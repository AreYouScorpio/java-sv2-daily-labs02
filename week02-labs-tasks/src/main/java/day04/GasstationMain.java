package day04;


public class GasstationMain {
    public static void main(String[] args) {


        Car car = new Car();
        GasStation gasStation = new GasStation(468);

        System.out.println("A tankolás ára: "+ gasStation.tankCar(car, 40));
        car.setKm(635);

        System.out.println("A fogyasztás: "+ car.calculateConsumption());

    }

}
