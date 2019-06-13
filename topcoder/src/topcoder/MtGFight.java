/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ubuntu
 */
public class MtGFight {

    public int[] findGoodFight(int[] power, int[] toughness) {
        ArrayList<Compare> arr = new ArrayList<>();
        int[] res = new int[2];
        int[] res2 = {};
        for (int i = 0; i < power.length; i++) {
            for (int j = 0; j < toughness.length; j++) {
                arr.add(new Compare(power[i], toughness[j]));
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if ((arr.get(i).getFirst() > arr.get(j).getSecond()) && (arr.get(j).getFirst() < arr.get(i).getSecond())) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res2;
    }

    class Compare {

        int first, second;

        Compare(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }

}
