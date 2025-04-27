package mammaldriver;

public class SuperMan extends Human implements Flying{
    private Boolean isTransformed;

    public Boolean getIsTransformed() {
        return isTransformed;
    }
    public SuperMan(){
        super("Kent", "Journalist", "Clark", 28, "Male");
        isTransformed = false;
    }
    public void Transform(){
        if(isTransformed){
            isTransformed = false;
        } else {
            isTransformed = true;
        }
    }
    @Override
    public void fly() {
        if (isTransformed) {
            System.out.println("Superman is flying! Beware Lex Luthor!");
        }
        else {
            System.out.println("Shhhhh! I am Clark Kent now, don't want to reveal my secret ID");
            move();
        }
    }
}
