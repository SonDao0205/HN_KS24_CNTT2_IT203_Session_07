package com.rikkeiedu.management;

import com.rikkeiedu.management.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] studentList = new Student[100];
        int currentIndex = 0;
        int choice;

        do {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ HỌC SINH ---");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tính điểm trung bình");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    double score = Double.parseDouble(sc.nextLine());
                    System.out.print("Nhập tên lớp: ");
                    String className = sc.nextLine();

                    Student newStudent = new Student(name, score, className);
                    studentList[currentIndex++] = newStudent;
                    System.out.println("Thêm thành công!");
                    break;

                case 2:
                    System.out.println("\n--- DANH SÁCH HỌC SINH ---");
                    for (Student s : studentList) {
                        if(s != null){
                            s.displayData();
                        }
                    }
                    break;

                case 3:
                    double totalScore = 0;
                    for (Student s : studentList) {
                        if(s != null){
                            totalScore += s.getScore();
                        }
                    }
                    double average = totalScore / currentIndex;;
                    System.out.printf("Điểm trung bình của %d học sinh là: %.2f\n", currentIndex, average);
                    break;

                case 4:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 4);
    }
}
