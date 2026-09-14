class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n =arr.length;
                int i=0,j=n-1;
                while(i<=j){
                    int mid =(i+j)/2;
                    if(k==arr[mid]) {
                      return true;  
                    }

                    else if(k>arr[mid]) i=mid+1;
                    else j=mid-1;

                }
                return false;
    }
}