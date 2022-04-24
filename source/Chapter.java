
public class Chapter {

	private String name;
	private byte number;
	private String summary;

	public Chapter(String n, String s) {
		setName(n);
		setSummary(s);
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		String num = Byte.toString(number);
		return num;
	}

	public String getSummary() {
		return summary;
	}

	public void setName(String n) {
		name = n;
	}

	public void setNumber(String n) {
		number = Byte.parseByte(n);
	}

	public void setSummary(String n) {
		summary = n;
	}
}