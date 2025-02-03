import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            Integer freq = map.get(i);
            map.put(i, (freq == null) ? 1: freq + 1);
        }

        List<Integer> ketSet = new ArrayList<>(map.keySet());

        ketSet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1).compareTo(map.get(o2));
            }
        });

        ketSet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int answer = 0;
        for (Integer i : ketSet) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= map.get(i);
        }

        return answer;
    }        
}