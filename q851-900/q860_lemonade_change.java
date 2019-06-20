class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) return true;
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (five == 0) return false;
                if (ten > 0) {
                    ten--;
                    five--;
                } else {
                    if (five < 3) return false;
                    five -= 3;
                }
            }
        }
        return true;
    }
}
