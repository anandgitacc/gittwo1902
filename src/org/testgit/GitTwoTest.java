package org.testgit;

public class GitTwoTest {
	
	private void one() {
		System.out.println("git test 1");
	}
	
	private void two() {
		System.out.println("git test 2");
	}
	
	private void three() {
		System.out.println("git test 3");
	}
	
	public static void main(String[] args) {
		
		GitTwoTest g = new GitTwoTest();
		g.one();
		g.two();
		g.three();
		
	}

}
