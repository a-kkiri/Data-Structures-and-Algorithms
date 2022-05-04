public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 8, 0, 1, 9, 7, 3, 2, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            boolean swap = true;    //判断是否提前完成排序

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    swap = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (swap) { break; }    //如果提前完成排序，则跳出循环
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
