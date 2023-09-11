public class Rectangle extends Shape {
    private double height;
    private double width;
    public Rectangle() {
        height = 0;
        width = 0;
    }
    public Rectangle(double height, double width) {
        if(width != height) {
            this.width = width;
            this.height = height;
        } else {
            System.out.println("Error. Si los lados son iguales usted desea un cuadrado.");
        }
    }
    public void setHeight(double height) {
        if(height != width) {
            this.height = height;
        } else {
            System.out.println("Error. Si los lados son iguales usted desea un cuadrado.");
        }
    }
    public double getHeight() {
        return height;
    }
    public void showHeight() {
        System.out.println("Alto: " + getHeight());
    }
    public void setWidth(double width) {
        if(width != height) {
            this.width = width;
        } else {
            System.out.println("Error. Si los lados son iguales usted desea un cuadrado.");
        }
    }
    public double getWidth() {
        return width;
    }
    public void showWidth() {
        System.out.println("Ancho: " + getWidth());
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
