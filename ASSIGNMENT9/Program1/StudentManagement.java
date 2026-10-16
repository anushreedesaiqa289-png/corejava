
import java.util.*;

class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo
                + ", Name: " + name
                + ", Marks: " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n----- STUDENT MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Sort Students by Roll No");
            System.out.println("5. Sort Students by Name");
            System.out.println("6. Sort Students by Marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(roll, name, marks);
                    list.add(s);

                    System.out.println("Student added successfully.");
                    break;
                }

                case 2: {
                    if (list.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        Iterator<Student> itr = list.iterator();

                        while (itr.hasNext()) {
                            Student s = itr.next();
                            s.display();
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;

                    for (Student s : list) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Student found:");
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                }

                case 4: {
                    Collections.sort(list,
                        Comparator.comparingInt(Student::getRollNo));

                    System.out.println("Students sorted by roll number.");

                    Iterator<Student> itr = list.iterator();
                    while (itr.hasNext()) {
                        itr.next().display();
                    }
                    break;
                }

                case 5: {
                    Collections.sort(list,
                        Comparator.comparing(
                            Student::getName,
                            String.CASE_INSENSITIVE_ORDER));

                    System.out.println("Students sorted by name.");

                    Iterator<Student> itr = list.iterator();
                    while (itr.hasNext()) {
                        itr.next().display();
                    }
                    break;
                }

                case 6: {
                    Collections.sort(list,
                        Comparator.comparingDouble(Student::getMarks));

                    System.out.println("Students sorted by marks.");

                    Iterator<Student> itr = list.iterator();
                    while (itr.hasNext()) {
                        itr.next().display();
                    }
                    break;
                }

                case 0:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
