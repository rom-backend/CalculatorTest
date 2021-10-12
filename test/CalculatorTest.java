import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*jUnit을 사용한 테스트코드 작성*/
class CalculatorTest {
    Calculator cal;

    @BeforeEach
    public void setUp() {
        cal = new Calculator();
    }

    @Test
    public void 덧셈() {
        assertEquals(7, cal.add(3,4));
    }

    @Test
    public void 뺄셈() {
        assertEquals(1, cal.subtract(5, 4));
    }

    @Test
    public void 곱하기() {
        assertEquals(20, cal.multiply(5, 4));
    }

    @Test
    public void 나누기() {
        assertEquals(5, cal.divide(20, 4));
    }

    @AfterEach
    public void tearDown() {
        cal = null;
    }

}