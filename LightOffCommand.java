class LightOffCommand implements command {
    private Light light;
    private int previousBrightness;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.off();
    }
    @Override
    public void undo() {
        if (previousBrightness == 100) {
            light.on();
        } else {
            light.dim(previousBrightness);
        }
    }
}