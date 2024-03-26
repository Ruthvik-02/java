public class StudentAttendRecord {
    public boolean checkRecord(String s) {
        int late = 0;
        int absent = 0;
        char[] arr = s.toCharArray();

        for(char c: arr){
            if(c=='A'){
                absent++;
                if(absent>=2){
                    return false;
                }
            }
            if(c=='L'){
                late++;
                if(late>=3){
                    return false;
                }
            }
            else{
                late = 0;
            }
        }
        return true;
    }
}
