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

import himedia.hbgoguma.repository.vo.GogumaReviewHistory;
import himedia.hbgoguma.service.GogumaReviewHistoryService;

@RestController
@RequestMapping("/api/gogumareview")
public class GogumaReviewHistoryController {
	@Autowired
	private GogumaReviewHistoryService gogumaReviewHistoryService;
	
//	GET : /api/gogumareview
	@GetMapping
	public ResponseEntity<List<GogumaReviewHistory>> selectAllReviews() {
		List<GogumaReviewHistory> reports = gogumaReviewHistoryService.selectAllReviews();
		return ResponseEntity.ok(reports);
	}
	
//	GET : /api/gogumareview
	@GetMapping("/my/{uid}")
	public ResponseEntity<List<GogumaReviewHistory>> selectMyReviews(@PathVariable Long uid) {
		List<GogumaReviewHistory> reports = gogumaReviewHistoryService.selectMyReviews(uid);
		return ResponseEntity.ok(reports);
	}
	
//	POST : /api/gogumareview -> 새로운 리뷰 생성
	@PostMapping
	public ResponseEntity<GogumaReviewHistory> insertReview(@RequestBody GogumaReviewHistory review) {
		GogumaReviewHistory savedReview = gogumaReviewHistoryService.insertReview(review);
		return ResponseEntity.ok(savedReview);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumareview/{hid} -> 기존 리뷰 항목 수정
	@PutMapping("/{hid}")
	public ResponseEntity<GogumaReviewHistory> updateReview(@RequestBody GogumaReviewHistory review, @PathVariable Long hid) {
		review.setHid(hid);
		GogumaReviewHistory updatedReview = gogumaReviewHistoryService.updateReview(review);
		return ResponseEntity.ok(updatedReview);
	}
	
//	DELETE : /api/gogumareview/{hid} -> 기존 리뷰 항목 삭제
	@DeleteMapping("/{hid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteReview(@PathVariable Long hid) {
		gogumaReviewHistoryService.deleteReview(hid);
		return ResponseEntity.ok().<Void>build();
	}
}
