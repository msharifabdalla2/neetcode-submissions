class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        hash_map = {}
        frequency_array = [[] for i in range(len(nums) + 1)]
        
        for num in nums:
            hash_map[num] = hash_map.get(num, 0) + 1
        
        for nums, count in hash_map.items():
            frequency_array[count].append(nums)

        result = []
        
        for i in range (len(frequency_array) - 1, 0, -1):
            for num in frequency_array[i]:
                result.append(num)
                if (len(result) == k):
                    return result
        


        

        

        

        