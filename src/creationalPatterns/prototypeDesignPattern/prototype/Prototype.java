package creationalPatterns.prototypeDesignPattern.prototype;

public interface Prototype extends Cloneable {
    public Prototype clone() throws CloneNotSupportedException;
}
