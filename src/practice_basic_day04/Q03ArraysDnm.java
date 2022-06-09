package practice_basic_day04;

import java.util.Arrays;

public class Q03ArraysDnm {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        //1.adim : str tanimladik

        String str="HeySiri";
        String str1[]=str.split("");
        System.out.println(Arrays.toString(str1));
    }
}
