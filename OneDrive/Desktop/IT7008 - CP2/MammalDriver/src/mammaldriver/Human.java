package mammaldriver;

public class Human extends Mammal {
    private String surName;
    private String occupation;

    public Human(String surName, String occupation, String name, int age, String gender) {
        super(name, age, gender);
        this.surName = surName;
        this.occupation = occupation;
    }

    

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    @Override
    public void eat(){
        System.out.println("As a Human, I Eat Meat");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping ... ");
    }
    @Override
    public void move(){
        System.out.println("Human: Moving");
    }
    @Override
    public void speak(){
        System.out.println("Human: Speaking");
    }
}
