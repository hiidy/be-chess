package chess.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("문자열에 개행문자를 추가하는 메서드를 테스트")
    void testAppendNewLine() {
        String text = "hi";
        String addedText = StringUtils.appendNewLine(text);
        Assertions.assertEquals("hi\n", addedText);
    }
}
