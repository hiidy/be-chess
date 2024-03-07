package chess.pieces;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NonePieceTest {

    @Test
    @DisplayName("NonePiece객체를 만고 '.'기호가 할당되는지 테스트합니다.")
    void verifyNonePieceSymbol() {
        Piece nonePiece = new NonePiece(PieceType.NONE, Color.NOCOLOR);
        assertThat(nonePiece.getSymbol()).isEqualTo(".");
    }

    @Test
    @DisplayName("NonePiece객체를 만들고 NOCOLOR가 할당되는지 테스트합니다.")
    void verifyNonePieceColor() {
        Piece nonePiece = new NonePiece(PieceType.NONE, Color.NOCOLOR);
        assertThat(nonePiece.isNone()).isTrue();
    }

}
