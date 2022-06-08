package task12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class CarService {

    private final List<Car> carList = new ArrayList<>();

    public void addCarToList(Car car) {
        carList.add(car);
    }

    public void removeFromList(Car car) {
        carList.remove(car);
    }

    public List<Car> getCarList() {
        return List.copyOf(carList);
    }


    public List<Car> getCarListWithEngine(EngineType engineType) {

        return carList.stream()
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toList());
    }


    public List<Car> getCarListWithEngineV12() {

        List<Car> carsWithEngineV12 = new ArrayList<>();

        for (Car car: carList) {
            if (car.getEngineType().equals(EngineType.V12)) {
                carsWithEngineV12.add(car);
            }
        }
        return carsWithEngineV12;
    }

    public List<Car> getCarListWithCarsBefore1999Stream() {

        return carList.stream()
                .filter(car -> car.getYearOfProduction() < 1999)
                .collect(Collectors.toList());
    }

    public List<Car> getCarListWithCarsBefore1999() {

      List<Car> carList1 = new ArrayList<>();

        for (Car car: carList) {
            if(car.getYearOfProduction() < 1999) {
                carList1.add(car);
            }
        }
        return carList1;
    }

    public Car getTheMostExpensiveCar() {

        Car result = null;

        for (Car car : carList) {
            if (result == null || result.getPrice() < car.getPrice()) {
                result = car;
            }
        }
        return result;
    }

    public Car getTheMostExpensiveCarWithStream() {

        return carList.stream()
                .max(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getTheCheapestCar() {
        Car result = null;
        for (Car car : carList) {
            if (result == null || result.getPrice() > car.getPrice()) {
                result = car;
            }
        }
        return result;
    }


    public Car getTheCheapestCarWithStream() {
        return carList
                .stream()
                .min(Comparator.comparing(Car::getPrice))
                .orElse(null);
    }

    public Car getCarsWith3ManufacturersOrMore() {
        for (Car car : carList) {
            if (car.getManufacturerList().size() >= 3) {
                return car;
            }
        }
        return null;
    }

    public Car getCarsWith3ManufacturersOrMoreWithStream() {
        return carList.
                stream().
                filter(car -> car.getManufacturerList().size() >= 3)
                .findFirst()
                .orElse(null);
    }

    public List<Car> getCarsSorted(boolean isAscending) {

        List<Car> sortedCarList = new ArrayList<>(this.carList);
//      lacking sensitive order
//        if (isAscending) {
//            sortedCarList.sort(Comparator.comparing(Car::getName));
//        } else {
//            sortedCarList.sort(Comparator.comparing(Car::getName).reversed());
//        }

        if (isAscending) {
            sortedCarList.sort((o1,o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
        } else {
            sortedCarList.sort((o1,o2) -> o2.getName().compareToIgnoreCase(o1.getName()));
        }

//        We can do this if Car implements comparable
//        sorted.sort(Car::compareTo)

        return sortedCarList;
    }

    public boolean isCarPresentInCarList(Car car) {
        return carList.contains(car);
    }

    public List<Car> findCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturerList().contains(manufacturer)) {
                result.add(car);
            }
        }
        return result;
    }

    public List<Car> findCarsByManufacturerWithStream(Manufacturer manufacturer) {

        return carList.stream()
                .filter(car -> car.getManufacturerList().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getListOfCarsMadeByManufacturerThatWasEstablishedInSomeYear(int foundingYear, Operator operator) {
        List<Car> result = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer manufacturer : car.getManufacturerList()) {
                if (!result.contains(car)) {
                    switch (operator) {
                        case LESS_THAN:
                            if (manufacturer.getYearOfSetUp() < foundingYear) {
                                result.add(car);
                            }
                            break;
                        case GREATER_THAN:
                            if (manufacturer.getYearOfSetUp() > foundingYear) {
                                result.add(car);
                            }
                            break;
                        case EQUALS:
                            if (manufacturer.getYearOfSetUp() == foundingYear) {
                                result.add(car);
                            }
                            break;
                    }
                }
            }
        }
        return result;
    }

    public List<Car> getListOfCarsMadeByManufacturerThatWasEstablishedInSomeYearWithStream(
            int foundingYear, Operator operator) {
        return carList.stream()
                .filter(car -> car.getManufacturerList().stream()
                        .anyMatch(m -> operator.fits(m, foundingYear)))
                .collect(Collectors.toList());
    }

    public enum Operator {

        LESS_THAN((manufacturer, productionYear) -> manufacturer.getYearOfSetUp() < productionYear),
        GREATER_THAN((manufacturer, productionYear) -> manufacturer.getYearOfSetUp() > productionYear),
        EQUALS((manufacturer, productionYear) -> manufacturer.getYearOfSetUp() == productionYear);

        private final BiPredicate<Manufacturer, Integer> fits;

        Operator(BiPredicate<Manufacturer, Integer> fits) {
            this.fits = fits;
        }

        boolean fits(Manufacturer m, Integer i) {
            return this.fits.test(m, i);
        }
    }
}
