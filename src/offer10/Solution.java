package offer10;

/**
 * Created by DELL on 2018/2/18.
 * Describe:我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 * <p>
 * 思路：依旧是斐波那契数列
 * target=n时，分2种情况考虑：
 * 第一次摆2*1，则还有f(target-1)
 * 第一次摆1*2，则还有f(target-2)
 * 所以 f(target)=f(target-1)+f(target-2)
 */
public class Solution {
    public int RectCover(int target){
        if(target<=2){
            return target;
        }else{
            return RectCover(target-1)+RectCover(target-2);
        }

    }
}
