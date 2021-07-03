import java.util.Scanner;
 
public class Automorphic {
 
    public static void main(String args[]){
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
 
        int c=0, sqr = num*num;
        int temp =num;  
 
        
        while(temp>0){
            c++;
            temp=temp/10;
        }
 
        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));
 
        if(num == lastSquareDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
}
Output:

Enter a number
376
Automorphic number

Enter a number
22
Not an Automorphic number