package Commandpattern;

// command invoker
public class Remote {
    private Command command;
    public Remote(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
