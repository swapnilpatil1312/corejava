package assignment9;



import java.util.*;

public class StudentManager {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student\n2. Display All\n3. Search by RollNo");
            System.out.println("4. Sort by RollNo\n5. Sort by Name\n6. Sort by Marks\n0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter RollNo: "); int r = sc.nextInt();
                    System.out.print("Enter Name: "); String n = sc.next();
                    System.out.print("Enter Marks: "); double m = sc.nextDouble();
                    list.add(new Student(r, n, m));
                    break;

                case 2:
                    Iterator<Student> itr = list.iterator();
                    while (itr.hasNext()) System.out.println(itr.next());
                    break;

                case 3:
                    System.out.print("Enter RollNo to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;
                    for (Student s : list) {
                        if (s.getRollNo() == searchRoll) {
                            System.out.println("Found: " + s);
                            found = true; break;
                        }
                    }
                    if (!found) System.out.println("Not found.");
                    break;

                case 4: // Sort by RollNo
                    list.sort(Comparator.comparingInt(Student::getRollNo));
                    System.out.println("Sorted by Roll Number.");
                    break;

                case 5: // Sort by Name
                    list.sort(Comparator.comparing(Student::getName));
                    System.out.println("Sorted by Name.");
                    break;

                case 6: // Sort by Marks
                    list.sort(Comparator.comparingDouble(Student::getMarks));
                    System.out.println("Sorted by Marks.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }
}
