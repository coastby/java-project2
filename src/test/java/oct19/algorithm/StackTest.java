package oct19.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @BeforeEach
    void setUp(){
        System.out.println("Test start");
    }

    @Test
    @DisplayName("push test")
    void push() {
        Stack s = new Stack();
        s.push(200);
        s.push(300);
        Integer[] arr = s.getArr();
        assertEquals(200, arr[0]);
        assertEquals(300, arr[1]);
    }

    @Test
    @DisplayName("push and pop test")
    void pushAndPop() {
        Stack s = new Stack();
        s.push(200);
        s.push(300);

        assertEquals(300, s.pop());
        assertEquals(200, s.pop());

        //Exception 검증
        assertThrows(EmptyStackException.class, () -> {
            s.pop();
        });
    }

    @Test
    void isEmpty() {
        Stack s = new Stack();
        assertTrue(s.isEmpty());
        s.push(400);
        assertFalse(s.isEmpty());
        s.pop();
        assertTrue(s.isEmpty());
    }

    @Test
    void realStack(){
        java.util.Stack<Integer> st = new java.util.Stack<>();
        assertThrows(EmptyStackException.class, () -> {
            st.pop();
        });
    }

}