class Solution {
    long[] s;
    int[] tree;
    public int lower(long x){
        int lo=0, hi=s.length;
        while(lo<hi){
            int m = (lo+hi)/2;
            if(s[m] < x) lo = m+1;
            else hi=m;
        }
        return lo;
    }

    public int upper(long x){
        int l=0, h=s.length;
        while(l<h){
            int m = (l+h)/2;
            if(s[m]<=x) l = m+1;
            else h=m;
        }
        return l;
    }

    public int q(int i){
        int sum=0;
        while(i>0){
            sum+=tree[i];
            i-=i&(-i);
        }
        return sum;
    }

    public void update(int i){
        while(i<tree.length){
            tree[i]++;
            i+=i&(-i);
        }
    }
    
    public long distantSubarrays(int[] arr, int goal, int k) {
        if(k==0) return (long)arr.length*(arr.length+1)/2;
        int n = arr.length;
        long[] p = new long[n+1];
        for(int i=0; i<n; i++){
            p[i+1] = p[i]+arr[i];
        }
        s=p.clone();
        Arrays.sort(s);
        tree = new int[n+2];
        long ans=0;
        for(int i=0; i<=n; i++){
            ans+=i-q(lower(p[i]-goal+k));
            ans+= q(upper(p[i]-goal-k));
            update(lower(p[i])+1);
        }
        return ans;
    }
}