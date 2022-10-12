public class bh_array {
    public static void main(String[] args) {
        //method1;
      /*  int [] marks = new int[5];
        marks[0] = 78;
        marks[1] = 98;
        //method 2
        int [] marks1 = {58,78,98,56,78,89};

        int a = marks1[2] + 2;
//        System.out.println(marks1[2]);
        int b = marks1.length;

        for(int i =0;i<marks1.length;i++){
            System.out.print(marks1[i]);
            System.out.print(" ");
        }
        System.out.println();

        for(int elements : marks1){
            System.out.print(elements);
            System.out.print(" ");
        }
        */

//        Multidimensional array:

        int [][] twoD = new int[2][3];
        twoD[0][0] = 2;
        twoD[1][2] = 6;

        int [][] matrix = {{1,2,3},
                          {2,4,6}};
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }


    }
}
