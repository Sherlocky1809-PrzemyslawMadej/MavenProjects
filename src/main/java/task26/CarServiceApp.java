package task26;

import java.util.ArrayList;
import java.util.List;

public class CarServiceApp {

    public static void main(String[] args) {

//        task12.Manufacturer fiat = new task12.Manufacturer("Fiat", 1900, "Italy");
//        task12.Manufacturer mercedes = new task12.Manufacturer("Manufacturer", 1901, "Germany");
//        task12.Manufacturer porsche = new task12.Manufacturer("Porsche", 1950, "Germany");
//        task12.Manufacturer tesla = new task12.Manufacturer("Tesla", 2010, "USA");
//        task12.Manufacturer benz = new Manufacturer("Benz", 1901, "Germany");

//        task12.Car panda = new task12.Car("Panda", "Fiat", 40000, 2011, Collections.singletonList(fiat), EngineType.S4);
//        task12.Car sclass = new task12.Car("S600", "Mercedes", 500000, 2020, List.of(mercedes, benz), EngineType.V12);
//        task12.Car sclass2 = new task12.Car("S600", "Mercedes", 550000, 2021, List.of(mercedes, benz, tesla), EngineType.V12);
//        task12.Car cayenne = new task12.Car("Cayenne", "Porsche", 300000, 2009, Collections.singletonList(porsche), EngineType.V8);
//        task12.Car boxter = new task12.Car("Boxter", "Porsche", 250000, 2001, Collections.singletonList(porsche), EngineType.S6);
//        task12.Car eclass = new task12.Car("E500", "Mercedes", 400000, 1992, Collections.singletonList(mercedes), EngineType.V8);

        Car panda = new Car("Panda", "Fast as speedy Gonzalez", CarType.COUPE);
        Car sSixHundred = new Car("S600", "Mercedes type of SuperCar!", CarType.COUPE);
        Car cayenne = new Car("Cayenne", "Porsche is good!", CarType.COUPE);
        Car boxster = new Car("Boxster", "Porsche is good!", CarType.CABRIO);
        Car eFiveHundred = new Car("E500", "Mercedes type of SuperCar!", CarType.SEDAN);
        Car smallPolish = new Car("126p", "Fast as speedy Gonzalez", CarType.HATCHBACK);
        Car tipo = new Car("Tipo", "Fast as speedy Gonzalez", CarType.SEDAN);
        Car roma = new Car("Roma", "Car for rich people", CarType.COUPE);
        Car testarossa = new Car("Testarossa", "Car for rich people", CarType.COUPE);

        Model fiat = new Model("Fiat",1970, List.of(panda, smallPolish, tipo));
        Model mercedes = new Model("Mercedes", 1992, List.of(sSixHundred,eFiveHundred));
        Model porsche = new Model("Porsche", 2001, List.of(cayenne, boxster));
        Model ferrari = new Model("Ferrari", 1986, List.of(testarossa, roma));

        Manufacturer italianManufacturer = new Manufacturer("ITAManu", 1950, List.of(ferrari,fiat));
        Manufacturer germanManufacturer = new Manufacturer("GERManu", 1900, List.of(porsche, mercedes));

        List<Manufacturer> manufacturerList = List.of(italianManufacturer, germanManufacturer);

        CarRepo carRepo = new CarRepoImpl();
        List<Model> allModels = carRepo.getAllModels(manufacturerList);
        System.out.println(allModels);

        System.out.println("*********************");

        List<Car> allCars = carRepo.getAllCars(allModels);
        System.out.println(allCars);

        System.out.println("*********************");

        List<String> allNamesOfManu = carRepo.getAllManufacturersNames(manufacturerList);
        System.out.println(allNamesOfManu);

        System.out.println("*********************");

        List<Integer> allYearsOfSetUpManus = carRepo.getCreationYearOfManufacturers(manufacturerList);
        System.out.println(allYearsOfSetUpManus);

        System.out.println("****************");

        List<String> allNamesOfModels = carRepo.getAllNamesOfModels(allModels);
        System.out.println(allNamesOfModels);

        System.out.println("*********************");

        List<Integer> allYearsOfStartProductionModels = carRepo.getAllYearProductionOfModels(allModels);
        System.out.println(allYearsOfStartProductionModels);

        System.out.println("*********************");

        List<String> allNamesOfCars = carRepo.getNamesOfCars(allCars);
        System.out.println(allNamesOfCars);

        System.out.println("*********************");

        List<String> allDescriptionOfCars = carRepo.getDescriptionsOfCars(allCars);
        System.out.println(allDescriptionOfCars);

        System.out.println("*********************");

        List<Model> allModelsWithEvenYearOfProduction = carRepo.getOnlyModelsWithEvenYearsOfProduction(allModels);
        System.out.println(allModelsWithEvenYearOfProduction);

        System.out.println("*********************");

        List<Car> listOfSpecifiedCars1 =
                carRepo.getManufacturersCarsWithEvenStartProductionAndOddYearOfCreation(manufacturerList);
        System.out.println(listOfSpecifiedCars1);

        System.out.println("*********************");

        List<Car> listOfCABRIOCars =
                carRepo.getOnlyCABRIOCarsWithOddYearsOfProductionEvenYearCreation(manufacturerList);
        System.out.println(listOfCABRIOCars);

        System.out.println("*********************");

        List<Car> listOfSEDANCars =
                carRepo.getOnlySEDANCarsWithModelFrom1990AndOlderManufacturerThanFrom1919(manufacturerList);
        System.out.println(listOfSEDANCars);
    }
}
