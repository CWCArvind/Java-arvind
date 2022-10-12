package java_Revision;

public class arrays {
    public static void main(String[] args) {
        int []marks ={45,53,56,58,65,89,97};
        // Finding whether the array is sorted is or not : in terms of incresing order

        int check = 0;

        for(int i=0;i<marks.length-1;i++){
            for(int j =i+1;j<marks.length;j++){
                if(marks[i]>marks[j]){
                    System.out.println("Array is not sorted in increasing order");
                    check = 2;
                    break;
                }
            }
            if(check == 2){
                break;
            }
            if(i==marks.length-2){
                System.out.println("Array is sorted in terms of increasing order");
            }
        }

        //   Finding the minimum value present in the array:
     /*   int a = Integer.MAX_VALUE;

        for(int i = 0;i<marks.length;i++){
            if(marks[i]<a){
                a = marks[i];
            }
        }

        System.out.println("The minimum value stored in the array is "+a);
        */


    }
}
