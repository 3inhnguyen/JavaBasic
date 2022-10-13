package Array;

public class baitap3 {

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 4, 5};

        // Yêu cầu 1: Tìm phần tử nhỏ nhất trong mảng
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        // Yêu cầu 2: Tìm phần tử lớn nhất trong mảng
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

        // Tính giá trị trung bình các phần tử trong mảng
        int sum = 0;
        int tongcacphantu = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int avg = sum/ arr.length;
        System.out.println("Tinh trung binh: " + avg);

        // Hiển thị các phần tử là số nguyên tố trong mảng. Biết rằng số nguyên tố
        //là số chỉ chia hết cho 1 và chính nó

    }
}
