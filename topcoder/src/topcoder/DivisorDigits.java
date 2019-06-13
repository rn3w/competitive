/*
Problem Statement
    
Create a class DivisorDigits containing a method howMany which takes an int number and returns how many digits in number divide evenly into number itself.
Definition
    
Class:
DivisorDigits

Method signature:
int howMany(int number)

Examples
0)
12345
Returns: 3
12345 is divisible by 1, 3, and 5.
1) 
661232
Returns: 3
661232 is divisible by 1 and 2.

2)    
52527
Returns: 0
52527 is not divisible by 5, 2, or 7.

3)
730000000
Returns: 0
Nothing is divisible by 0. In this case, the number is also not divisible by 7 or 3.
 */
package topcoder;

public class DivisorDigits {

    public int howMany(int number) {
        String digs = number + "";
        int res = 0;
        int dig=0;
        for (int i = 0; i < digs.length(); i++) {
            dig=Integer.parseInt(digs.charAt(i)+"");
            if ( dig>0 && number % dig == 0 ) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        DivisorDigits div = new DivisorDigits();
        div.howMany(12345);
        System.out.println("GOOD... bye");
    }

}
