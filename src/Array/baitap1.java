package Array;

public class baitap1 {

    public static void main(String[] args) {
        int []arr = {10, 25, -4, 32, 63, 81, 19, 24, 13, 18, 45, 12, 72, 42, -6};

        System.out.println("yeu cau 1");
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 != 0){
                System.out.println(i +": "+ arr[i]);
            }
        }

        System.out.println("yeu cau 2");
        int count = 0;
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 == 0 && arr[i] % 6 == 0) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("yeu cau 3");
        int tong = 0;
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] % 2 == 0) {
                tong += arr[i];
            }
        }
        System.out.println(tong);

        System.out.println("yeu cau 4");
        for(int i = 0; i < arr.length ; i++){
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        for(int i = 0; i < arr.length ; i++){
                System.out.println(arr[i]);
            }
        }
    }

