package himedia.hbgoguma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.hbgoguma.repository.vo.GogumaPost;
import himedia.hbgoguma.service.GogumaPostService;

@RestController
@RequestMapping("/api/gogumapost")
public class GogumaPostController {
	@Autowired
	private GogumaPostService gogumaPostSerivce;
	
//	GET : /api/gogumapost
	@GetMapping
	public ResponseEntity<List<GogumaPost>> getAllPosts() {
		List<GogumaPost> items = gogumaPostSerivce.selectAllPosts();
		return ResponseEntity.ok(items);
	}
	
//	POST : /api/gogumapost -> 새로운 쇼핑 항목 생성
	@PostMapping
	public ResponseEntity<GogumaPost> createPost(@RequestBody GogumaPost post) {
		GogumaPost savedPost = gogumaPostSerivce.insertPost(post);
		return ResponseEntity.ok(savedPost);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumapost/{pid} -> 기존 쇼핑 항목 수정
	@PutMapping("/{pid}")
	public ResponseEntity<GogumaPost> updatePost(@RequestBody GogumaPost post, @PathVariable Long pid) {
		post.setPid(pid);
		GogumaPost updatedPost = gogumaPostSerivce.updatePost(post);
		return ResponseEntity.ok(updatedPost);
	}
	
//	DELETE : /api/gogumapost/{pid} -> 기존 쇼핑 항목 삭제
	@DeleteMapping("/{pid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deletePost(@PathVariable Long pid) {
		gogumaPostSerivce.deletePost(pid);
		return ResponseEntity.ok().<Void>build();
	}
}