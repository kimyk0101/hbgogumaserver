package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaPostMapper;
import himedia.hbgoguma.repository.vo.GogumaPost;

@Service
public class GogumaPostService {
	@Autowired
	private GogumaPostMapper gogumaPostMapper;
	
	public List<GogumaPost> selectAllPosts() {
		List<GogumaPost> posts = gogumaPostMapper.selectAllPosts();
		
		return posts;
	}
	
	public GogumaPost insertPost(GogumaPost post) {
		gogumaPostMapper.insertPost(post);
		
		Long pid = post.getPid();
		
		return gogumaPostMapper.selectByPid(pid);
	}
	
	public GogumaPost updatePost(GogumaPost post) {
		gogumaPostMapper.updatePost(post);
		
		return post;
	}
	
	public int deletePost(Long pid) {
		return gogumaPostMapper.deletePost(pid);
	}
}
