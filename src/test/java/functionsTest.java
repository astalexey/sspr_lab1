import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Functions.*;

public class functionsTest {
    Functions functions = new Functions();
    @Test
    public void Test1() {
        int a = 15, b = 21;
        int sum = functions.sum(a,b);
        Assertions.assertEquals(36, sum);
    }

    @Test
    public void Test2() {
        int a = 25, b = 10;
        int sub = functions.sub(a,b);
        Assertions.assertEquals(15, sub);
    }

    @Test
    public void Test3() {
        int a = 25, b = 10;
        int mul = functions.mul(a,b);
        Assertions.assertEquals(250, mul);
    }

    @Test
    public void Test4() {
        int a = 55;
        int b = 5;
        int div = (int) functions.div(a,b);
        Assertions.assertEquals(11, div);
    }
}
