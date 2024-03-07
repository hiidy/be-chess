package chess;

import chess.pieces.Color;
import chess.pieces.Piece;
import chess.pieces.PieceFactory;
import chess.pieces.PieceType;
import java.util.HashMap;
import java.util.Map;

public class Board {

    private static final int CHESS_BOARD_SIZE = 8;

    private final Map<Position, Piece> piecePositions = new HashMap<>();

    public void initializeChessBoard() {
        initializePawn();
        initializeKnight();
        initializeBishop();
        initializeRook();
        initializeQueen();
        initializeKing();
        initializeNonePiece();
    }


    private void initializePawn() {
        for (int i = 1; i <= 8; i++) {
            piecePositions.put(new Position(2, i),
                PieceFactory.createPiece(PieceType.PAWN, Color.WHITE));
        }
        for (int i = 1; i <= 8; i++) {
            piecePositions.put(new Position(7, i),
                PieceFactory.createPiece(PieceType.PAWN, Color.BLACK));
        }
    }

    private void initializeKnight() {
        piecePositions.put(new Position(1, 2),
            PieceFactory.createPiece(PieceType.KNIGHT, Color.WHITE));
        piecePositions.put(new Position(1, 7),
            PieceFactory.createPiece(PieceType.KNIGHT, Color.WHITE));
        piecePositions.put(new Position(8, 2),
            PieceFactory.createPiece(PieceType.KNIGHT, Color.BLACK));
        piecePositions.put(new Position(8, 7),
            PieceFactory.createPiece(PieceType.KNIGHT, Color.BLACK));
    }

    private void initializeBishop() {
        piecePositions.put(new Position(1, 3),
            PieceFactory.createPiece(PieceType.BISHOP, Color.WHITE));
        piecePositions.put(new Position(1, 6),
            PieceFactory.createPiece(PieceType.BISHOP, Color.WHITE));
        piecePositions.put(new Position(8, 3),
            PieceFactory.createPiece(PieceType.BISHOP, Color.BLACK));
        piecePositions.put(new Position(8, 6),
            PieceFactory.createPiece(PieceType.BISHOP, Color.BLACK));
    }

    private void initializeRook() {
        piecePositions.put(new Position(1, 1),
            PieceFactory.createPiece(PieceType.ROOK, Color.WHITE));
        piecePositions.put(new Position(1, 8),
            PieceFactory.createPiece(PieceType.ROOK, Color.WHITE));
        piecePositions.put(new Position(8, 1),
            PieceFactory.createPiece(PieceType.ROOK, Color.BLACK));
        piecePositions.put(new Position(8, 8),
            PieceFactory.createPiece(PieceType.ROOK, Color.BLACK));
    }

    private void initializeQueen() {
        piecePositions.put(new Position(1, 4),
            PieceFactory.createPiece(PieceType.QUEEN, Color.WHITE));
        piecePositions.put(new Position(8, 4),
            PieceFactory.createPiece(PieceType.QUEEN, Color.BLACK));
    }

    private void initializeKing() {
        piecePositions.put(new Position(1, 5),
            PieceFactory.createPiece(PieceType.KING, Color.WHITE));
        piecePositions.put(new Position(8, 5),
            PieceFactory.createPiece(PieceType.KING, Color.BLACK));
    }

    private void initializeNonePiece() {
        for (int i = 3; i <= 6; i++) {
            for (int j = 1; j <= CHESS_BOARD_SIZE; j++) {
                piecePositions.put(new Position(i, j),
                    PieceFactory.createPiece(PieceType.NONE, Color.NOCOLOR));
            }
        }
    }

    public int getPiecesNumber() {
        return piecePositions.size();
    }

    public Piece findPiece(Position position) {
        return piecePositions.get(position);
    }

    public String getChessBoardResult() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= CHESS_BOARD_SIZE; i++) {
            sb.append(getRowResult(i));
        }
        return sb.toString();
    }

    private String getRowResult(int row) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= CHESS_BOARD_SIZE; i++) {
            sb.append(getPieceSymbol(row, i));
        }
        sb.append('\n');
        return sb.toString();
    }

    private String getPieceSymbol(int row, int col) {
        if (!piecePositions.containsKey(new Position(row, col))) {
            return ".";
        }
        return piecePositions.get(new Position(row, col)).getSymbol();
    }

}
