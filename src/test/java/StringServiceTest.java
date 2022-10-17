import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringServiceTest {

    @Test
    void countStrings() {
        String[] string_array = {"a", "aaa", "bsa"};
        assertEquals(2, StringService.countStrings(string_array,'a'));
    }

    @Test
    void getEqualsStrings() {
        String[] string_array = {"a", "aaa", "asdf"};
        assertEquals(1,StringService.getEqualsStrings(string_array,"a"));
    }

    @Test
    void getUnics() {
        String[] string_array = {"help", "guy", "Andrey"};
        assertEquals(3, StringService.getUnics(string_array,"a"));
    }

    @Test
    void getOnesEnters() {
        String[] string_array = {"halp", "aua", "Andrey", "b", "bb"};
        assertEquals(1, StringService.getOnesEnters(string_array,"b"));
    }
}
