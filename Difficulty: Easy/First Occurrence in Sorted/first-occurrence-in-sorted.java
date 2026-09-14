class Solution {
    public int firstSearch(int[] arr, int k) {
       int i=0,j=arr.length-1,ind=-1;
       while(i<=j){
           int mid=(i+j)/2;
           if(arr[mid]<k) i=mid+1;
           else if(arr[mid]>k) j=mid-1;
           else{
               ind=mid;
               j=mid-1;
           }
       }
       return ind;
        
    }
}