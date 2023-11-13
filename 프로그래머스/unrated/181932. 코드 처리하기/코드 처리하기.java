class Solution {
    public String solution(String code) {
        String[] codeArray = code.split("");
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        
        if(codeArray.length == 0){
            return "EMPTY";
        }
        
        for(int i = 0; i < codeArray.length; i++){
            if(mode == 0){
                if(!codeArray[i].equals("1") && i % 2 == 0){
                    answer.append(codeArray[i]);
                } else if(codeArray[i].equals("1")){
                    mode = 1;
                }
            } else if(mode == 1){
                if(!codeArray[i].equals("1") && i % 2 == 1){
                    answer.append(codeArray[i]);
                } else if(codeArray[i].equals("1")){
                    mode = 0;
                }
            }
        }
        
        return answer.length() == 0 ? "EMPTY" : answer.toString();

    }
}