package chess.pieces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PawnTest {


    @Test
    @DisplayName("흰색pawn을 만들어서 흰색이 잘 할당되었는지 확인합니다.")
    void verifyCreateWhitePawn() {
        Piece pawn = new Pawn(Color.WHITE);
        assertThat(pawn.isWhite()).isTrue();
    }

    @Test
    @DisplayName("흰색 Pawn일 때 ♟기호가 할당되는지 테스트합니다.")
    void verifyWhitePawnSymbol() {
        Piece whitePawn = new Pawn(Color.WHITE);
        assertThat(whitePawn.getSymbol()).isEqualTo("♟");
    }

    @Test
    @DisplayName("검은색 Pawn일 때 ♙기호가 할당되는지 테스트합니다.")
    void verifyBlackPawnSymbol() {
        Piece blackPawn = new Pawn(Color.BLACK);
        assertThat(blackPawn.getSymbol()).isEqualTo("♙");
    }
}