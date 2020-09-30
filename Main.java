import java.util.Scanner;

public class Main {
    public static void main(String []args) {

        Student s=new Student("Max","Prikhodko",10,Gender.MALE,1);
        System.out.println(s);
        Group g=new Group();
        g.addWithParameters();
        g.add(s);
        g.add(new Student("A","B",12,Gender.MALE,3));
       g.add(new Student("Den","C",12,Gender.MALE,4));
        g.add(new Student("Vlad","D",18,Gender.MALE,5));
        g.add(new Student("Danya","F",12,Gender.MALE,6));
        g.add(new Student("Vitya","K",20,Gender.MALE,7));
        g.add(new Student("George","G",12,Gender.MALE,8));
        g.add(new Student("Tom","Lm",12,Gender.MALE,9));
        g.add(new Student("Ben","O",12,Gender.MALE,10));
        g.add(new Student("dadad","dadada",12,Gender.MALE,11));
        g.add(new Student("dadad","dadada",12,Gender.MALE,12));
        g.toString();
        System.out.println(s.toString());
        System.out.println(g.remove(2));
        System.out.println(g.remove(1));
        Student s2=new Student("Max","Pri",10,Gender.FEMALE,2);
        g.add(s2);
        g.found("Pri");
        g.remove(2);
       g.found("B");
       IdComparator a=new IdComparator();
       g.sort(a.reversed());
       g.toString();

g.foundPrizovnykov();


    }


}
