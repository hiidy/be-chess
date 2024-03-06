package chess.pieces;

public abstract class Piece {

    private final String symbol;
    private final Color color;

    protected Piece(String symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    public String getSymbol() {
        return symbol;
    }

    public Color getColor() {
        return color;
    }
}
