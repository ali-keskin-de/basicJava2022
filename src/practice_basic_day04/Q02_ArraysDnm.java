package practice_basic_day04;

import java.util.Scanner;

public class Q02_ArraysDnm {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int input[]= {1,2,3,4,5,6,7};
        int toplam=0;
        for (int i = 0; i < input.length; i++) {
            toplam += input[i];

        }
        int output=toplam/(input.length);
        System.out.println("dizinin ortalama degeri: "+output);//4
    }
}
