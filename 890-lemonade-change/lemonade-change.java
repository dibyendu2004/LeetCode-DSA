class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5=0,count10=0,count20=0;

        int n = bills.length;

        for(int i=0;i<n;i++){
            if(bills[i] == 5){
                count5++;
            }
            if(bills[i] == 10){
                if(count5 == 0){
                   return false;
                }
                else{
                    count5--;
                    count10++;
                }
            }
             if(bills[i] == 20){
                if( count10 > 0 && count5 > 0){
                    count10--;
                    count5--;
                }
                else if(count5 >= 3){
                    count5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}