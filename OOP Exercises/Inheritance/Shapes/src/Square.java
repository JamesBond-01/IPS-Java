public class Square extends Shape {
    private double side;
    public Square() {
        side = 0;
    }
    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void showSideSize() {
        System.out.println("Tamaño de lados: " + getSide());
    }

    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
