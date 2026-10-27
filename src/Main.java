import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Main {
  public static void main(String[] args) {
    // theList();
  }

  public static void theArray() {
    // String[] nomes = new String[] { "Angelo", "Anna", "Pedro" };
    String[] nomes = new String[3];

    System.out.printf("Indice 0 -> %s\n", nomes[0]);
    System.out.printf("Indice 1 -> %s\n", nomes[1]);
    System.out.printf("Indice 2 -> %s\n", nomes[2]);
    System.out.printf("Indice 3 -> %s\n", nomes[3]);
  }

  public static void theGeneric() {
    class MinhaListaDeDoisItens<T> {
      private T item1;
      private T item2;

      public void add(T value) {
        if (this.item1 == null) {
          this.item1 = value;
          return;
        }

        if (this.item2 == null) {
          this.item2 = value;
          return;
        }

        System.out.println("A lista ta cheia");
      }

      public void show() {
        System.out.printf(" - Item 1: %s\n - Item 2: %s\n", this.item1, this.item2);
      }
    }

    MinhaListaDeDoisItens<String> minhaListaDeDoisItens = new MinhaListaDeDoisItens();

    minhaListaDeDoisItens.add("Anna");
//    minhaListaDeDoisItens.add(4);
//    minhaListaDeDoisItens.add(6);

    minhaListaDeDoisItens.show();
  }

  public static void theList() {
    Scanner myScanner = new Scanner(System.in);

    String valor = myScanner.nextLine();

    System.out.println(valor);

    List<Integer> numbers = new ArrayList<>();

    numbers.add(1); // 0
    numbers.add(2); // 1
    numbers.add(3); // 2
    numbers.add(4); // 3
    numbers.add(5); // 4

    System.out.printf("Index 0 -> %s\n", numbers.get(0));
    System.out.printf("Index 1 -> %s\n", numbers.get(1));

//    System.out.println("Press Enter to continue");
//    myScanner.nextLine();

    numbers.set(1, 10);

    System.out.printf("Index 0 -> %s\n", numbers.get(0));
    System.out.printf("Index 1 -> %s\n", numbers.get(1));

    System.out.println(numbers);
    System.out.println(numbers.subList(1, 3 + 1));
  }

  public static void theListJefferson() {
    Scanner scanner = new Scanner(System.in);

    // List <String> tarefas = new ArrayList<>();
    List<String> tarefas = new ArrayList<>();
    System.out.println("Você tem direito a guardar 5 tarefas");

    System.out.println("Informe a primeira tarefa");
    tarefas.add(scanner.nextLine());

    System.out.println("Informe a segunda tarefa");
    tarefas.add(scanner.nextLine());

    System.out.println("Informe a terceira tarefa");
    tarefas.add(scanner.nextLine());

    System.out.println("Informe a quarta tarefa");
    tarefas.add(scanner.nextLine());

    System.out.println("Informe a quinta tarefa");
    tarefas.add(scanner.nextLine());

    System.out.println(tarefas);
  }

  public static void theListMike() {
    Scanner scanner = new Scanner(System.in);
    List<String> tarefas = new ArrayList<>();

    System.out.println("=== Organizador de Tarefas ===");

    for (int i = 1; i <= 5; i++) {
      System.out.print("Digite a tarefa " + i + ": ");
      String entrada = scanner.nextLine();

      tarefas.add(entrada);
    }

    System.out.println("\n--- Lista ---");
    for (int i = 0; i < tarefas.size(); i++) {
      System.out.println((i + 1) + " - " + tarefas.get(i));
    }

    scanner.close();
  }

  public static void theListAlvaro() {
    Scanner scanner = new Scanner(System.in);
    List<String> task = new ArrayList<>(); // preferir o plural

    System.out.println("Você tem direito a guardar 5 task");

    String entrada;

    System.out.println("Informe a primeira task");
    entrada = scanner.nextLine();
    while (task.contains(entrada)) {
      System.out.println("Essa task já foi informada. Digite outra:");
      entrada = scanner.nextLine();
    }
    task.add(entrada);

    System.out.println("Informe a segunda task");
    entrada = scanner.nextLine();
    while (task.contains(entrada)) {
      System.out.println("Essa task já foi informada. Digite outra:");
      entrada = scanner.nextLine();
    }
    task.add(entrada);

    System.out.println("Informe a terceira task");
    entrada = scanner.nextLine();
    while (task.contains(entrada)) {
      System.out.println("Essa task já foi informada. Digite outra:");
      entrada = scanner.nextLine();
    }
    task.add(entrada);

    System.out.println("Informe a quarta task");
    entrada = scanner.nextLine();
    while (task.contains(entrada)) {
      System.out.println("Essa task já foi informada. Digite outra:");
      entrada = scanner.nextLine();
    }
    task.add(entrada);

    System.out.println("Informe a quinta task");
    entrada = scanner.nextLine();
    while (task.contains(entrada)) {
      System.out.println("Essa task já foi informada. Digite outra:");
      entrada = scanner.nextLine();
    }
    task.add(entrada);

    System.out.println(task);
  }

  public static void theListLucas() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tarefas = new ArrayList<>();

    while (tarefas.size() < 5) {
      System.out.print("Digite uma tarefa: ");
      String tarefa = scanner.nextLine();

      if (tarefas.contains(tarefa)) {
        System.out.println("Tarefa repetida!");
      } else {
        tarefas.add(tarefa);
      }
    }

    System.out.println("Suas tarefas: " + tarefas);

    scanner.close();
  }

  public static void theSet() {
    Set<Integer> numbers = new HashSet<>();

    numbers.add(null);

    numbers.add(0);
    numbers.add(1);
    numbers.add(2);
    numbers.add(23789);
    numbers.add(2);
    numbers.add(2);
    numbers.add(2);
    numbers.add(4);

    numbers.remove(1);

    System.out.println(numbers);

    Set<Integer> drawnNumbers = new HashSet<>();

    while (drawnNumbers.size() < 10) {
      drawnNumbers.add((int)Math.floor(Math.random() * 100));
    }

    System.out.println(drawnNumbers);
  }

  public static void theMap() {
    Map<String, Integer> grades = new TreeMap<>();

    grades.put("Anna", 9);
    grades.put("Fernanda", 10);
    grades.put("Lucas", 7);

    grades.put("Fernanda", 8);

    grades.remove("Paulo");

    System.out.println(grades);

    for (var entry : grades.entrySet()) {
      System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
    }
  }
}
