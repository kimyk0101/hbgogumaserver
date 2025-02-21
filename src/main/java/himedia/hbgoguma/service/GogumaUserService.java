package himedia.hbgoguma.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaUserMapper;
import himedia.hbgoguma.repository.vo.GogumaUser;

@Service
public class GogumaUserService {
	@Autowired
	private GogumaUserMapper gogumaUserMapper;

	// 전체 유저 불러오기
	public List<GogumaUser> selectAllUsers() {
		List<GogumaUser> users = gogumaUserMapper.selectAllUsers();
		
		return users;
	}
	
	public GogumaUser loginUser(String nickname, String password) {
		Map<String, String> userMap = new HashMap<>();
		userMap.put("nickname",nickname);
		userMap.put("password", password);
		
		GogumaUser user = gogumaUserMapper.loginUser(userMap);
		
		return user;
	}
	
	// 회원가입
	public GogumaUser registerUser(GogumaUser user) {
		gogumaUserMapper.registerUser(user);
		
		Long uid = user.getUid();
		
		return gogumaUserMapper.selectByUid(uid);
	}
	
	// 유저 정보 수정
	public GogumaUser updateUser(GogumaUser user) {
		gogumaUserMapper.updateUser(user);
		
		return user;
	}
	
	// 유저 삭제
	public int deleteUser(Long uid) {
		return gogumaUserMapper.deleteUser(uid);
	}
}
