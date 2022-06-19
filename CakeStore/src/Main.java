enum CakeType {
    Chocolate, Strawberry, Orange, Amaretto
}

interface CakeFactory {
    Cake produceCake(CakeType type);
}

class FirstFactory implements CakeFactory {

    @Override
    public Cake produceCake(CakeType type) {

        Cake cake = null;

        switch (type) {
            case Chocolate: {
                cake = new ChocolateCake();
                break;
            }
            case Strawberry: {
                cake = new StrawberryCake();
                break;
            }
            case Orange: {
                cake = new OrangeCake();
                break;
            }
            case Amaretto: {
                cake = new AmarettoCake();
                break;
            }
        }
        return cake;
    }
}


abstract class Cake {

    protected CakeType type;

    public abstract Cake getCake();
}

class ChocolateCake extends Cake {

    public ChocolateCake() {
        type = CakeType.Chocolate;
        System.out.println("Chocolate cake");
    }

    protected void AddIngridients() {
        System.out.println("Add ingridients...");
    }

    @Override
    public Cake getCake() {
        AddIngridients();
        return this;
    }
}

class StrawberryCake extends Cake {

    public StrawberryCake() {
        type = CakeType.Strawberry;
        System.out.println("Strawberry Cake");
    }

    protected void addStrawberry() {
        System.out.println("Add strawberry...");
    }

    protected void addCream() {
        System.out.println("Add cream...");
    }

    @Override
    public Cake getCake() {
        addStrawberry();
        addCream();
        return this;
    }
}

class OrangeCake extends Cake {

    public OrangeCake() {
        type = CakeType.Orange;
        System.out.println("Orange Cake");
    }

    protected void addOrange() {
        System.out.println("Add orange...");
    }

    protected void addCream() {
        System.out.println("Add cream...");
    }

    @Override
    public Cake getCake() {
        addOrange();
        addCream();
        return this;
    }
}


class AmarettoCake extends Cake {

    public AmarettoCake() {
        type = CakeType.Amaretto;
        System.out.println("Amaretto Cake");
    }


    protected void addAmaretto() {
        System.out.println("Add amaretto...");
    }


    @Override
    public Cake getCake() {
        addAmaretto();
        return this;
    }
}


public class Main {

    public static void main(String args[]) {
        CakeFactory factory = new FirstFactory();
        Cake chocolate = factory.produceCake(CakeType.Chocolate);
        Cake strawberry = factory.produceCake(CakeType.Strawberry);
        Cake amaretto = factory.produceCake(CakeType.Amaretto);
        Cake orange = factory.produceCake(CakeType.Orange);
    }
}