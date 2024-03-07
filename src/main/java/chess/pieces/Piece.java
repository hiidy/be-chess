package chess.pieces;

public abstract class Piece {

    private final PieceType type;
    private final String symbol;
    private final Color color;

    protected Piece(PieceType type, String symbol, Color color) {
        this.type = type;
        this.symbol = symbol;
        this.color = color;
    }

    public String getSymbol() {
        return symbol;
    }

    public boolean isWhite() {
        return color == Color.WHITE;
    }

    public boolean isBlack() {
        return color == Color.BLACK;
    }

    public boolean isNone() {
        return color == Color.NOCOLOR;
    }

    public boolean isSameType(PieceType type) {
        return this.type == type;
    }

    public boolean isSameColor(Color color) {
        return this.color == color;
    }
}
