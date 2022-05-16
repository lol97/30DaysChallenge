package TrainStream;

public class Person {
	private String name;
	private Long wage;
	private Integer age;
	private Sex sex;
	private String city;
	
	public Person(String name, Long wage, Integer age, Sex sex, String city) {
		super();
		this.name = name;
		this.wage = wage;
		this.age = age;
		this.sex = sex;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getWage() {
		return wage;
	}
	public void setWage(Long wage) {
		this.wage = wage;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", wage=" + wage + ", age=" + age + ", sex=" + sex + ", city=" + city + "]";
	}
	
	
}
