package himedia.hbgoguma.mappers;

import java.util.List;

import himedia.hbgoguma.repository.vo.GogumaReviewHistory;

public interface GogumaReviewHistoryMapper {
//	<select id="selectAllReviews" resultType="GogumaReviewHistory">
	List<GogumaReviewHistory> selectAllReviews();
//	<insert id="insertReview" parameterType="GogumaReviewHistory">
	int insertReview(GogumaReviewHistory item);
//	<select id="selectByHid" parameterType="Long" resultType="GogumaReviewHistory">
	GogumaReviewHistory selectByHid(Long hid);
//	<update id="updateReview" parameterType="GogumaReviewHistory">
	int updateReview(GogumaReviewHistory item);
//	<delete id="deleteReview" parameterType="Long">
	int deleteReview(Long id);
}
