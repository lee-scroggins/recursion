package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
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

  @Test
      void checkDenormalized() {
    Assertions.assertTrue(Palindromes.checkDenormalized("Radar"));
    Assertions.assertTrue(Palindromes.checkDenormalized("A man, a plan, a canal Panama!"));
    Assertions.assertTrue(Palindromes.checkDenormalized("aBba"));
    Assertions.assertFalse(Palindromes.checkDenormalized("A man, a plan, a dam - Hoover!"));
  }


}