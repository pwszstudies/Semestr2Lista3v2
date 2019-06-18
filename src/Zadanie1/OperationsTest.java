package Zadanie1;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class OperationsTest {
    Operations conversion;

    @Before
    public void setUp() throws Exception {
        conversion = new Operations();
    }


    @Test
    public void kilometersToMiles() throws Exception {
        assertThat(conversion.calculate("22km")).isEqualTo("13,67mi");
        assertThat(conversion.calculate("58km")).isEqualTo("36,04mi");
        assertThat(conversion.calculate("789km")).isEqualTo("490,26mi");
        assertThat(conversion.calculate("123km")).isEqualTo("76,43mi");

    }

    @Test
    public void milesToKilometers() throws Exception {
        assertThat(conversion.calculate("22mi")).isEqualTo("35,41km");
        assertThat(conversion.calculate("58mi")).isEqualTo("93,34km");
        assertThat(conversion.calculate("789mi")).isEqualTo("1269,77km");
        assertThat(conversion.calculate("123mi")).isEqualTo("197,95km");
    }
}