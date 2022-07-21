class Solution {
    public int findLHS(int[] nums) {
        int result = 0;
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i:nums){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(map1.containsKey(i-1)){
                result = Math.max(result,map1.get(i)+map1.get(i-1));
            }
        }

        return result;
    }
}