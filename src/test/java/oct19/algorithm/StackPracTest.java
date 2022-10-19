package oct19.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackPracTest {
    @Test
    public void pushTest() {
        StackPrac stackPrac = new StackPrac();
        stackPrac.push(0);
        stackPrac.push(2);

        int[] result = stackPrac.getStack();

        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(0, result[0]);
    }

}