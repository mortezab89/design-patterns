package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class FanStopCommand implements ICommand {

    Fan fan;

    public FanStopCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }
}
