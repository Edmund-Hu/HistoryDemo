package com.Edmund_7_27;

public class test_animal {
	public void bite(Animal a1){
		a1.getinfo();
		a1.gethabbit();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wolf wolf=new Wolf("¿«", 50, 65);
				//wolf.getinfo();
				//wolf.gethabbit();
		Tiger tiger = new Tiger("¿œª¢", 100, 60);
			//tiger.getinfo();
			//tiger.gethabbit();
		test_animal test = new test_animal();
		test.bite(tiger);
		test.bite(wolf);
	}

	
			
	
}
