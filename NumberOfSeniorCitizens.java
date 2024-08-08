class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String d : details) {
            if(d.charAt(11) >= '6') {
                if(d.charAt(12) == '0' && d.charAt(11) == '6') continue;
                count++;
            }
        }

        return count;
    }
}
    
