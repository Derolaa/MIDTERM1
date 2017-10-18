package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GPA;
	private eMajor Major;

	public Course(UUID courseID, String courseName, int gpa, eMajor major) {
		super();
		this.CourseID = courseID;
		this.CourseName = courseName;
		this.GPA = gpa;
		this.Major = major;
	}

	public UUID getCourseID() {
		return this.CourseID;
	}

	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}

	public String getCourseName() {
		return this.CourseName;
	}

	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}

	public int getGPA() {
		return this.GPA;
	}

	public void setGPA(int gpa) {
		this.GPA = gpa;
	}

	public eMajor getMajor() {
		return this.Major;

	}

	public void setMajor(eMajor major) {
		this.Major = major;

	}

}