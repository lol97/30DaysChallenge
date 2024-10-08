package com.sufyan97.learn_unit_test.junitdemo;

import java.util.List;

public class DemoUtils {
	private String academy = "Nebulae Academy";
	private String academyDuplicate = academy;
	
	private String[] firstThreeLetterAlphabet = {"A", "B", "C"};
	private List<String> listNamaJalan = List.of("WAHIDIN", "WAHID", "JAKARTA");
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public Object checkNull(Object obj) {
		if (obj != null) {
			return obj;
		}
		return null;
	}
	
	public Boolean isGreater(int n1, int n2) {
		return n1 > n2;
	}
	
	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public String getAcademyDuplicate() {
		return academyDuplicate;
	}

	public void setAcademyDuplicate(String academyDuplicate) {
		this.academyDuplicate = academyDuplicate;
	}

	public String[] getFirstThreeLetterAlphabet() {
		return firstThreeLetterAlphabet;
	}

	public void setFirstThreeLetterAlphabet(String[] firstThreeLetterAlphabet) {
		this.firstThreeLetterAlphabet = firstThreeLetterAlphabet;
	}

	public List<String> getListNamaJalan() {
		return listNamaJalan;
	}

	public void setListNamaJalan(List<String> listNamaJalan) {
		this.listNamaJalan = listNamaJalan;
	}
	
	public String throwEx(int a) throws Exception {
		if (a < 0) {
			throw new Exception("value should be greater than or equal to 0");
		}
		return "value is greater than or equal to 0";
	}
	
	public void checkTimeout() throws InterruptedException {
		System.out.println("I am going to sleep");
		Thread.sleep(2000);
		System.out.println("Sleeping over");
	}
	
	public Integer multiply(int a, int b) {
		return a*b;
	}
}
