package mod08.ex02.to;

public class AbroadTrip extends Trip {
	private int insurance;

	public AbroadTrip(Date start, Date end, String destination) {
		super(start, end, destination);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
}
