package org.teachingkidsprogramming;

public class Print100Ints10by10
{
  public static void main(String[] args)
  {
    for (int i = 0; i < 10; i++)
    {
      for (int j = 0; j < 10; j++)
      {
        System.out.print(((i * 10) + j + i) + " ");
      }
      System.out.println();
    }
  }
}