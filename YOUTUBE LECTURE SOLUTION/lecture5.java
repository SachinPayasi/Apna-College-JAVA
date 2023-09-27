//PATTERN PROBLEMS

public class lecture5 {
    public static void main(String[]args){

/*1 Print pattern:-
                    ***** 
                    *****
                    *****
                    *****
*/
  
        for(int i =1; i<=4;i++){
              for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    



    /*2 Print pattern:-

                    * * * * *
                    *       *
                    *       *
                    * * * * *  
    */
    int n= 4;
    int m =5;
        for(int i = 1;i<=n;i++){
                for(int j =1; j<=m;j++){
                    if(i==1||i==n||j==1||j==m){
                        System.out.print("*");
                        }  else{  System.out.print(" ");}
                    
        }
        System.out.println();
    }




    /*3 Print pattern:-

                        *
                        **
                        ***
                        ****
     */   
    int n =4;
    for(int i= 1;i<=n;i++){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }System.out.println();
    }




    /* 4 Print pattern:-
    
                       **** 
                       ***
                       **
                       *      
    */
    int n =4;
    for(int i =n;i>=1;i--){
        for(int j =1;j<=i;j++){
            System.out.print("*");
        }System.out.println();  
    }

    /* 5 Print pattern
                        *
                       **
                      ***
                     **** 
    */
    int n = 4;

       for(int i=n; i>=1; i--) {

           for(int j=1; j<i; j++) {

               System.out.print(" ");

           }

           for(int j=0; j<=n-i; j++) {

               System.out.print("*");

           }

           System.out.println();

       }



    /*6 Print pattern:-

                       1
                       1 2 
                       1 2 3
                       1 2 3 4 
                       1 2 3 4 5 
    */                 
    int n =5;
      for(int i =1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }System.out.println(); 
      }              
    

    
   }

} 