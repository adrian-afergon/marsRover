package leanmind.es;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RoverTest {

    @Test
    public void stay_in_place_if_no_commands_are_received() {
        Position initialPosition = new Position(0,0);
        CardinalPoint initialCardinalPoint = CardinalPoint.NORTH;
        Rover wally = new Rover(initialPosition, initialCardinalPoint);
        List<Character> commands = new ArrayList<>();

        wally.execute(commands);
        Position finalPosition = wally.position();

        Assert.assertEquals(initialPosition, finalPosition);
    }

    @Test
    public void does_not_turn_if_no_commands_are_received() {
        Position initialPosition = new Position(0,0);
        CardinalPoint initialCardinalPoint = CardinalPoint.NORTH;
        Rover wally = new Rover(initialPosition, initialCardinalPoint);
        List<Character> commands = new ArrayList<>();

        wally.execute(commands);
        CardinalPoint currentDirection = wally.direction();

        Assert.assertEquals(CardinalPoint.NORTH, currentDirection);
    }

}
