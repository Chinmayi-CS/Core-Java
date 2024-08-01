class WCRTHPSSMMA_Runner
{
	public static void main(String args[])
	{
	Watch watch = new Watch(1000,1);
	watch.brand = "Titan";
	System.out.println("Colour is : "+watch.colour);
	System.out.println("Brand is : "+watch.brand);
	System.out.println("Prize is : "+watch.price);
	System.out.println("Quantity is : "+watch.quantity);
	
	Watch watch1 = new Watch(2000,2);
	watch.brand = "Fastrack";
	System.out.println("Colour is : "+watch.colour);
	System.out.println("Brand is : "+watch.brand);
	System.out.println("Prize is : "+watch.price);
	System.out.println("Quantity is : "+watch.quantity);
	
	Cable cable = new Cable("Sheilded cable",100);
	cable.brand = "Pathway";
	System.out.println("colour is : "+cable.colour);
	System.out.println("Brand is : "+cable.brand);
	System.out.println("Type is : "+cable.type);
	System.out.println("Price is : "+cable.price);
	
	Cable cable1 = new Cable("copper cable",10);
	cable1.brand = "Hathway";
	System.out.println("colour is : "+cable1.colour);
	System.out.println("Brand is : "+cable1.brand);
	System.out.println("Type is : "+cable1.type);
	System.out.println("Price is : "+cable1.price);
	
	Radio radio = new Radio(500, 1);
	radio.brand = "philips";
	System.out.println("Colour is : "+radio.colour);
	System.out.println("Brand is : "+radio.brand);
	System.out.println("Price is : "+radio.price);
	System.out.println("Quantity is : "+radio.quantity);
	
	Radio radio1 = new Radio(5000, 6);
	radio1.brand = "philips";
	System.out.println("Colour is : "+radio1.colour);
	System.out.println("Brand is : "+radio1.brand);
	System.out.println("Price is : "+radio1.price);
	System.out.println("Quantity is : "+radio1.quantity);
	
	Trumpet trumpet = new Trumpet(300,1);
	trumpet.brand = "Musicalband";
	System.out.println("Colour is : "+trumpet.colour);
	System.out.println("Brand is : "+trumpet.brand);
	System.out.println("Price is : "+trumpet.price);
	System.out.println("Quantity is : "+trumpet.quantity);
	
	Trumpet trumpet1 = new Trumpet(500,1);
	trumpet1.brand = "Musicalband";
	System.out.println("Colour is : "+trumpet1.colour);
	System.out.println("Brand is : "+trumpet1.brand);
	System.out.println("Price is : "+trumpet1.price);
	System.out.println("Quantity is : "+trumpet1.quantity);
	
	Harmonica harmonica = new Harmonica(1000,1);
	harmonica.colour = "Brown";
	System.out.println("Name is : "+harmonica.name);
	System.out.println("Colour is : "+harmonica.colour);
	System.out.println("price is : "+harmonica.price);
	System.out.println("Quantity is : "+harmonica.quantity);
	
	Harmonica harmonica1 = new Harmonica(2000,2);
	harmonica1.colour = "Black";
	System.out.println("Name is : "+harmonica1.name);
	System.out.println("Colour is : "+harmonica1.colour);
	System.out.println("price is : "+harmonica1.price);
	System.out.println("Quantity is : "+harmonica1.quantity);
	
	Pendulum pendulum = new Pendulum(4000,1);
	pendulum.colour = "Black";
	System.out.println("type is : "+pendulum.type);
	System.out.println("colour is : "+pendulum.colour);
	System.out.println("Price is : "+pendulum.price);
	System.out.println("quantity is : "+pendulum.quantity);
	
	Pendulum pendulum1 = new Pendulum(2000,1);
	pendulum1.colour = "Brown";
	System.out.println("type is : "+pendulum1.type);
	System.out.println("colour is : "+pendulum1.colour);
	System.out.println("Price is : "+pendulum1.price);
	System.out.println("quantity is : "+pendulum1.quantity);
	
	Syringe syringe = new Syringe(50,2);
	syringe.brand = "Pharmacy";
	System.out.println("colour : "+syringe.colour);
	System.out.println("price : "+syringe.price);
	System.out.println("quantity : "+syringe.quantity);
	System.out.println("brand :  "+syringe.brand);
	
	Syringe syringe1 = new Syringe(20,1);
	syringe1.brand = "DM pharma";
	System.out.println("colour : "+syringe1.colour);
	System.out.println("price : "+syringe1.price);
	System.out.println("quantity : "+syringe1.quantity);
	System.out.println("brand :  "+syringe1.brand);
	
	Straightner straightner = new Straightner(5000,1);
	straightner.brand = "Livon";
	System.out.println("name : "+straightner.name);
	System.out.println("brand : "+straightner.brand);
	System.out.println("price : "+straightner.price);
	System.out.println("quantity : "+straightner.quantity);
	
	Straightner straightner1 = new Straightner(2000,1);
	straightner1.brand = "Tresemme";
	System.out.println("name : "+straightner1.name);
	System.out.println("brand : "+straightner1.brand);
	System.out.println("price : "+straightner1.price);
	System.out.println("quantity : "+straightner1.quantity);
	
	Mask mask = new Mask("surgical",50);
	mask.brand = "Puma";
	System.out.println("Colour : "+mask.colour);
	System.out.println("Brand : "+mask.brand);
	System.out.println("Type : "+mask.type);
	System.out.println("price : "+mask.price);
	
	Mask mask1 = new Mask("daily wear",10);
	mask1.brand = "Levis";
	System.out.println("Colour : "+mask1.colour);
	System.out.println("Brand : "+mask1.brand);
	System.out.println("Type : "+mask1.type);
	System.out.println("price : "+mask1.price);
	
	Anklets anklets = new Anklets(2000,2);
	anklets.material = "silver";
	System.out.println("Name : "+anklets.name);
	System.out.println("Material : "+anklets.material);
	System.out.println("price : "+anklets.price);
	System.out.println("quantity : "+anklets.quantity);
	
	Anklets anklets1 = new Anklets(50000,2);
	anklets1.material = "gold";
	System.out.println("Name : "+anklets1.name);
	System.out.println("Material : "+anklets1.material);
	System.out.println("price : "+anklets1.price);
	System.out.println("quantity : "+anklets1.quantity);
	
	Mug mug = new Mug(50,1);
	mug.name = "coffee mug";
	System.out.println("type : "+mug.type);
	System.out.println("name : "+mug.name);
	System.out.println("price : "+mug.price);
	System.out.println("quantity : "+mug.quantity);
	
	Mug mug1 = new Mug(30,1);
	mug1.name = "Water mug";
	System.out.println("type : "+mug1.type);
	System.out.println("name : "+mug1.name);
	System.out.println("price : "+mug1.price);
	System.out.println("quantity : "+mug1.quantity);
	}

}