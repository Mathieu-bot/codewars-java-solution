import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
​
public class Permutations {
​
  public static List<String> singlePermutations(String input) {
    if (input.length() == 0) {
      return List.of("");
    }
​
    return IntStream.range(0, input.length())
      .mapToObj(currentIndex -> {
        char currentChar = input.charAt(currentIndex);
        String remainingChars = input.substring(0, currentIndex) + input.substring(currentIndex + 1);
        return singlePermutations(remainingChars)
          .stream()
          .map(permutationOfRemaining -> currentChar + permutationOfRemaining);
      })
      .flatMap(permutations -> permutations)
      .distinct()
      .collect(Collectors.toList());
  }
}
​