package Logic;

public class Fahrenheit {

    private double tempInFahr;

    public Fahrenheit(double tempInFahr) {
        this.tempInFahr = tempInFahr;
    }

    public double getTempInCelsius() {
        return (tempInFahr - 32) * 5 / 9;
    }

    public double getTempInFahr() {
        return tempInFahr;
    }
}
