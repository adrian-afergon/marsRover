package leanmind.es;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {

    private Rover wally;
    private Position initialPosition;
    private CardinalPoint initialCardinalPoint;

    @Before
    public void initializeRover() {
        initialPosition = new Position(0, 0);
        initialCardinalPoint = CardinalPoint.NORTH;
        wally = new Rover(initialPosition, initialCardinalPoint);
    }

    @Test
    public void stay_in_place_if_no_commands_are_received() {
        List<Command> commands = new ArrayList<>();

        wally.execute(commands);
        Position finalPosition = wally.position();

        Assert.assertEquals(initialPosition, finalPosition);
    }

    @Test
    public void does_not_turn_if_no_commands_are_received() {
        List<Command> commands = new ArrayList<>();

        wally.execute(commands);
        CardinalPoint currentDirection = wally.direction();

        Assert.assertEquals(initialCardinalPoint, currentDirection);
    }

    @Test
    public void move_forwards() {
        List<Command> commands = new ArrayList<>();
        commands.add(Command.MOVE_FORWARDS());
        commands.add(Command.MOVE_FORWARDS());

        wally.execute(commands);
        Position currentPosition = wally.position();
        Position expectedDirection = new Position(0, 2);

        Assert.assertEquals(expectedDirection, currentPosition);
    }

    @Test
    public void move_backwards() {
        List<Command> commands = new ArrayList<>();
        commands.add(Command.MOVE_BACKWARDS());

        wally.execute(commands);
        Position currentPosition = wally.position();
        Position expectedDirection = new Position(0, -1);

        Assert.assertEquals(expectedDirection, currentPosition);
    }

}
