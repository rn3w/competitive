/*
 Problem Statement
    
This task is about the scoring in the first phase of the die-game Yahtzee, where five dice are used. 
The score is determined by the values on the upward die faces after a roll. The player gets to choose a 
value, and all dice that show the chosen value are considered active. The score is simply the sum of 
values on active dice.
Say, for instance, that a player ends up with the die faces showing 2, 2, 3, 5 and 4. 
Choosing the value two makes the dice showing 2 active and yields a score of 2 + 2 = 4, 
while choosing 5 makes the one die showing 5 active, yielding a score of 5.
Your method will take as input a int[] toss, where each element represents the upward face of a die, 
and return the maximum possible score with these values.
Definition
    
Class:
YahtzeeScore

Examples
0) 
{ 2, 2, 3, 5, 4 }
Returns: 5
The example from the text.
1)  
{ 6, 4, 1, 1, 3 }
Returns: 6
Selecting 1 as active yields 1 + 1 = 2, selecting 3 yields 3, selecting 4 yields 4 and selecting 6 yields 6, which is the maximum number of points.
2)
{ 5, 3, 5, 3, 3 }
Returns: 10
 */
package topcoder;

/**
 *
 * @author ubuntu
 */
public class YahtzeeScore {

    public int maxPoints(int[] toss) {
        int[] container = new int[toss.length];
        int max = -1000;
        int indexMax = 0;
        for (int i = 0; i < toss.length; i++) {
            for (int j = 0; j < toss.length; j++) {
                if (toss[j] == toss[i]) {
                    container[i] += toss[j];
                }
            }
        }

        for (int i = 0; i < container.length; i++) {
            if (max < container[i]) {
                max = container[i];
                indexMax = i;
            }
        }
        

        return toss[indexMax];
    }

    public static void main(String[] args) {
        YahtzeeScore t = new YahtzeeScore();
        int[] arr = {1, 2, 5, 3, 3};
        t.maxPoints(arr);
    }
}
