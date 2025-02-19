package fruitManager;

public interface FruitDao {
	boolean insert(Fruit fruit);
	boolean delete(Fruit fruit);
	boolean update(Fruit fruit);
	Fruit select(String name);
	
	
}
