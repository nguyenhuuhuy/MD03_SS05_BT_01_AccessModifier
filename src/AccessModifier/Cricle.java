package AccessModifier;

public class Cricle {
    private double radius = 1.0;
    private String color = "red";

    public Cricle() {
    }

    public Cricle(double radius) {
        this.radius = radius;
        this.color = "blue";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    void display(){
        System.out.println("radius: " + radius + "\n color: " + color);
    }

}

