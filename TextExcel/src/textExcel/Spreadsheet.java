package textExcel;


public class Spreadsheet implements Grid
{
	private int rows = 20;
	private int cols = 12;
	private String wholeSpreadsheet = "";
	//2d array for rows and columns
	private int [][] arrayOfStuff = new int[rows][cols];
	public String processCommand(String command)
	{
		System.out.println(command);
		return command;
	}


	public int getRows()
	{
		return this.rows;
	}


	public int getCols()
	{
		return this.cols;
	}

	public Cell getCell(Location loc)
	{
		return null;
	}

	public String getGridText()
	{
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				wholeSpreadsheet += arrayOfStuff[i][j];
			}
		}
		return wholeSpreadsheet;
	}

}
