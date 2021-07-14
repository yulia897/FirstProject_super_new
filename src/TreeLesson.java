import javax.swing.*;
import java.util.Arrays;
// comment

public class TreeLesson {
    public static void main(String[] args) {
        nomer5Arr(5,111);

        int[] nomer1 = {1, 0, 1, 1, 0, 1};
        for (int i = 0; i < nomer1.length; i++)
            if (nomer1[i] == 0)
                nomer1[i] = 1;
            else
                nomer1[i] = 0;
        System.out.println(Arrays.toString(nomer1));

        int[] nomer2 = new int[5];
        for (int j = 0; j < nomer2.length; j++) {
            nomer2[j] = j + 1;
        }
            System.out.println(Arrays.toString(nomer2));

        int[] nomer3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int k = 0; k < nomer3.length; k++) {
            if (nomer3[k] <6)
                nomer3[k] = (nomer3[k]* 2);
        }
                    System.out.println(Arrays.toString(nomer3));

        int [][] nomer4 = new int[4][5];
        for (int l = 0; l < nomer4.length; l++) {
            for (int m = 0; m < nomer4[l].length; m++){
                if (l==m)
                    nomer4[l][m]=2;
                    else
                        nomer4[l][m]=1;
            }
        }
            for (int l=0;l<nomer4.length;l++) {
                String nomer4Arr=Arrays.toString(nomer4[l]);
                System.out.println(nomer4Arr);
            }
  }
  public static void nomer5Arr (int len, int initialValue){
                int [] nomer5= new int[len];
            for(int n=0; n<nomer5.length;n++) {
            nomer5[n] = initialValue;
        }
        System.out.println(Arrays.toString(nomer5));

    }
    }