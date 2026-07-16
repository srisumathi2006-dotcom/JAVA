package day07;

public class problem04 {
    public static void main(String[]args){
        int []a={12,50,5,666,777};
        int evensum=0;
        int oddsum=0;
        for(int j:a){
            int org=j;
            int count=0;
            while(j!=0){
                int pop=j%10;
                count++;
                j/=10;
            }
            if(count%2==0){
                evensum+=org;
            }
            else{
                oddsum+=org;
            }

        }

        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
