package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaPost;

@Mapper
public interface GogumaPostMapper {
//	<select id="selectAllPosts" resultType="GogumaPost">
	List<GogumaPost> selectAllPosts();
//	<insert id="insertPost" parameterType="GogumaPost">
	int insertPost(GogumaPost post);
//	<select id="selectPostByPid" parameterType="Long" resultType="GogumaPost">
	GogumaPost selectPostByPid(Long pid);
	
	List<GogumaPost> selectMyPosts(Long uid);
//	<select id="selectRelatedPosts" parameterType="Long" resultType="GogumaPost">	
	List<GogumaPost> selectRelatedPosts(GogumaPost post);
	
	GogumaPost updatePostUserList(GogumaPost post);
	//	<update id="updatePost" parameterType="GogumaPost">
	int updatePost(GogumaPost post);
//	<delete id="deletePost" parameterType="Long">
	int deletePost(Long pid);
}
