import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import Board.Board;
import Piece.Pawn;
import Piece.Pawn.Color;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    @DisplayName("체스판을 만들고 폰을 추가한 후 판의 사이즈와 find기능을 테스트")
    void createChessBoard() {
        Board board = new Board();

        Pawn white = new Pawn(Color.WHITE);
        board.addPawn(white);
        assertEquals(1, board.getBoardSize());
        assertEquals(white, board.findPawn(0));

        Pawn black = new Pawn(Color.BLACK);
        board.addPawn(black);
        assertEquals(2, board.getBoardSize());
        assertEquals(black, board.findPawn(1));
    }

    @Test
    @DisplayName("최대 폰 개수 초과 테스트")
    void exceedMaximumPawnNumber() {
        Board board = new Board();

        for (int i = 0; i < 8; i++) {
            board.addPawn(new Pawn());
        }

        assertEquals(8, board.getBoardSize());
        assertEquals("최대 폰 개수를 초과하였습니다.", assertThrows(IllegalStateException.class,
            () -> board.addPawn(new Pawn())).getMessage());
    }
}
