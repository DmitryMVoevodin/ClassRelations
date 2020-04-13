import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Department dep1 = new Department("Dep1");
        Department dep2 = new Department("Dep2");
        Department dep3 = new Department("Dep3");
        Department dep4 = new Department("Dep4");
        Department dep5 = new Department("Dep5");

        History[] hist1 = new History[2];
        hist1[0] = new History(dep1, "topic1", 5);
        hist1[1] = new History(dep2, "topic2", 4);
        History[] hist2 = new History[2];
        hist2[0] = new History(dep5, "topic3", 3);
        hist2[1] = new History(dep3, "topic4", 4);
        History[] hist3 = new History[2];
        hist3[0] = new History(dep4, "topic5", 5);
        hist3[1] = new History(dep1, "topic6", 5);

        Student stud1 = new Student(
                "Ivan",
                "Ivanov",
                new Card(1,new Date()),
                dep3,
                hist1
        );
        Student stud2 = new Student(
                "Petr",
                "Petrov",
                new Card(2,new Date()),
                dep3,
                hist2
        );
        Student stud3 = new Student(
                "Mihail",
                "Mihailov",
                new Card(3,new Date()),
                dep1,
                hist3
        );

        dep3.setStudents(new Student[]{stud1, stud2});
        dep1.setStudents(new Student[]{stud3});

        System.out.println(dep1 + "; " + dep3);
        System.out.println("student1 = " + stud1);
        System.out.println("student2 = " + stud2);
        System.out.println("student3 = " + stud3);

    }
}
