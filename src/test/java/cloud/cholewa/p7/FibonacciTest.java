package cloud.cholewa.p7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FibonacciTest {

    @ParameterizedTest
    @MethodSource("fibonacciParams")
    void shouldCalculateFibonacci(int n, int expected) {
        //when
        int fibonacci = Fibonacci.fibonacci(n);
        //then
        assertThat(fibonacci).isEqualTo(expected);
    }

    static Stream<Arguments> fibonacciParams() {
        return Stream.of(
                arguments(0, 0),
                arguments(1, 1),
                arguments(2, 1),
                arguments(3, 2),
                arguments(4, 3),
                arguments(5, 5),
                arguments(6, 8),
                arguments(7, 13),
                arguments(8, 21),
                arguments(9, 34),
                arguments(10, 55),
                arguments(11, 89),
                arguments(12, 144)
        );
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34",
            "10, 55",
            "11, 89",
            "12, 144"
    })
    void shouldCalculateFibonacciWith_CSVSource(int n, int expected) {
        //when
        int fibonacci = Fibonacci.fibonacci(n);
        //then
        assertThat(fibonacci).isEqualTo(expected);
    }
}
