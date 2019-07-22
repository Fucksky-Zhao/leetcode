class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for ( ; left <= right; left++) {
            int temp = left;
            int remainder = 0;
            while (temp > 0) {
                remainder = temp % 10;
                temp = temp / 10;
                if (remainder == 0 || left%remainder != 0) break;
            }
            if (temp > 0) continue;
            else if (left % remainder == 0) res.add(left);
        }
        return res;
    }
}
