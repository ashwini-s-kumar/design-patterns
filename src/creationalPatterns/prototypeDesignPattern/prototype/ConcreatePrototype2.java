package creationalPatterns.prototypeDesignPattern.prototype;

public class ConcreatePrototype2 implements Prototype{
    private int id;
    public ConcreatePrototype2(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ConcreatePrototype2{" +
                "id=" + id +
                '}';
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        super.clone();
        return new ConcreatePrototype2(this.id);
    }
}
