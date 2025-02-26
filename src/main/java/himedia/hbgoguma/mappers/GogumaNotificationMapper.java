package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaNotification;

@Mapper
public interface GogumaNotificationMapper {
//	<select id="selectAllNotifications" resultType="GogumaNotification">
	List<GogumaNotification> selectAllNotifications();
//	<insert id="insertNotification" parameterType="GogumaNotification">
	GogumaNotification insertNotification(GogumaNotification item);
//	<select id="selectByNid" parameterType="Long" resultType="GogumaNotification">
	GogumaNotification selectByNid(Long nid);
//	<update id="updateNotification" parameterType="GogumaNotification">
	GogumaNotification updateNotification(GogumaNotification item);
//	<update id="readNotification" parameterType="Long">
	GogumaNotification readNotification(Long nid);
//	<delete id="deleteNotification" parameterType="Long">
	int deleteNotification(Long nid);
}
