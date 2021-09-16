package cloud.cholewa.p6;

import org.junit.jupiter.api.Test;

import static cloud.cholewa.p6.ExceptionsExample.DEFAULT_NUMBER;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ExceptionsExampleTest {

    private final ExceptionsExample exceptionsExample = new ExceptionsExample();

    @Test
    public void shouldReturnStringFromNumberIfNumberIsLessThanDefault() {
        //given
        int number = 2;

        //when
        String s = exceptionsExample.doSomething(number);

        //then
        assertThat(s)
                .isInstanceOf(String.class)
                .isEqualTo("2");
    }

    @Test
    public void shouldReturnStringFromNumberIfNumberIsEqualsDefault() {
        //when
        String s = exceptionsExample.doSomething(DEFAULT_NUMBER);

        //then
        assertThat(s)
                .isInstanceOf(String.class)
                .isEqualTo(String.valueOf(DEFAULT_NUMBER));
    }

    @Test
    public void shouldThrowException_WhenNumberGraterThanDefault() {
        //given
        int number = 6;

        //then
        assertThatThrownBy(() -> exceptionsExample.doSomething(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Parametr jest większy od 5");
    }
}
