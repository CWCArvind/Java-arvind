package java_Revision;
import java.util.Scanner;
public class revstring250 {

    public static void main(String[] args) {

        Scanner S=new Scanner(System.in);
        System.out.println("enter the no");
        int a=S.nextInt();
        String b="myjavaclass";
        String [] array=new String[b.length()-a+1];
        for(int i=0;i<b.length()-a+1;i++){
            array[i] = b.substring(i,i+3);

        }
        for(int j=0;j<array.length-1;j++){
            for(int k=j+1;k<array.length;k++){
                if(array[j].compareTo(array[k])>0){
                    String swap=array[j];
                    array[j]=array[k];
                    array[k]=swap;


                }
            }
        }
        System.out.println("the smallest string is");



    }

}
