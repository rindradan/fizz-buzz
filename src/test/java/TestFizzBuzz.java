import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestFizzBuzz {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 4, 7, 8 })
    void should_return_number(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals(String.valueOf(number), fizzBuzz.transform(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 3, 6, 9, 12, 18 })
    void should_return_fizz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Fizz", fizzBuzz.transform(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 5, 10, 20, 25, 35 })
    void should_return_buzz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("Buzz", fizzBuzz.transform(number));
    }

    @ParameterizedTest
    @ValueSource(ints = { 15, 30, 45, 60, 75 })
    void should_return_fizz_buzz(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals("FizzBuzz", fizzBuzz.transform(number));
    }
}
