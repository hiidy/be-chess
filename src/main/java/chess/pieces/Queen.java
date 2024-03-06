package chess.pieces;

public class Queen extends Piece {

    public Queen(Color color) {
        super(getSymbolForColor(color), color);
    }

    public Queen() {
        super(getSymbolForColor(Color.WHITE), Color.WHITE);
    }

    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♛";
        } else {
            return "♕";
        }
    }
}
