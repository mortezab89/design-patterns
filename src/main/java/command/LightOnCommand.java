package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
