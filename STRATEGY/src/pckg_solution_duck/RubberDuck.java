package pckg_solution_duck;

import pckg_solution_duck.flyBehaviours.FlyBehaviour;
import pckg_solution_duck.quackBehaviours.QuackBehaviour;
import pckg_solution_duck.swimBehaviour.SwimBehaviour;

public class RubberDuck extends Duck{

    public RubberDuck(FlyBehaviour fb, QuackBehaviour qb, SwimBehaviour sb) {
        super(fb, qb, sb);
    }
}
