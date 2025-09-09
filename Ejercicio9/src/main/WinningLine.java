package main;

public class WinningLine {
    public enum Type {
        ROW, COLUMN, DIAGONAL_MAIN, DIAGONAL_SECONDARY
    }
    private Type type;
    private int index;
    private int diagonal;

    public WinningLine(Type type, int index, int diagonal) {
        this.type = type;
        this.index = index;
        this.diagonal = diagonal;
    }

    public Type getType() {
        return type;
    }
    public boolean isRow() {
        return type == Type.ROW;
    }

    public boolean isColumn() {
        return type == Type.COLUMN;
    }

    public boolean isDiagonalMain() {
        return type == Type.DIAGONAL_MAIN;
    }
    public boolean isDiagonalSecondary() {
        return type == Type.DIAGONAL_SECONDARY;
    }

    public int getIndex() {
        return index;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
}

