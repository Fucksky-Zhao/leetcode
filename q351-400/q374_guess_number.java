/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int high = n, low = 1;
        int middle = low + (high - low) / 2;
        while (low <= high) {
            if (guess(middle) == 0) {
                return middle;
            } else if (guess(middle) == -1) {
                high = middle - 1;
                middle = low + (high - low) / 2;
            } else {
                low = middle + 1;
                middle = low + (high - low) / 2;
            }
        }
        return -1;
    }
}
