public class Circle extends Shape {
    private double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public void showCircumference() {
        System.out.println("Circumference: " + getCircumference());
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void showRadius() {
        System.out.println("Radio: ");
    }
}
