package pckg_solution_duck;

import pckg_solution_duck.flyBehaviours.FlyBehaviour;
import pckg_solution_duck.quackBehaviours.QuackBehaviour;
import pckg_solution_duck.swimBehaviour.SwimBehaviour;

public class DecoyDuck extends Duck{

    public DecoyDuck(FlyBehaviour fb, QuackBehaviour qb, SwimBehaviour sb) {
        super(fb, qb, sb);
    }
}
