package chess;

import chess.pieces.Color;
import chess.pieces.Piece;
import chess.pieces.PieceFactory;
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
    }

    private void initializePawn() {
        for (int i = 1; i <= 8; i++) {
            piecePositions.put(new Position(2, i), PieceFactory.createPiece("pawn", Color.WHITE));
        }
        for (int i = 1; i <= 8; i++) {
            piecePositions.put(new Position(7, i), PieceFactory.createPiece("pawn", Color.BLACK));
        }
    }

    private void initializeKnight() {
        piecePositions.put(new Position(1, 2), PieceFactory.createPiece("knight", Color.WHITE));
        piecePositions.put(new Position(1, 7), PieceFactory.createPiece("knight", Color.WHITE));
        piecePositions.put(new Position(8, 2), PieceFactory.createPiece("knight", Color.BLACK));
        piecePositions.put(new Position(8, 7), PieceFactory.createPiece("knight", Color.BLACK));
    }

    private void initializeBishop() {
        piecePositions.put(new Position(1, 3), PieceFactory.createPiece("bishop", Color.WHITE));
        piecePositions.put(new Position(1, 6), PieceFactory.createPiece("bishop", Color.WHITE));
        piecePositions.put(new Position(8, 3), PieceFactory.createPiece("bishop", Color.BLACK));
        piecePositions.put(new Position(8, 6), PieceFactory.createPiece("bishop", Color.BLACK));
    }

    private void initializeRook() {
        piecePositions.put(new Position(1, 1), PieceFactory.createPiece("rook", Color.WHITE));
        piecePositions.put(new Position(1, 8), PieceFactory.createPiece("rook", Color.WHITE));
        piecePositions.put(new Position(8, 1), PieceFactory.createPiece("rook", Color.BLACK));
        piecePositions.put(new Position(8, 8), PieceFactory.createPiece("rook", Color.BLACK));
    }

    private void initializeQueen() {
        piecePositions.put(new Position(1, 4), PieceFactory.createPiece("queen", Color.WHITE));
        piecePositions.put(new Position(8, 4), PieceFactory.createPiece("queen", Color.BLACK));
    }

    private void initializeKing() {
        piecePositions.put(new Position(1, 5), PieceFactory.createPiece("king", Color.WHITE));
        piecePositions.put(new Position(8, 5), PieceFactory.createPiece("king", Color.BLACK));
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
