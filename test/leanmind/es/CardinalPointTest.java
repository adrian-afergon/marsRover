package leanmind.es;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardinalPointTest {

    @Test
    public void be_equal() {
        CardinalPoint firstCardinalPoint = new CardinalPoint(0 , 0);
        CardinalPoint secondCardinalPoint = new CardinalPoint(0, 0);

        Assert.assertEquals(firstCardinalPoint, secondCardinalPoint);
    }

    @Test
    public void not_equal() {
        CardinalPoint firstCardinalPoint = new CardinalPoint(0 , 0);
        CardinalPoint secondCardinalPoint = new CardinalPoint(0, 1);

        Assert.assertNotEquals(firstCardinalPoint, secondCardinalPoint);
        Assert.assertNotEquals(firstCardinalPoint, "Not a cardinal point");
    }

}