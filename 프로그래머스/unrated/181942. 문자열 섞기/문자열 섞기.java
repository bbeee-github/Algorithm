class Solution {
    public String solution(String str1, String str2) {
        int a = str1.length();
        int b = str2.length();
        // int max = Math.max(a, b);
        int sum = a + b;
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < sum; i++){
            if(i < a){
                answer.append(str1.charAt(i));
            } if(i < b){
                answer.append(str2.charAt(i));
            }
        }
        

        
        return answer.toString();
    }
}