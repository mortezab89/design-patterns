package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class LightOffCommand implements ICommand {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
