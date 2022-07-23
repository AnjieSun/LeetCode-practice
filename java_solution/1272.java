import java.util.Collections;
class Solution {
    public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<List<Integer>> result1 = new ArrayList<>();
        int left = toBeRemoved[0];
        int right = toBeRemoved[1];
        int length = intervals.length;
        for(int i = 0; i <= length - 1 ; i++){
            if(intervals[i][0] >= left){
                break;
            }else if(intervals[i][0] <left &&left <=intervals[i][1]){
                int a = left;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(intervals[i][0]);
                list.add(a);
                result.add(list);
            }else if(left >= intervals[i][1]){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(intervals[i][0]);
                list.add(intervals[i][1]);
                result.add(list);
                //break;
            }
        }

        for(int j = length - 1; j >= 0; j--){
            if(right >= intervals[j][1]){
                break;
            }
            else if(right< intervals[j][1] && right > intervals[j][0]){
                //intervals[j][1]= right;
                int a = right;
                ArrayList<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(intervals[j][1]);
                result.add(list);
            }
            else if(right <= intervals[j][0]){
                ArrayList<Integer> list = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                list.add(intervals[j][0]);
                list.add(intervals[j][1]);
                result1.add(0,list);   
                //break;             
            }
        }
        result.addAll(result1);
        return result;
    }
}