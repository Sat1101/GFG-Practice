class Solution {
    int floorSqrt(int n) {
        int root=0;
        for(int i=0;i<=n;i++){
            if(i*i>n)break;
             root=i;
        }
        return root;
        
    }
}