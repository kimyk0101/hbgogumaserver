package himedia.hbgoguma.repository.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GogumaReviewHistory {
	private Long hid;				// 구매 후기글 고유번호
	private Long sendUid;			// 구매 후기글 작성자 유저번호
	private Long receiveUid;		// 구매 게시글 올렸던 작성자 유저번호
	private String reviewContent;	// 구매 후기글 내용
	private Float reviewPoint;		// 판매자 대상 평점
	private Integer rewardPoint;	// 후기글 작성 보상 포인트
	private Date reviewUpdate;		// 후기글 작성 시간
}
