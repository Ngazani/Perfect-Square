/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectsquare;
import java.util.*;
/**
 *
 * @author Uncle Ngazii
 */
public class PerfectSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here'
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int num = sc.nextInt();
        
        System.out.println(result(num));
    }
    
    static String result(int N)
    {
        String output = "";
        int num2 = 0;
                
        if(N>=0 && N<=100)
        {
            System.out.println("Divisors are: ");
            for(int i = 1;  i < N ;i++)
            {
                if((N % i) == 0)
                {
                System.out.println(i);
                num2 += i;
                }
                
            }
            System.out.println("Sum:"+ num2);
            if(num2 == N)
            {
            output = "Yes number is a perfect square";
            }
            else
            {
            output = "No";
            }
        }
    
    return output; }
    
}
