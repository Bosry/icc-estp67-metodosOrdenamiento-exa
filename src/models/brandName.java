package models;

public class brandName {
    private String brandName;
    private CarModel[] models;

    public brandName(String brandName, CarModel[] models){
        this.brandName = brandName;
        this.models = models;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public CarModel[] getModels() {
        return this.models;
    }

    public int getTotalValidYears() {
        int total = 0;
        if (models == null) return 0;

        for (CarModel model : models) {
            if (model.getYears() == null) continue;
            for (CarYear year : model.getYears()) {
                if (year.isValid()) total++;
            }
        }
        return total;
    }
}