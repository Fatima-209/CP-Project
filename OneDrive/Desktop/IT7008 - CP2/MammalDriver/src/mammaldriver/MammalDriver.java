package mammaldriver;

public class MammalDriver {
    public static void main(String[] args) {
       Pegasus pegasus1 = new Pegasus(44, "Greek", "Brown", "Pegasus", 16, "Female");
       SuperMan superMan1 = new SuperMan();
        pegasus1.eat();
        pegasus1.sleep();
        pegasus1.move();
        pegasus1.speak();
        pegasus1.fly();
        // SuperMan
        superMan1.eat();
        superMan1.sleep();
        superMan1.move();
        superMan1.speak();
        superMan1.fly(); 
        superMan1.Transform();
        superMan1.fly(); 
    }
    
}
