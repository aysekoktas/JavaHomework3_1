
public class Customer {
	public Customer()
    {
        System.out.println("Müşteri nesnesi başlatıldı.");
    }
    public int Id;
    public String City; //Sonradan eklenen
    
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
}
