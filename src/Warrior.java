public class Warrior extends Hero{
    public Warrior() {
        super(200, 50, "CRITICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность: " + superAbility);

    }
}
