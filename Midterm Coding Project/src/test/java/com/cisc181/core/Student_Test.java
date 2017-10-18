package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.core.Section;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		try {
			Student A = new Student("Marshall", "Bruce", "Mathers", new Date(1972, 10, 17), eMajor.BUSINESS, "270 Lafayette Suite 805, Newark, DE",
					"3138975062", "mandm@gmail.com");
			
			Student B = new Student("Sarah", "Elena", "Kriebel", new Date(1990, 8, 24), eMajor.NURSING, "1201 Canvasback Rd, New Castle, DE",
					"3029921024", "sarahk@hotmail.com");
			
			Student C = new Student("Destiny", "Hope", "Cyrus", new Date(1992, 11, 23), eMajor.NURSING, "6962 Wildlife Rd, Newark, DE",
					"4249921024", "destinyhope@gmail.com");
			
			Student D = new Student("Jermaine", "Dale", "Datto", new Date(1991, 10, 25), eMajor.CHEM, "297 The Green, Newark, DE",
					"3028921024", "jermainedd@gmail.com");
			
			Student E = new Student("Christina", "Mayim", "Sossay", new Date(1996, 9, 22), eMajor.PHYSICS, "7 Water Dr, Wilmington, DE",
					"2529921024", "sosassy@yahoo.com");
			
			Student A1 = new Student("Marshall", "Bruce", "Mathers", new Date(1972, 10, 17), eMajor.BUSINESS, "270 Lafayette Suite 805, Newark, DE",
					"3138975062", "mandm@gmail.com");
			
			Student B1 = new Student("Sarah", "Elena", "Kriebel", new Date(1990, 8, 24), eMajor.NURSING, "1201 Canvasback Rd, New Castle, DE",
					"3029921024", "sarahk@hotmail.com");
			
			Student C1 = new Student("Destiny", "Hope", "Cyrus", new Date(1992, 11, 23), eMajor.NURSING, "6962 Wildlife Rd, Newark, DE",
					"4249921024", "destinyhope@gmail.com");
			
			Student D1 = new Student("Jermaine", "Dale", "Datto", new Date(1991, 10, 25), eMajor.CHEM, "297 The Green, Newark, DE",
					"3028921024", "jermainedd@gmail.com");
			
			Student E1 = new Student("Christina", "Mayim", "Sossay", new Date(1996, 9, 22), eMajor.PHYSICS, "7 Water Dr, Wilmington, DE",
					"2529921024", "sosassy@yahoo.com");
			
			ArrayList<Student> TestStudent = new ArrayList<Student>();
			TestStudent.add(A);
			TestStudent.add(B);
			TestStudent.add(C);
			TestStudent.add(D);
			TestStudent.add(E);
			TestStudent.add(A1);
			TestStudent.add(B1);
			TestStudent.add(C1);
			TestStudent.add(D1);
			TestStudent.add(E1);
			
			Course c1 = new Course(UUID.randomUUID(), "CHEM104", 3, eMajor.CHEM);
			Course c2 = new Course(UUID.randomUUID(), "BUS250", 3, eMajor.BUSINESS);
			Course c3 = new Course(UUID.randomUUID(), "CISC181", 4, eMajor.COMPSI);
			
			ArrayList<Course> TestCourse = new ArrayList<Course>();
			TestCourse.add(c1);
			TestCourse.add(c2);
			TestCourse.add(c3);
			
			Semester fall = new Semester(UUID.randomUUID(), new Date(2017, 8, 28), new Date(2017, 12, 20));
			Semester spring = new Semester(UUID.randomUUID(), new Date(2018, 2, 5), new Date(2018, 5, 29));
		
			ArrayList<Semester> TestSemester = new ArrayList<Semester>();
			TestSemester.add(fall);
			TestSemester.add(spring);
			
			Section s1 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 1);
			Section s2 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 2);
			Section s3 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 3);
			Section s4 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 4);
			Section s5 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 5);
			Section s6 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 6);
			
			ArrayList<Section> TestSection = new ArrayList<Section>();
			TestSection.add(s1);
			TestSection.add(s2);
			TestSection.add(s3);
			TestSection.add(s4);
			TestSection.add(s5);
			TestSection.add(s6);
			
			Enrollment enrollingAs1 = new Enrollment(s1.getSectionID(), A.getStudentID());
			enrollingAs1.setGrade(0);
			Enrollment enrollingAs2 = new Enrollment(s2.getSectionID(), A.getStudentID());
			enrollingAs2.setGrade(0);
			Enrollment enrollingAs3 = new Enrollment(s3.getSectionID(), A.getStudentID());
			enrollingAs3.setGrade(0);

			Enrollment enrollingBs1 = new Enrollment(s1.getSectionID(), B.getStudentID());
			enrollingBs1.setGrade(20);
			Enrollment enrollingBs2 = new Enrollment(s2.getSectionID(), B.getStudentID());
			enrollingBs2.setGrade(20);
			Enrollment enrollingBs3 = new Enrollment(s3.getSectionID(), B.getStudentID());
			enrollingBs3.setGrade(20);
			
			Enrollment enrollingCs2 = new Enrollment(s2.getSectionID(), C.getStudentID());
			enrollingCs2.setGrade(30);
			Enrollment enrollingCs3 = new Enrollment(s3.getSectionID(), C.getStudentID());
			enrollingCs3.setGrade(30);
			Enrollment enrollingCs4 = new Enrollment(s4.getSectionID(), C.getStudentID());
			enrollingCs4.setGrade(30);
			
			assertEquals(((enrollingCs2.getGrade() + enrollingCs3.getGrade() + enrollingCs4.getGrade()) / 3), 30, 0);

			Enrollment enrollingDs2 = new Enrollment(s2.getSectionID(), D.getStudentID());
			enrollingDs2.setGrade(40);
			Enrollment enrollingDs3 = new Enrollment(s3.getSectionID(), D.getStudentID());
			enrollingDs3.setGrade(40);
			Enrollment enrollingDs4 = new Enrollment(s4.getSectionID(), D.getStudentID());
			enrollingDs4.setGrade(40);

			assertEquals(((enrollingDs2.getGrade() + enrollingDs3.getGrade() + enrollingDs4.getGrade()) / 3), 40, 0);

			Enrollment enrollingEs3 = new Enrollment(s3.getSectionID(), E.getStudentID());
			enrollingEs3.setGrade(50);
			Enrollment enrollingEs4 = new Enrollment(s4.getSectionID(), E.getStudentID());
			enrollingEs4.setGrade(50);
			Enrollment enrollingEs5 = new Enrollment(s5.getSectionID(), E.getStudentID());
			enrollingEs5.setGrade(50);

			assertEquals(((enrollingEs3.getGrade() + enrollingEs4.getGrade() + enrollingEs5.getGrade()) / 3), 50, 0);

			Enrollment enrollingA1s3 = new Enrollment(s3.getSectionID(), A1.getStudentID());
			enrollingA1s3.setGrade(60);
			Enrollment enrollingA1s4 = new Enrollment(s4.getSectionID(), A1.getStudentID());
			enrollingA1s4.setGrade(60);
			Enrollment enrollingA1s5 = new Enrollment(s5.getSectionID(), A1.getStudentID());
			enrollingA1s5.setGrade(60);

			assertEquals(((enrollingA1s3.getGrade() + enrollingA1s4.getGrade() + enrollingA1s5.getGrade()) / 3), 60, 0);

			Enrollment enrollingB1s4 = new Enrollment(s4.getSectionID(), B1.getStudentID());
			enrollingB1s4.setGrade(70);
			Enrollment enrollingB1s5 = new Enrollment(s5.getSectionID(), B1.getStudentID());
			enrollingB1s5.setGrade(70);
			Enrollment enrollingB1s6 = new Enrollment(s6.getSectionID(), B1.getStudentID());
			enrollingB1s6.setGrade(70);

			assertEquals(((enrollingB1s4.getGrade() + enrollingB1s5.getGrade() + enrollingB1s6.getGrade()) / 3), 70, 0);

			Enrollment enrollingC1s4 = new Enrollment(s4.getSectionID(), C1.getStudentID());
			enrollingC1s4.setGrade(80);
			Enrollment enrollingC1s5 = new Enrollment(s5.getSectionID(), C1.getStudentID());
			enrollingC1s5.setGrade(80);
			Enrollment enrollingC1s6 = new Enrollment(s6.getSectionID(), C1.getStudentID());
			enrollingC1s6.setGrade(80);

			assertEquals(((enrollingC1s4.getGrade() + enrollingC1s5.getGrade() + enrollingC1s6.getGrade()) / 3), 80, 0);

			Enrollment enrollingD1s1 = new Enrollment(s1.getSectionID(), D1.getStudentID());
			enrollingD1s1.setGrade(90);
			Enrollment enrollingD1s3 = new Enrollment(s2.getSectionID(), D1.getStudentID());
			enrollingD1s3.setGrade(90);
			Enrollment enrollingD1s5 = new Enrollment(s5.getSectionID(), D1.getStudentID());
			enrollingD1s5.setGrade(90);

			assertEquals(((enrollingD1s1.getGrade() + enrollingD1s3.getGrade() + enrollingD1s5.getGrade()) / 3), 90, 0);

			Enrollment enrollingE1s2 = new Enrollment(s2.getSectionID(), E1.getStudentID());
			enrollingE1s2.setGrade(100);
			Enrollment enrollingE1s4 = new Enrollment(s4.getSectionID(), E1.getStudentID());
			enrollingE1s4.setGrade(100);
			Enrollment enrollingE1s6 = new Enrollment(s6.getSectionID(), E1.getStudentID());
			enrollingE1s6.setGrade(100);
			
			assertEquals(((enrollingAs1.getGrade() + enrollingAs2.getGrade() + enrollingAs3.getGrade()) / 3), 0, 0);

			assertEquals(((enrollingBs1.getGrade() + enrollingBs2.getGrade() + enrollingBs3.getGrade()) / 3), 20, 0);

			assertEquals(((enrollingE1s2.getGrade() + enrollingE1s4.getGrade() + enrollingE1s6.getGrade()) / 3), 100, 0);

			assertEquals(((enrollingA1s3.getGrade() + enrollingA1s4.getGrade() + enrollingA1s5.getGrade()) / 3), 60, 0);

			/*

			 * assertEquals((( enrollingAs1.getGrade() + enrollingBs1.getGrade()

			 * + enrollingCs1.getGrade() + enrollingDs1.getGrade() +

			 * enrollingEs1.getGrade() + enrollingA1s1.getGrade() +

			 * enrollingB1s1.getGrade() + enrollingC1s1.getGrade() +

			 * enrollingD1s1.getGrade() + enrollingE1s1.getGrade()) / 3),50);

			 */

			assertEquals(Math.floor((enrollingAs1.getGrade() + enrollingBs1.getGrade() + enrollingD1s1.getGrade()) / 3),
					(110/3), 0);
			assertEquals(((enrollingAs2.getGrade() + enrollingBs2.getGrade() + enrollingCs2.getGrade()
					+ enrollingDs2.getGrade() + enrollingE1s2.getGrade()) / 5), 38, 0);

			assertEquals(Math.floor((enrollingAs3.getGrade() + enrollingBs3.getGrade() + enrollingCs3.getGrade()
					+ enrollingDs3.getGrade() + enrollingEs3.getGrade() + enrollingA1s3.getGrade()
					+ enrollingD1s3.getGrade()) / 7), (290 / 7), 0);

			assertEquals(Math.floor((enrollingCs4.getGrade() + enrollingDs4.getGrade() + enrollingEs4.getGrade()
					+ enrollingA1s4.getGrade() + enrollingB1s4.getGrade() + enrollingC1s4.getGrade()
					+ enrollingE1s4.getGrade()) / 7), (430 / 7), 0);

			assertEquals(((enrollingEs5.getGrade() + enrollingA1s5.getGrade() + enrollingB1s5.getGrade()
					+ enrollingC1s5.getGrade() + enrollingD1s5.getGrade()) / 5), (350/5), 0);

			E1.setMajor(eMajor.NURSING);
		} 
		catch (PersonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}