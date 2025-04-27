package mammaldriver;

public class Horse extends Mammal {
    private String breed;
    private String color;

    public Horse(String breed, String color, String name, int age, String gender) {
        super(name, age, gender);
        this.breed = breed;
        this.color = color;
    }

   
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void eat(){
        System.out.println("As a Horse, I Eat grass");
    }
    @Override
    public void sleep(){
        System.out.println("Horse Is Sleeping ... ");
    }
    @Override
    public void move(){
        System.out.println("Horse: Moving");
    }
    @Override
    public void speak(){
        System.out.println("Horse: Speaking");
    }
}
