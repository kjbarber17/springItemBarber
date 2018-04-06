package beans;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;

	public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void changePrice(long sourceItemId, long targetItemId, double price) {
		Item sourceItem = itemDao.find(sourceItemId);
		Item targetItem = itemDao.find(targetItemId);
		System.out.println("testing");

		sourceItem.setPrice(sourceItem.getPrice() + price);
		targetItem.setPrice(targetItem.getPrice() + price);

		itemDao.update(sourceItem);
		itemDao.update(targetItem);

	}

	public void changePrice(long itemId, double price) {
		Item item = itemDao.find(itemId);
		item.setPrice(item.getPrice() + price);
		itemDao.update(item);

	}
	public ItemServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item getItem(long itemId) {
		// TODO Auto-generated method stub
		return itemDao.find(itemId);

	}

}
