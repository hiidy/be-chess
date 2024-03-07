package chess.pieces;

public class Rook extends Piece {

    public Rook(Color color) {
        super(getSymbolForColor(color), color);
    }


    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♜";
        } else {
            return "♖";
        }
    }

}
