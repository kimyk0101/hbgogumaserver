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
public class GogumaNotification {
	private Long nid;			// 알람 고유 번호
	private Long receiveUid;	// 알람 받는 유저번호
	private Long sendUid;		// 알람 보낸 유저 (신고, 구매 희망, 구매 확정 등)
	private Integer notiCategory; 	// 알람 사유 (신고, 구매 희망, 구매 확정 등)
	private String notiContent;	// 알람 내용
	private Date notiDate;		// 알람 업데이트 시간
}
