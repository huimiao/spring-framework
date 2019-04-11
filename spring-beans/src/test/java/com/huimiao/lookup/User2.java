package com.huimiao.lookup;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

public class User2 {

	@Getter
	@Setter
	@Value("this is the name.")
	private String userName;
	private User1 user1;

	@Getter
	@Setter
	private List<User1> user1s;

	@Setter
	@Getter
	@Value("this is test")
	private Optional<String> test;


	public User2() {

	}

	public User2(String d) {

	}

	public void test() {
		System.out.println(getUser1());
	}

	public User1 getUser1() {
		return user1;
	}

	public void setUser1(User1 user1) {
		this.user1 = user1;
	}
}
