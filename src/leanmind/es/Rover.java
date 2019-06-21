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
        for (Command command : commands) {
            if (command.isForwards()) {
                moveForwards();
            } else if (command.isBackwards()) {
                moveBackwards();
            }
        }
    }

    private void moveBackwards() {
        int currentY = this.position.getY();
        this.position = new Position(0, currentY - 1);
    }

    private void moveForwards() {
        int currentY = this.position.getY();
        this.position = new Position(0, currentY + 1);
    }

    Position position() {
        return this.position;
    }

    CardinalPoint direction() {
        return this.cardinalPoint;
    }
}
