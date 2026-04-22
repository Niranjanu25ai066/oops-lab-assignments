abstract  class projectMain{
    abstract  void power();
     void display(){
        System.out.println("same dugging commands");
        

     }

}
class child1 extends projectMain{
    void power(){
        System.out.println("child1 is here")
        ;
    }
}
 class child2 extends projectMain{
    void power(){
        System.out.println("child2 is here");
    }
 }

 class TestProject{
    public static void main(String[] args) {
        child1 a= new child1();
        child2 b = new child2();
        a.power();
        a.display();
        b.display();
        b.power();
    }
 }