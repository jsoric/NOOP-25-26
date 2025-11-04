package pckg_solution_duck;

import pckg_solution_duck.flyBehaviours.FlyBehaviour;
import pckg_solution_duck.quackBehaviours.QuackBehaviour;
import pckg_solution_duck.swimBehaviour.SwimBehaviour;

public class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;

    public Duck(FlyBehaviour fb, QuackBehaviour qb, SwimBehaviour sb) {
        this.flyBehaviour = fb;
        this.quackBehaviour = qb;
        this.swimBehaviour = sb;
    }

    public void performQuack() {
        System.out.println(this.getClass().getSimpleName() + flyBehaviour.fly());
    }

    public void performFly(){
        System.out.println(this.getClass().getSimpleName() + quackBehaviour.quack());
    }

    public void swim(){
        System.out.println(this.getClass().getSimpleName() + swimBehaviour.swim());
    }

    public void display(){
        System.out.println("I am a " + this.getClass().getSimpleName() + ".");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
