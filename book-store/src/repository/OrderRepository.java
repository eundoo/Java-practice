package repository;

import java.util.ArrayList;
import java.util.List;

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
		
	}
	
	/**
	 * 지정된 사용자의 주문내역을 반환한다.
	 * @param userId 사용자 아이디
	 * @return 주문내역
	 */
	public List<Order> getOrdersByUserId(String userId) {
		return null;
	}
	
	
	private void loadData() {
		
	}
	
	public void saveData() {
		
	}
}
