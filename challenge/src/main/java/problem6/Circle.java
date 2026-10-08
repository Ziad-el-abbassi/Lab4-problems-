package problem6;

public class Circle extends Forme{
    private final double radius;
    public Circle(double r){
        this.radius=r;
    };
    @Override
    public double getSurface(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle (radius " + this.radius + " cm)";
    }
}
