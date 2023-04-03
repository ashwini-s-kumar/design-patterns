package creationalPatterns.prototypeDesignPattern.prototype;

public class Demo {
    public static void main(String [] arr){
        try {
            Prototype prototype1 = new ConcreatePrototype1("ConcreatePrototype1");
            Prototype prototype2 = new ConcreatePrototype2(10);

            System.out.println("Prototype1 : " + prototype1.toString());
            System.out.println("Prototype2 : " + prototype2.toString());

            Prototype prototype3 = prototype1.clone();
            Prototype prototype4 = prototype2.clone();

            System.out.println("Cloned Prototype3 : " + prototype3.toString());
            System.out.println("Cloned Prototype4 : " + prototype4.toString());

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
