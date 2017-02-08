
public class StudentAdvanceTicket extends AdvanceTicket{
	private int number;
	private int price;
	public StudentAdvanceTicket(int number){
		super(number);
	}
	public int getPrice(){
		return super.getPrice()/2;
	}
}
