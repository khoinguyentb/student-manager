/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;

/**
 *
 * @author vankh
 */
public class Student implements Serializable,Comparable<Student>{
    private long  id;
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String khoa;
    private String lop;
    private double  GPA;

    public Student() {
    }

    public Student(long id, String hoTen, String ngaySinh, String diaChi, String khoa, String lop, double GPA) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.khoa = khoa;
        this.lop = lop;
        this.GPA = GPA;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getGPA() {
        return GPA;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    
    public String getHoTen() {
        return hoTen;
    }

    public long getId() {
        return id;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    @Override
    public int compareTo(Student o) {
        return this.hoTen.compareTo(o.hoTen);
    }

}
