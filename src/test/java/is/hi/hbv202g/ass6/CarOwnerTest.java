package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarOwnerTest {

    public static final Car BEETLE = new Car("Beetle");
    public static final CarOwner JOHN_DOE = new CarOwner("John Doe");
    private Car beetle;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        beetle = BEETLE;
        carOwner = JOHN_DOE;
    }

    @Test
    public void getName() {
        Car car = beetle;
        assertEquals("John Doe", carOwner.getName());
        assertEquals("Beetle", car.getName());
    }

}
