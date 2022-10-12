@FunctionalInterface
interface firstImpression {
    void smile ();
}

class advJava {
    void javaDocs (){
        System.out.println("Java provides a special support to create java docs with just a command that is javadoc");
        System.out.println("we do not have to write html or css nor to spend so much time to create a javadoc");
        System.out.println("We have class tags as well as method tags to customize our java doc");
    }
    void annotations (){
        System.out.println("We have different annotations in java which can help us from a very small mistake creating a big disaster to the code and you and your time");
        System.out.println("Some of them are - @override,@Deprecated,@Suppress Warnings and @Functional interface");
    }
    void Anonymous (){
        System.out.println("java says that if you have an interface to run its methods you want to make a concrete class and no other use of that class exist -->In such a case it allows to create the class and its object together in the main method starting with the instantiation. Such a class is known as an anonymous class which means it has no name. ");

    }
    void LambdaExpressions (){
        System.out.println("It is just like the Anonymous class the only difference is it is used for the functional interfaces and hence it has even more less typing material than anonymous class");
    }

}




public class java {
    public static void main(String[] args) {

        firstImpression interact = ()->{
            System.out.println("Real Smile is the only and one of the most important method to impress anyone when one's meets you");
        };
        interact.smile();


    }
}
