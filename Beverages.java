abstract class Beverages {
    private boolean wantsExtras;

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }
    public abstract void boilWater();
    public abstract void brew();
    public abstract void pourInCup();
    public abstract void addCondiments();
    public abstract void addExtras();

    public void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras)
            addExtras();
    }

    }

