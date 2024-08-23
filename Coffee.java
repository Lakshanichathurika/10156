public class Coffee extends Beverages {

    @Override
    public void boilWater() {
        System.out.println("Boiling water");
    }
    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
    @Override
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void addExtras() {
        System.out.println("Adding vanilla syrup");
    }

}
