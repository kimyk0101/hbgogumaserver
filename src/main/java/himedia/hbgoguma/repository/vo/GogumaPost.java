package himedia.hbgoguma.repository.vo;

import java.util.Date;
import java.util.List;

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
public class GogumaPost {
	private Long pid;				// 게시글 번호
	private Long uid;				// 작성자 유저번호
	private Long selected_uid;		// 구매확정자 유저번호
	private Integer loca_gu;			// 작성자 구 정보
	private Integer loca_dong;		// 작성자 동 정보
	private String post_title; 		// 게시글 제목
	private String post_photo; 		// 게시글 사진링크
	private String post_content; 	// 게시글 내용
	private Integer post_category;	// 게시글 카데고리
	private Integer post_price;		// 게시글 가격
	private List<Long> user_list; 	// 구매 희망자 uid 리스트
	private Integer report_cnt;		//	게시글 신고 횟수
	private Date post_update;		// 게시글 게시시간
}
