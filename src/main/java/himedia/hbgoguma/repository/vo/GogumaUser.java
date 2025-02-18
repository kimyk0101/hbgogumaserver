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
public class GogumaUser {
	private Long uid;			// 유저 회원번호
	private String name;		// 이름
	private String nickname;	// 닉네임
	private String password;	// 비밀번호
	private String telNumber;	// 전화번호
	private String email;		// 이메일
	private Integer locaGu;			// 구 정보
	private Integer locaDong;		// 동 정보
	private String thumbnail;	// 썸네일 주소
	private Long recommend_uid;	// 추천인 회원번호
	private Integer point;		// 유저 포인트
	private Float userRate;		// 유저 평가 점수
	private Date registerDate; 	// 가입일자
	private Boolean isDeleted;	// 유저정보(탈퇴) 삭제 여부
	private Date update;		// 갱신시간
}
