import car.Car;
import car.CarType;
import car.FuelType;
import car_utilities.CarFactory;

import java.util.Scanner;

public class Main {

    private static final CarFactory carFactory = new CarFactory();

    public static void main(String[] args) {

        //Car car = carFactory.GenerateCar("Mondeo", 4, true, CarType.Small, FuelType.Electro);
        Scanner input = new Scanner(System.in);

        System.out.println("Please tell me the Modelname.");
        String name = input.nextLine();

        System.out.println("Please tell me the Seatamount.");
        int seats = input.nextInt();

        Car car = carFactory.GenerateCar(name, seats, false, CarType.Small, FuelType.Gasoline);

        car.PrintData();
    }
}