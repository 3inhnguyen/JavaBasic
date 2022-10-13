package Array;

import java.util.Scanner;

public class baitap4 {

    public static void main(String[] args) {
        //nhap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int d = sc.nextInt();
        System.out.println("Nhap so cot: ");
        int c = sc.nextInt();
        int [][] array = new int[d][c];

        for(int i = 0;i < d; i++){
            for(int j =0; j < c;j++){
                System.out.println("nhap phan tu thu [" + i + "," + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }
        // xuat
        for(int i = 0;i < array.length; i++){
            for(int j =0; j < array.length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
        //tong
        int tong = 0;
        for(int i = 0;i < d; i++){
            for(int j =0; j < c;j++){
                tong += array[i][j];
            }
        }
        System.out.println("Tong cac phan tu: " + tong);
    }
}

