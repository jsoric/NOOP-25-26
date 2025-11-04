package pckg_solution_duck.quackBehaviours;

public class MuteQuack implements QuackBehaviour {

    @Override
    public String quack() {
        return " can't quack!";
    }
}
