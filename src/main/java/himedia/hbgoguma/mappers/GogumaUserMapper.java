package himedia.hbgoguma.mappers;

import java.util.List;

import himedia.hbgoguma.repository.vo.GogumaUser;

public interface GogumaUserMapper {
//	<select id="selectAllUsers" resultType="GogumaUser">
	List<GogumaUser> selectAllUsers();
//	<insert id="registerUser" parameterType="GogumaUser">
	int registerUser(GogumaUser user);
//	<select id="selectByUid" parameterType="Long" resultType="GogumaUser">
	GogumaUser selectByUid(Long uid);
//	<update id="updateUser" parameterType="GogumaUser">
	int updateUser(GogumaUser user);
//	<delete id="deleteUser" parameterType="Long">
	int deleteUser(Long uid);
}
