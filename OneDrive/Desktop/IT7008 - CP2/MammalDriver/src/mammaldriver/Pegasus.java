package mammaldriver;

public class Pegasus extends Horse implements Flying{
    private int numberOfBelievers;

    public Pegasus(int numberOfBelievers, String breed, String color, String name, int age, String gender) {
        super(breed, color, name, age, gender);
        this.numberOfBelievers = numberOfBelievers;
    }

    public int getNumberOfBelievers() {
        return numberOfBelievers;
    }

    public void setNumberOfBelievers(int numberOfBelievers) {
        this.numberOfBelievers = numberOfBelievers;
    }

    @Override
    public void fly() {
      System.out.println("Pegasus is flying high in the sky!");
    }
    
}
