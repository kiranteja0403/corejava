package prgm1;

public class car {
	public String name;
	public int length;
	public byte no_of_wheels;
	public byte no_of_gears;

	public static void main(String[] args) {
		car maruti = new car();
		// TODO Auto-generated method stub
		maruti.name = "Bmw";
		maruti.no_of_gears = 6;
		maruti.no_of_wheels = 4;
		maruti.length = 790;
		System.out.println(maruti.toString());
		System.out.println(Student.flag);
	}

//	@Override
//	public String toString() {
//		return "car [name=" + name + ", length=" + length + ", no_of_wheels=" + no_of_wheels + ", no_of_gears="
//				+ no_of_gears + "]";
//	}
}