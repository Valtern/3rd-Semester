import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        storage man = new storage();
        Scanner sc = new Scanner(System.in);
        Student s1;
        OOPcourse course = new OOPcourse();
        WebDevcourse course2 = new WebDevcourse();
        boolean opt = false, opt1, opt2;
        String crsName, lcrName, stdName;
        double crsGrade;
        int optNum, optNum1, nimSearch, numRe;
        int NIM, age;

        while (!opt) {
            opt1 = false;
            opt2 = false;
            System.out.println();
            System.out.println();
            System.out.println("Welcome to POLINEMA simple online grading system");
            System.out.println("What would you'd like to do ?");
            System.out.println("1. Input information for OOP course \n2. Input information for Web dev course \n3. Data management for OOP \n4. Data management for web dev\n5. Exit ");
            optNum = sc.nextInt();
            switch (optNum) {
                case 1:
                    s1 = new Student();
                    crsName = course.setCoursename();
                    sc.next();
                    lcrName = course.setLecturername();
                    stdName = course.setStudentname();
                    crsGrade = course.setCoursegrade();
                    System.out.println("Set a student NIM:  ");
                    NIM = sc.nextInt();
                    System.out.println("Set a student age: ");
                    age = sc.nextInt();
                    s1.age = age;
                    s1.nim = NIM;
                    s1.name = stdName;
                    s1.crs.totalGrade = crsGrade;
                    s1.crs.courseName = crsName;
                    s1.crs.lecturerName = lcrName;
                    man.addFirst(s1);
                    System.out.println("Successfully added");
                    break;
                case 2:
                    s1 = new Student();
                    crsName = course2.setCoursename();
                    sc.next();
                    lcrName = course.setLecturername();
                    stdName = course.setStudentname();
                    crsGrade = course.setCoursegrade();
                    System.out.println("Set a student NIM:  ");
                    NIM = sc.nextInt();
                    System.out.println("Set a student age: ");
                    age = sc.nextInt();
                    s1.age = age;
                    s1.nim = NIM;
                    s1.name = stdName;
                    s1.crs.totalGrade = crsGrade;
                    s1.crs.courseName = crsName;
                    s1.crs.lecturerName = lcrName;
                    man.addFirst(s1);
                    System.out.println("Successfully added");
                    break;
                case 3:
                    while (!opt1) {
                        System.out.println("What would you like to do ? \n1. Search for a student \n2. Remove a student \n3. Print details \n4. Sort Data \n5. Exit");
                        optNum1 = sc.nextInt();
                        switch (optNum1) {
                            case 1:
                                nimSearch = sc.nextInt();
                                man.SeqSearch(nimSearch);
                                break;
                            case 2:
                                numRe = sc.nextInt();
                                man.remove(numRe);
                                break;
                            case 3:
                                man.print();
                                break;
                            case 4:
                                man.sortData();
                                break;
                            case 5:
                                opt1 = true;
                        }
                    }
                    break;
                case 4:
                    while (!opt2) {
                        System.out.println("What would you like to do ? \n1. Search for a student \n2. Remove a student \n3. Print details \n4. Sort Data \n5. Exit");
                        optNum1 = sc.nextInt();
                        switch (optNum1) {
                            case 1:
                                nimSearch = sc.nextInt();
                                man.SeqSearch(nimSearch);
                                break;
                            case 2:
                                numRe = sc.nextInt();
                                man.remove(numRe);
                                break;
                            case 3:
                                man.print();
                                break;
                            case 4:
                                man.sortData();
                                break;
                            case 5:
                                opt2 = true;
                        }

                    }
                    break;
                case 5:
                    opt = true;

            }

        }
    }
}