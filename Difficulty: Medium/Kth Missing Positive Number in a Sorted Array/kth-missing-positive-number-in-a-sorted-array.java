class Solution {
    public int kthMissing(int[] arr, int k) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int correctNo=mid+1;
            int missing = arr[mid]-correctNo;
            if(missing>=k)j=mid-1;
            else i=mid+1;
        }
        return j+1+k;
    }
}