package controllers;

import models.brandName;

public class BrandController {
    public BrandController(){

    }
    public brandName[] sortSelectionDesc(brandName[] brands) {
        int n = brands.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (brands[j].getTotalValidYears() > brands[maxIndex].getTotalValidYears()) {
                    maxIndex = j;
                }
            }

            brandName temp = brands[i];
            brands[i] = brands[maxIndex];
            brands[maxIndex] = temp;
        }
        return brands;
    }

    public brandName binarySearchByValidYears(
            brandName[] brands,
            int validYears,
            boolean isAscending) {

        int left = 0;
        int right = brands.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midValue = brands[mid].getTotalValidYears();

            if (midValue == validYears) {
                return brands[mid];
            }

            if (isAscending) {
                if (validYears < midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (validYears > midValue) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }

        return null;
    }

    public void printBrands(brandName[] brands) {
        for (brandName b : brands) {
            System.out.println(b.getBrandName() + " - Años válidos: " + b.getTotalValidYears());
        }
    }

}
