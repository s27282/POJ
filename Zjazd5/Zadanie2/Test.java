package src.zadanie52;
import src.zadanie52.Movablepoint;

public class Test {
        public static void main(String[] args) {
            src.zadanie52.Movablepoint point = new Movablepoint(0, 0);

            System.out.println(point);
            point.moveUp();
            point.moveRight();
            System.out.println(point);

            point.moveUp();
            point.moveRight();
            System.out.println(point);

            point.moveDown();
            point.moveLeft();
            System.out.println(point);
        }
    }

