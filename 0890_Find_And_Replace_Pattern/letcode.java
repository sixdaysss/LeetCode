package test;


import java.util.ArrayList;
import java.util.List;

public class letcode {
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern){
            List<String> lst = new ArrayList <>();
            for(int i=0; i<words.length; i++){
                if(words[i].length() == pattern.length()){
                    if(isMatch(words[i],pattern)){
                        lst.add(words[i]);
                    }
                }
            }
            return lst;
        }
        public boolean isMatch(String word, String pattern){
            int[] map = new int[138];
            int[] isUse = new int[138];
            for(int i=0; i<word.length(); i++){
                int p = pattern.charAt(i);
                int s = word.charAt(i);
                if(map[p]==0 && isUse[s]==0){
                    map[p]=s;
                    isUse[s]=1;
                }
                else if(map[p]!=s){
                    return false;
                }
            }
            return true;
        }
    }
        public static void main(String[] args){
            String[] arr = {"abc", "deq", "mee", "aqq","dkd", "ccc"};
            String pattern = "abb";
            letcode letcode = new letcode();
            Solution solution  = letcode.new Solution();
            System.out.println(solution.findAndReplacePattern(arr,pattern));
    }

}
