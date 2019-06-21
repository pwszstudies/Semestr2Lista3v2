package Zadanie3.tests;

import Zadanie3.TradeSession;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class SumCoinsTest {
    MiscOperations miscOperations;

    @Before
    public void setUp() throws Exception {
        miscOperations = new MiscOperations();
    }

    @Test
    public void coinsInsideTest() {
        TradeSession sessionTest1 = mock(TradeSession.class);

        stub(sessionTest1.getCoinsInside().get("5zl")).toReturn(3);
//        Mockito.when(sessionTest1.getCoinsInside().get("5zl"))).thenReturn(3);
        doReturn(3).when(sessionTest1).getCoinsInside().get("5zl");
//        Mockito.doReturn(4).when((sessionTest1).getCoinsInside().get("2zl"));
//        Mockito.doReturn(2).when((sessionTest1).getCoinsInside().get("20gr"));
//       assertEquals((miscOperations.buyItem(sessionTest1)), 15);
    }
}