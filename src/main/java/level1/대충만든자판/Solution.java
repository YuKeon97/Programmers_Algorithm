package level1.대충만든자판;

class Solution {
    int cnt = 10001;


    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] idx = new int[10001];

        for (String s : targets) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                for (int j = 0; j < keymap[i].length(); j++) {
                    if (c != keymap[i].charAt(j)) {
                        idx[j] = ++cnt;
                    } else {
                        idx[j] = cnt;
                        break;
                    }

                }
            }
        }

        return answer;
    }

}