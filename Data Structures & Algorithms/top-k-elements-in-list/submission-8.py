class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        hashMap = defaultdict(int)

        frequencyArray = [[] for i in range(len(nums) + 1)]

        for num in nums:
            hashMap[num] += 1
        
        for number, count in hashMap.items():
            frequencyArray[count].append(number)
        
        result = []

        for i in range(len(frequencyArray) -1, 0, -1):
            for num in frequencyArray[i]:
                result.append(num)
                if len(result) == k:
                    return result
        