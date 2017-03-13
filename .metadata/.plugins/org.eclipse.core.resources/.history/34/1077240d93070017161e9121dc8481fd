package textExcel;


public class Spreadsheet implements Grid
{
	public Spreadsheet(){
		 for(int i = 0; i < rows; i++){
			 for(int j = 0; j < cols; j++){
				 arrayOfStuff[i][j] = new EmptyCell();
			 }
		 }
	}
	private int rows = 20;
	private int cols = 12;
	private Cell [][] arrayOfStuff = new Cell[rows][cols];
	private String wholeSpreadsheet = "";
	//2d array for rows and columns
	public String processCommand(String command)
	{
		System.out.println(command);
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 12; j++){
				if(!command.equals("")){
					arrayOfStuff[i][j] = new TextCell(command);
				}
			}
		}
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
		System.out.print("   |");
		for(char a = 'A'; a < 'M'; a++){
			System.out.print(a + "         |");
		}
		System.out.println("");
		for(int i = 1; i < 21; i++){
			if(i < 10){
				System.out.print(i + "  ");
				for(int j = 0; j < 13; j++){
					System.out.print("|          ");
				}
				System.out.println("");
			}if(i >= 10){
				System.out.print(i + " ");
				for(int j = 0; j < 13; j++){
					System.out.print("|          "); 
				}
				System.out.println("");
			}
		}
		return "";

		
	}
	public String cellInspection(String cell){
		SpreadsheetLocation a = new SpreadsheetLocation(cell);
		String result = arrayOfStuff[a.getRow()][a.getCol()].fullCellText();
		return result;
	}
	public String cellAssignment(String str, Cell cell){
		SpreadsheetLocation b = new SpreadsheetLocation(cell);
		arrayOfStuff[b.getRow()][b.getCol()] = str;
	}

}
