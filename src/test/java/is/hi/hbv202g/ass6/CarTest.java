package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final Car BEETLE = new Car("Beetle");
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = BEETLE;
    }

    @Test
    public void getNameOfCar() {
        assertEquals("Beetle", car.getName());
    }

}
