public class CntNumOfSubStr {
    // Helper function to calculate the count of substrings with at most k distinct characters
    static long calcCount(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int[] charFreq = new int[26]; // Array to store the frequency of characters
        int dist_count = 0; // Variable to keep track of distinct characters
        long ans = 0; // Variable to store the final count

        while (j < n) {
            charFreq[s.charAt(j) - 'a']++;

            // If the character becomes distinct, increment the distinct count
            if (charFreq[s.charAt(j) - 'a'] == 1) {
                dist_count++;
            }

            // Decreasing the window size to maintain at most k distinct characters
            while (dist_count > k) {
                charFreq[s.charAt(i) - 'a']--;

                // If the frequency becomes 0, decrement the distinct count
                if (charFreq[s.charAt(i) - 'a'] == 0) {
                    dist_count--;
                }

                // Move the window's starting point to the right
                i++;
            }

            // Update the count by adding the current window size
            ans += (j - i + 1);
            
            // Move the window's ending point to the right
            j++;
        }

        return ans;
    }

    // Main function to calculate the count of substrings with exactly k distinct characters
    long substrCount(String S, int K) {
        return calcCount(S, K) - calcCount(S, K - 1);
    }
}

