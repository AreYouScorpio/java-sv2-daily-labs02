package day04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car (10,100);
       // car.setLitre(40);
       //  car.setKm(635);
        System.out.println(car.calculateConsumption());
    }
}
