class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for (num in nums) {

            map[num] = map.getOrDefault(num, 0) + 1
        }

        val buckets = MutableList<MutableList<Int>>(nums.size + 1) { mutableListOf() }

        for ((number, frequency) in map) {

            buckets[frequency].add(number)
        }

        val result = mutableListOf<Int>()

        for (bucket in buckets.reversed()) {
            

            for (num in bucket) result.add(num)

            if (result.size == k) return result.toIntArray()
        }

        return result.toIntArray()

    }
}
