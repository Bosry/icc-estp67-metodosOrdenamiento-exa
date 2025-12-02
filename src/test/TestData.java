package test;

import models.CarModel;
import models.CarYear;
import models.brandName;

public class TestData {

    /**
     * Crea un arreglo de marcas de ejemplo para pruebas
     * 
     * @return Arreglo de marcas con modelos y años
     */
    public static brandName[] createBrands() {
        // ===== HONDA =====
        CarYear[] civicYears = {
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, true),
                new CarYear(2023, false)
        };

        CarYear[] accordYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] hondaModels = {
                new CarModel("Civic", civicYears),
                new CarModel("Accord", accordYears)
        };

        brandName honda = new brandName("Honda", hondaModels);

        // ===== TOYOTA =====
        CarYear[] corollaYears = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, true),
                new CarYear(2023, true)
        };

        CarYear[] camryYears = {
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, false),
                new CarYear(2023, true)
        };

        CarModel[] toyotaModels = {
                new CarModel("Corolla", corollaYears),
                new CarModel("Camry", camryYears)
        };

        brandName toyota = new brandName("Toyota", toyotaModels);

        // ===== FORD =====
        CarYear[] mustangYears = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, false)
        };

        CarYear[] f150Years = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] fordModels = {
                new CarModel("Mustang", mustangYears),
                new CarModel("F-150", f150Years)
        };

        brandName ford = new brandName("Ford", fordModels);

        // ===== CHEVROLET =====
        CarYear[] silveradoYears = {
                new CarYear(2016, false),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, false),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] camaroYears = {
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarModel[] chevroletModels = {
                new CarModel("Silverado", silveradoYears),
                new CarModel("Camaro", camaroYears)
        };

        brandName chevrolet = new brandName("Chevrolet", chevroletModels);

        // ===== NISSAN =====
        CarYear[] altimaYears = {
                new CarYear(2016, true),
                new CarYear(2017, false),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] sentraYears = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, false)
        };

        CarModel[] nissanModels = {
                new CarModel("Altima", altimaYears),
                new CarModel("Sentra", sentraYears)
        };

        brandName nissan = new brandName("Nissan", nissanModels);

        // ===== MAZDA =====
        CarYear[] mazda3Years = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarYear[] cx5Years = {
                new CarYear(2017, true),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, true),
                new CarYear(2022, true)
        };

        CarModel[] mazdaModels = {
                new CarModel("Mazda3", mazda3Years),
                new CarModel("CX-5", cx5Years)
        };

        brandName mazda = new brandName("Mazda", mazdaModels);

        // ===== HYUNDAI =====
        CarYear[] elantraYears = {
                new CarYear(2016, true),
                new CarYear(2017, true),
                new CarYear(2018, false),
                new CarYear(2019, true),
                new CarYear(2020, false),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarYear[] tucsonYears = {
                new CarYear(2017, false),
                new CarYear(2018, true),
                new CarYear(2019, true),
                new CarYear(2020, true),
                new CarYear(2021, false),
                new CarYear(2022, true)
        };

        CarModel[] hyundaiModels = {
                new CarModel("Elantra", elantraYears),
                new CarModel("Tucson", tucsonYears)
        };

        brandName hyundai = new brandName("Hyundai", hyundaiModels);

        return new brandName[] { honda, toyota, ford, chevrolet, nissan, mazda, hyundai };
    }
}
