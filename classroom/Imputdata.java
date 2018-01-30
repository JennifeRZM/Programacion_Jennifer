/**************************************************************************************
Jennifer Ruiz Montalvo
InputData.java

*****************************************************************************************************/

import java.util.Scanner;
public class Imputdata{
  public static void main(String[] args) {
    Scanner userData = new Scanner(System.in);
    String name;
    System.out.println("Enter your name ");
    name = userData.nextLine();

    System.out.println("hello "+name+"!");
  }
}
