class KeyBunch
{
	String material;
	Key_ key_;
	
	KeyBunch(String material,Key_ key_)
	{
		System.out.println("Created KeyBunch using String and Key_ constructor");
		this.material = material;
		this.key_ = key_;
		
	}
	
	public void details()
	{
		System.out.println("KeyBunch material is : "+this.material);
		
		key_.details();
		
	}

}