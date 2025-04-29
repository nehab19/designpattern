package guru.springframework.spring5webapp.designpattern.LLD.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I am Square");
    }
}
