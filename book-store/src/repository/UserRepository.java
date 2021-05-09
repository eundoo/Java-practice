package repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import exception.UserException;
import vo.User;

public class UserRepository {

	private List<User> db = new ArrayList<>();
	
	public UserRepository() {
		// 일반 :                 ~    99,999
		// 로얄 :      100,000    ~   999,999
		// 골드 :    1,000,000    ~ 4,999,999
		// 플레티넘 : 5,000,000
		loadData();
	}
	
	/**
	 * 지정된 사용자정보를 저장한다.
	 * @param user 사용자정보
	 */
	public void insertUser(User user) {
		db.add(user);
	}
	
	/**
	 * 지정된 사용자아이디로 사용자정보를 조회한다.
	 * @param userId 조회할 사용자 아이디
	 * @return 사용자정보가 포함된 User객체, 사용자정보가 존재하지 않으면 null을 반환한다.
	 */
	public User getUserById(String userId) {
		for (User user : db) {
			if(user.getId().equals(userId)) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 지정된 사용자정보로 사용자정보를 갱신한다.
	 * @param user 변경된 사용자 정보가 포함되어 있는 User객체
	 */
	public void updateUser(User user) {
		
	}
	
	/**
	 * 사용자정보를 로드한다.
	 */
	private void loadData() {
		try (FileReader fileReader = new FileReader("src/users.csv");
				BufferedReader reader = new BufferedReader(fileReader)) {
			
			String text = null;
			while((text=reader.readLine()) != null) {
				String[] items = text.split(",");
				String id = items[0];
				String name = items[1];
				String password = items[2];
				int point = Integer.parseInt(items[3]);
				String grade = items[4];
			
				User user = new User(id,name,password,point,grade);
				db.add(user);
			}
		} catch (IOException e) {
			throw new UserException(e.getMessage());
		}
	
	}
	
	/**
	 * 사용자정보를 저장한다.
	 */
	public void saveData() {
		try (PrintWriter writer = new PrintWriter("src/users.csv")) {
			for(User user : db) {
				StringBuilder sb = new StringBuilder();
				sb.append(user.getId())
				.append(",")
				.append(user.getName())
				.append(",")
				.append(user.getPassword())
				.append(",")
				.append(user.getPoint())
				.append(",")
				.append(user.getGrade());
				
				writer.println(sb.toString());
			}
		} catch (IOException e) {
			throw new UserException(e.getMessage());
		}
	}
}
