package offer13;

/**
 * Created by DELL on 2018/2/18.
 * Describe:输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * <p>
 * 思路：
 * 新建一个数组newArr，先计算原来数组中奇数的个数count，
 * 那么在newArr[0] - newArr[count]中存放奇数，从newArr[count]开始存放偶数，
 * 再array重新赋值一遍。
 */
public class Solution {
    public void reOrderArray(int [] array){
        int [] newArr=new int[array.length];
        int count=0;
        int oddBegin=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] % 2 != 0){
                count++;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if (array[i] % 2 !=0){
                newArr[oddBegin++]=array[i];
            } else {
                newArr[count++] = array[i];
            }
        }
        for (int i = 0; i < array.length ; i++) {
            array[i] = newArr[i];
        }
    }
}
