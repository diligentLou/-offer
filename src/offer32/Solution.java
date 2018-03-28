package offer32;

/**
 * Created by DELL on 2018/3/15.
 * 如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class Solution {
    public String ReverseSentence(String str) {
        return (str.lastIndexOf(" ")==-1)?str:str.substring(str.lastIndexOf(" ")+1) +" "+ReverseSentence(str.substring(0,str.lastIndexOf(" ")));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.ReverseSentence("student. a am I"));
    }
}
