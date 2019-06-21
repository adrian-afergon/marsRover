package leanmind.es;

public class Position {
    private int x;
    private int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Position) {
            Position position = (Position) obj;
            return this.x == position.x && this.y == position.y;
        }
        return false;
    }
}
