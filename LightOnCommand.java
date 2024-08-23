class LightOnCommand implements command {
    private Light light;
    private int previousBrightness;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.on();
    }
    @Override
    public void undo() {
        if (previousBrightness == 0) {
            light.off();
        } else {
            light.dim(previousBrightness);
        }
    }
}