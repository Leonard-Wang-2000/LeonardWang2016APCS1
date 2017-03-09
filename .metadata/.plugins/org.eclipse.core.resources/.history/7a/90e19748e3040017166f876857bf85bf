package textExcel;

public class TextCell implements Cell {

	private String strcontents = "";
	private String abbreviatedText;
	private char[] charArray = strcontents.toCharArray();
	public String abbreviatedCellText() {
		for(int i = 0; i < 10; i++){
			abbreviatedText += charArray[i];
		}
		return abbreviatedText;
	}

	@Override
	public String fullCellText() {
		return null;
	}
	public void setText(String strcontents){
		this.strcontents = strcontents;
	}

}
