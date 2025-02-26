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
	private Long buyer_uid;			// 구매 후기글 작성자 유저번호
	private Long seller_uid;		// 구매 게시글 올렸던 작성자 유저번호
	private String review_content;	// 구매 후기글 내용
	private Integer review_point;	// 판매자 대상 평점
	private Integer reward_point;	// 후기글 작성 보상 포인트
	private Date upd_date;		// 후기글 작성 시간
}
