
public class Chapter {

	private String chapName;
	private byte chapNum;
	private String summary;

	public Chapter(String n, String s) {
		setName(n);
		setSummary(s);
	}

	public String getName() {
		return chapName;
	}

	public String getNumber() {
		String num = Byte.toString(chapNum);
		return num;
	}

	public String getSummary() {
		return summary;
	}

	public void setName(String n) {
		chapName = n;
	}

	public void setNumber(String n) {
		chapNum = Byte.parseByte(n);
	}

	public void setSummary(String n) {
		summary = n;
	}
}