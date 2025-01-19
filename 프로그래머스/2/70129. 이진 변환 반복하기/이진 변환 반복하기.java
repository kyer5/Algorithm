import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(String s) {
        int zeroCnt = 0;
        int cnt = 0;
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));

        while (list.size() > 1) {
            int length = 0;
            List<String> newList = new ArrayList<>();
            for (String str : list) {
                if (str.equals("0")) {
                    zeroCnt++;
                } else {
                    length++;
                    newList.add("1");
                }
                String newStr = Integer.toBinaryString(length);
                list = Arrays.asList(newStr.split(""));
            }
            cnt++;
        }

        return new int[]{cnt, zeroCnt};
    }
}