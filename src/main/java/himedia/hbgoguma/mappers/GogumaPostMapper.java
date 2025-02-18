package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaPost;

@Mapper
public interface GogumaPostMapper {
//	<select id="selectAllPosts" resultType="GogumaPost">
	List<GogumaPost> selectAllPosts();
//	<insert id="insertPost" parameterType="GogumaPost">
	int insertPost(GogumaPost item);
//	<select id="selectByNid" parameterType="Long" resultType="GogumaPost">
	GogumaPost selectByPid(Long pid);
//	<update id="updateNotification" parameterType="GogumaPost">
	int updatePost(GogumaPost item);
//	<delete id="deleteNotification" parameterType="Long">
	int deletePost(Long id);
}
