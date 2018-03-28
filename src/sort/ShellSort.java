package sort;

/**
 * Created by DELL on 2017/10/18.
 */
public class ShellSort {
    //排序
    public static void shellSort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        int d=arr.length/2;
        while (d>=1){
            shellInsert(arr,d);
            d/=2;
        }
    }

    /**
     * 希尔排序的一趟插入
     * @param arr  待排数组
     * @param d    增量
     */
    public static void shellInsert(int[] arr,int d){
        for (int i = d; i <arr.length ; i++) {
            int j=i-d;
            int temp=arr[i];      //记录要插入的数据
            while(j>=0&&arr[j]>temp){   //从后向前,找到比其他小的数的位置
                arr[j+d]=arr[j];      //向后挪动
                arr[j]=temp;
                j-=d;
            }
        }
    }
}
