package models;

public class CarModel {

    private String brandName;
    private CarYear[] years;

    public CarModel (String brandName, CarYear[] years){
        this.brandName = brandName;
        this.years = years;
    }

    public String getName(){
        return "";
    }
    

    public CarYear[] getYears(){
        return null;
    }
}
