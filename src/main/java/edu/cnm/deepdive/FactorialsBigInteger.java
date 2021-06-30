package edu.cnm.deepdive;

import java.math.BigInteger;

public class FactorialsBigInteger {

  public static BigInteger computeRecursive(int input) {
    if (input < 0) {
      throw new IllegalArgumentException();
    }
    return (input == 0) ? BigInteger.ONE : BigInteger.valueOf(input).multiply(computeRecursive(input - 1));
  }

}
