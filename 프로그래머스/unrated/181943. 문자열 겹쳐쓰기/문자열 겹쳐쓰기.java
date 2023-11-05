class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 1. my_string을 s 까지 자른다       
        String answer = my_string;
        String first = answer.substring(0, s);
        
        // 2. overwrite_string의 갯수만큼 문자열을 치환한다.
        String over = "";
        for(int i = 0; i < overwrite_string.length(); i++){
            over += overwrite_string.charAt(i);
        }
        // 3. 남은 문자는 반환한다.
        String last = my_string.substring(s + overwrite_string.length());
        
        // 4. 문자들을 합친 후 리턴한다.
        answer = first + over + last;
        return answer;
    }
}

