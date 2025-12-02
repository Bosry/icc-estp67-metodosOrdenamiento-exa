package models;

public class Brand {
    private String brandName;
    private CarModel[] models;
    private int modelcount;
    
    public Brand (String brandName, CarModel[] models){
        this.brandName = brandName;
        this.models = models;
        this.modelcount = models.length;
    }

    public String getName(){
        return "";
    }
    public CarModel[] getModel(){
        return null;
    }

    public CarModel getModelByName(String name){
        return null;
    }


    public int getTotalValidYears() {
        int total = 0;

        if (models == null) return 0;

        for (CarModel model : models) {
            if (model == null || model.getYears() == null) continue;

            for (CarYear year : model.getYears()) {
                if (year != null && year.isAviable()) {
                    total++;
                }
            }
        }

        return total;
    }
    public Brand[] sortSelectionDesc(Brand[] brands) {
    for (int i = 0; i < brands.length - 1; i++) {
        int indiceMenor = i;
        for (int j = i + 1; j < brands.length; j++) {
            if (brands[j].getTotalValidYears() > brands[indiceMenor].getTotalValidYears()) {
                indiceMenor = j;
            }
        }
        if (i != indiceMenor) {
        Brand temp = brands[i];
        brands[i] = brands[indiceMenor];
        brands[indiceMenor] = temp;
        }
    }
    return brands;
}

public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
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
}
