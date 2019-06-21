package Zadanie3.tests;

import Zadanie3.TradeSession;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import static org.assertj.core.api.Assertions.assertThat;

public class BuyItemTest {
    MiscOperations miscOperations;
    @Before
    public void setUp() throws Exception {
        miscOperations = new MiscOperations();
    }

    @Test
    public void buyItem() {
        TradeSession sessionTest1 = Mockito.mock(TradeSession.class);
        Mockito.stub(sessionTest1.sumCoins()).toReturn(12f);
        assertThat(miscOperations.buyItem(sessionTest1, 7f)).isEqualTo(5f);
        assertThat(miscOperations.buyItem(sessionTest1, 12f)).isEqualTo(0f);
        assertThat(miscOperations.buyItem(sessionTest1, 15f)).isEqualTo(-1f);
        assertThat(miscOperations.buyItem(sessionTest1, 11f)).isEqualTo(1f);

    }
}