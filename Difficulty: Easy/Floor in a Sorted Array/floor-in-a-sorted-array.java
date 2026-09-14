class Solution {
    static int findFloor(int[] arr, int x) {
       int i=0,j=arr.length-1,ind=-1;
       while(i<=j){
           int mid=(i+j)/2;
           if(arr[mid]>x) j=mid-1;
           else{
               ind=mid;
               i=mid+1;
           }
       }
        return ind;
    }
}
