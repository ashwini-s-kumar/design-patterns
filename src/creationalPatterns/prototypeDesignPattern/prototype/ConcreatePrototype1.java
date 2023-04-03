package creationalPatterns.prototypeDesignPattern.prototype;

public class ConcreatePrototype1 implements Prototype{

    private String name;

    public ConcreatePrototype1(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConcreatePrototype1{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        super.clone();
        return new ConcreatePrototype1(this.name);
    }
}
