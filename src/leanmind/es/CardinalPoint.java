package leanmind.es;

public class CardinalPoint {
    private int x;
    private int y;

    CardinalPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CardinalPoint) {
            CardinalPoint cardinalPoint = (CardinalPoint) obj;
            return this.x == cardinalPoint.x && this.y == cardinalPoint.y;
        }
        return false;
    }
}
