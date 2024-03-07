package chess.pieces;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(getSymbolForColor(color), color);
    }


    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♟";
        } else {
            return "♙";
        }
    }


}
