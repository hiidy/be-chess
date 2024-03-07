package chess.pieces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PawnTest {

    @Test
    @DisplayName("흰색과 검은색을 할당해서 Pawn 생성기능 테스트")
    void createPawn() {
        verifyPawn(Color.WHITE);
        verifyPawn(Color.BLACK);
    }

    void verifyPawn(Color color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
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