package week1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    private static final Logger log = Logger.getGlobal();
    private Person person = null;
    private Person person2 = null;

    @BeforeAll
    static void 전체한번시작() {

        log.info("BeforeAll 작동");
    }

    @BeforeEach
    void 시작할때마다시작() {
        person = new Person("hason", 12);
        log.info("BeforeEach 작동");
    }

    @Test
    void HelloWorld() {
        // given
        int a = 5;
        // when
        int result = a + 5;
        // then
        int expected = 10;

        person = new Person("taebin", 14);
        assertThat(person.getName()).isEqualTo("hason");
    }

    @Test
    void print() {
        // given
        String name = "Hello";
        // then
        assertThat(person.getName()).isEqualTo("hason");
    }

    class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }
    }
}
