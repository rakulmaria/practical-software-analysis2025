package exercises;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @ParameterizedTest(name = "midpoint({0}, {1}) -> {2}")
    @CsvSource({
        "0, 0, 0",
        "0, 1, 0",
        "1, 2, 1",
        "2, 7, 4",
        "3, 7, 5"
        // add other valid test inputs here
        
    })
    void midpoint_cases(int low, int high, int expected) {
        assertEquals(expected, BinarySearch.midpoint(low, high));
    }

    // Test using @CsvFileSource
    // @ParameterizedTest
    // @CsvFileSource(resources = "/search/midpoint_cases.csv", delimiter = ';')
    // ...

}

