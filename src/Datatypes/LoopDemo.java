package Datatypes;

public class LoopDemo {
    public static void main(String[] args){
        int[] arr={10,21,50,43,30};
        System.out.println("For loop outputs:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println("Enhanced for loop op:");
        for(int num:arr){
            System.out.println(num);
        }

        System.out.print("Return statement\n");
        test();
    }
    static void test(){
        for(int i=1;i<=5;i++){
            if(i==3) return;
            System.out.print(i);
        }
        System.out.println("End of the method");
    }
}
