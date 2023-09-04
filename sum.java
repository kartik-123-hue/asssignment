class GfG
{
    int maxLen(int arr[], int n)
    {
        int sum=0,count=0;
        // Your code here
        HashMap<Integer,Integer> SumtoIndex=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                count=i+1;
            }
            else if(SumtoIndex.containsKey(sum)){
                count=Math.max(count,(i-SumtoIndex.get(sum)));
            }
            else{
                SumtoIndex.put(sum,i);
            }
        }
        return count;
    }
}
