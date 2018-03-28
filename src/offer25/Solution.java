package offer25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018/3/14.
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        List<Character> list =new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!list.contains(ch)) {
                list.add(Character.valueOf(ch));
            }else {
                list.remove(Character.valueOf(ch));
            }
        }
        if (list.size() <= 0) {
            return -1;
        }
        return str.indexOf(list.get(0));
    }
}
