package topcoder;

import java.util.Arrays;

/**
 *
 * @author ubuntu
 */
public class LongJump2 {

    public int countNewLeaders(int n, int[] jumpLengths) {
        int[] newA = null;
        int maximo = -100;
        int step = 0;
        Compare compare = null;
        for (int i = 0; i < jumpLengths.length; i = i + n) {
            newA = Arrays.copyOfRange(jumpLengths, i, i + n);
            if (compare == null) {
                compare = verifyArray(maximo, newA, -1);
                 step =step+ compare.step;
            } else {
                compare = verifyArray(compare.max, newA, compare.idxMax);
                step =step+ compare.step;
                System.out.println("AAA"+step);
            }

            System.out.println(compare.idxMax + " " +step + " " + compare.max);
        }
        return 0;
    }

    public Compare verifyArray(int maximo, int[] arrays, int idxMax) {
        int max = maximo;
        int indexMax = 0;
        Compare compare = null;
        int step = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
                indexMax = i;
                if (idxMax != i) {
                    step++;
                }
                compare = new Compare(step, indexMax, max);
            }
        }
        return compare;
    }

    class Compare {

        int step, idxMax, max;

        Compare(int first, int second, int max) {
            this.step = first;
            this.idxMax = second;
            this.max = max;
        }

        public int getFirst() {
            return step;
        }

        public int getSecond() {
            return idxMax;
        }
    }

    public static void main(String[] args) {
        LongJump2 t = new LongJump2();
        int[] a = {810, 811, 812, 813, 814, 815};

        int b = 2;
        t.countNewLeaders(b, a);
    }
}
