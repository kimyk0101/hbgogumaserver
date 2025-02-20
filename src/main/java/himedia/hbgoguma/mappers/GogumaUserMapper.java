package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaUser;

@Mapper
public interface GogumaUserMapper {
//	<select id="selectAllUsers" resultType="GogumaUser">
	List<GogumaUser> selectAllUsers();
//	<insert id="registerUser" parameterType="GogumaUser">
	int registerUser(GogumaUser user);
//	<select id="loginUser" resultType="GogumaUser">
	GogumaUser loginUser(String nickname, String password);
//	<select id="selectByUid" parameterType="Long" resultType="GogumaUser">
	GogumaUser selectByUid(Long uid);
//	<update id="updateUser" parameterType="GogumaUser">
	int updateUser(GogumaUser user);
//	<delete id="deleteUser" parameterType="Long">
	int deleteUser(Long uid);
}
