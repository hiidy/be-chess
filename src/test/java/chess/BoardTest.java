package chess;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import chess.pieces.Color;
import chess.pieces.Piece;
import chess.pieces.PieceType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
        board.initializeChessBoard();
    }


    @Test
    @DisplayName("PAWN과 WHITE 타입을 입력했을 때 기물이 총 몇개인지 찾는 테스트")
    void testGetPiecesNumber() {
        int pawnSum = board.getPiecesNumber(PieceType.PAWN, Color.WHITE);
        assertEquals(8, pawnSum);
    }

    @Test
    @DisplayName("초기화 된 체스판에서 좌표에 따라서 흰색 Pawn을 찾는 테스트")
    void testFindPieceByPosition() {
        assertEquals("♟", board.findPiece(new Position(Rank.SECOND, Column.A)).getSymbol());
    }

    @Test
    @DisplayName("전체 체스판이 제대로 출력되는지 테스트")
    void testPrintChessBoard() {
        assertEquals(
            "♜♞♝♛♚♝♞♜\n" +
                "♟♟♟♟♟♟♟♟\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "♙♙♙♙♙♙♙♙\n" +
                "♖♘♗♕♔♗♘♖\n", board.getChessBoardResult()
        );
    }

    @Test
    @DisplayName("기물을 움직이는 메서드 테스트")
    void testMovePiece() {
        board.move(new Position(Rank.SECOND, Column.A), new Position(Rank.FOURTH, Column.A));
        assertEquals("♟", board.findPiece(new Position(Rank.FOURTH, Column.A)).getSymbol());
    }

    @Test
    @DisplayName("기물들을 바꿀 때 객체가 동등한지 테스트")
    void testMovePieceByReplace() {
        Piece pieceBeforeMove = board.findPiece(new Position(Rank.SECOND, Column.A));
        board.move(new Position(Rank.SECOND, Column.A), new Position(Rank.FOURTH, Column.A));
        Piece pieceAfterMove = board.findPiece(new Position(Rank.FOURTH, Column.A));
        assertSame(pieceBeforeMove, pieceAfterMove);
        assertEquals(pieceBeforeMove, pieceAfterMove);
    }

    @Test
    @DisplayName("초기 체스판이 만들어질때 점수가 38점인지 확인하는 테스트")
    void testCalculateWhitePlayerScore() {
        assertEquals(38.0, board.calculateScoreByColor(Color.WHITE));
    }

    @Test
    @DisplayName("Pawn이 같은 열에 있을 때 0.5의 점수를 잘 갖는지 테스트")
    void testCheckTwoMorePawnInColumn() {
        board.move(new Position(Rank.SECOND, Column.B), new Position(Rank.THIRD, Column.C));
        assertEquals(37.0, board.calculateScoreByColor(Color.WHITE));

        board.move(new Position(Rank.SECOND, Column.A), new Position(Rank.FOURTH, Column.C));
        assertEquals(36.5, board.calculateScoreByColor(Color.WHITE));
    }
}
