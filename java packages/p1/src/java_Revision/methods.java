package java_Revision;

// Pattern printing using recursion :


public class methods {

    void starPattern (int n){
        if(n==0){
            return;
        }
        starPattern(n-1);
        for(int i=0;i<n;i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Today I am somewhat upset\n I don't know why");

        methods pattern = new methods();
        pattern.starPattern(4);




    }
}
