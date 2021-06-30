package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for recursion and iteration for @String input for the provided parameters.
 * The {@return boolean} will return true or false.
 */
class PalindromesTest {

  static final String[] palindromes = {
      "radar",
      "abba",
      "x",
      ""
  };

  static final String[] nonPalindromes = {
      "sonar",
      "abb"
  };

  /**
   * Computes recursion for @String input for the provided parameters.
   * Test assertions are true.
   */
  @Test
  void checkRecursive_palindromes() {
    for (String input : palindromes) {
      assertTrue(Palindromes.checkRecursive(input));
    }
  }

  /**
   * Computes recursion for @String input for the provided parameters.
   * Test assertions are false.
   */
  @Test
  void checkRecursive_nonPalindromes() {
    for (String input : nonPalindromes) {
      assertFalse(Palindromes.checkRecursive(input));
    }
  }

  /**
   *Tests recursion values of parameters.
   * Test assertions are true or false.
   */
  @Test
      void checkDenormalized() {
    Assertions.assertTrue(Palindromes.checkDenormalized("Radar"));
    Assertions.assertTrue(Palindromes.checkDenormalized("A man, a plan, a canal Panama!"));
    Assertions.assertTrue(Palindromes.checkDenormalized("aBba"));
    Assertions.assertFalse(Palindromes.checkDenormalized("A man, a plan, a dam - Hoover!"));
  }

  /**
   * Computes iteration for @String input for the provided parameters.
   * Test assertions are true.
   */
  @Test
  void checkIterative_true() {
    Assertions.assertTrue(Palindromes.checkIterative("radar"));
    Assertions.assertTrue(Palindromes.checkIterative("abba"));
    Assertions.assertTrue(Palindromes.checkIterative("x"));
    Assertions.assertTrue(Palindromes.checkIterative(""));
  }

  /**
   * Computes iteration for @String input for the provided parameters.
   * Test assertions are true.
   */
  @Test
  void checkIterative_false() {
    Assertions.assertFalse(Palindromes.checkIterative("sonar"));
    Assertions.assertFalse(Palindromes.checkIterative("abb"));
  }


}