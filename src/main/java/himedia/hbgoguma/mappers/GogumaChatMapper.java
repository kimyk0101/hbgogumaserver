package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaChat;

@Mapper
public interface GogumaChatMapper {
//	<select id="selectAllChats" resultType="gogumaChat">
	List<GogumaChat> selectAllChats();
//	<select id="selectChatsByPid" resultType="gogumaChat">
	List<GogumaChat> selectChatsByPid(Long pid);
//	<insert id="insertChat" parameterType="gogumaChat">
	int insertChat(GogumaChat item);
//	<select id="selectChatByCid" parameterType="Long" resultType="gogumaChat">
	GogumaChat selectChatByCid(Long cid);
//	<update id="updateChat" parameterType="gogumaChat">
	int updateChat(GogumaChat item);
//	<delete id="deleteChat" parameterType="Long">
	int deleteChat(Long cid);
}
