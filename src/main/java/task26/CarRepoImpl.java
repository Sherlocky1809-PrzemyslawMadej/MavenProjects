package task26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepoImpl implements CarRepo {



    @Override
    public List<Model> getAllModels(List<Manufacturer> manufacturerList) {

            List<Model> allModelsOfCars = new ArrayList<>();

        for (Manufacturer manufacturer: manufacturerList) {
            allModelsOfCars.addAll(manufacturer.getModels());
        }
        return allModelsOfCars;
    }

    @Override
    public List<Car> getAllCars(List<Model> allModelsOfCars) {

        List<Car> listOfCars = new ArrayList<>();

            for (Model model : allModelsOfCars) {
                listOfCars.addAll(model.getCars());
            }
        return listOfCars;
    }

    @Override
    public List<String> getAllManufacturersNames(List<Manufacturer> manufacturerList) {

        List<String> listOfManufacturersNames = new ArrayList<>();

        for (Manufacturer manufacturer: manufacturerList) {
            listOfManufacturersNames.add(manufacturer.getName());
        }
        return listOfManufacturersNames;
    }

    @Override
    public List<Integer> getCreationYearOfManufacturers(List<Manufacturer> manufacturerList) {

        List<Integer> listOfYearsOfCreationManus = new ArrayList<>();

        for (Manufacturer manufacturer: manufacturerList) {
            listOfYearsOfCreationManus.add(manufacturer.getYearOfCreation());
        }

        return listOfYearsOfCreationManus;
    }

    @Override
    public List<String> getAllNamesOfModels(List<Model> allModelsOfCars) {

        List<String> listOfModelsNames = new ArrayList<>();

        for (Model model: allModelsOfCars) {
            listOfModelsNames.add(model.getName());
        }
        return listOfModelsNames;
    }

    @Override
    public List<Integer> getAllYearProductionOfModels(List<Model> allModelsOfCars) {

        List<Integer> allYearsOfStartingProductionOfModels = new ArrayList<>();

        for (Model model: allModelsOfCars) {
            allYearsOfStartingProductionOfModels.add(model.getProductionStartYear());
        }
        return allYearsOfStartingProductionOfModels;
    }

    @Override
    public List<String> getNamesOfCars(List<Car> listOfCars) {

        List<String> listOfCarsNames = new ArrayList<>();

        for (Car car: listOfCars) {
            listOfCarsNames.add(car.getName());
        }
        return listOfCarsNames;
    }

    @Override
    public List<String> getDescriptionsOfCars(List<Car> listOfCars) {

        List<String> listOfDescriptionNames = new ArrayList<>();

        for (Car car: listOfCars) {
            if(!listOfDescriptionNames.contains(car.getDescription()))
            listOfDescriptionNames.add(car.getDescription());
        }
        return listOfDescriptionNames;
    }

    public List<Model> getOnlyModelsWithEvenYearsOfProduction(List<Model> allModelsOfCars) {

        return allModelsOfCars.stream()
                .filter(model -> model.getProductionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getManufacturersCarsWithEvenStartProductionAndOddYearOfCreation
            (List<Manufacturer> manufacturerList) {

        List<Car> listOfSpecifiedCars1 = new ArrayList<>();
        List<Model> modelsList = new ArrayList<>();

        List<Manufacturer> manufacturerList1 = manufacturerList.stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 != 0).toList();

        for (Manufacturer manufacturer: manufacturerList1) {
            modelsList.addAll(manufacturer.getModels());
        }

        List<Model> listOfFilteredModels = modelsList.stream()
                .filter(model -> model.getProductionStartYear() % 2 == 0).toList();

        for (Model model: listOfFilteredModels) {
            listOfSpecifiedCars1.addAll(model.getCars());
        }
        return listOfSpecifiedCars1;
    }

    @Override
    public List<Car> getOnlyCABRIOCarsWithOddYearsOfProductionEvenYearCreation(List<Manufacturer> manufacturerList) {
        List<Car> listOfCABRIOCars = new ArrayList<>();
        List<Model> modelsList1 = new ArrayList<>();

        List<Manufacturer> manufacturerList2 = manufacturerList.stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0).toList();

        for (Manufacturer manufacturer: manufacturerList2) {
            modelsList1.addAll(manufacturer.getModels());
        }

        List<Model> listOfFilteredModels1 = modelsList1.stream()
                .filter(model -> model.getProductionStartYear() % 2 != 0).toList();

        for (Model model: listOfFilteredModels1) {
            listOfCABRIOCars.addAll(model.getCars());
        }

        return listOfCABRIOCars.stream()
                .filter(car -> car.getCarType() == CarType.CABRIO)
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getOnlySEDANCarsWithModelFrom1990AndOlderManufacturerThanFrom1919(List<Manufacturer> manufacturerList) {

        List<Car> listOfSEDANCars = new ArrayList<>();
        List<Model> modelsList2 = new ArrayList<>();

        List<Manufacturer> manufacturerList3 = manufacturerList.stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() < 1919).toList();

        for (Manufacturer manufacturer: manufacturerList3) {
            modelsList2.addAll(manufacturer.getModels());
        }

        List<Model> listOfFilteredModels2 = modelsList2.stream()
                .filter(model -> model.getProductionStartYear() > 1990).toList();

        for (Model model: listOfFilteredModels2) {
            listOfSEDANCars.addAll(model.getCars());
        }

        return listOfSEDANCars.stream()
                .filter(car -> car.getCarType() == CarType.SEDAN)
                .collect(Collectors.toList());
    }
}
