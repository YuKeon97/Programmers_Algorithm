package level1.자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String tmp = String.valueOf(n);
        for (int i = 0; i < tmp.length(); i++) sum += Character.getNumericValue(tmp.charAt(i));
        return sum;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        System.out.println(t.solution(123));
    }
}
