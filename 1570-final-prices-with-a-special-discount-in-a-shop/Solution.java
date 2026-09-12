import java.util.Scanner;
public class Solution {
    static int[] finalPrices(int[] prices){
        int n= prices.length;
        Scanner sc = new Scanner(System.in);
        int[] answer= new int[n];
        for(int i = 0; i<n; i++){
            answer[i] = prices[i];
            for(int j = i+1; j<n; j++){
                if(prices[j] <= prices[i]){
                    answer[i] = answer[i] - prices[j];
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices= new int[n];
        for(int i = 0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        int[] answer = finalPrices(prices);
        for(int i = 0; i<n; i++){
            System.out.print(answer[i]+" ");
        }
    }
}