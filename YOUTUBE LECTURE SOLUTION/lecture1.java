import java.util.Scanner;

public class lecture1 {
 
 // Que:1:-Creat a function to print average of 3 numbers
 
    public static int printAverage(int a, int b, int c){
    int average = (a+b+c)/3;
    System.out.println(average);;
    return 1;
 }
    public static void main(String[]args){
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAverage(a, b, c);
    }



// Que:2:- Create function for sum of odd numbers
public static int oddSum(int n) {
   int sum = 0;
    for(int i=1;i<=n;i++){
       
        if(i%2==1){
            System.out.println(i);
           sum = sum +i ;
        }
           
    }   
    System.out.println("sum of odd number is: "+sum);
    return sum;

}

public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();

    oddSum(n);
    
} 



//Que:3:-Creat function to print  grater of two numbers
public static int printGreater(int a, int b){
    if(a>b){
        System.out.println("a is greater than b");
    }else if(b>a){
        System.out.println("b is greater than a");
    }else{
        System.out.println("a and b is equal");
    }
    return 1;
}
public static void main(String args[]){

     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     printGreater(a, b);

}



//Que:4:-Print the function that takes the radius as input and return circumferrance of circle

//circumference == radius

public static Double printCircumferances(Double r){
     
    return 2*3.14*r;
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();


    System.out.println(printCircumferances(r));

}


//Que:5:- Creat function to chech eligible for vote or not according to age 
   
public static boolean isEligible(int age){
    if(age >18){
        return true;  // true = eligible
    }else {
        return false;  // false == not eligible
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    System.out.println(isEligible(age));
}


//infinite loop using do while  
    public static void main(String[]args){
    do{

    }while(true);
}


//Que 6:- Write a program to enter the number till user want it at the end positive and negative and zero wil display

public static void main(String []args){
    int positive= 0, negative = 0,zero = 0;
    System.out.println("Press 1 for continue and press 2 for stop");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    while(input==1){
        System.out.println("Enter your number");
        int n = sc.nextInt();

        if(n>0){
            System.out.println(positive++);
        }else if(n<0){
            System.out.println(negative++);
        }else{
            zero++;
        }
     System.out.println("Press 1 to continue & 0 to stop");
     input = sc.nextInt();
} 
System.out.println("positive "+positive);
System.out.println("negative "+negative);
System.out.println("zeros"+zero);
}

}     
