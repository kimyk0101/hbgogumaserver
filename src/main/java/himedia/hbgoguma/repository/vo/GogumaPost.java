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
	private Long selectedUid;		// 구매확정자 유저번호
	private Integer locaGu;			// 작성자 구 정보
	private Integer locaDong;		// 작성자 동 정보
	private String postTitle; 		// 게시글 제목
	private String postPhoto; 		// 게시글 사진링크
	private String postContent; 	// 게시글 내용
	private Integer postCategory;	// 게시글 카데고리
	private List<Long> userList; 	// 구매 희망자 uid 리스트
	private Integer reportCnt;		//	게시글 신고 횟수
	private Date postUpdate;		// 게시글 게시시간
}
