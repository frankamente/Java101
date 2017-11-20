package com.svqjug.java101.chapter8.exercise1.consultant;

import org.junit.Test;

public class ConsultantTests {

	@Test
	public void testRoles() {
		final Employee employee1 = new Manager(1, "Pointy-haired", "Boss");
		final Employee employee2 = new ProjectLead(2, "Wally", "");
		final Employee employee3 = new Developer(3, "Dilber", "");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		final Manager manager = (Manager) employee1;
		final ProjectLead projectLead = (ProjectLead) employee2;
		final Developer developer = (Developer) employee3;
		manager.accountHours();
		projectLead.design();
		developer.develop();
	}
}
