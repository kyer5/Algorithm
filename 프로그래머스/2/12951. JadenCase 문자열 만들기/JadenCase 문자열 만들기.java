class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].isEmpty()) {
                sb.append(" ");
            } else {
                sb.append(arr[i].substring(0, 1).toUpperCase());
                sb.append(arr[i].substring(1).toLowerCase());
                sb.append(" ");
            }
        }

        if (s.charAt(s.length() - 1) == ' ') {
            return sb.toString();
        }

        return sb.substring(0, sb.length() - 1);
    }
}