class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int k = 0;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                res[i] += (candies > k * num_people + i + 1) ? k * num_people + i + 1 : candies;
                candies = (candies > k * num_people + i + 1) ? candies - (k * num_people + i + 1) : 0;
            }
            k++;
        }
        return res;
    }
}
