package chess.pieces;

public class Rook extends Piece {

    public Rook(Color color) {
        super(getSymbolForColor(color), color);
    }

    public Rook() {
        super(getSymbolForColor(Color.WHITE), Color.WHITE);
    }

    private static String getSymbolForColor(Color color) {
        if (color == Color.WHITE) {
            return "♜";
        } else {
            return "♖";
        }
    }

}
