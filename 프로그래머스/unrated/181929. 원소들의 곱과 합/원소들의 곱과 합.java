class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1; 
        int sum = 0;

        // 배열 순회
        for (int i = 0; i < num_list.length; i++) {
            mul *= num_list[i];
            sum += num_list[i];
        }

        // for 루프가 끝난 후에 mul과 sum의 제곱을 비교
        if (mul < sum * sum) {
            answer += 1;
        }

        return answer;
    }
}
