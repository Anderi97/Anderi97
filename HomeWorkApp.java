package com.geekbrains;

public class HomeWorkApp {

  public static void main(String[] args) {
    printThreeWorlds(); // Вызов объявленных методов для их проверки
    checkSumSign();
    printColor();
    compareNumbers();
  }

  public static void printThreeWorlds() // Метод выводит 3 текстовых сообщения
      {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  public static void checkSumSign() // Метод определяет знак суммы двух целых чисел
      {
    int a = 20;
    int b = -40;
    if ((a + b) > 0) {
      System.out.println("Сумма положительная.");
    }
    if ((a + b) < 0) {
      System.out.println("Сумма отрицательная.");
    }
  }

  public static void printColor() // Метод выводит одно из трех различных текстовых сообщений
        // в зависимости от значения переменной а
      {
    int a = 100;
    if (a <= 0) {
      System.out.println("Цвет красный.");
    }
    if ((a > 0) && (a < 100)) {
      System.out.println("Цвет желлтый.");
    }
    if (a >= 100) {
      System.out.println("Цвет зеленый.");
    }
  }

  public static void
      compareNumbers() // Метод сравнивает два числа и выводит соответствующее сообщение
      {
    int a = 2;
    int b = 3;
    if (a >= b) {
      System.out.println("a>=b");
    }
    if (a < b) {
      System.out.println("a<b");
    }
  }
}
