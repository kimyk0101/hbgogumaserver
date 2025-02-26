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
	private GogumaPostService gogumaPostService;
	
//	GET : /api/gogumapost
	@GetMapping
	public ResponseEntity<List<GogumaPost>> getAllPosts() {
		List<GogumaPost> items = gogumaPostService.selectAllPosts();
		return ResponseEntity.ok(items);
	}
	
//	GET : /api/gogumapost/{pid}
	@GetMapping("/{pid}")
	public ResponseEntity<GogumaPost> selectPostByPid(@PathVariable Long pid) {
		GogumaPost post = gogumaPostService.selectPostByPid(pid);
		
		return ResponseEntity.ok(post);
	}
	
	//GET : /api/gogumapost/{pid}/related
	@GetMapping("/{pid}/related")
	public ResponseEntity<List<GogumaPost>> selectRelatedPosts(@PathVariable Long pid) {
		GogumaPost post = gogumaPostService.selectPostByPid(pid);
			
		List<GogumaPost> relatedPosts = gogumaPostService.selectRelatedPosts(post);
			
		return ResponseEntity.ok(relatedPosts);
	}
	
//	POST : /api/gogumapost -> 새로운 쇼핑 항목 생성
	@PostMapping
	public ResponseEntity<GogumaPost> insertPost(@RequestBody GogumaPost post) {
		GogumaPost savedPost = gogumaPostService.insertPost(post);
		return ResponseEntity.ok(savedPost);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumapost/{pid} -> 기존 쇼핑 항목 수정
	@PutMapping("/{pid}")
	public ResponseEntity<GogumaPost> updatePost(@RequestBody GogumaPost post, @PathVariable Long pid) {
		post.setPid(pid);
		GogumaPost updatedPost = gogumaPostService.updatePost(post);
		return ResponseEntity.ok(updatedPost);
	}
	
//	DELETE : /api/gogumapost/{pid} -> 기존 쇼핑 항목 삭제
	@DeleteMapping("/{pid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deletePost(@PathVariable Long pid) {
		gogumaPostService.deletePost(pid);
		return ResponseEntity.ok().<Void>build();
	}
}