package car_utilities;

import car.Car;
import car.CarType;
import car.FuelType;
import engine.Engine;
import fuel.Diesel;
import fuel.Electro;
import fuel.Fuel;
import fuel.Gasoline;

public class CarFactory {

    public Car GenerateCar(String Name, int Seats, boolean SportsMode, CarType carType, FuelType fuelType) {

        Engine Engine = new Engine(200, 4.5f, 4);
        Fuel fuel = GetFuel(fuelType);
        return new Car(Name, Seats, SportsMode, Engine, carType, fuelType, fuel);

    }

    private Fuel GetFuel(FuelType fuelType) {
        switch (fuelType) {
            case FuelType.Diesel -> {
                return new Diesel(true);
            }

            case FuelType.Electro -> {
                return new Electro();
            }
            case FuelType.Gasoline -> {
                return new Gasoline();
            }
        }
        return null;
    }
}
