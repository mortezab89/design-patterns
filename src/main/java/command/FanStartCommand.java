package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class FanStartCommand implements ICommand {

    Fan fan;

    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }
}
