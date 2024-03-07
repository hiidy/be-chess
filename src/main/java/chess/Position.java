package chess;

import java.util.Objects;

public class Position {

    private final Rank rank;
    private final Column column;

    public Position(Rank rank, Column column) {
        this.rank = rank;
        this.column = column;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Position other = (Position) obj;
        return this.rank == other.rank && this.column == other.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, column);
    }
}
