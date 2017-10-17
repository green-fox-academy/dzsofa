package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument() {
        this.name = "StringedInstrument";
        this.numberOfStrings = 0;
    }

    public StringedInstrument(int numberOfStrings) {
        this.name = "StringedInstrument";
        this.numberOfStrings = numberOfStrings;
    }

    public String sound() {
        return "giving sound";
    }

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
    }
}
