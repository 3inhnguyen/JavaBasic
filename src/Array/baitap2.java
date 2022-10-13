package Array;

import java.util.Random;
import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {

        int []arr = new int[20];
        Random random = new Random();

        //tao mang
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(20);
        }
        //xuat mang
        for(int i = 0; i < arr.length; i++){
            System.out.print(" ," + arr[i] );
        }

        //nhap x
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap X: ");
        int x = sc.nextInt();

        // yc1: In ra phần tử có giá trị bị trùng lặp trong mảng trên 3 lần
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        System.out.println("So lan xuat hien cua X: " + count);
        // 1 2 3 1 4 // 1 2 3 5 5
        // yc2: In ra phần tử có giá trị bị trùng lặp trong mảng trên 3 lần
        int countYc2 = 0;
        for(int i = 0; i< arr.length; i++){
            arr[0] = arr[i];

        }
    }
}
