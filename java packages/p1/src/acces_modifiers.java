


class circle {
    private float radius ;
    private float perimeter ;
    private float area ;

     void setRadius(float r){
        radius = r;
    }
    void setPerimeter(float p){
        if(p==2*(22/7.0f)*radius){
        perimeter = p;}
        else {
            System.out.println("Warning:\n Your perimeter is not correct according to the radius.\nPlease set correctly.");
        }
    }
    void setArea(float a){
       if(a==(22/7.0f)*radius*radius) {
           area = a;
       }
       else{
           System.out.println("Warning:\n Your area is not correct according to the radius.\nPlease set correctly.");
       }
    }
    float getRadius(){
        return radius;
    }
    float getPerimeter(){
        return perimeter;
    }
    float getArea(){
        return area;
    }
}


class myEmployee {
   private int  id;
   private String name;
    String getName (){
        return name;
    }
    int getId (){
        return id;
    }
    void setName(String n){

        name = n;
    }
    void setId(int ID){
        id = ID;
    }
}
public class acces_modifiers {
    public static void main(String[] args) {

//        myEmployee obj = new myEmployee();
//        obj.setName("Arvind Sharma");
//        System.out.println(obj.getName());
        circle circle = new circle();
        circle.setRadius(7);
        circle.setPerimeter(44);
        circle.setArea(154);
        System.out.println(circle.getArea());


    }
}
