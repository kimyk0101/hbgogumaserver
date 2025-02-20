package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaChat;

@Mapper
public interface GogumaChatMapper {
//	<select id="selectAllChats" resultType="gogumaChat">
	List<GogumaChat> selectAllChats();
//	<insert id="insertChat" parameterType="gogumaChat">
	int insertChat(GogumaChat item);
//	<select id="selectChatByCid" parameterType="Long" resultType="gogumaChat">
	GogumaChat selectChatByCid(Long nid);
//	<update id="updateChat" parameterType="gogumaChat">
	int updateChat(GogumaChat item);
//	<delete id="deleteChat" parameterType="Long">
	int deleteChat(Long id);
}
