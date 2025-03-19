package org.example;

import java.util.ArrayList;

public class App {
  FuzzyFinder finder;
  FuzzyListGenerator generator;
  ArrayList<Fuzzy> fuzzySorted;
  ArrayList<Fuzzy> fuzzyRandom;
  void init() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
    fuzzySorted = generator.sortedRainbowFuzzies();
    fuzzyRandom = generator.randomizedRainbowFuzzies();
  }
  void printArray(ArrayList<Fuzzy> a) {
    System.out.print('[');
    for(int i = 0; i < a.size(); ++i) {
      if(i != 0) {
        System.out.print(", ");
      }
      System.out.print(a.get(i).color);
    }
    System.out.print(']');
  }
  void run() {
    init();
    System.out.println(fuzzySorted.get(finder.binarySearch(fuzzySorted)).color);
    printArray(new FuzzyListGenerator(4).sortedRainbowFuzzies());
    System.out.println();
    printArray(new FuzzyListGenerator(4).randomizedRainbowFuzzies());
  }
  public static void main(String[] args) {
    new App().run();
  }
}
