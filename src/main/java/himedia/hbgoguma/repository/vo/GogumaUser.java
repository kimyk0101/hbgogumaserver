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
	private String tel_number;	// 전화번호
	private String email;		// 이메일
	private Long loca_gu;			// 구 정보
	private Long loca_dong;		// 동 정보
	private String thumbnail;	// 썸네일 주소
	private Long recommend_uid;	// 추천인 회원번호
	private Integer pumpkin_point;		// 유저 포인트
	private Float user_rate;		// 유저 평가 점수
	private Date register_date; 	// 가입일자
	private Boolean is_deleted;	// 유저정보(탈퇴) 삭제 여부
	private Boolean is_admin;	// 관리자 계정 여부
	private Date upd_date;		// 갱신시간
}
