package chess.pieces;

public class Knight extends Piece {

    public Knight(Color color) {
        super(getSymbolForColor(color), color);
    }


    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♞";
        } else {
            return "♘";
        }
    }
}
