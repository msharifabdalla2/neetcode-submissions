class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        max_l = 0
        l = 0
        mySet = set()

        for r in range(len(s)):
            while s[r] in mySet:
                mySet.remove(s[l])
                l += 1
            mySet.add(s[r])
            max_l = max(max_l, r - l + 1)
        return max_l

        # s = "abcabcbb"