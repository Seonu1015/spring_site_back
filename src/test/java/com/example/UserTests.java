package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

@SpringBootTest
public class UserTests {

	@Autowired
	UserDAO dao;
	
	@DisplayName("회원가입 테스트")
	@Test
	void insert() {
		//given - 어떤 데이터가 준비되었을 때,
		UserVO vo = new UserVO();
		vo.setEmail("white@test.com");
		vo.setPassword("1234");
		
		//when - 어떤 함수를 실행하면
		dao.insert(vo);
		
		//then - 어떠한 결과가 나와야 한다
		HashMap<String, Object> userFromDB = dao.read(vo.getEmail());

        assertThat(userFromDB).isNotNull(); // 저장된 유저 정보가 null이 아닌지 확인
        assertThat(userFromDB.get("email")).isEqualTo(vo.getEmail()); // 이메일이 일치하는지 확인
        assertThat(userFromDB.get("password")).isEqualTo(vo.getPassword()); // 비밀번호가 일치하는지 확인
	}
}
