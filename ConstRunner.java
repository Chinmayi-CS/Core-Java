class ConstRunner
{
	public static void main(String[] values)
	{
		System.out.println("Start main in ConstRunner");
		Wardrobe wardrobe = new Wardrobe();
		double wardrobe1 = wardrobe.cost;
		double wardrobe2 = wardrobe.size;
		System.out.println("Cost of wardrobe is : "+wardrobe1);
		System.out.println("Size of wardrobe in cm is : "+wardrobe2);
		wardrobe.cost = 5000 ;
		wardrobe.size = 220;
		System.out.println("Updated Cost of wardrobe is : "+wardrobe.cost);
		System.out.println("Updated Size of wardrobe in cm is : "+wardrobe.size);
		
		System.out.println("End Wardrobe");
		
		Nireeksha nireeksha = new Nireeksha();
		double nireeksha1 = nireeksha.weight;
		double nireeksha2 = nireeksha.height;
		System.out.println("Weight of Nireeksha in kg : "+nireeksha1);
		System.out.println("Height of Nireeksha in feet  : "+nireeksha2);
		nireeksha.weight = 60;
		nireeksha.height = 5.2;
		System.out.println("Updated Weight of Nireeksha in kg : "+nireeksha.weight);
		System.out.println("Updated Height of Nireeksha in feet  : "+nireeksha.height);
		
		System.out.println("End Nireeksha");
		
		ATM atm = new ATM();
		double atm1 = atm.money;
		String atm2 = atm.timings;
		System.out.println("Money in ATM is : "+atm1);
		System.out.println("Timings is  : "+atm2);
		atm.money = 500000;
		atm.timings = "24*7";
		System.out.println("Updated money in ATM is : "+atm.money);
		System.out.println("Updated timings of ATM is : "+atm.timings);
		
		System.out.println("End ATM");
		
		Coin coin = new Coin();
		boolean coin1 = coin.head;
		boolean coin2 = coin.tail;
		System.out.println("Head : "+coin1);
		System.out.println("Tail : "+coin2);
		coin.head = true;
		coin.tail = false;
		System.out.println("Updated Head : "+coin.head);
		System.out.println("Updated Tail : "+coin.tail);

		System.out.println("End Coin");
		
		Furniture furniture = new Furniture();
		String furniture1 = furniture.name;
		double furniture2 = furniture.price;
		System.out.println("Name of furniture : "+furniture1);
		System.out.println("Price of furniture : "+furniture2);
		furniture.name = "Sofa";
		furniture.price = 50000; 
		System.out.println("Updated Name of furniture : "+furniture1);
		System.out.println("Updated Price of furniture : "+furniture2);
		
		System.out.println("End Furniture");
		
		Aeroplane aeroplane = new Aeroplane();
		String aeroplane1 = aeroplane.name;
		String  aeroplane2 = aeroplane.takeOffTime;
		System.out.println("Name of Aeroplane : "+aeroplane1);
		System.out.println("Take Off Time : "+aeroplane2);
		aeroplane.name = "Emirates";
		aeroplane.takeOffTime = "9:00am";
		System.out.println("Updated name of Aeroplane : "+aeroplane.name);
		System.out.println("Updated Take Off Time : "+aeroplane.takeOffTime);
		
		System.out.println("End Aeroplane");
		
		CCTV cctv = new CCTV();
		double cctv1 = cctv.price;
		boolean cctv2 = cctv.isItMegapixel;
		System.out.println("Price of CCTV : "+cctv1);
		System.out.println("Is it MEGAPIXEL : "+cctv2);
		cctv.price = 20000;
		cctv.isItMegapixel = true;
		System.out.println("Updated Price of CCTV : "+cctv.price);
		System.out.println("Updated : Is it MEGAPIXEL : "+cctv.isItMegapixel);
		
		System.out.println("End CCTV");
		
		Tripod tripod = new Tripod();
		double tripod1 = tripod.price;
		double tripod2 = tripod.heightInMeters;
		System.out.println("Price of tripod : "+tripod1);
		System.out.println("Height of tripod in cm : "+tripod2);
		tripod.price = 2000;
		tripod.heightInMeters = 100;
		System.out.println("Updated price of Tripod : "+tripod.price);
		System.out.println("Updated Height of Tripod : "+tripod.heightInMeters);
		
		System.out.println("End Tripod");
		
		Zip zip = new Zip();
		double zip1 = zip.price;
		double zip2 = zip.length;
		System.out.println("Price of zip : "+zip1);
		System.out.println("Length of zip :"+zip2);
		zip.price = 20;
		zip.length = 10;
		System.out.println("Updated Price of zip : "+zip.price);
		System.out.println("Updated Length of zip in cm : "+zip.length);
		
		System.out.println("End Zip");
		
		Helmet helmet= new Helmet();
		double helmet1 = helmet.cost;
		String helmet2 = helmet.type;
		System.out.println("Cost of helmet is "+helmet1);
		System.out.println("Type of helmet is "+helmet2);
		helmet.cost = 250;
		helmet.type = "Half Helmet";
		System.out.println("Updated cost of helmet is : "+helmet.cost);
		System.out.println("Updated type of helmet is : "+helmet.type);
		
		System.out.println("End Helmet");
		
		HillStation hillstation= new HillStation();
		String hillstation1 = hillstation.name;
		String hillstation2 = hillstation.openingAndClosingTime;
		System.out.println("Name of hillstation is : "+hillstation1);
		System.out.println("opening And Closing Time of hillstation is : "+hillstation2);
		hillstation.name = "Kemmangundi";
		hillstation.openingAndClosingTime = "6am to 6pm";
		System.out.println("Updated Name of hillstation is : "+hillstation.name);
		System.out.println("Updated opening And Closing Time of hillstation is : "+hillstation.openingAndClosingTime);
		
		System.out.println("End HillStation");

		Camera camera = new Camera();
		double camera1=camera.cost;
		String camera2=camera.brand;
		System.out.println("Cost of camera is : "+camera1);
		System.out.println("Brand of camera is : "+camera2);
		camera.cost=50000;
		camera.brand="Canon";
		System.out.println("Updated Cost of camera is : "+camera.cost);
		System.out.println("Updated Brand of camera is : "+camera.brand);
		
		System.out.println("End Camera");
		
		Hat hat = new Hat();
		double hat1=hat.price;
		String hat2=hat.brand;
		System.out.println("price of hat is : "+hat1);
		System.out.println("Brand of hat is : "+hat2);
		hat.price=500;
		hat.brand="Puma";
		System.out.println("Updated Price of hat is : "+hat.price);
		System.out.println("Updated Brand of hat is : "+hat.brand);
		
		System.out.println("End Hat");
		
		SelfieStick selfiestick = new SelfieStick();
		String selfiestick1=selfiestick.brand;
		double selfiestick2=selfiestick.length;
		System.out.println("Brand of selfiestick is : "+selfiestick1);
		System.out.println("Length of camera in cm is : "+selfiestick2);
		selfiestick.brand="Oppo";
		selfiestick.length=100;
		System.out.println("Updated brand of selfiestick is : "+selfiestick.brand);
		System.out.println("Updated length of selfiestick in cm is : "+selfiestick.length);
		
		System.out.println("End SelfieStick");
		
		Cloth cloth = new Cloth();
		String cloth1=cloth.material;
		double cloth2=cloth.price;
		System.out.println("Material of cloth is : "+cloth1);
		System.out.println("Price of cloth for 1meter is : "+cloth2);
		cloth.material="Cotton";
		cloth.price=150;
		System.out.println("Updated Material of cloth is : "+cloth.material);
		System.out.println("Updated Price of cloth for 1meter is : "+cloth.price);
		
		System.out.println("End Cloth");
		
		Poster poster = new Poster();
		double poster1 = poster.length;
		double poster2 = poster.width;
		System.out.println("Length of poster in m is : "+poster1);
		System.out.println("width of poster in m is : "+poster2);
		poster.length=10;
		poster.width= 15;
		System.out.println("Updated Length of poster in m is : "+poster.length);
		System.out.println("Updated width of poster in m is : "+poster.width);
		
		System.out.println("End Poster");
		
		PostBox postbox = new PostBox();
		String postBox1 = postbox.area;
		double postBox2 = postbox.weight;
		System.out.println("area of postbox is : "+postBox1);
		System.out.println("weight of postbox in kg is : "+postBox2);
		postbox.area = "Mahalakshmipuram";
		postbox.weight = 5;
		System.out.println("Updated area of postbox is : "+postbox.area);
		System.out.println("Updated weight of postbox in kg is : "+postbox.weight);
		
		System.out.println("End PostBox");
		
		Key key = new Key();
		String key1 = key.type;
		double key2 = key.price;
		System.out.println("Type of key is : "+key1);
		System.out.println("Price of key is : "+key2);
		key.type = "Car Key";
		key.price = 1000;
		System.out.println("Updated Type of key is : "+key.type);
		System.out.println("Updated Price of key is : "+key.price);
		
		System.out.println("End Key");
		
		Tree tree = new Tree();
		String tree1 = tree.name;
		double tree2 = tree.age;
		System.out.println("Name of tree is : "+tree1);
		System.out.println("Age of tree in years is : "+tree2);
		tree.name = "Banyan Tree";
		tree.age = 10;
		System.out.println("Updated Name of tree is : "+tree.name);
		System.out.println("Updated Age of tree in years is : "+tree.age);
		
		System.out.println("End Tree");
		
		System.out.println("End main in ConstRunner");
		
	}

}