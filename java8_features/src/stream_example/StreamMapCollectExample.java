package stream_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Jatin", "Thakur", "abc@gmail.com"));
		users.add(new User(2, "Ritki", "chillar", "dec@gmail.com"));
		users.add(new User(3, "Shashank", "jha", "cdc@gmail.com"));
		users.add(new User(4, "Rahul", "Tomar", "ghc@gmail.com"));
		users.add(new User(5, "Nikhil", "Gupta", "khkh@gmail.com"));
		users.add(new User(6, "Manmeet", "Sharma", "gjus@gmail.com"));
		
		// by traditional method 
		
		List<UserDTO> usersDTO = new ArrayList<UserDTO>();
		for(User user: users) {
			usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}

		for(UserDTO dto : usersDTO) {
			System.out.println(dto);
		}
		
		// using stream().map() method
		
		List<UserDTO> userDTOs = users.stream().map(new Function<User, UserDTO>() {

			@Override
			public UserDTO apply(User user) {
				return new UserDTO(user.getId(), user.getUserName(), user.getEmail());
			}
		}).collect(Collectors.toList());
		System.out.println(userDTOs);
		
		List<UserDTO> userDTOs2 = users.stream().map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
									.collect(Collectors.toList());
		userDTOs2.forEach(System.out::println);
		
	}
}


class UserDTO{
	
	private int id;
	private String userName;
	private String email;
	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
	
}

// consider its domain/entity jpa class
class User{
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}
