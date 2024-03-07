package chess.pieces;

public class PieceFactory {

    public static Piece createPiece(String pieceType, Color color) {
        switch (pieceType.toLowerCase()) {
            case "pawn":
                return new Pawn(color);
            case "knight":
                return new Knight(color);
            case "bishop":
                return new Bishop(color);
            case "rook":
                return new Rook(color);
            case "queen":
                return new Queen(color);
            case "king":
                return new King(color);
            default:
                throw new IllegalArgumentException("알 수 없는 기물 타입입니다.");
        }
    }

}
