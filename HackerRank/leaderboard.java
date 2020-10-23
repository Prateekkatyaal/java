package HackerRank;

public class leaderboard {
    public static void main(String[] args) {
        int a[] = {5, 25, 50, 120};
        int s[] = {100, 100, 50, 40, 40, 20, 10};

        int n = s.length;
        
        int rank = 1;

        int r[] = new int[a.length];

        int k = 0;

        for(int i = 0; i < n-1; i++){
            if(i == n-1){
                a[k] = rank;
            }else if(s[i] == s[i+1]){
                continue;
            }else if(a[k] > s[i]){
                r[k] = rank--;
                k++;
                rank = 1;
                i = 0;
            }else{
                rank++;
            }
        }

        System.out.println(r);

    }
}