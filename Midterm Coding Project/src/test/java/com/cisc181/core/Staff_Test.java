package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testAverageStaffSalary() throws PersonException {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		Staff A = new Staff("Marshall", "Bruce", "Mathers", new Date(1972, 10, 17), "270 Lafayette Suite 805, Newark, DE",
				"3138975062", "mandm@gmail.com", "None", 1, 50000.00, new Date(2011, 4, 26), eTitle.MR);
		TestStaff.add(A);
		
		Staff B = new Staff("Sarah", "Elena", "Kriebel", new Date(1990, 8, 24), "1201 Canvasback Rd, New Castle, DE",
				"3029921024", "sarahk@hotmail.com", "None", 3, 30000.00, new Date(2013, 4, 26), eTitle.MS);
		TestStaff.add(B);
		
		Staff C = new Staff("Destiny", "Hope", "Cyrus", new Date(1992, 11, 23), "6962 Wildlife Rd, Newark, DE",
				"4249921024", "destinyhope@gmail.com", "Mondays & Tuedays: 4-5PM", 2, 40000.00, new Date(2011, 04, 26), eTitle.MS);
		TestStaff.add(C);
		
		Staff D = new Staff("Jermaine", "Dale", "Datto", new Date(1991, 10, 25), "297 The Green, Newark, DE",
				"3028921024", "jermainedd@gmail.com", "None", 4, 20000.00, new Date(2014, 4, 26), eTitle.MR);
		TestStaff.add(D);
		
		Staff E = new Staff("Christina", "Mayim", "Sossay", new Date(1996, 9, 22), "7 Water Dr, Wilmington, DE",
				"2529921024", "sosassy@yahoo.com", "None", 5, 10000.00, new Date(2012, 4, 26), eTitle.MRS);
		TestStaff.add(E);
		
		double totalStaffSalary = 0;
		for (Staff s : TestStaff) {
			totalStaffSalary += s.getSalary();
		}
		totalStaffSalary /= 5;
		
		int averageStaffSalary = (int) totalStaffSalary;
		
		assertEquals(averageStaffSalary, 30000);
	}	
	
	@Test(expected = PersonException.class)
	public void testAgeException() throws PersonException {

		Staff E = new Staff("Mayim", "Christina", "Bailik", new Date(700, 9, 22), "7 Water Rd, Wilmington, DE",
				"2529821024", "bailik@yahoo.com", "None", 5, 10000.00, new Date(2012, 4, 26), eTitle.MRS);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {

		Staff E = new Staff("Mayim", "Christina", "Bailik", new Date(1996, 9, 22), "7 Water Rd, Wilmington, DE",
				"252992102", "bailik@yahoo.com", "None", 5, 10000.00, new Date(2012, 4, 26), eTitle.MRS);
	}

}
