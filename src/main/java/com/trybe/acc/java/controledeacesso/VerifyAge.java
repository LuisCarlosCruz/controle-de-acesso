package com.trybe.acc.java.controledeacesso;
import java.util.Scanner;

public class VerifyAge {
  public String idade (short idade) {
    if (idade < 18) return "Pessoa cliente menor de idade, catraca liberada!";
    if (idade <= 49) return "Pessoa adulta, catraca liberada!";
    return "Pessoa adulta a partir de 50, catraca liberada!";
  }
}
