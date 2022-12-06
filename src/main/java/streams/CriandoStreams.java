package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

  public static void main(String[] args) {

    Consumer<Object> print = System.out::print;

    // Formas de criar STREAMS

    Stream<String> langs = Stream.of("Java ", "Javascript ", "Kotlin\n");
    langs.forEach(print);

    String[] maisLangs = {"Python ", "Lisp ", "Cobol ", "Perl ", "GoLang\n"};

    Stream.of(maisLangs).forEach(print);
    Arrays.stream(maisLangs).forEach(print);
    Arrays.stream(maisLangs, 1, 3).forEach(print);

    List<String> otherLangs = Arrays.asList("C ", "PHP ", "Clojure ", "Elixir\n");
    otherLangs.stream().forEach(print);
    otherLangs.parallelStream().forEach(print);

    // Criando streams infinitos
    Stream.generate(() -> "a").forEach(print);
    Stream.iterate(0, n -> n+1).forEach(print);
  }
}
