package guru.springframework.spring5webapp.designpattern.LLD.decorator;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }

    @Override
    int cost() {
      return this.basePizza.cost() + 15;
    }
}
