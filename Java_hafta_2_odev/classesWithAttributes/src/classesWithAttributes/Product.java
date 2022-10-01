package classesWithAttributes;

public class Product {
	public Product() //constructor method class ismi ile aynı olmalıdır
	{
		System.out.println("yapıcı calisdi.");
	}
	
    private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String kod;
	
	
	
	
	public int getId()
	{
		return _id;// id okunur
	}
	public void setId(int id)
	{
		//this.id=id;
		_id=id;
	}
	/**
	 * @return the _name
	 */
	public String getName() {
		return _name;
	}
	/**
	 * @param _name the _name to set
	 */
	public void setName(String name) {
		_name = name;
	}
	/**
	 * @return the _description
	 */
	public String getDescription() {
		return _description;
	}
	/**
	 * @param _description the _description to set
	 */
	public void setDescription(String description) {
		_description = description;
	}
	/**
	 * @return the _price
	 */
	public double getPrice() {
		return _price;
	}
	/**
	 * @param _price the _price to set
	 */
	public void setPrice(double price) {
		_price = price;
	}
	/**
	 * @return the _stockAmount
	 */
	public int getStockAmount() {
		return _stockAmount;
	}
	/**
	 * @param _stockAmount the _stockAmount to set
	 */
	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}
	/**
	 * @return the kod
	 */
	public String getKod() {
		return this._name.substring(0,1)+_id;
	}
	
}
