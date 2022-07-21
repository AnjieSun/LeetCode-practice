class Solution {
    public String stringShift(String s, int[][] shift) {
        int[] trans = new int[shift.length];
        for(int i = 0; i < shift.length; i++){
            if(shift[i][0] == 1){
                trans[i] = shift[i][1];
            }
            else{
                trans[i] = 0 - shift[i][1];
            }
        }
        int sum = 0;
        for(int i =0 ;i<trans.length;i++){
            sum += trans[i];
        }
        String result = "";
        if(sum > 0){
            sum = sum%s.length();
            result = s.substring(s.length()-sum,s.length())+s.substring(0,s.length()-sum);
        }else{
            int rev = (0-sum)%s.length();
            result = s.substring(rev,s.length())+s.substring(0,rev);
        }
        return result;
    }
}