import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

public class FizzBuzz {

    private final List<Map.Entry<IntPredicate, String>> actions = new ArrayList<>();

    public FizzBuzz() {
        actions.add(Map.entry(i -> (i % 3 == 0) && (i % 5 == 0), "FizzBuzz"));
        actions.add(Map.entry(i -> (i % 5 == 0), "Buzz"));
        actions.add(Map.entry(i -> (i % 3 == 0), "Fizz"));
    }

    public String transform(int input) {
        return actions.stream().filter(entry -> entry.getKey().test(input)).map(Map.Entry::getValue).findAny().orElse(String.valueOf(input));
    }
}
