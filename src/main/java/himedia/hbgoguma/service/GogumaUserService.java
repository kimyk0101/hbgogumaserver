package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import himedia.hbgoguma.mappers.GogumaUserMapper;
import himedia.hbgoguma.repository.vo.GogumaUser;

public class GogumaUserService {
	@Autowired
	private GogumaUserMapper gogumaUserMapper;

	public List<GogumaUser> selectAllUsers() {
		List<GogumaUser> users = gogumaUserMapper.selectAllUsers();
		
		return users;
	}
	
	public GogumaUser registerUser(GogumaUser user) {
		gogumaUserMapper.registerUser(user);
		
		Long uid = user.getUid();
		
		return gogumaUserMapper.selectByUid(uid);
	}
	
	public GogumaUser updateUser(GogumaUser user) {
		gogumaUserMapper.updateUser(user);
		
		return user;
	}
	
	public int deleteUser(Long uid) {
		return gogumaUserMapper.deleteUser(uid);
	}
}
