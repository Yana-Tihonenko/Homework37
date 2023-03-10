import java.util.ArrayList;

public class Rook {
    public enum Color {
        WHITE,
        BLACK,
    }

    private int row;
    private int column;

    private Color color;

    private Rook(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public Color getColor() {
        return color;
    }

    public void setCoordinates(int row, int column) {
        Pawn.checkCoordinates(row, column);
        if (checkNewPosition(row, column) == true) {
            this.row = row;
            this.column = column;
        } else {
            System.err.println("Error new position");
        }

    }

    public ArrayList<Rook> initializationRooks(Color color) {
        ArrayList result = new ArrayList();
        if (Color.WHITE == color) {
            result.add(new Rook(1, 1));
            result.add(new Rook(1, 8));
        }
        if (Color.BLACK == color) {
            result.add(new Rook(8, 1));
            result.add(new Rook(8, 8));
        }
        return result;
    }

    public boolean checkNewPosition(int row, int column) {
        boolean flag = false;
        int currentRow = getRow();
        int currentColumn = getColumn();
        if (currentRow == row || currentColumn == column) {
            flag = true;
        }
        return flag;
    }
}
