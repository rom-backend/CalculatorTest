import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*jUnit을 사용한 테스트코드 작성*/
class CalculatorTest2 {
    Calculator cal;

    @BeforeEach
    public void setUp() {
        System.out.println("setup");
    }

    @Test
    public void test1() throws Exception{
        System.out.println("test1");
    }

    @Test
    public void test2() throws Exception{
        System.out.println("test2");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("teardown");
    }

}