class Solution {


    private static final Map<String, Integer> numbersMap = new HashMap<String, Integer>(){{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};



    public int romanToInt(String s) {

        int res = 0;
        int prev = 0;
        int current = 0;
        String [] expect = s.split("");
        for(int i = 0; i < expect.length; i++){

            current = numbersMap.get(expect[i]);
            if(current > prev){
                res += (current - prev);
                res -= prev;
            }else{
                res += current;

            }
            prev = current;
        }


        return res;
    }
}