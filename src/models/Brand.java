package models;

public class Brand {
    private String brandName;
    private CarModel[] models;

    public Brand(String brandName, CarModel[] models) {
        this.brandName = brandName;
        this.models = models;
    }

    public String getName() {
        return this.brandName;
    }

    public CarModel[] getModels() {
        return this.models;
    }

    public CarModel getModelByName(String name) {
        if (models == null)
            return null;
        for (CarModel model : models) {
            if (model.getModelName().equalsIgnoreCase(name)) {
                return model;
            }
        }
        return null;
    }

    public int getTotalValidYears() {
        int total = 0;

        if (models == null)
            return 0;

        for (CarModel model : models) {
            if (model == null || model.getYears() == null)
                continue;

            for (CarYear year : model.getYears()) {
                if (year != null && year.isAviable()) {
                    total++;
                }
            }
        }

        return total;
    }

}
