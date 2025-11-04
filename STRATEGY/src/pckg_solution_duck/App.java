package pckg_solution_duck;

import pckg_solution_duck.flyBehaviours.FlyNoWay;
import pckg_solution_duck.flyBehaviours.FlyWithWings;
import pckg_solution_duck.quackBehaviours.MuteQuack;
import pckg_solution_duck.quackBehaviours.Quack;
import pckg_solution_duck.quackBehaviours.Squeak;
import pckg_solution_duck.swimBehaviour.Swim;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        FlyWithWings flyWithWings = new FlyWithWings();
        FlyNoWay flyNoWay = new FlyNoWay();

        Quack quack = new Quack();
        Squeak squeak = new Squeak();
        MuteQuack muteQuack = new MuteQuack();

        Swim swim = new Swim();

        MallardDuck mallardDuck = new MallardDuck(flyWithWings, quack, swim);
        RedHeadDuck redHeadDuck = new RedHeadDuck(flyWithWings, quack, swim);
        RubberDuck rubberDuck = new RubberDuck(flyNoWay, squeak, swim);
        DecoyDuck decoyDuck = new DecoyDuck(flyNoWay, muteQuack, swim);

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(mallardDuck);
        ducks.add(redHeadDuck);
        ducks.add(rubberDuck);
        ducks.add(decoyDuck);

        executeAction(ducks);

    }

    private static void executeAction(List<Duck> someList){
        for (Duck d : someList) {
            d.display();
            d.performFly();
            d.performQuack();
            d.swim();
            System.out.println("\n");
        }
    }
}
