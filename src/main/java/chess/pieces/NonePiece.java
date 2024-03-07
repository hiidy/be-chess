package chess.pieces;

public class NonePiece extends Piece {

    public NonePiece(PieceType type, Color color) {
        super(type, getSymbolForColor(), color);
    }

    private static String getSymbolForColor() {
        return ".";
    }
}
