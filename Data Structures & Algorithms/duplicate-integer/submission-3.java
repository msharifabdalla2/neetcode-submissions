class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seenList = new HashSet<>();
        for (int num : nums) {
            if(seenList.contains(num)) {
                return true;
            }
            seenList.add(num);
        }
        return false;
    }
}