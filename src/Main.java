import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<Student>();

        studentSet.add(new Student(52, "Alaba", 5.5));
        studentSet.add(new Student(55, "Chrizzy", 0.5));
        studentSet.add(new Student(2, "Kimich", 6.5));
        studentSet.add(new Student(22, "Jeroud", 1.5));
        studentSet.add(new Student(72, "Bruno", 6.5));

        System.out.println(studentSet.toString());
        System.out.println();
        Iterator<Student> studentIterator = studentSet.iterator();
        while (studentIterator.hasNext()){
            Student temp = studentIterator.next();
                if (temp.getName().charAt(0) == 'A' || temp.getName().charAt(0) == 'J') {
                    studentIterator.remove();
                }
        }
        System.out.println(studentSet.toString());
    }
}