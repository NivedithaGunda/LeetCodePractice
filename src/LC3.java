class LC3{
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        String result = "";

        for (char c : s.toCharArray()) {
            if (!result.contains(c)) {
                result = result + c;
                length++;
            }
        }
        return length;
    }
}