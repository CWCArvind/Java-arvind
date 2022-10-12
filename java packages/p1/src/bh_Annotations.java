import java.util.ArrayList;

interface functional {
    String sinTheta (int a);
    String cosTheta (int a);
        }

        @FunctionalInterface
        interface stackoverflow {
    void queries ();
        }


class noun {

    @Deprecated
    public void definition (){
        System.out.println("Noun is the name of a person place or thing");
    }
}
class pronoun extends noun {
    @Deprecated
    @Override
    public void definition (){
        System.out.println("Pronoun is the word used in place of noun");
    }
}

public class bh_Annotations {
    @SuppressWarnings("definition")
    public static void main(String[] args) {
      /*  noun name = new noun();
        name.definition();

        functional obj = new functional() {
            @Override
            public String sinTheta(int a) {
                return "right angle value is one";
            }

            @Override
            public String cosTheta(int a) {
                return "at zero it is one";
            }

        };

        stackoverflow obj1 = ()->{
                System.out.println("Stackoverflow has every query a solution");
        };

        System.out.println(obj.cosTheta(45));
        obj1.queries();
        */

        ArrayList a = new ArrayList();
        a.add(0,45);
        int anum =(int) a.get(0);
        System.out.println(anum);
//        a.add(18);













    }
}
