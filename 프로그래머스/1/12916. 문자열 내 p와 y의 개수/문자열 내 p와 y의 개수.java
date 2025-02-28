class Solution {
    boolean solution(String s) {
        String[] split = s.split("");

        int pCount = 0;
        int sCount = 0;

        for (String str : split) {
            if (str.equals("p") || str.equals("P")) {
                pCount++;
            } else if (str.equals("y") || str.equals("Y")) {
                sCount++;
            }
        }

        if (pCount == 0 && sCount == 0) {
            return true;
        }

        return pCount == sCount;
    }
}