package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


/**
 * Test for BigIntegers.
 */
class FactorialsBigIntegerTest {

  static final long[][] testCases = {
      {0, 1},
      {1, 1},
      {5, 120},
      {10, 3_628_800},
      {13, 6_227_020_800L},
  };

  /**
   * Computes non exceptions of computeRecursive method with expected and actual input.
   */
  @Test
  void computeRecursive_nonExceptional() {
    for (long[] testCase : testCases) {
      int n = (int) testCase[0];
      BigInteger expected = BigInteger.valueOf(testCase[1]);
      BigInteger actual = FactorialsBigInteger.computeRecursive(n);
      assertEquals(expected, actual);
    }
  }

  /**
   * Computes exceptions for computeRecursive method with expected throw.
   */
  @Test
  void computeRecursive_exceptional() {
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        FactorialsBigInteger.computeRecursive(-1);
      }
    });
  }

  /**
   * Computes non exceptions of computeIterative method with expected and actual input.
   */
  @Test
  void computeIterative_nonExceptional() {
    for (long[] testCase : testCases) {
      int n = (int) testCase[0];
      BigInteger expected = BigInteger.valueOf(testCase[1]);
      BigInteger actual = FactorialsBigInteger.computeRecursive(n);
      assertEquals(expected, actual);
    }
  }

  /**
   * Computes exceptions for computeIterative method with expected throw.
   */
  @Test
  void computeIterative_exceptional() {
    assertThrows(IllegalArgumentException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        FactorialsBigInteger.computeRecursive(-1);
      }
    });

  }

}