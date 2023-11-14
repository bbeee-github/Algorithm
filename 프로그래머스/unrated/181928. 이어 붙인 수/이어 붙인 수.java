class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even.append(num_list[i]);
            } else{
                odd.append(num_list[i]);
            }
        }
        // StringBuilder를 문자열로 변환하고 정수로 파싱하여 더하기
        answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return answer;
    }
}