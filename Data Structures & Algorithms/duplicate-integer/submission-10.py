class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashSet = set()

        for num in nums:
            if hashSet and num in hashSet:
                return True
            hashSet.add(num)
        return False
        



    
        