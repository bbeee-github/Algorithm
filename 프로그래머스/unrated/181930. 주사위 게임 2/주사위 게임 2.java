class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int pow_2 = (a * a) + (b * b) + (c * c);
        int pow_3 = (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        if (a != b && b != c && a != c) {
            answer = sum;
        } else if (a == b && b == c) {
            answer = sum * pow_2 * pow_3;
        } else {
            answer = sum * pow_2;
        }

        return answer;
    }
}
