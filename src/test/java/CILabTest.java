import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //test for first letter capital
    @Test
    public void detectCapitalUseTest1() {
       myString.setString("Adsf");
        assertEquals(true, myString.detectCapitalUse());
    }
    //test for middle letter being capitalized
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("asdfHdasf");
        assertEquals(false, myString.detectCapitalUse());
    }

    //test for all letters being capitalized
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("ASDFASDF");
        assertEquals(true, myString.detectCapitalUse());
    }

}
