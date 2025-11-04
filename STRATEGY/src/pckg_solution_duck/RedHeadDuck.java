package pckg_solution_duck;

import pckg_solution_duck.flyBehaviours.FlyBehaviour;
import pckg_solution_duck.quackBehaviours.QuackBehaviour;
import pckg_solution_duck.swimBehaviour.SwimBehaviour;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(FlyBehaviour fb, QuackBehaviour qb, SwimBehaviour sb) {
        super(fb, qb, sb);
    }
}
