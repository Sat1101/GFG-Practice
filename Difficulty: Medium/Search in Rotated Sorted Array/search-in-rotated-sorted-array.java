class Solution {
    int search(int[] arr, int key) {
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==key)return mid;
            else if(arr[i]<=arr[mid]){
                if(arr[i]<=key && key<=arr[mid])j=mid-1;
                else i=mid+1;
            }
            else{
                if(arr[mid]<=key&& key<=arr[j])i=mid+1;
                else j=mid-1;
            }
        }
        return -1;
    }
}