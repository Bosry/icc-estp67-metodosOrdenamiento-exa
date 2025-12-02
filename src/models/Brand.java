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
    
}
