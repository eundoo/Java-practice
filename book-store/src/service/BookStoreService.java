package service;

import java.util.List;

import repository.BookRepository;
import repository.UserRepository;
import vo.Book;
import vo.Order;
import vo.User;

public class BookStoreService {

	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	private User loginedUser = null;
	
	/**
	 * 모든 책정보를 반환한다.
	 * @return 도서 목록
	 */
	public List<Book> getAllBookList() {
		return null;
	}
	
	/**
	 * 지정된 카테고리에 해당하는 책 정보들을 반환한다.
	 * @param category 조회할 도서 카테고리
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByCategory(String category) {
		return null;
	}
	
	/**
	 * 지정된 책 제목을 포함하고 잇는 책 정보들을 반환한다.
	 * @param title 조회할 도서 제목
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByTitle(String title) {
		return null;
	}
	
	/**
	 * 지정된 가격범위에 속하는 책 정보들을 반환한다.
	 * @param minPrice 최소 가격
	 * @param maxPrice 최대 가격
	 * @return 도서 목록
	 */
	public List<Book> searchBooksByPrice(int minPrice, int maxPrice) {
		return null;
	}
	
	/**
	 * 지정된 책번호에 해당하는 책정보를 반환한다.
	 * @param no 조회할 책 번호
	 * @return 도서
	 */
	public Book findBook(int no) {
		return null;
	}
	
	/**
	 * 지정된 책번호의 재고를 변경한다.
	 * @param no 책번호
	 * @param stock 변경된 재고량
	 */
	public void updateBookStock(int no, int stock) {
		
	}
	
	/**
	 * 지정된 사용자정보를 등록한다.
	 * @param user 새 사용자
	 */
	public void addNewUser(User user) {
		
	}
	
	/**
	 * 지정된 아이디와 비밀번호로 사용자정보를 인증한다.
	 * @param id 아이디
	 * @param password 비밀번호
	 */
	public void login(String id, String password) {
		
	}
	
	/**
	 * 로그인된 사용자 정보를 삭제한다.
	 */
	public void logout() {
		
	}
	
	/**
	 * 로그인여부를 반환한다.
	 * @return 로그인된 사용자정보가 존재하면 true를 반환한다.
	 */
	public boolean isLogined() {
		return false;
	}
	
	/**
	 * 치정된 책번호의 책을 수량만큼 주문한다.
	 * @param bookNo 책번호
	 * @param amount 주문수량
	 */
	public void orderBook(int bookNo, int amount) {
		
	}
	
	/**
	 * 로그인한 사용자의 주문정보를 반환한다.
	 * @return 주문 목록
	 */
	public List<Order> getMyOrderList() {
		return null;
	}
	
	/**
	 * 로그인한 사용자의 상세정보를 반환한다.
	 * @return
	 */
	public User getMyInfo() {
		return null;
	}
	
	/**
	 * 모든 정보를 저장한다.
	 */
	public void restore() {
		
	}
}

