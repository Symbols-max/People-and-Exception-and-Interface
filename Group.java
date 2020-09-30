import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group implements Voenkom {
    public int n;
    Student[] s = new Student[9];
    // private String a;

    public Group() {
        this.s = s;
    }

    public void add(Student f) {
        try {
            for (int k = 0; k < s.length; k++) {
                if (s[k] == null) {
                    s[k] = f;
                    return;
                }
            }
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В группе нет свободных мест");
        }
    }

    public boolean remove(int index) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == index) {
                s[i] = null;
                return true;
            }
        }
        return false;
    }

    public void found(String surname) {
        for (Student student : s) {
            if (student == null) continue;
            if (surname.equals(student.getSurname())) {
                System.out.println(student.toString());
            }
        }


    }

    @Override
    public String toString() {
        for (Student s : s
        ) {
            System.out.println(s);
        }
        return " ";
    }

    public void sortSurname() {
        Arrays.sort(s, new SurnameCopparator());
    }

    public void sort(Comparator b) {
        Arrays.sort(s, b);
    }

    @Override
    public Student[] foundPrizovnykov() {

        for (Student student : s) {
            if (student == null) continue;
            if (student.getAge() >= 18 && student.getGender() == Gender.MALE) {
                n++;
            }
        }
        Student[] pryzovnyky = new Student[n];
        for (Student stu : s) {
            if (stu == null) continue;
            if (stu.getAge() >= 18 && stu.getGender() == Gender.MALE) {
                for (int k = 0; k < pryzovnyky.length; k++) {
                    if (pryzovnyky[k] == null) {
                        pryzovnyky[k] = stu;
                    }
                }
            }
        }

        return pryzovnyky;
    }

    public void addWithParameters() {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.println("name:");
        st.setName(sc.next());
        System.out.println("surname:");
        st.setSurname(sc.next());
        System.out.println("age:");
        st.setAge(sc.nextInt());
        System.out.println("gender:");
        if (sc.next() == "male") {
            st.setGender(Gender.MALE);
        } else {
            st.setGender(Gender.FEMALE);

        }
        System.out.println("id:");
        st.setId(sc.nextInt());
        add(st);
    }
}