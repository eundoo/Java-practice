package app;

import java.util.Scanner;

import exception.BookStoreException;
import service.BookStoreService;

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
		
	}
	
	/**
	 * 로그인하기
	 */
	private void login() {
		
	}
	
	/**
	 * 회원가입하기
	 */
	private void register() {
		
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
				
			} else if (searchMenuNo == 2) {
				
			} else if (searchMenuNo == 3) {
				
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
		
	}
	
	/**
	 * 내 정보 보기
	 */
	private void displayMyInfo() {
		
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
		
	}
	
	/**
	 * 종료하기
	 */
	private void exit() {
		System.out.println("[프로그램 종료]");
		service.restore();
		System.exit(0);
	}
	
	public static void main(String[] args) {
		new BookApp().menu();
	}
}
