package day08;

public class selection_sorting {
    public static void main(String[] args){
        int[]a={0,3,2,2,1,1,5};//{
//            for(int i=0;i<a.length;i++){
//                int minindex=i;
//                for(int j=i+1;j<a.length;j++){
//                    if(a[j]<a[minindex])
//                        minindex=j;
//                }
//                int temp=a[i];
//                a[i]=a[minindex];
//                a[minindex]=temp;
//            }
//            for(int num:a){
//                System.out.print(" "+num);
//            }
//        }
    }
    public static void sorting(int []a){

            for(int i=0;i<a.length;i++){
                int minindex=i;
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[minindex])
                        minindex=j;
                }
                int temp=a[i];
                a[i]=a[minindex];
                a[minindex]=temp;
            }
            for(int num:a){
                System.out.print(" "+num);
            }
    }

}
