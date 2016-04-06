
public class Car {
	
	private float prize = 0;
	private String nameTag = "";
	private String dateAddCar = "";
	private int yearCar = 0;
	private float kmCar = 0;
	public Car(float prize, String nameTag, String dateAddCar, int yearCar, float kmCar) {
		super();
		this.prize = prize;
		this.nameTag = nameTag;
		this.dateAddCar = dateAddCar;
		this.yearCar = yearCar;
		this.kmCar = kmCar;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	public String getNameTag() {
		return nameTag;
	}
	public void setNameTag(String nameTag) {
		this.nameTag = nameTag;
	}
	public String getDateAddCar() {
		return dateAddCar;
	}
	public void setDateAddCar(String dateAddCar) {
		this.dateAddCar = dateAddCar;
	}
	public int getYearCar() {
		return yearCar;
	}
	public void setYearCar(int yearCar) {
		this.yearCar = yearCar;
	}
	public float getKmCar() {
		return kmCar;
	}
	public void setKmCar(float kmCar) {
		this.kmCar = kmCar;
	}

}
