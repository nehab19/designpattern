package guru.springframework.spring5webapp.designpattern.LLD.factory;

public class MainMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape=shapeFactory.getShape("Square");
        shape.draw();

    }
}
