
import java.util.Scanner;

class Student {
  int rollNo;
  String name;
  int age;
  String address;
  long phoneNo;
  String email;

  public Student(int rollNo, String name, int age, String address, long phoneNo, String email) {
    this.rollNo = rollNo;
    this.name = name;
    this.age = age;
    this.address = address;
    this.phoneNo = phoneNo;
    this.email = email;
  }
}

public class StudentDatabase {
  static int numStudents = 0;
  static Student[] students = new Student[10];

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
      System.out.println("1. Add student");
      System.out.println("2. View student");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");
      int choice = input.nextInt();

      switch (choice) {
        case 1:
          addStudent();
          break;
        case 2:
          viewStudent();
          break;
        case 3:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
      }
    }
  }

  public static void addStudent() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter roll number: ");
    int rollNo = input.nextInt();
    System.out.print("Enter name: ");
    String name = input.next();
    System.out.print("Enter age: ");
    int age = input.nextInt();
    System.out.print("Enter address: ");
    String address = input.next();
    System.out.print("Enter phone number: ");
    long phoneNo = input.nextLong();
    System.out.print("Enter email: ");
    String email = input.next();

    students[numStudents] = new Student(rollNo, name, age, address, phoneNo, email);
    numStudents++;
  }

  public static void viewStudent() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter roll number: ");
    int rollNo = input.nextInt();

    for (int i = 0; i < numStudents; i++) {
      if (students[i].rollNo == rollNo) {
        System.out.println("Roll number: " + students[i].rollNo);
        System.out.println("Name: " + students[i].name);
        System.out.println("Age: " + students[i].age);
        System.out.println("Address: " + students[i].address);
        System.out.println("Phone number: " + students[i].phoneNo);
        System.out.println("Email: " + students[i].email);
        return;
      }
    }

    System.out.println("Student not found");
  }
}
