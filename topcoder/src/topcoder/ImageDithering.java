/*
 Problem Statement
    
Sometimes when computer programs have a limited number of colors to use, they use a 
technique called dithering. Dithering is when you use a pattern made up of different 
colors such that when the colors are viewed together, they appear like another color. 
For example, you can use a checkerboard pattern of black and white pixels to achieve 
the illusion of gray.
You are writing a program to determine how much of the screen is covered by a certain dithered color. 
Given a computer screen where each pixel has a certain color, and a list of all the solid colors that 
make up the dithered color, return the number of pixels on the screen that are used to make up the 
dithered color. Each pixel will be represented by a character in screen. Each character in screen and 
in dithered will be an uppercase letter ('A'-'Z') representing a color.
Assume that any pixel which is a color contained in dithered is part of the dithered color.

Method signature:
int count(String dithered, String[] screen)

Examples
0)

    
"BW"
{"AAAAAAAA",
 "ABWBWBWA",
 "AWBWBWBA",
 "ABWBWBWA",
 "AWBWBWBA",
 "AAAAAAAA"}
Returns: 24
Here, our dithered color could consist of black (B) and white (W) pixels, composing a shade of gray. In the picture, there is a dithered gray square surrounded by another color (A).
1)
"BW"
{"BBBBBBBB",
 "BBWBWBWB",
 "BWBWBWBB",
 "BBWBWBWB",
 "BWBWBWBB",
 "BBBBBBBB"}
Returns: 48
Here is the same picture, but with the outer color replaced with black pixels. Although in reality, the outer pixels do not form a dithered color, your algorithm should still assume they are part of the dithered pattern.
2)  
"ACEGIKMOQSUWY"
{"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
 "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"}
Returns: 150
A picture of vertical stripes, every other stripe is considered part of the dithered color.
3)
"CA"
{"BBBBBBB",
 "BBBBBBB",
 "BBBBBBB"}
Returns: 0
The dithered color is not present.
4)
"DCBA"
{"ACBD"}
Returns: 4
The order of the colors doesn't matter.
 */
package topcoder;

import java.util.Arrays;

public class ImageDithering {

    public int count(String dithered, String[] screen) {
        int cont=0;
        
        String screenToString=String.join(",", screen);
        
        for (int i = 0; i < dithered.length(); i++) {
            for (int j = 0; j < screenToString.length(); j++) {
                if(dithered.charAt(i)==screenToString.charAt(j)){
                cont++;
                }
            }
        }
        
        return cont;
    }

    public static void main(String[] args) {
        ImageDithering t = new ImageDithering();
        String parameter1="BW";
        String [] parameter2=
{"AAAAAAAA",
 "ABWBWBWA",
 "AWBWBWBA",
 "ABWBWBWA",
 "AWBWBWBA",
 "AAAAAAAA"};
        t.count(parameter1, parameter2);
    }
}
