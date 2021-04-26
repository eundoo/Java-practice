
package repository;

import java.util.ArrayList;
import java.util.List;

import vo.Book;

public class BookRepository {

	private List<Book> db = new ArrayList<>();
	
	public BookRepository() {}
	
	/**
	 * 모든 책정보를 반환한다.
	 * @return 도서 목록
	 */
	public List<Book> getAllBooks() {
		return null;
	}
	
	/**
	 * 지정된 책번호의 책을 반환한다.
	 * @param no 책번호
	 * @return 도서
	 */
	public Book getBookByNo(int no) {
		return null;
	}
	
	/**
	 * 지정된 책으로 책정보를 변경한다.
	 * @param book 변경된 책정보를 포함하고 있는 책
	 */
	public void updateBook(Book book) {
		
	}
	
	private void loadData() {
		
	}
	
	public void saveData() {
		
	}
}
