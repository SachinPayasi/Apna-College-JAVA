//LOOPS
// for loop, while loop, do while loop:- Example questions


import java.util.*;

public class lecture4 {

  // QUestion Based On For Loop

//Que 1 :- Print  Hello World - 200 Times Using For Loop:- 
    public static void main(String args[]){

        for(int i =1; i<=200;i++){
            System.out.println(i + "  Hello world ");
        }
      }

        
//Que 2:- Print num 1 to 10.
   
      public static void main(String args[]){

        for(int i = 1; i<=10; i++){
            System.out.println(i);
        }
      }
          


        //Question Based on While Loop. 
        
//Que 3:- Print Numbers From  0 - 10  By Using While Loop.

    public static void main(String args[]){

       int i = 1;
        while (i<=10){
            System.out.println(i);
            i =i+1; // increment to increase value by 1
        }
      }


        //Que Based On do while loop.
//Que 4:-Print Numbers From 1 - 10 By Using Do While Loop

          public static void main(String args[]){

        int i =1;
        do{
            System.out.println(i);
            i = i+1;
        } while(i<=10);  
        
      } 



        //Homework Problem :-

//Que 1:-Print sum of n natural numbers

        public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
          int n = sc.nextInt();
          
          int sum = 0;
          
          for (int i =1; i<=n; i++){
             if(i%2==0){
              System.out.println(i);
                        
            sum = sum+i;
          }

          }
          System.out.println("sum of the numbers is  "  +sum);
        } 


//Oue 2: Take Marks Input From The User,  Compare Them Print And Pass Motivational Message with that Using Do While Loop.    
          
        
            public static void main(String args[]){

          System.out.println("Enter Marks");
          Scanner sc = new Scanner(System.in);
          int n;
         
          do{
            
              int marks = sc.nextInt();
              if (marks>=90 && marks<=100){
                System.out.println("this is good");
              }else if(marks>=60){
                System.out.println("this is also good");
              }else if(marks>=0){
                System.out.println(" this is also good,marks doesn't matters effort matters");
              }else{ System.out.println("Invalid");
            }
              System.out.println("Want to continue?(yes(1)no(0))");
              n=sc.nextInt();
              System.out.println("Enter Marks");
           
          }while(n==1);
        }
    
//Que 3:- Print prime number till n Using For loop
          
            public static void main(String args[]){

          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

boolean isPrime = true;
for (int i =2; i<=n/2;i++){

            if (n%i==0){
              isPrime=false;
              break;
            }
           } if(isPrime){
           if(n==1){
                System.out.println("this not an prime number nor a composite number");
              } else{
                System.out.println("this is a prime number ");
              }
            }else{
              System.out.println("Not A Prime number");
            }


        
    }
}
