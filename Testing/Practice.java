package Testing;

abstract class Shape {
    abstract void draw();

    void info() {
        System.out.println("this is a shape.");
    }
}

interface Colorable {
    void color();
}

class Circle extends Shape implements Colorable {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    public void color() {
        System.out.println("Coloring the circle red.");
    }
}

public class Practice {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.info();

        Colorable colorable = new Circle();
        colorable.color();
    }
}
