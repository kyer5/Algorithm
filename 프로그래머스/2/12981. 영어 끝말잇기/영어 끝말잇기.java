import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || list.get(list.size() - 1).charAt(list.get(list.size() - 1).length() - 1) != (words[i].charAt(0))) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                list.add(words[i]);
            }
        }

        return answer;
    }
}