package com.geekbrains;

public class geekbrains {

  public static void main(String[] args) 
  {
   System.out.println(checkSum(15, 4));//Проверка объявленных методов
   System.out.println(checkSign(-3));
   System.out.println(checkSumBool(-8));
   printString(-6, "test");
   System.out.println(checkVisYear(1900));
  }
  public static boolean checkSum(int a, int b) //Метод проверяет принадлежит ли сумма двух чисел интервалу [10;20] и возвращает true/false                                           
  {
    if (((a+b) >= 10)&&((a+b) <= 20))
        {
          return true;
        }
    return false;
  }
  public static String checkSign(int a) //Метод проверяет знак числа и возвращает соответсующую строку
  {
    if (a<0) 
        {
          return "отрицательное";
        }
    return "положительное";
  }
  public static boolean checkSumBool(int a) //Метод проверяет знак числа и возвращает true/false
  {
    if (a<0) 
        {
          return true;
        }
    return false;
  }
  public static void printString(int a, String s) //Метод выводит a раз строку s 
  {
   while(a>0)
       {
         System.out.println(s);
         a=a-1;
       } 
  }
  public static boolean checkVisYear(int a) //Метод проверяет является ли год високосным и возвращает true/false
  {
    if(((a%4==0)&&(a%100!=0))||(a%400==0))
        {
          return true;
        }
    return false;
  }
}
