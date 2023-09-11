public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Square square1 = new Square();
        Square square2 = new Square(4);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4,10);
        Rectangle rectangle3 = new Rectangle();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(8);

        System.out.println("Forma x:");
        shape1.showArea();
        shape1.showPerimeter();

        System.out.println("Cuadrado 1:");
        square1.setSide(6);
        square1.showSideSize();
        square1.showArea();
        square1.showPerimeter();
        System.out.println("Cuadrado 2:");
        square2.showSideSize();
        square2.showArea();
        square2.showPerimeter();

        System.out.println("Rectangulo 1:");
        rectangle1.setHeight(8);
        rectangle1.setWidth(4);
        rectangle1.showHeight();
        rectangle1.showWidth();
        rectangle1.showArea();
        rectangle1.showPerimeter();
        System.out.println("Rectangulo 2:");
        rectangle2.showHeight();
        rectangle2.showWidth();
        rectangle2.showArea();
        rectangle2.showPerimeter();
        System.out.println("Rectangulo 3:");
        rectangle3.setHeight(4);
        rectangle3.setWidth(4);
        rectangle3.showHeight();
        rectangle3.showWidth();
        rectangle3.showArea();
        rectangle3.showPerimeter();

        System.out.println("Circulo 1:");
        circle1.setRadius(5);
        circle1.showCircumference();

    }
}