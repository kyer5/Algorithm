class Solution {
    public int[] solution(int brown, int yellow) {
        int yellowHeight;
        int yellowWidth;

        for (yellowHeight = 1; true; yellowHeight++) {
            for (yellowWidth = yellow; yellowWidth > 0; yellowWidth--) {
                if (yellow == yellowHeight * yellowWidth) {
                    if (brown == yellowHeight * 2 + (yellowWidth + 2) * 2) {
                        return new int[]{yellowWidth + 2, yellowHeight + 2};
                    }
                }
            }
        }
    }
}