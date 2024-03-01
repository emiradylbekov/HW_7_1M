public class Magic extends Hero{
    public Magic() {
        super(150, 30, "MAGICAL DAMAGE");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность: " + superAbility);

    }
}
