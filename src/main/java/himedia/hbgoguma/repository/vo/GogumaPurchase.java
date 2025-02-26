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
public class GogumaPurchase {
	private Long id;			// 구매기록 고유번호
	private Long seller_uid;	// 판매자 고유번호
	private Long buyer_uid;		// 구매자 고유번호
	private Long pid;			// 게시글 고유번호
	private Long price;			// 거래 가격
	private Date upd_date;		// 거래 완료시간
}
