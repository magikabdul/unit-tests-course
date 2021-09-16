package cloud.cholewa.p1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatDateTest {

    @Test
    void shouldDateToYearMonthString() {
        //given
        LocalDate date = LocalDate.of(2021, 9, 16);

        //when
        String s =  FormatDate.formatDate(date);

        //then
        assertEquals("2021-09", s);
    }
}
