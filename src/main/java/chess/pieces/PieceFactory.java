package chess.pieces;

public class PieceFactory {

    public static Piece createPiece(PieceType pieceType, Color color) {
        switch (pieceType) {
            case PAWN:
                return new Pawn(pieceType, color);
            case ROOK:
                return new Rook(pieceType, color);
            case KNIGHT:
                return new Knight(pieceType, color);
            case BISHOP:
                return new Bishop(pieceType, color);
            case QUEEN:
                return new Queen(pieceType, color);
            case KING:
                return new King(pieceType, color);
            case NONE:
                return new NonePiece(pieceType, color);
            default:
                throw new IllegalArgumentException("잘못된 기물 타입입니다");
        }
    }
}
