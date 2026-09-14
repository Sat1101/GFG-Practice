class Solution {
    int single(int[] arr) {
        int n=arr.length;
        if(n==1)return arr[0];
        if(arr[n-1]!=arr[n-2])return arr[n-1];
        if(arr[0]!=arr[1])return arr[0];
        int i=0,j=n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]!=arr[mid+1]&& arr[mid]!=arr[mid-1])return arr[mid];
            int f=mid,s=mid;
            if(arr[mid]==arr[mid-1])f=mid-1;
            else s=mid+1;
            int lcount=f-i;
            int rcount=j-s;
            if(lcount%2==0) i=s+1;
            else j=f-1;
            
        }
        return 1;
        
    }
}