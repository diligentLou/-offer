package offer25;

import java.util.LinkedHashMap;

/**
 * Created by DELL on 2018/3/14.
 */
public class Solution1 {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap <Character,Integer> map=new LinkedHashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsValue(str.charAt(i))) {
                int time =map.get(str.charAt(i));
                map.put(str.charAt(i),++time);
            }else {
                map.put(str.charAt(i),1);
            }
        }
        int pos = -1;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }
}
