// Concrete implementation of shape
public class Rectangle extends Shape{
    public Rectangle(Color color){
        super(color);
    }

    @Override
    public String draw(){
        return "Drawing Square. " + color.fillColor();
    }

}
