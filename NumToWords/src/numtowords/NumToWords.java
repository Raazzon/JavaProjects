
package numtowords;

import java.util.Scanner;

public class NumToWords {
    static Scanner s = new Scanner(System.in);
    static char[] num = new char[3];
    static int digits = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Please Enter a 3 digits of number : ");
        digits = s.nextInt();
        
        String a="" , c="";
        boolean checkfor1 = false;
        
        for(int i=0; i <= String.valueOf(digits).length()-1; i++){
            num[i]=(String.valueOf(digits).charAt(i));
            int j = Character.getNumericValue(num[i]);
            
            switch (j){
                case 1:
                    if(i==0){
                        a = "One Hundred";
                    }else if(i==1){
                        checkfor1 = true;
                    }else{
                        if(checkfor1){
                             a = "Eleven";
                             checkfor1 = false;
                        }else{
                             a = "One";
                        }
                    }
                    break;
               case 2:
                    if(i==0){
                        a = "Two Hundred";
                    }else if(i==1){
                        a = "Twenty";
                    }else{
                        if(checkfor1){
                             a = "Twelve";
                              checkfor1 = false;
                        }else{
                             a = "Two";
                        }
                    }
                    break;
                case 3:
                    if(i==0){
                        a = "Three Hundred";
                    }else if(i==1){
                        a = "Thirty";
                    }else{
                        if(checkfor1){
                             a = "Thirteen";
                              checkfor1 = false;
                        }else{
                             a = "Three";
                        }
                    }
                    break;
                case 4:
                    if(i==0){
                        a = "Four Hundred";
                    }else if(i==1){
                        a = "Forty";
                    }else{
                        if(checkfor1){
                             a = "Fourteen";
                              checkfor1 = false;
                        }else{
                             a = "Four";
                        }
                    }
                    break;
                case 5:
                    if(i==0){
                        a = "Five Hundred";
                    }else if(i==1){
                        a = "Fifty";
                    }else{
                        if(checkfor1){
                             a = "Fifteen";
                              checkfor1 = false;
                        }else{
                             a = "Five";
                        }
                    }
                    break;
                case 6:
                    if(i==0){
                        a = "Six Hundred";
                    }else if(i==1){
                        a = "Sixty";
                    }else{
                        if(checkfor1){
                             a = "Sixteen";
                              checkfor1 = false;
                        }else{
                             a = "Six";
                        }
                    }
                    break;
                case 7:
                    if(i==0){
                        a = "Seven Hundred";
                    }else if(i==1){
                        a = "Seventy";
                    }else{
                        if(checkfor1){
                             a = "Seventeen";
                              checkfor1 = false;
                        }else{
                             a = "Seven";
                        }
                    }
                    break;
                case 8:
                    if(i==0){
                        a = "Eight Hundred";
                    }else if(i==1){
                        a = "Eighty";
                    }else{
                        if(checkfor1){
                             a = "Eighteen";
                              checkfor1 = false;
                        }else{
                             a = "Eight";
                        }
                    }
                    break;
                case 9:
                    if(i==0){
                        a = "Nine Hundred";
                    }else if(i==1){
                        a = "Ninety";
                    }else{
                        if(checkfor1){
                             a = "Nineteen";
                              checkfor1 = false;
                        }else{
                             a = "Nine";
                        }
                    }
                    break;
               case 0:
                    if(i==0){
                        a = "";
                    }else if(i==1){
                        a = "";
                    }else{
                        if(checkfor1){
                             a = "Teen";
                              checkfor1 = false;
                        }else{
                             a = "";
                        }
                    }
                    break;                          
             }
             c +=a+" ";  
             a="";
          }
         System.out.println(c);
       }
  }
