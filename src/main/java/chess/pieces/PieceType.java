package chess.pieces;

public enum PieceType {
    PAWN(1.0),
    KNIGHT(2.5),
    ROOK(5.0),
    BISHOP(3.0),
    QUEEN(9.0),
    KING(0.0),
    NONE(0.0);;

    private final double defaultPoint;

    PieceType(double defaultPoint) {
        this.defaultPoint = defaultPoint;
    }

    public double getDefaultPoint() {
        return defaultPoint;
    }
}
