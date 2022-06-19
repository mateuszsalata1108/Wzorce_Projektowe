public abstract class SmoothieDecorator implements Smoothie {
    protected Smoothie customSmoothie;

    public SmoothieDecorator(Smoothie customSmoothie) {
        this.customSmoothie = customSmoothie;
    }

    @Override
    public String make() {
        return customSmoothie.make();
    }
}
