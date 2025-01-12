class Solution {
    boolean solution(String s) {
        int result = 0;
        String[] arr = s.split("");

        for (String str : arr) {
            if (str.equals(")")) {
                result--;
            } else if (str.equals("(")) {
                result++;
            }
            if (result < 0) {
                return false;
            }
        }

        return result == 0;
    }
}