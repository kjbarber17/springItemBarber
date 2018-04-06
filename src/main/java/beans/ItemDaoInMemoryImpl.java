package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class ItemDaoInMemoryImpl implements ItemDao {

	private Map<Long,Item>itemsMap = new HashMap<Long, Item>();

	{
		Item item1 = new Item(1L, "table", 100, 25, 75);
		Item item2 = new Item(2L, "couch", 300, 50, 250);

		itemsMap.put(item1.getId(), item1);
		itemsMap.put(item2.getId(), item2);
	}

	public void insert(Item item) {
		itemsMap.put(item.getId(), item);

	}

	public void update(Item item) {
		itemsMap.put(item.getId(), item);

	}

	public void update(List<Item> items) {
		for(Item item:items) {
			update(item);
		}
	}
	public void delete(long itemId) {
		itemsMap.remove(itemId);

	}

	public Item find(long itemId) {
		return itemsMap.get(itemId);

	}

	public List<Item> find(List<Long> itemIds) {
		List<Item>items = new ArrayList<Item>();
		for(Long id: itemIds) {
			items.add(itemsMap.get(id));
		}
		return items;
	}

	public List<Item> find(String itemName) {
		List<Item>items = new ArrayList<Item>();
		for (Item item: itemsMap.values()) {
			if(itemName.equals(item.getItemName())) {
				items.add(item);
			}
		}
		return items;
	}

	public List<Item> find(double discount) {
		List<Item>items = new ArrayList<Item>();
		for (Item item: itemsMap.values()) {
			if(discount == (item.getDiscount())) {
				items.add(item);
			}
		}
		return items;
	}

}
