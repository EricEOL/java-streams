package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

  /*
  * Used to create a new stream with the same size of the original stream
  * Transform each element of the original stream
  */

  // 2º - Compisiton Example
  private static final String shout(String n) {
    return n + "!!! ";
  }

  public static void main(String[] args) {
    Consumer<String> print = System.out::print;

    // 1º Example
    List<String> marcas = Arrays.asList("BMW ", "Porsche ", "Audi\n");
    marcas.stream().map((marca) -> marca.toUpperCase()).forEach(print);

    // 2º Example
    UnaryOperator<String> upperCase = n -> n.toUpperCase();
    UnaryOperator<String> firstChar = n -> n.charAt(0) + "";

      // Composition
    marcas.stream()
        .map(upperCase)
        .map(firstChar)
        .map(Map::shout)
        .forEach(print);
  }
}
