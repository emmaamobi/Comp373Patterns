// abstraction
public abstract class Shape {
    protected Color color; // Bridge to Color object

    public Shape(Color color){
        this.color = color;
    }

    abstract public String draw();
}
