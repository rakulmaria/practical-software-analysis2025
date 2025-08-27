package exercises;

public final class CsvUtil {
    private CsvUtil() {}

    public static String[] splitCsv(String line) {
        if (line == null) throw new IllegalArgumentException("null");
        return line.split(",");
    }
}

