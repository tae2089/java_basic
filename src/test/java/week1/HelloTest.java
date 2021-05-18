package week1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HelloTest {

    @Test
    void HelloWorld() {
        // given
        int a = 5;
        // when
        int result = a + 5;
        // then
        int expected = 10;
        assertThat(result, is(equalTo(expected)));
    }

}
