class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        int length = s.length();

        int result = 0;
        int left = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        for(int right  = 0;right < length; right++){
            char ch = s.charAt(right);
            map1.put(ch, map1.getOrDefault(ch,0) + 1);
            if(map1.get(ch)==1 && right - left + 1 ==k){
                result++;
                map1.put(s.charAt(left), map1.get(s.charAt(left)) -1);
                left++;
                continue;
            }

            while(map1.get(ch)>1){
                map1.put(s.charAt(left), map1.get(s.charAt(left)) -1);
                left++;
            }
        }
        return result;
    }
}