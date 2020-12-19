package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest  {
     @Test
    public void testPosition() {
       BishopBlack bishopBlack = new BishopBlack(Cell.A2);
       assertThat(bishopBlack.position(),is(Cell.A2));
    }
    @Test
    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        assertThat(bishopBlack.copy(Cell.C1).position(),is(Cell.C1));
    }
  @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C1,Cell.G5);
        assertThat(bishopBlack.way(Cell.C1,Cell.G5),is(new Cell[]{Cell.D2,Cell.E3,Cell.F4,Cell.G5}));
    }
}