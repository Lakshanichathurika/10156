class LightDimCommand implements command {
    private Light light;
    private int level;
    private int previousBrightness;

    public LightDimCommand(Light light, int level) {
        this.light = light;
        this.level = level;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.dim(level);
    }
    @Override
    public void undo() {
        light.dim(previousBrightness);
    }
}