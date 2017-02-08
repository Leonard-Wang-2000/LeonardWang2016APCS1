
public class AdvanceTicket extends Tickets{
	private int number;
	public AdvanceTicket(int number){
		super(number);
	}
	private int price;
	public int getPrice(){
		if(number < 10){
			price = 40;
		}else{
			price = 30;
		}
		return price;
	}
	
}
