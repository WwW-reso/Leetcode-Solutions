class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_length = 200;
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < min_length){
                min_length = strs[i].length();
            }
        }

        String checker ;
        String result = "";
        String current;
        for(int i = 0; i < min_length; i++){

            checker = String.valueOf(strs[0].charAt(i));
            for(int j = 0; j < strs.length; j++){
                current = String.valueOf(strs[j].charAt(i));
                if(!current.equals(checker)){
                    return result;
                }
            }
            result += strs[0].charAt(i);
        }
        return result;
    }
}