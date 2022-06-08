package task26;

import java.util.List;

public interface CarRepo {

//    List<Manufacturer> manufacturerList = new ArrayList<>();
//    List<Model> allModelsOfCars = new ArrayList<>();

    List<Model> getAllModels(List<Manufacturer> manufacturerList);

    List<Car> getAllCars(List<Model> allModelsOfCars);

    List<String> getAllManufacturersNames(List<Manufacturer> manufacturerList);

    List<Integer> getCreationYearOfManufacturers(List<Manufacturer> manufacturerList);

    List<String> getAllNamesOfModels(List<Model> allModelsOfCars);

    List<Integer>  getAllYearProductionOfModels(List<Model> allModelsOfCars);

    List<String> getNamesOfCars(List<Car> listOfCars);

    List<String> getDescriptionsOfCars(List<Car> listOfCars);

    List<Model> getOnlyModelsWithEvenYearsOfProduction(List<Model> allModelsOfCars);

    List<Car> getManufacturersCarsWithEvenStartProductionAndOddYearOfCreation(List<Manufacturer> manufacturerList);

    List<Car> getOnlyCABRIOCarsWithOddYearsOfProductionEvenYearCreation(List<Manufacturer> manufacturerList);

    List<Car> getOnlySEDANCarsWithModelFrom1990AndOlderManufacturerThanFrom1919(List<Manufacturer> manufacturerList);

}
