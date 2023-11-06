class Solution {
    public int[] solution(int[] numbers) {
        // numbers의 길이로 answer 배열 초기화
    int[] answer = new int[numbers.length];
        
        // numbers 길이만큼 배열 내 원소 * 2
        for(int i = 0; i < numbers.length; i++){
            // 각 원소를 answer에 담기
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }
}
