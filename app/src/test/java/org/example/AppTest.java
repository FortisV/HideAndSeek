package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  static FuzzyFinder finder;
  static FuzzyListGenerator generator;

  @BeforeAll
  static void init() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
  }

  @Test
  void linearSortedFind() {
    assertEquals(26, finder.linearSearch(new ArrayList<>(Arrays.asList(new Fuzzy("indigo"), new Fuzzy("green"), new Fuzzy("orange"), new Fuzzy("red"), new Fuzzy("yellow"), new Fuzzy("orange"), new Fuzzy("blue"), new Fuzzy("yellow"), new Fuzzy("red"), new Fuzzy("orange"), new Fuzzy("indigo"), new Fuzzy("orange"), new Fuzzy("red"), new Fuzzy("violet"), new Fuzzy("violet"), new Fuzzy("blue"), new Fuzzy("yellow"), new Fuzzy("blue"), new Fuzzy("yellow"), new Fuzzy("indigo"), new Fuzzy("red"), new Fuzzy("green"), new Fuzzy("green"), new Fuzzy("violet"), new Fuzzy("green"), new Fuzzy("blue"), new Fuzzy("gold"), new Fuzzy("indigo"), new Fuzzy("violet")))));
  }

  @Test
  void binarySortedFind() {
    assertEquals(4, finder.binarySearch(new ArrayList<>(Arrays.asList(new Fuzzy("blue"), new Fuzzy("blue"), new Fuzzy("blue"), new Fuzzy("blue"), new Fuzzy("gold"), new Fuzzy("green"), new Fuzzy("green"), new Fuzzy("green"), new Fuzzy("green"), new Fuzzy("indigo"), new Fuzzy("indigo"), new Fuzzy("indigo"), new Fuzzy("indigo"), new Fuzzy("orange"), new Fuzzy("orange"), new Fuzzy("orange"), new Fuzzy("orange"), new Fuzzy("red"), new Fuzzy("red"), new Fuzzy("red"), new Fuzzy("red"), new Fuzzy("violet"), new Fuzzy("violet"), new Fuzzy("violet"), new Fuzzy("violet"), new Fuzzy("yellow"), new Fuzzy("yellow"), new Fuzzy("yellow"), new Fuzzy("yellow")))));
  }
}
