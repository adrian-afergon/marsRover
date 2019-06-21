package leanmind.es;

public class Command {

    private CommandEnum command;

    Command(CommandEnum command) {
        this.command = command;
    }

    public static Command TURN_LEFT() {
        return new Command(CommandEnum.TURN_LEFT);
    }

    public static Command MOVE_FORWARDS() {
        return new Command(CommandEnum.MOVE_FORWARDS);
    }

    public static Command MOVE_BACKWARDS() {
        return new Command(CommandEnum.MOVE_BACKWARDS);
    }

    public static Command TURN_RIGHT() {
        return new Command(CommandEnum.TURN_RIGHT);
    }

    public boolean isForwards() {
        return this.command.equals(CommandEnum.MOVE_FORWARDS);
    }

    public boolean isBackwards() {
        return this.command.equals(CommandEnum.MOVE_BACKWARDS);
    }

}