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
public class GogumaChat {
	 private long cid;
	 private long pid;
	 private long writer_uid;
	 private long seller_uid;
	 private long buyer_uid;
	 private String chat_content;
	 private Date upd_date;
}
