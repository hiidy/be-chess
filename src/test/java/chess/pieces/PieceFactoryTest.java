package chess.pieces;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PieceFactoryTest {

    @Test
    @DisplayName("팩토리 메서드로 Pawn이 잘 생성되는지 확인하는 테스트")
    void testCreatePawnByPieceFactory() {
        Piece pawn = PieceFactory.createPiece("pawn", Color.WHITE);
        assertThat(pawn).isInstanceOf(Pawn.class);
    }

    @Test
    @DisplayName("대문자로 PAWN을 입력했을때 객체가 잘 생성되는지 확인하는 테스트")
    void testCreatePawnInUpperCase() {
        Piece pawn = PieceFactory.createPiece("PAWN", Color.WHITE);
        assertThat(pawn).isInstanceOf(Pawn.class);
    }

    @Test
    @DisplayName("팩토리 메서드로 pawn을 생성했을 때 흰색이 잘 할당되었는지 확인하는 테스트")
    void testAssignColorByPieceFactory() {
        Piece pawn = PieceFactory.createPiece("pawn", Color.WHITE);
        assertThat(pawn.getColor()).isEqualTo(Color.WHITE);
    }

}
