import java.util.List;

public class Student extends People  {
    private int id;

    public Student(String name, String surname, int age, Gender gender, int id) {
        super(name, surname, age, gender);
        this.id = id;
    }
    public Student(){
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +super.toString()+
                '}';
    }

}
