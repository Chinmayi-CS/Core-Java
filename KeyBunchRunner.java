class KeyBunchRunner
{
	public static void main(String[] args)
	{
		Key_ key_ = new Key_(20.5,"Lock Repair");
		
		
		KeyBunch keyBunch = new KeyBunch("plastic",key_);
		keyBunch.details();
		
		System.out.println("==============================");
		
		Key_ key_1 = new Key_(10,"Key Maker");
		
		
		KeyBunch keyBunch1 = new KeyBunch("plastic",key_1);
		keyBunch1.details();	
		
	}
}