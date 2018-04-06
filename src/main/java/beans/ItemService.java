package beans;

public interface ItemService {
	public void changePrice(long itemId, double discount);
	public Item getItem(long itemId);

}
 