package repository;

import java.util.ArrayList;
import java.util.List;

import exception.OrderException;
import vo.Order;

public class OrderRepository {

	private List<Order> db = new ArrayList<>();
	
	public OrderRepository() {
		loadData();
	}
	
	/**
	 * 지정된 주문정보를 저장한다.
	 * @param order 주문정보
	 */
	public void insertOrder(Order order) {
		db.add(order);
	}
	
	/**
	 * 모든 주문내역을 반환한다.
	 * @return 주문내역
	 */
	public List<Order> getAllOrders() {
		return db;
	}
	
	
	private void loadData() {
		
	}
	
	public void saveData() {
		
	}
}
