public class FruitDecorator extends SmoothieDecorator {
    public FruitDecorator(Smoothie customSmoothie) {
        super(customSmoothie);
    }

    @Override
    public String make() {
        return customSmoothie.make() + addFruit();
    }

    private String addFruit() {
        return " + Strawberry";
    }
}
