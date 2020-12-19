package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.white.PawnWhite;

import static org.hamcrest.Matchers.is;

import static org.junit.Assert.assertThat;

public class LogicTest {

     @Test(expected = FigureNotFoundException.class)
    public void testMoveFigureNotFoundException() throws ImpossibleMoveException,FigureNotFoundException, OccupiedCellException {
         Logic logic = new Logic();
         BishopBlack bishopBlack = new BishopBlack(Cell.C2);
         logic.add(bishopBlack);
         logic.move(Cell.C1,Cell.G5);

    }
    @Test(expected = OccupiedCellException.class)
    public void testMoveOccupiedCellException() throws ImpossibleMoveException,FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.E6);
        PawnWhite pawnWhite = new PawnWhite(Cell.D5);
        logic.add(pawnWhite);
        logic.add(bishopBlack);
        logic.move(Cell.E6, Cell.B3);
    }
    @Test(expected = ImpossibleMoveException.class)
    public void testMoveImpossibleMoveException() throws ImpossibleMoveException,FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.E6);
        logic.add(bishopBlack);
        logic.move(Cell.E6, Cell.D6);
    }
}