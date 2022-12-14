package oct20;

import october.oct20.Bracket;
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

        assertTrue(br.solutionMulti("{{[}(]})"));
        assertFalse(br.solutionMulti("()[]{)"));
    }
}