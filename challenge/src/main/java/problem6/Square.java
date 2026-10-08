package problem6;

public class Square extends Forme{
    private final double side;
    public Square(double s){
        this.side=s;
    };
    @Override
    public double getSurface(){
     return side*side;
    }
    @Override
    public String toString() {
        return "Square (side " + this.side + " cm)";
    }
}
