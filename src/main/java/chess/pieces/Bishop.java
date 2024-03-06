package chess.pieces;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(getSymbolForColor(color), color);
    }

    public Bishop() {
        super(getSymbolForColor(Color.WHITE), Color.WHITE);
    }

    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♝";
        } else {
            return "♗";
        }
    }
}
