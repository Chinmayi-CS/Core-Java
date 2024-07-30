class SIMPW_Runner
{
	public static void main(String args[])
	{
		System.out.println("Start main in SIMPW_Runner");
		Spatula spatula = new Spatula();
		spatula.material = "silicone";
		spatula.price = 50;
		spatula.type = "Silicone";
		spatula.colour = "red";
		System.out.println("Material is : "+spatula.material);
		System.out.println("Price is : "+spatula.price);
		System.out.println("Type is : "+spatula.type);
		System.out.println("Colour is : "+spatula.colour);
		
		Spatula spatula1 = new Spatula();
		System.out.println("Material of spatula1 is : "+spatula1.material);
		System.out.println("Price of spatula1 is : "+spatula1.price);
		System.out.println("Type of spatula1 is : "+spatula1.type);
		System.out.println("Colour of spatula1 is : "+spatula1.colour);

		IronBox ironBox = new IronBox();
		ironBox.brand = "philips";
		ironBox.colour = "blue";
		ironBox.type = "normal";
		ironBox.price = 1599;
		System.out.println("Brand is : "+ironBox.brand);
		System.out.println("Colour is : "+ironBox.colour);
		System.out.println("Type is : "+ironBox.type);
		System.out.println("Price is : "+ironBox.price);
		
		IronBox ironBox1 = new IronBox();
		System.out.println("Brand is : "+ironBox1.brand);
		System.out.println("Colour is : "+ironBox1.colour);
		System.out.println("Type is : "+ironBox1.type);
		System.out.println("Price is : "+ironBox1.price);
		
		Mirror mirror = new Mirror();
		mirror.type = "double sided";
		mirror.colour = "white";
		mirror.shape = "Square";
		mirror.price = 1000;
		System.out.println("Type is : "+mirror.type);
		System.out.println("Colour is : "+mirror.colour);
		System.out.println("Type is : "+mirror.shape);
		System.out.println("Price is : "+mirror.price);
		
		Mirror mirror1 = new Mirror();
		System.out.println("Type is : "+mirror1.type);
		System.out.println("Colour is : "+mirror1.colour);
		System.out.println("Type is : "+mirror1.shape);
		System.out.println("Price is : "+mirror1.price);
		
		Pillow pillow = new Pillow();
		pillow.colour = "Beige";
		pillow.brand = "Peps_mattress";
		pillow.price = 500;
		pillow.size = "Small";
		System.out.println("Colour is : "+pillow.colour);
		System.out.println("Brand is : "+pillow.brand);
		System.out.println("Price is : "+pillow.price);
		System.out.println("Size is : "+pillow.size);
		
		Pillow pillow1 = new Pillow();
		System.out.println("Colour is : "+pillow1.colour);
		System.out.println("Brand is : "+pillow1.brand);
		System.out.println("Price is : "+pillow1.price);
		System.out.println("Size is : "+pillow1.size);
		
		Wallet wallet = new Wallet();
		wallet.quantity = 2;
		wallet.colour = "black";
		wallet.price =1000 ;
		wallet.material = "cloth";
		wallet.quality = "bad";
		System.out.println("Colour is : "+wallet.quantity);
		System.out.println("Brand is : "+wallet.colour);
		System.out.println("Price is : "+wallet.price);
		System.out.println("Price is : "+wallet.material);
		System.out.println("Size is : "+wallet.quality);
		
		Wallet wallet1 = new Wallet();
		System.out.println("Colour is : "+wallet1.quantity);
		System.out.println("Brand is : "+wallet1.colour);
		System.out.println("Price is : "+wallet1.price);
		System.out.println("Price is : "+wallet1.material);
		System.out.println("Size is : "+wallet1.quality);
		
		System.out.println("End main in SIMPW_Runner");
		
	}
	




}