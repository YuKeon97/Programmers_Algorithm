package level1.카드뭉치;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1idx = 0;
        int cards2idx = 0;

        for (int i = 0; i < goal.length; i++) {
            String tmp = goal[i];
            if (cards1idx<cards1.length && tmp.equals(cards1[cards1idx])) cards1idx++;
            else if (cards2idx<cards2.length && tmp.equals(cards2[cards2idx])) cards2idx++;
            else return "No";
        }
        return "Yes";
    }
}