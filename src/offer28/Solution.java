package offer28;

/**
 * Created by DELL on 2018/3/14.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array == null ||array.length <= 1) {
            num1[0] = num2[0] = 0;
            return;
        }
        int len=array.length,index=0,sum=0;
        for (int i = 0; i < len; i++) {
            sum ^=array[i];
        }
        for ( index = 0; index < 32; index++) {
                if((sum & (1 << index)) !=0){
                    break;
            }
        for (int i = 0; i < len ; i++) {
                if ((array[i]&(1<<index))!=0){
                    num2[0]^=array[i];
                }else {
                    num1[0]^=array[i];
                }
            }
        }
    }

    /**
     * 数组a中只有一个数出现一次，其他数都出现了2次，找出这个数字
     * @param a
     * @return
     */
    public static int find1Form2(int[] a){
        int len =a.length,res=0;
        for (int i = 0; i < len ; i++) {
            res =res ^ a[i];
        }
        return res;
    }
    /**
     * 数组a中只有一个数出现一次，其他数字都出现了3次，找出这个数字
     * @param a
     * @return
     */
    public static int findForm3(int[] a){
        int[] bits=new int[32];
        int len=a.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 32; j++) {
                bits[j] =bits[j] +((a[i] >>>j) & 1);
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (bits[i] % 3 !=0) {
                res = res | (1 << i);  //| (按位或)
            }
        }
        return res;
    }
}
