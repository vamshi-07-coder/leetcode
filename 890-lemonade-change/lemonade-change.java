class Solution {
    public boolean lemonadeChange(int[] bills) {
        int d5=0,d10=0,d20=0;
        boolean con=true;
        for(int i=0;i<bills.length;i++){
           if(bills[i]==5){
             d5++;
           }
           else if(bills[i]==10 && d5>=1 ){
             d10++;
             d5--;
           }
           else if(bills[i]==20 && d5>=1 ){
             d20++;
             if(d10>=1){
                d10--;
                d5--;
             }else if(d10==0 && d5>=3){
                d5-=3;
             }else{
                con=false;
                break;
             }
            
           }
           else{
            con=false;
            break;
           }
        }
        return con;
    }
}