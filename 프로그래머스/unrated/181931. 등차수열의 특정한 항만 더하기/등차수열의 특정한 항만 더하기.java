import java.util.ArrayList;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int ret = 0;
        
        // ArrayList 선언
        ArrayList<Integer> result = new ArrayList<>();

        // 등차수열 a, + b, included.length까지
        for(int i = 0; i < included.length; i++){
            result.add(a);
            if(included[i] == true){
            answer += a;
            }
            a = a + d;
        }
        return answer;
    }
}