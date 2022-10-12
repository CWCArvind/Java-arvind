/**
 * This class can be used to make the rock paper scissor game.
 * @author Arvind(Black Rider)
 * @version 2.0
 * @since 2022
 * @see <a href ="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"target = "_blank"></a> Java Docs
 */

public class Method_Tags {
    /**
     *
     * @param args These are the arguments supplied to the method
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This method will return addition of two numbers
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return This method will return the sum of these two numbers
     * @throws Exception if i is zero
     * @deprecated This method is deprecated please use + operator.
     */
    public int add (int i , int j) throws Exception{
        int c;
        c = i + j;
        return c;
    }
}
