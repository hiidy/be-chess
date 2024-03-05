package chess.pieces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pieces.Pawn;
import pieces.Pawn.Color;


class PawnTest {

    @Test
    @DisplayName("pawn 생성 테스트")
    void createPawn() {

        verifyPawn(Color.WHITE);
        verifyPawn(Color.BLACK);
    }

    void verifyPawn(Color color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

    @Test
    @DisplayName("pawn 기본 생성자 테스트")
    void createDefaultConstructor() {
        Pawn pawn = new Pawn();
        assertThat(pawn.getColor()).isEqualTo(Color.WHITE);
    }
}