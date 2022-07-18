package com.trybe.acc.java.controledeacesso;

/** * Main Class.*/
public class VerifyAge {

  /** Método principal. */
  public String idade(short idade) {
    if (idade < 18) {
      return "Pessoa cliente menor de idade, catraca liberada!";
    } else if (idade <= 49) {
      return "Pessoa adulta, catraca liberada!";
    } else {
      return "Pessoa adulta a partir de 50, catraca liberada!";
    }
  }
}
