package ru.job4j.chess;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.CoreMatchers.is;

public class BishopBlackTest {

    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Assert.assertThat(bishopBlack.position(), is(Cell.A1));
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        BishopBlack bishopBlackCopy = (BishopBlack) bishopBlack.copy(Cell.A5);
        Assert.assertThat(bishopBlackCopy.position(), is(Cell.A5));
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.C1, Cell.G5);
        Cell[] expect = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertThat(result, is(expect));
    }
}
