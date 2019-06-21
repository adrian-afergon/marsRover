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
        int[] finalPosition = {0, 0};
        int[] initialPosition = wally.position();

        wally.execute(commands);

        Assert.assertArrayEquals(initialPosition, finalPosition);
    }

}
