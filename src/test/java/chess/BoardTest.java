package chess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import chess.pieces.Color;
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

//    @Test
//    @DisplayName("체스판을 초기화했을 때 기물의 개수가 총 32개인지 테스트")
//    void testInitializePawn() {
//        board.initializeChessBoard();
//
//    }

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
}
