package cloud.cholewa.p7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class EmptyStringTest {

    @ParameterizedTest(name = "Param: `{0}`")
    @ValueSource(strings = {" ", "a", "   a", "  abc", "    a    "})
    public void shouldCheckIfStringIsNotEmpty(String s) {
        //when
        boolean result = EmptyString.checkIfNotEmpty(s);

        //then
        assertThat(result).isTrue();
    }

}
