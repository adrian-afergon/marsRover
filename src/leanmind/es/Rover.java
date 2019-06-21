package leanmind.es;

import java.util.List;

class Rover {

    private Position position;
    private CardinalPoint cardinalPoint;

    Rover(Position position, CardinalPoint cardinalPoint) {
        this.position = position;
        this.cardinalPoint = cardinalPoint;
    }

    void execute(List<Command> commands) {
        for (int i = 0; i < commands.size(); i++) {
            this.position = new Position(0, this.position.getY() + 1);
        }
    }

    Position position() {
        return this.position;
    }

    CardinalPoint direction() {
        return this.cardinalPoint;
    }
}
