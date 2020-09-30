import java.util.Comparator;

public class NameComparator implements Comparator {


        @Override
        public int compare(Object o1, Object o2) {

            if(o1!=null && o2==null){
                return 1;
            }
            if(o1==null && o2!=null){
                return -1;
            }
            if(o1==null && o2==null){
                return 0;
            }

            Student a=(Student) o1;
            Student b=(Student)o2;
            String name1=a.getName();
            String name2=b.getName();

            if(name1.compareTo(name2)>0) {return 1;}

            if (name1.compareTo(name2)<0){ return -1;}

            return 0;
        }
    }

