public class TestSmoothie {
    public static void main(String arg[]) {
        Smoothie smoothie = new FlavourDecorator(new FruitDecorator(new BasicSmoothie()));
        System.out.println(smoothie.make());
    }
}
