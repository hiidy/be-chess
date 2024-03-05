package Board;

import Piece.Pawn;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int MAXIMUM_PAWN_NUMBER = 8;

    private List<Pawn> board = new ArrayList<>();

    public void addPawn(Pawn pawn) {
        checkPawnCount();
        board.add(pawn);
    }

    public int getBoardSize() {
        return board.size();
    }

    public Pawn findPawn(int pawnIndex) {
        return board.get(pawnIndex);
    }

    private void checkPawnCount() {
        if (getBoardSize() == MAXIMUM_PAWN_NUMBER) {
            throw new IllegalStateException("최대 폰 개수를 초과하였습니다.");
        }
    }
}
