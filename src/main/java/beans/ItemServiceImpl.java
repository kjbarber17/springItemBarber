package beans;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void changePrice(long sourceItemId, double discount) {
		Item sourceItem = itemDao.find(sourceItemId);
		
		System.out.println("testing");

		sourceItem.setSalePrice(sourceItem.getPrice() - discount);
		

		itemDao.update(sourceItem);
		

	}

	/*public void changePrice(long itemId, double price) {
		Item item = itemDao.find(itemId);
		item.setPrice(item.getDiscount() + price);
		itemDao.update(item);

	}*/
	public ItemServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item getItem(long itemId) {
		// TODO Auto-generated method stub
		return itemDao.find(itemId);

	}

}
