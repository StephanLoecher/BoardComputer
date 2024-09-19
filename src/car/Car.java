package car;

import engine.Engine;
import fuel.Fuel;

public class Car {
    public String Name;
    public int Seats;
    public boolean SportsMode;
    public Engine Engine;
    public CarType Type;
    public FuelType FuelType;
    public Fuel Fuel;

    public Car(String name, int seats, boolean sportsMode, Engine engine, CarType carType, FuelType fuelType,
               Fuel fuel) {
        Name = name;
        Seats = seats;
        SportsMode = sportsMode;
        Engine = engine;
        FuelType = fuelType;
        Type = carType;
        Fuel = fuel;
    }

    public void PrintData() {
        System.out.println("Name: " + Name);
        System.out.println("Seats: " + Seats);
        // System.out.println("Engine: " + Engine);
        System.out.println("Engine: " + Engine.PrintEngineData());
        System.out.println("CarType: " + Type);
        System.out.println("FuelType: " + FuelType);
        System.out.println("Fuel: " + Fuel);
        //System.out.println("Fuel: " + Fuel.PrintFuelData());
    }
}
