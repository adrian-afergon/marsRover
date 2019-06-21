package leanmind.es;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class roverTest {

    @Test
    public void stay_in_place_when_no_commands_are_received() {
        Rover wally = new Rover();
        List<Character> commands = new ArrayList<>();
        CardinalPoint finalPosition = new CardinalPoint(0, 0);
        CardinalPoint initialPosition = new CardinalPoint(0,0);

        wally.execute(commands);

        Assert.assertEquals(initialPosition, finalPosition);
    }

}
