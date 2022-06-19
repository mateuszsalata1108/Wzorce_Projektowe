public class FlavourDecorator extends SmoothieDecorator {
    public FlavourDecorator(Smoothie customSmoothie) {
        super(customSmoothie);
    }

    @Override
    public String make() {
        return customSmoothie.make() + addChocolate();
    }

    private String addChocolate() {
        return " + Chocolate";
    }
}
