package chess;

import chess.pieces.Color;
import chess.pieces.Piece;
import chess.pieces.PieceFactory;
import chess.pieces.PieceType;
import chess.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class Board {

    private final Map<Position, Piece> piecePositions = new HashMap<>();

    public void initializeChessBoard() {
        initializePawn();
        initializePieceWithoutPawn(Rank.FIRST, Color.WHITE);
        initializePieceWithoutPawn(Rank.EIGHTH, Color.BLACK);
        initializeNonePiece();
    }

    private void initializePawn() {
        for (Column column : Column.values()) {
            piecePositions.put(new Position(Rank.SECOND, column),
                PieceFactory.createPiece(PieceType.PAWN, Color.WHITE));
        }

        for (Column column : Column.values()) {
            piecePositions.put(new Position(Rank.SEVENTH, column),
                PieceFactory.createPiece(PieceType.PAWN, Color.BLACK));
        }
    }

    private void initializePieceWithoutPawn(Rank rank, Color color) {
        piecePositions.put(new Position(rank, Column.A),
            PieceFactory.createPiece(PieceType.ROOK, color));
        piecePositions.put(new Position(rank, Column.B),
            PieceFactory.createPiece(PieceType.KNIGHT, color));
        piecePositions.put(new Position(rank, Column.C),
            PieceFactory.createPiece(PieceType.BISHOP, color));
        piecePositions.put(new Position(rank, Column.D),
            PieceFactory.createPiece(PieceType.QUEEN, color));
        piecePositions.put(new Position(rank, Column.E),
            PieceFactory.createPiece(PieceType.KING, color));
        piecePositions.put(new Position(rank, Column.F),
            PieceFactory.createPiece(PieceType.BISHOP, color));
        piecePositions.put(new Position(rank, Column.G),
            PieceFactory.createPiece(PieceType.KNIGHT, color));
        piecePositions.put(new Position(rank, Column.H),
            PieceFactory.createPiece(PieceType.ROOK, color));
    }

    private void initializeNonePiece() {
        for (Column colum : Column.values()) {
            piecePositions.put(new Position(Rank.THIRD, colum),
                PieceFactory.createPiece(PieceType.NONE, Color.NOCOLOR));
            piecePositions.put(new Position(Rank.FOURTH, colum),
                PieceFactory.createPiece(PieceType.NONE, Color.NOCOLOR));
            piecePositions.put(new Position(Rank.FIFTH, colum),
                PieceFactory.createPiece(PieceType.NONE, Color.NOCOLOR));
            piecePositions.put(new Position(Rank.SIXTH, colum),
                PieceFactory.createPiece(PieceType.NONE, Color.NOCOLOR));
        }
    }

    public int getPiecesNumber(PieceType pieceType, Color color) {
        return piecePositions.values().stream()
            .filter(piece -> piece.isSameType(pieceType) && piece.isSameColor(color))
            .mapToInt(piece -> 1)
            .sum();
    }

    public Piece findPiece(Position position) {
        return piecePositions.get(position);
    }

    public String getChessBoardResult() {
        StringBuilder sb = new StringBuilder();
        for (Rank rank : Rank.values()) {
            sb.append(getRowResult(rank));
        }
        return sb.toString();
    }

    private String getRowResult(Rank rank) {
        StringBuilder sb = new StringBuilder();
        for (Column column : Column.values()) {
            sb.append(getPieceSymbol(rank, column));
        }
        return StringUtils.appendNewLine(sb.toString());
    }

    private String getPieceSymbol(Rank rank, Column column) {
        return findPiece(new Position(rank, column)).getSymbol();
    }

}
