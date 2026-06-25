class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        // Make a mutableMapOf<Int, Int>()
        // Iterate through the IntArray -> for (num in nums)
            // val numberTotalSeen = map.getOrPut(num) { 0 }
            // numberTotalSeen++
        // return ** this is a hard part of returning the most frequent elements ** maybe return backwards from the key values based on where the map places it?

        val map = mutableMapOf<Int, Int>()

        for (num in nums) {

            map[num] = map.getOrDefault(num, 0) + 1

        }

        val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }

        for ((number, frequency) in map) {
            
            buckets[frequency].add(number)

        }

        val result = mutableListOf<Int>()

        for (i in buckets.indices.reversed()) {
            val bucket = buckets[i]

            for (num in bucket) result.add(num)

            if (result.size == k) return result.toIntArray()
        }

        return result.toIntArray()
    }

}
