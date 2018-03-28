package offer01;

/**
 * Created by DELL on 2018/2/12.
 * Describe:在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int i, j;
        for (i = row - 1, j = 0; i >= 0 && j < col; ) {
            if (array[i][j] == target) {
                return true;
            } else if (target > array[i][j]) {
                j++;
                continue;
            } else {
                i--;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Solution solution = new Solution();
        boolean a = solution.Find(156, arr);
        System.out.println(a);
    }
}
