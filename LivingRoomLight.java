class LivingRoomLight implements Light {
    private int brightness = 0;

    @Override
    public void on() {
        System.out.println("Living room light is on");
        brightness = 100;
    }

    @Override
    public void off() {
        System.out.println("Living room light is off");
        brightness = 0;
    }
    @Override
    public void dim(int level) {
        System.out.println("Living room light is dimmed to " + level + "%");
        brightness = level;
    }

    public int getBrightness() {
        return brightness;
    }
}
