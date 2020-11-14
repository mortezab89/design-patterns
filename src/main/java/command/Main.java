package command;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class Main {

    public static void main(String[] args) {
        HomeRemote homeRemote = new HomeRemote();

        Light livingRoomLight = new Light();

        homeRemote.setiCommand(new LightOnCommand(livingRoomLight));
        homeRemote.buttonPressed();

        homeRemote.setiCommand(new LightOffCommand(livingRoomLight));
        homeRemote.buttonPressed();

        Fan fan = new Fan();
        homeRemote.setiCommand(new FanStartCommand(fan));
        homeRemote.buttonPressed();

        homeRemote.setiCommand(new FanStopCommand(fan));
        homeRemote.buttonPressed();

    }
}
