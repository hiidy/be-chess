import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;


class PawnTest {

    @Test
    @DisplayName("pawn 생성 테스트")
    void createPawn() {

        verifyPawn("white");
        verifyPawn("black");
    }

    void verifyPawn(final String color) {
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }

}