package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

/** * Main Class.*/

public class Principal {

  /** Método principal. */
  public static void main(String[] args) {
    short inputShort;
    ArrayList<Short> ages = new ArrayList<>();

    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entre com o número correspondente à opção desejada: ");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostrar relatório");
      String input = scanner.next();
      inputShort = Short.parseShort(input);

      if (inputShort == 1) {
        System.out.println("Entre com a idade:");
        String inputAge = scanner.next();
        short age = Short.parseShort(inputAge);

        VerifyAge verifyAge = new VerifyAge();
        System.out.println(verifyAge.idade(age));

        ages.add(age);
      }

      if (inputShort != 1 && inputShort != 2) System.out.println("Entre com uma opção válida!");

    } while (inputShort != 2);

    // RELATORIO

    int menores = 0, adultas = 0, aPartirDe50 = 0;

    for (short age : ages) {
      if (age < 18) menores++;
      if (age < 50) adultas++;
      aPartirDe50++;
    }

    DecimalFormat percentage = new DecimalFormat("#.##%");
    float percentageMenores = (float) menores / ages.size();
    float percentageAdultas = (float) adultas / ages.size();
    float percentageAPartirDe50 = (float) aPartirDe50 / ages.size();

    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + menores);
    System.out.println("adultas: " + adultas);
    System.out.println("a partir de 50: " + aPartirDe50);

    System.out.println("\n----- Percentual -----");
    System.out.println("menores: " + percentage.format(percentageMenores));
    System.out.println("adultas: " + percentage.format(percentageAdultas));
    System.out.println("a partir de 50: " + percentage.format(percentageAPartirDe50));

    System.out.println("\nTOTAL: " + ages.size());

  }
}

