package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaReviewHistoryMapper;
import himedia.hbgoguma.repository.vo.GogumaReviewHistory;

@Service
public class GogumaReviewHistoryService {
	@Autowired
	private GogumaReviewHistoryMapper gogumaReviewMapper;
	
	public List<GogumaReviewHistory> selectAllReviews() {
		List<GogumaReviewHistory> reviews = gogumaReviewMapper.selectAllReviews();
		
		return reviews;
	}
	
	public GogumaReviewHistory insertReview(GogumaReviewHistory review) {
		gogumaReviewMapper.insertReview(review);
		
		Long hid = review.getHid();
		
		return gogumaReviewMapper.selectByHid(hid);
	}
	
	public GogumaReviewHistory updateReview(GogumaReviewHistory review) {
		gogumaReviewMapper.updateReview(review);
		
		return review;
	}
	
	public int deleteReview(Long hid) {
		return gogumaReviewMapper.deleteReview(hid);
	}
}
