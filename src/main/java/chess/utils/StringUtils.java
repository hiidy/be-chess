package chess.utils;

public class StringUtils {

    private static final String NEWLINE = System.lineSeparator();

    private StringUtils() {
    }

    public static String appendNewLine(String inputText) {
        return inputText + NEWLINE;
    }
}
