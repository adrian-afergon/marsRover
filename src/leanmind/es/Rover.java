package leanmind.es;

import java.util.List;

class Rover {

    private final Position position;
    private final CardinalPoint cardinalPoint;

    Rover(Position position, CardinalPoint cardinalPoint) {
        this.position = position;
        this.cardinalPoint = cardinalPoint;
    }

    void execute(List<Character> commands) {
    }

    Position position() {
        return this.position;
    }

    CardinalPoint direction() {
        return this.cardinalPoint;
    }
}
