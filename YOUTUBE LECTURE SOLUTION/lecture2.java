//Homework Problems Bsed On Variable And Data Types

// Que 1 :- Print variable of each type

import java.util.*;
public class lecture2 {
    public static void main(String[] args){
     
        String name = "abcd";
        int age = 21;
        float weight = 57.8f;
        double salary = 446627.8d;
        char nature = 'A';
        System.out.println(name);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(salary);
        System.out.println(nature);
    }
}

   
//Que 2:- Program to print the radius of circle
public class lecture2 {
    public static void main(String[] args){
     
   Scanner sc =  new Scanner(System.in);
   System.out.println("Enter the radius");
   int r = sc.nextInt();
System.out.println(+r);
System.out.println("Radius of circle");
System.out.println(2*3.14*r);
System.out.println("The area of circle");
System.out.println(3.14*r*r);
    }
}


//Que 3:-  Print table of N numbers

public class lecture2 {
    public static void main(String[] args){
     
      Scanner sc = new Scanner(System.in );
      int n = sc.nextInt();
      System.out.println(n*1);
      System.out.println(n*2);
      System.out.println(n*3);
      System.out.println(n*4);
      System.out.println(n*5);
      System.out.println(n*6);
      System.out.println(n*7);
      System.out.println(n*8);
      System.out.println(n*9);
      System.out.println(n*10);
    }
}


//Que 4:- Example question  take 2 variable from user and print their sum

public class lecture2 {
    public static void main(String[] args){
Scanner Sc = new Scanner(System.in);
System.out.println("ENTER A 1ST VARIABLE");
int a = Sc.nextInt();
System.out.println("ENTER SECOND VARIABLE");
int b = Sc.nextInt();
System.out.println("SUM OF THE VARIABLES IS");
int sum = a+b;
System.out.println(sum);


    }
}
