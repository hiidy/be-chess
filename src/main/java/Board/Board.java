package board;

import java.util.ArrayList;
import java.util.List;
import pieces.Pawn;

public class Board {

    private static final int MAXIMUM_PAWN_NUMBER = 8;

    private List<Pawn> pieces = new ArrayList<>();

    public void addPawn(Pawn pawn) {
        checkPawnCount();
        pieces.add(pawn);
    }

    public int getBoardSize() {
        return pieces.size();
    }

    public Pawn findPawn(int pawnIndex) {
        return pieces.get(pawnIndex);
    }

    private void checkPawnCount() {
        if (getBoardSize() == MAXIMUM_PAWN_NUMBER) {
            throw new IllegalStateException("최대 폰 개수를 초과하였습니다.");
        }
    }
}
