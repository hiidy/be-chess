package chess.pieces;

public class King extends Piece {

    public King(PieceType type, Color color) {
        super(type, getSymbolForColor(color), color);
    }


    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♚";
        } else {
            return "♔";
        }
    }
}
