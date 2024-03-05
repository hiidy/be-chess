package chess.pieces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pieces.Pawn;
import pieces.Pawn.Color;


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
    @DisplayName("pawn 기본 생성자가 흰색 폰으로 생성되는지 테스트")
    void createDefaultConstructor() {
        Pawn pawn = new Pawn();
        assertThat(pawn.getColor()).isEqualTo(Color.WHITE);
    }
}