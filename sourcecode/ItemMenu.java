
public class ItemMenu {
	
	static int SANWICH = 1;
	static int COFFEE = 2;
	static int CEREAL = 3;
	static int PIZZA = 4;

	public static Item getItem(int itemid){
		if (itemid == SANWICH ){
			return new Sanwich(); 
		}else if (itemid == COFFEE ){
			return new Coffee(); 
		}else  if (itemid == CEREAL ){
			return new Cereal(); 
		}else if (itemid == PIZZA){
			return new  Pizza(); 
		}
		return null;
	}
}
