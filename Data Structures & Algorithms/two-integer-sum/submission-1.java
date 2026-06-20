class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int number = nums[i];
            int difference = target - number;

            if(numberMap.containsKey(difference)){
                return new int[] {numberMap.get(difference), i};
            }

            numberMap.put(number, i);
        }

        return new int[] {};
    }
}
