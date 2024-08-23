public class Tea extends Beverages{
    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void addExtras() {
        System.out.println();
    }
}
