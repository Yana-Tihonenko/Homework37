import java.util.ArrayList;
import java.util.HashMap;

public class Pawn {
    final int START_ROW = 2;

    public enum Color {
        WHITE,
        BLACK,
    }

    private Color color;
    private int row;
    private int column;

    public Pawn(Color color, int row, int column) {
        this.color = color;

        checkCoordinates(row, column);
        this.row = row;
        this.column = column;
    }

    public Pawn(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setCoordinates(int row, int column) {
        checkCoordinates(row, column);
        // TODO проверка возможности хода
        int currentRow = getRow();
        int currentColumn = getColumn();
        if (column == currentColumn) {
            if (currentRow == START_ROW && (row - currentRow > 2)) {
                System.out.printf("Некорректный ход. Номер строки может быть только %f или %f /n", currentRow + 1, currentRow + 2);
            } else if (row - currentRow != 1) {
                System.out.printf("Некорректный ход. Номер строки может быть только " + currentRow + 1);
            } else {
                this.row = row;
                this.column = column;
            }
        } else {
            System.out.println("Некорректный ход. Номер стоблца может быть только " + currentColumn);
        }


    }


    public static void checkCoordinates(int row, int column) {
        if (row < 1 || row > 8) {
            throw new IllegalArgumentException("Некорректный номер строки: " + row);
        }

        if (column < 1 || column > 8) {
            System.out.println("Некорректный номер столбца: " + column);throw new IllegalArgumentException();
        }
    }


}
