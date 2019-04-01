/**
	Saket Bakshi. 3/28/19. Period 6. This is used for problem 3 of Chapter 12.
	Describes a mailing address.
*/
public class Address
{
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;

	/**
		Constructs a mailing address
		@param aName the recipient name
		@param aStreet the street
		@param aCity the city
		@param aState the two-letter state code
		@param aZip the ZIP postal code
	*/
	public Address(String aName, String aStreet, String aCity, String aState, String aZip)
	{
		name = aName;
		street = aStreet;
		city = aCity;
		state = aState;
		zip = aZip;
	}

	/**
		Returns the name.
		@return the name
	*/
	public String getName()
	{
		return name;
	}

	/**
		Returns the street.
		@return the street
	*/
	public String getStreet()
	{
		return street;
	}

	/**
		Returns the city.
		@return the city
	*/
	public String getCity()
	{
		return city;
	}

	/**
		Returns the state.
		@return the state
	*/
	public String getState()
	{
		return state;
	}

	/**
		Returns the zip.
		@return the zip
	*/
	public String getZip()
	{
		return zip;
	}
}