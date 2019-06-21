package leanmind.es;

import org.junit.Assert;
import org.junit.Test;

public class PositionTest {

    @Test
    public void be_equal() {
        Position firstPosition = new Position(0 , 0);
        Position secondPosition = new Position(0, 0);

        Assert.assertEquals(firstPosition, secondPosition);
    }

    @Test
    public void not_equal() {
        Position firstPosition = new Position(0 , 0);
        Position secondPosition = new Position(0, 1);

        Assert.assertNotEquals(firstPosition, secondPosition);
        Assert.assertNotEquals(firstPosition, "Not a cardinal point");
    }

}