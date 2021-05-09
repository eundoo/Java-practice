package app;

import static utils.CommonUtils.numberToCurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exception.BookStoreException;
import service.BookStoreService;
import vo.Book;
import vo.Order;
import vo.User;

public class BookApp {

	private BookStoreService service = new BookStoreService();
	private Scanner scanner = new Scanner(System.in);
	
	public void menu() {
		try {
			
			boolean isLogined = service.isLogined();
			
			if (!isLogined) {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.로그인  3.회원가입  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					login();
				} else if (menuNo == 3) {
					register();
				} else if (menuNo == 0) {
					exit();
				}
				
			} else {
				System.out.println("-----------------------------------------------------------------------");
				System.out.println("1.도서목록  2.검색  3.주문  4.내정보  5.주문내역 6.로그아웃  0.종료");
				System.out.println("-----------------------------------------------------------------------");
				
				System.out.print("메뉴 선택 > ");
				int menuNo = scanner.nextInt();
				System.out.println();
				
				if (menuNo == 1) {
					displayAllBooks();
				} else if (menuNo == 2) {
					searchBook();
				} else if (menuNo == 3) {
					orderBook();
				} else if (menuNo == 4) {
					displayMyInfo();
				} else if (menuNo == 5) {
					displayMyOrderHistory();
				} else if (menuNo == 6) {
					logout();
				} else if (menuNo == 0) {
					exit();
				}
			}
		} catch (BookStoreException e) {
			System.out.println("[오류] " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		menu();
	}
	
	/**
	 * 모든 책 정보 출력하기.
	 */
	private void displayAllBooks() {
		System.out.println("[도서 목록 조회]");
		List<Book> books = service.getAllBookList();
		printBookList(books);
	}
	
	/**
	 * 로그인하기
	 */
	private void login() {
		System.out.println("[로그인]");
		
		System.out.println("아이디 입력 > ");
		String userId = scanner.next();
		System.out.println("비밀번호 입력 > ");
		String password = scanner.next();
		
		service.login(userId, password);
		
		System.out.println("[환영합니다!]");
	}
	
	/**
	 * 회원가입하기
	 */
	private void register() {
		System.out.println("아이디를 입력하세요");
		String userId = scanner.next();
		
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		
		System.out.println("비밀번호를 입력하세요");
		String password = scanner.next();
		
		User user = new User();
		user.setId(userId);
		user.setName(name);
		user.setPassword(password);
		user.setPoint(0);
		user.setGrade(null);
		
		service.addNewUser(user);	
		System.out.println("사용자 정보를 저장하였습니다.");
	}
	
	/**
	 * 도서 검색
	 */
	private void searchBook() {
		while(true) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.제목검색  2.카테고리검색  3.가격검색  0.종료");
			System.out.println("-----------------------------------------------------------------------");

			System.out.print("검색 메뉴 선택 > ");
			int searchMenuNo = scanner.nextInt();
			System.out.println();
			
			if (searchMenuNo == 1) {
				System.out.println("책 제목을 입력해주세요");
				String title = scanner.next();
				
				List<Book> books = service.searchBooksByTitle(title);
				printBookList(books);
				
			} else if (searchMenuNo == 2) {
				System.out.println("카테고리를 입력해주세요");
				String category = scanner.next();
				
				service.searchBooksByCategory(category);
				
				
			} else if (searchMenuNo == 3) {
				System.out.println("최소가격을 입력해주세요");
				int minPrice = scanner.nextInt();
				System.out.println("최대가격을 입력해주세요");
				int maxPrice = scanner.nextInt();
				
				service.searchBooksByPrice(minPrice, maxPrice);
			} else if (searchMenuNo == 0) {
				break;
			}
			System.out.println();
			
		}
	}
	
	/**
	 * 책 주문하기
	 */
	private void orderBook() {
		System.out.println("주문할 책의 번호를 입력하세요");
		int book = scanner.nextInt();
		
		System.out.println("주문할 책의 갯수를 입력하세요");
		int amount = scanner.nextInt();
		
		service.orderBook(book, amount);
		System.out.println("도서주문이 완료되었습니다.");
	}
	
	/**
	 * 내 정보 보기
	 */
	private void displayMyInfo() {
		System.out.println("내 상세정보");
		User user = service.getMyInfo();
	
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("아이디: " + user.getId());
		System.out.println("이 름: " + user.getName());
		System.out.println("포인트: " + user.getPoint() + "점");
		System.out.println("등 급: " + user.getGrade());
		System.out.println("-----------------------------------------------------------------------");
	}
	
	/**
	 * 내주문내역 보기
	 */
	private void displayMyOrderHistory() {

	}
	
	/**
	 * 로그아웃하기
	 */
	private void logout() {
		service.logout();
		System.out.println("로그아웃이 되었습니다.");
	}
	
	/**
	 * 종료하기
	 */
	private void exit() {
		System.out.println("[프로그램 종료]");
		service.restore();
		System.exit(0);
	}
	
	private void printBookList(List<Book> books) {
		
		if (books == null || books.isEmpty()) {
			System.out.println("[안내] 검색결과가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("번호\t가격\t할인가격\t수량\t제목");
		System.out.println("--------------------------------------------------------------------");
		StringBuilder sb = new StringBuilder();
		for (Book book : books) {
			sb.append(book.getNo())
				.append("\t")
				.append(numberToCurrency(book.getPrice()))
				.append("\t")
				.append(numberToCurrency(book.getDiscountPrice()))
				.append("\t")
				.append(book.getStock())
				.append("\t")
				.append(book.getTitle());
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		System.out.println("--------------------------------------------------------------------");
	} 
	
	public static void main(String[] args) {
		new BookApp().menu();
	}
}