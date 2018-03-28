package sort;

/**
 * 选择排序
 * Created by DELL on 2017/10/18.
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {//只需要比较n-1次
            //将数组中的第一个数arr[i]即arr[minIndex]作为基准,遍历其后面所有的数字,只要出现比这个数字小的,那么就记下
            //这个数的下标并赋给minIndex,遍历完后该minIndex不等于i,说明找到了最小的值,就将这个数字下标为minIndex的值与基准数字交换之
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {  //如果minIndex不为i,说明找到了更小的值,交换之
                swap(arr, i, minIndex);
            }
        }
    }
            public static void swap(int[] arr,int i,int j){
                int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
            }
}
