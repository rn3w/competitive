/*

Julius Caesar used a system of cryptography, now known as Caesar Cipher, which shifted each letter 2 
places further through the alphabet (e.g. 'A' shifts to 'C', 'R' shifts to 'T', etc.). 
At the end of the alphabet we wrap around, that is 'Y' shifts to 'A'.
We can, of course, try shifting by any number. Given an encoded text and a number of places to shift, 
decode it.
For example, "TOPCODER" shifted by 2 places will be encoded as "VQREQFGT". In other words, 
if given (quotes for clarity) "VQREQFGT" and 2 as input, you will return "TOPCODER". 
See example 0 below.
Definition
    
Class:CCipher

Method signature:
String decode(String cipherText, int shift)

Examples
0)
"VQREQFGT"
2
Returns: "TOPCODER"

1)
"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
10
Returns: "QRSTUVWXYZABCDEFGHIJKLMNOP"

2) 
"TOPCODER"
0
Returns: "TOPCODER"

3)

    
"ZWBGLZ"
25
Returns: "AXCHMA"

4)
"DBNPCBQ"
1
Returns: "CAMOBAP"

5)
"LIPPSASVPH"
4
Returns: "HELLOWORLD"
 */
package topcoder;

/**
 *
 * @author ubuntu
 */
public class CCipher {
    String decode(String cipherText, int shift){
       String result="";
        for(int i=0;i<cipherText.length();i++){
            
            result+=(char)((int)cipherText.charAt(i)+shift);
        }
        return result;
    }
    
    public static void main(String[] args) {
        CCipher t = new CCipher();
        t.decode("TOPCODER",2);
    }
}
