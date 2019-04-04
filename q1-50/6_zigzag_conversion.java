class Solution {
    public String convert(String s, int numRows) {
        int m = numRows;
        int n = s.length();
        String result = "";
        if (n <= 2 || m == 1) return s;//test case: "abc", 1
        for (int i = 0; i < m; i++) {
            if (i >= n) return result;//test case: "abc", 8
            result += s.charAt(i);
            int step1 = 2 * m - 2 * (i + 1);
            int step2 = 2 * i;
            int temp = i;
            while (true) {
                if (temp >= n) break;
                if (step1 != 0) {
                    temp += step1;
                    if (temp < n) {
                        result += s.charAt(temp);
                    } else {
                        break;
                    }
                }
                if (step2 != 0) {
                    temp += step2;
                    if (temp < n) {
                        result += s.charAt(temp);
                    } else {
                        break;
                    }
                }

            }
        }
        return result;
    }
}
