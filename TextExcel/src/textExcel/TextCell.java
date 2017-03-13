package textExcel;

import java.util.Arrays;

public class TextCell implements Cell  {

	private String strcontents = "";
	private String abbreviatedText = "";
	private char[] charArray = new char[strcontents.length()];
	
	public TextCell(String strcontents){
		this.strcontents = strcontents;
	}
	public String abbreviatedCellText() {
		//creates a new value so the original is not modified
				String returnVal = "";
				
				//gets rid of quotation marks
				if(strcontents.contains("\"") == true){
					returnVal = strcontents.substring(1, strcontents.length() - 1);
				}
				//only takes first 10 characters if string is longer than 10
				if(returnVal.length() > 10){
					returnVal = returnVal.substring(0, 10);
					return returnVal;
				}else{
					
					//fills in the spaces to make the value left alligned
					while(returnVal.length() != 10){
						returnVal += " ";

					}
					return returnVal;
				}
	}

	public String fullCellText() {
		return strcontents;
	}
	public void setText(String strcontents){
		this.strcontents = strcontents;
	}

}
