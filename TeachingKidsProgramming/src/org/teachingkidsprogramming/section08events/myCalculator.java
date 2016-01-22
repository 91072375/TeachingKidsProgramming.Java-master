package org.teachingkidsprogramming.section08events;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class myCalculator
{
  public static void main(String[] args)
  {
    int num1 = MessageBox.askForNumericalInput("Please enter the first number");
    MessageBox.showMessage("You entered: " + num1);
    String operation = MessageBox.askForTextInput("Please choose an operation: + , - , x , / , * ");
    MessageBox.showMessage("The operation you want is : " + operation);
    int num2 = MessageBox.askForNumericalInput("Please enter the second number");
    MessageBox.showMessage("You entered: " + num2);
    if (operation.equals("+"))
    {
      int sum = add(num1, num2);
      MessageBox.showMessage(num1 + " + " + num2 + " = " + sum);
      System.exit(0);
    }
    if (operation.equals("-"))
    {
      int difference = subtract(num1, num2);
      MessageBox.showMessage(num1 + " - " + num2 + " = " + difference);
      System.exit(0);
    }
    if (operation.equals("x"))
    {
      int product = multiply(num1, num2);
      MessageBox.showMessage(num1 + " x " + num2 + "  = " + product);
      System.exit(0);
    }
    if (operation.equals("/"))
    {
      int quotient = divide(num1, num2);
      if (quotient == -1) { return; }
      MessageBox.showMessage(num1 + " / " + num2 + "  = " + quotient);
      System.exit(0);
    }
    if (operation.equals("*"))
    {
      int answer = pow(num1, num2);
      MessageBox.showMessage(num1 + " to the power of " + num2 + " = " + answer);
      System.exit(0);
    }
  }
  public static int add(int n1, int n2)
  {
    return n1 + n2;
  }
  public static int subtract(int n1, int n2)
  {
    return n1 - n2;
  }
  public static int multiply(int n1, int n2)
  {
    return n1 * n2;
  }
  public static int divide(int n1, int n2)
  {
    if (n2 == 0)
    {
      MessageBox.showMessage("You can't divide by zero...");
      return -1;
    }
    else
      return n1 / n2;
  }
  public static int pow(int base, int exp) // 
  {
    int answer = 1;
    for (int i = 0; i < exp; i++)
    {
      answer = answer * base;
    }
    return answer;
  }
}