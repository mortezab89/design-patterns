package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class HomeRemote {

    ICommand iCommand;

    public HomeRemote() {
    }

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void buttonPressed(){
        iCommand.execute();
    }
}
