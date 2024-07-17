public class Main{
    static void addOne(int x){ //Pass by Value
        x=x+1;
    }
    static void addOne(int arr[]){ //Pass by refernce
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String[]args){
        int x=10;
        addOne(x);
        System.out.println(x);
        int arr[]={1,2,3,4,5};
        addOne(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
