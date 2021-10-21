package day04;

public class Car {

    int litre;
    int km;

    public void setKm(int km) {
        this.km = km;
    }

    public void setLitre(int litre) {
        this.litre = litre;
    }

    public Car (int litre, int km)
    {
        this.litre = litre;
        this.km = km;
    }

    public double calculateConsumption ()
    {
        return (this.litre*1.0/this.km)*100;
    }
}
