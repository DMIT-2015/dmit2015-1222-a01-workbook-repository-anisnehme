package dmit2015.model;

public class Circle {

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius must be a postive non-zero number");
        }
        this.radius = radius;
    }

    public Circle() {
        setRadius(1);
    }
    public Circle(double radius) {
        //this.radius = radius;
        setRadius(radius);
    }
}
