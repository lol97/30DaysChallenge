package com.sufyan97.learn_unit_test;

import java.util.List;

public class DemoUtils {
	private String academy = "Nebulae Academy";
	private String academyDuplicate = academy;
	
	private String[] firstThreeLetterAlphabet = {"A", "B", "C"};
	private List<String> listNamaJalan = List.of("WAHIDIN", "WAHID", "JAKARTA");
	
	public int add(int a, int b) {
		return a + b; //break on purpose
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
}
