package com.rikkeiedu.management.model;

public class Student {
    public static final String SCHOOL_NAME = "Rikkei Education";
    private static int nextId = 1;
    int id;
    String fullName;
    double score;
    String className;

    public Student(String fullName, double score, String className) {
        this.id = nextId++;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void displayData() {
        System.out.printf("ID: %d | Tên: %-15s | Lớp: %-10s | Điểm: %.2f | Trường: %s\n",
                id, fullName, className, score, SCHOOL_NAME);
    }
}