import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class myFirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Выполняется один раз перед всеми тестами");
    }

    @BeforeEach
    void setUp() {
        System.out.println("сетап тестов");
    }

    @Tag("auto")
    @DisplayName("Тест на авторизацию администратора")
    @RepeatedTest(10)
    void nameFor() {
        System.out.println("мой первый тест");
    }

    @Tag("auto2")
    @Test
    void name2() {
        System.out.println("мой первый тест2");
    }

    @Tag("auto2")
    @ParameterizedTest
    @ValueSource(ints = {1, 6, 9})
    void name3(int value) {
        System.out.println("мой первый тест2, значение: " + value);
    }

    @AfterEach
    void tearDown() {
        System.out.println("шаги завершения теста");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Выполняется один раз после всех тестов");
    }
}