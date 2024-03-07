package chess.pieces;

public class King extends Piece {

    public King(Color color) {
        super(getSymbolForColor(color), color);
    }


    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♚";
        } else {
            return "♔";
        }
    }
}
