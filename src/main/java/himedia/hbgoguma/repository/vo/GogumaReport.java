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
public class GogumaReport {
	private Long rid;			// 신고글 번호
	private Long uid;			// 신고한 유저번호
	private Long pid;			// 신고당한 게시글 번호
	private Integer report_id;	// 신고 사유
	private Boolean is_confirmed;	// 신고처리 완료 여부
	private Date upd_date;	// 신고 일시
}
