class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashMap = defaultdict(int)

        frequencyArray = [[] for i in range(len(nums) + 1)]

        for num in nums:
            hashMap[num] += 1
        
        for nums, count in hashMap.items():
            frequencyArray[count].append(nums)
        
        result = []

        for i in range (len(frequencyArray) - 1, 0, -1):
            for num in frequencyArray[i]:
                result.append(num)
                if (len(result) == k):
                    return result
        