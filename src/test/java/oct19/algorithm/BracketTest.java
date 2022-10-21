package oct19.algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {
    @Test
    @DisplayName("괄호짝 확인하기")
    void bracketTest(){
        Bracket br = new Bracket();
        assertTrue(br.solution("()()"));
        assertTrue(br.solution("(())()"));
        assertFalse(br.solution(")()("));
        assertFalse(br.solution("(()("));
    }

}