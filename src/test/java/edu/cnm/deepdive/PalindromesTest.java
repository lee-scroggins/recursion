package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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

  @Test
  void checkRecursive_palindromes() {
    for (String input : palindromes) {
      assertTrue(Palindromes.checkRecursive(input));
    }
  }

  @Test
  void checkRecursive_nonPalindromes() {
    for (String input : nonPalindromes) {
      assertFalse(Palindromes.checkRecursive(input));
    }
  }

}