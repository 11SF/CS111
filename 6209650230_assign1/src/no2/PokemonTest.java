//Student ID : 6209650230
//Name : Nawapong Sitaruno

package no2;


public class PokemonTest {
	public static void main(String[] args) {
		Pokemon pkm1 = new Pokemon();
		Pokemon pkm2 = new Pokemon();
		Pokemon pkm3 = new Pokemon();
		Pokemon pkm4 = new Pokemon();
		Pokemon pkm5 = new Pokemon();
		
		pkm1.setName("Bulbasaur");
		pkm1.setType("Grass Poison");
		pkm1.setCategory("Seed");
		pkm1.setWeight(15.2);
		
		pkm2.setName("Charmeleon");
		pkm2.setType("Fire");
		pkm2.setCategory("Flame");
		pkm2.setWeight(41.9);
		
		pkm3.setName("Charizard");
		pkm3.setType("Fire Flying");
		pkm3.setCategory("Flame");
		pkm3.setWeight(199.5);
		
		pkm4.setName("Pikachu");
		pkm4.setType("Electric");
		pkm4.setCategory("Mouse");
		pkm4.setWeight(13.2);
		
		pkm5.setName("Sandslash");
		pkm5.setType("Ground");
		pkm5.setCategory("Mouse");
		pkm5.setWeight(65.0);
		
		System.out.println("Pokemon: "+pkm1.getName()+" Category: "+pkm1.getCategory());
		System.out.println("Type: "+pkm1.getType()+"   Weight: "+pkm1.getWeight());
		
		System.out.println("Pokemon: "+pkm2.getName()+" Category: "+pkm2.getCategory());
		System.out.println("Type: "+pkm2.getType()+"   Weight: "+pkm2.getWeight());
		
		System.out.println("Pokemon: "+pkm3.getName()+" Category: "+pkm3.getCategory());
		System.out.println("Type: "+pkm3.getType()+"   Weight: "+pkm3.getWeight());
		
		System.out.println("Pokemon: "+pkm4.getName()+" Category: "+pkm4.getCategory());
		System.out.println("Type: "+pkm4.getType()+"   Weight: "+pkm4.getWeight());
		
		System.out.println("Pokemon: "+pkm5.getName()+" Category: "+pkm5.getCategory());
		System.out.println("Type: "+pkm5.getType()+"   Weight: "+pkm5.getWeight());
	}
}

