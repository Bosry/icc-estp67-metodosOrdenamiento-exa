package models;

public class CarYear {
    private int year;
    private boolean isAviable;

    public CarYear(int year, boolean isAviable) {
        this.year = year;
        this.isAviable = isAviable;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isAviable() {
        return this.isAviable;
    }

    public boolean isValid() {
        return this.isAviable;
    }
}