package LC3;

import java.util.HashSet;
import java.util.Set;


class LC3{
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0, left = 0;
        Set<Character> set = new HashSet<>();
        
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}