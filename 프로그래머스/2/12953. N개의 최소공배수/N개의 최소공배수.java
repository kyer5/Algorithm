class Solution {
    public int solution(int[] arr) {
        int n = 1;

        for (int i = arr.length - 2; i >= 0; i--) {
            while (true) {
                if ((arr[arr.length - 1] * n) % arr[i] != 0) {
                    i = arr.length - 1;
                    n++;
                } else {
                    break;
                }
            }
        }

        return arr[arr.length - 1] * n;
    }
}