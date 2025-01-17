class Solution {
    public int solution(int n) {
        int next = n + 1;
        String binaryString1 = Integer.toBinaryString(n);
        char[] charArray1 = binaryString1.toCharArray();
        int cnt1 = 0;

        for (char c1 : charArray1) {
            if (c1 == '1') {
                cnt1++;
            }
        }

        while (true) {
            String binaryString2 = Integer.toBinaryString(next);
            char[] charArray2 = binaryString2.toCharArray();
            int cnt2 = 0;

            for (char c2 : charArray2) {
                if (c2 == '1') {
                    cnt2++;
                }
            }

            if (cnt1 == cnt2) {
                return next;
            }
            next++;
        }
    }
}