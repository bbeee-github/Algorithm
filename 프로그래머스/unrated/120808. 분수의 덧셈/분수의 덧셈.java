class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 분자
        int numer = numer1 * denom2 + numer2 * denom1;
        // 분모
        int denom = denom1 * denom2;

        int a = numer; // 분자
        int b = denom; // 분모
        
        // 분모가 0이 될때까지 실행 후 최대공약수를 구한다.
        while (b != 0) { 
            int temp = b;
            b = a % b; 
            a = temp; // 최대공약수 2
        }

        // 분자와 분모의 최대약수로 각각 나누나.
        numer /= a;
        denom /= a;

        return new int[]{numer, denom};
    }
}
