package Commandpattern;

public class CommandPattern {
    public static void main(String[] args) {
        // receiver
        Light light = new Light();
        // concrete imple of command
        Command onLight = new OnCommand(light);
        // invoker of command
        Remote remote = new Remote(onLight);
        remote.pressButton();

        Command ofLight = new OffCommand(light);
        Remote rem = new Remote(ofLight);
        rem.pressButton();
    }
}
