package addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddNumbersTest {

    private AddNumbers addNumbers;

    @BeforeEach
     void setUp() {
        addNumbers = new AddNumbers();
    }

    @AfterEach
    void tearDown() {
        addNumbers = null;
    }

    @Test
    void testAdd() {
        assertEquals(30, addNumbers.add(10, 20));
        assertNotEquals(50, addNumbers.add(20, 20));
    }

}