package sort;

/**
 * Created by DELL on 2017/10/18.
 */
public class insertSort {
    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        //这里首先要假设第一个数位置是正确的(arr[0]是第一张牌);因为要往后移动数字,必须要假设第一个。
        //然后将第二个数字arr[1]比作打扑克时拿到的第二张牌
        //i依旧控制需要将多少个数字进行排序(n个数字,n-1次排序,为啥?比如只有两个数字，你肯定只需要进行1次排序啊)
        for (int i = 1; i <arr.length ; i++) {
            int j=i;//第一次循环将第二个数字的下标赋给j
            int temp=arr[j];//第一次循环时将第二个数字赋值给target(即保留待插入元素)

            //第一次循环时如果第二个数字小于第一个数字,就将第一个数字后移(后面的循环中即将前面的数字都后移一位)
            while(j>0&&arr[j]<arr[j-1]){
                arr[j]=arr[j-1];
                //然后将第二个数字插入到第一个位置(后面的循环中即将插入数字插入到前面空出的地方)
                arr[j-1]=temp;
                j--;
            }
        }
    }
}
