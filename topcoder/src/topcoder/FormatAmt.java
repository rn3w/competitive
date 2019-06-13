/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topcoder;

/**
 *
 * 49734321 9 Returns: "$49,734,321.09"
 *
 * @author ubuntu
 */
public class FormatAmt {

    public String amount(int dollars, int cents) {
        String res = "";
        String character = (dollars + "");
        character = new StringBuilder(character).reverse().toString();
        String cent = ".";
        int cont = 0;
        for (int i = 0; i < character.length(); i++) {
            cont++;
            res += character.charAt(i);
            if (i > 0 && cont % 3 == 0 && i < character.length() - 1) {
                res += ",";
            }
        }
        if (cents < 10) {
            cent += "0" + cents;
        } else {
            cent += cents + "";
        }

        return "$" + new StringBuilder(res).reverse().toString() + cent;
    }

    public static void main(String[] args) {
        FormatAmt t = new FormatAmt();
        t.amount(49734321, 9);
    }

}
