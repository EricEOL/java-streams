package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

  public static void main(String[] args) {
    List<String> aprovados = Arrays.asList("Eric", "Rebecca", "Thamiris", "Lucas");

    System.out.println("<-- Usando ForEach diretamente -->");
    aprovados.forEach(aprovado -> System.out.println(aprovado));

    System.out.println("<-- Criando Objeto Stream -->");
    Stream<String> streamAprovados = aprovados.stream();
    streamAprovados.forEach(System.out::println);
  }
}
