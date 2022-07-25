class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        dp[0] = 0;
        int dayindex = 0;
        for(int i = 1; i<=365; i++){
            if(dayindex>= days.length)break;

            if(days[dayindex]!=i){
                dp[i] = dp[i-1];
                continue;
            }

            dayindex++;

            dp[i] = Math.min(Math.min(dp[Math.max(0,i-1)]+costs[0],dp[Math.max(0,i-7)]+costs[1]),dp[Math.max(0,i-30)]+costs[2]);
        }
        return dp[days[days.length - 1]];
    }
}