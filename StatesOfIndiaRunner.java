class StatesOfIndiaRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in StatesOfIndia");
		String state1="Andhra Pradesh";
		String state2="Arunachal pradesh";
		String state3="Assam";
		String state4="Bihar";
		String state5="Chattisgarh";
		String state6="Goa";
		String state7="Gujrat";
		String state8="Haryana";
		String state9="Himachal Pradesh";
		String state10="Jharkhand";
		String state11="Karnataka";
		String state12="Kerala";
		String state13="Madhya Pradesh";
		String state14="Maharashtra";
		String state15="Meghalaya";
		String state16="Manipur";
		String state17="Meghalaya";
		String state18="Mizoram";
		String state19="Nagaland";
		String state20="Odisha";
		String state21="Punjab";
		String state22="Rajasthan";
		String state23="Sikkim";
		String state24="Tamil Nadu";
		String state25="Telangana";
		String state26="Tripura";
		String state27="Uttar Pradesh";
		String state28="Uttarkhand";
		String state29="West Bengal";
		
		String[] states ={state1,state2,state3,state4,state5,state6,state7,state8,state9,state10,state11,state12,state13,state14,state15,state16,state17,state18,state19,state20,state21,state22,state23,state24,state25,state26,state27,state28,state29};
		int ref=states.length;
		System.out.println("Length is : "+ref);
		System.out.println("Original array");
		
		for(int start_states=0;start_states<states.length;start_states++)
		{
			System.out.println("State is :"+states[start_states]);
		}
		
		System.out.println("Reversed array");
		for(int start_states=states.length-1;start_states>=0;start_states--)
		{
			System.out.println("State is :"+states[start_states]);
		}
		System.out.println("End main in StatesOfIndia");
	}






}