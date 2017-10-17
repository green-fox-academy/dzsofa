package main.java.music;

public abstract class Instrument {
    protected String name;

    public Instrument() {
        this.name = this.getClass().toString();
    }

    abstract void play();
}
