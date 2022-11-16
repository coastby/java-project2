package oct19.algorithm;

import october.algorithm.StackPrac;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StackPracTest {
    @Test
    public void pushTest() {
        StackPrac stackPrac = new StackPrac();
        stackPrac.push(0);
        stackPrac.push(2);

        int[] result = stackPrac.getArr();

        Assertions.assertEquals(2, result[1]);
        Assertions.assertEquals(0, result[0]);
    }

    @Test
    @DisplayName("pop(), push() test")
    public void pushAndPop(){
        StackPrac sp = new StackPrac();
        sp.push(100);
        sp.push(200);

        Assertions.assertEquals(100, sp.getArr()[0]);
        Assertions.assertEquals(200, sp.getArr()[1]);

        int a = sp.pop();
        Assertions.assertEquals(200, a);
    }

}