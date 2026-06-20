class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_length = 0
        l = 0
        mySet = set()

        for r in range(len(s)):
            while mySet and s[r] in mySet:
                mySet.remove(s[l])
                l += 1
            mySet.add(s[r])
            max_length = max(max_length, r - l + 1)
        return max_length
        # s = "abcabcbb"