class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int m=nums.length;
         List<Integer> target =new ArrayList<>();
        for(int i=0;i<m;i++)
        {
           target.add(index[i],nums[i]);
        }
        int[] res=new int[target.size()];
        for(int i=0;i<target.size();i++)
        {
            res[i]=target.get(i);
        }
        return res;
     }
}