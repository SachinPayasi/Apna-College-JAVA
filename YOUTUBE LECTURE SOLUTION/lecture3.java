//Example question lecture 3
//IF ,ELSE IF, ELSE AND SWITCH BREAK
import java.util.*;
public class lecture3 {

//Que 1:- Take input from user to enter age and give result adult or not

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age ");
    int age = sc.nextInt();
    if(age > 18){
        System.out.println("You Are A Adult");
    }else{
        System.out.println("Not A Adult");
    }
}


//Que 2:- Take input From user check even or odd

    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number ");
    int a = sc.nextInt();
    if(a%2==0){
        System.out.println("even");
    } else{
        System.out.println("odd");
    }
}



//Que 3:- Input from user (2 input) And
/*
if a ==b :- Print a is equal to b; 
if a > b :- Print a is greater to b;
if a < b :- Print a is lesser  to b;
*/
    public static void main(String[]args){ 
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER NO 1");
    int a = sc.nextInt();
    System.out.println("ENTER NO 2");
    int b = sc.nextInt();
    if (a == b){
        System.out.println(" a is equal");
    }else if(a > b){
        System.out.println("a is greatetr");
    }else {
        System.out.println("a is lesser");
    }
}
    


//Que 4 :-Take input from user 1,2 and 3.
/*
if input == 1 Print "Hello";
if input == 2 Print "Namaste"; 
if input == 3 Print "Bonjour"; // BOnjour is a form of greetings In JAPAN as like our NAMASTE
*/
public static void main(String[]args){
System.out.println("Press Button (1,2,3)");

Scanner sc = new Scanner(System.in);

int button = sc.nextInt();

if (button == 1){
    System.out.println("Hello");
    } else if(button == 2){
        System.out.println("Namaste");
    } else if (button == 3){
        System.out.println("Bonjour");
    }else{
        System.out.println("Inavalid Button");
    }
}

//Same Question with switch case:-
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("press(1||2||.3)");
 int button = sc.nextInt();
 switch(button){
    case 1:
      System.out.println("hello");
      break;
      case 2 :
      System.out.println("namaste");
      break;
      case 3:
      System.out.println("Bonjour");
      break;
      default :
      System.out.println("inavalid choice");

 }
}     


          //Homework Problem Lecture 3

//Que 1 :- Creat Simple Calculator Using Switch Case :-

        public static void main(String[]args){  
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter A Number 1");
          int a = sc.nextInt();
          System.out.println("Enter A Number 2");
          int b = sc.nextInt();
          System.out.println("Enter operator (+,-,*,/,%):");
          char c = sc.next().charAt(0);
          System.out.println("result is:"+c);
          
         switch(c){
          case '+': 
          System.out.println("a+b");
          break;

          case '-':
          System.out.println( a-b);
          break;

          case '*':
          System.out.println(a*b);
          break;

          case '/':
          if (b==0){
            System.out.println("Invalid devision");
          }else{
          System.out.println(a/b);
          }
          break;

          case '%':
          if(b==0){
            System.out.println("Invalid Division");
          }else{
          System.out.println(a%b);
          }
          break;
          default : 
          System.out.println("invalid operator"); 
         }
    }



//Que 2:- Take Input From User (1-12) And print Month Name According To Input Number

public static void main(String[]args){
System.out.println("Enter the month Number");
Scanner sc = new Scanner(System.in);
int month = sc.nextInt();
System.out.println(+month);
switch(month){
    case 1:
    System.out.println("january ");
    break;

    case 2:
    System.out.println("february");
    break;

    case 3:
    System.out.println("march");
    break;

    case 4:
    System.out.println("april");
    break;
    
    case 5:
    System.out.println("may");
    break;
    
    case 6:
    System.out.println("june");
    break;
    
    case 7:
    System.out.println("july");
    break;

    case 8:
    System.out.println("August");
    break;
    
    case 9:
    System.out.println("september");
    break;
    
    case 10:
    System.out.println("October");
    break;
    
    case 11:
    System.out.println("November");
    break;
    
    case 12:
    System.out.println("December");
    break;

    default:System.out.println("Invalid Month number");
}



}
    

