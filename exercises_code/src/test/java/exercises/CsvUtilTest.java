package exercises;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;




class CsvUtilTest {

    //Template for a parameterized test
    @ParameterizedTest
    @MethodSource("cases")
    void splitCsv_singleEmptyField_preservesAllFields(String input, String[] expected) {
        
    }

    //Generator method
    /*  static Stream<Arguments> cases() {return Stream.of(....);}*/

}

