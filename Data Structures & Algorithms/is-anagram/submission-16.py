class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        my_mapS = {}
        my_mapT = {}

        for i in range(len(s)):
            my_mapS[s[i]] = my_mapS.get(s[i], 0) + 1
            my_mapT[t[i]] = my_mapT.get(t[i], 0) + 1
        
        return my_mapS == my_mapT  

        