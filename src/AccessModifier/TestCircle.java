package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Cricle cricle = new Cricle();
        System.out.println("radius ----> " + cricle.getRadius());
        System.out.println("getArea ----> " + cricle.getArea());
        Cricle cricle1 = new Cricle(5);
        System.out.println("radius -----> "+ cricle1.getRadius());
        System.out.println("getArea -----> " + cricle1.getArea());
        cricle.display();
        cricle1.display();
    }

}
