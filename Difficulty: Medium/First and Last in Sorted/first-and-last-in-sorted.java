class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=arr.length-1,ind=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<x) i=mid+1;
            else if(arr[mid]>x) j=mid-1;
            else{
                ind=mid;
                j=mid-1;
            }
        }
        ans.add(ind);
        
        
         i=0;
         j=arr.length-1;
         ind=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<x) i=mid+1;
            else if(arr[mid]>x) j=mid-1;
            else{
                ind=mid;
                i=mid+1;
            }
        }
        ans.add(ind);
        return ans;
    }
}
