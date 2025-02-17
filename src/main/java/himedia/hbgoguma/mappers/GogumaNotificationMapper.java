package himedia.hbgoguma.mappers;

import java.util.List;

import himedia.hbgoguma.repository.vo.GogumaNotification;

public interface GogumaNotificationMapper {
//	<select id="selectAllNotifications" resultType="GogumaNotification">
	List<GogumaNotification> selectAllNotifications();
//	<insert id="insertNotification" parameterType="GogumaNotification">
	int insertNotification(GogumaNotification item);
//	<select id="selectByNid" parameterType="Long" resultType="GogumaNotification">
	GogumaNotification selectByNid(Long nid);
//	<update id="updateNotification" parameterType="GogumaNotification">
	int updateNotification(GogumaNotification item);
//	<delete id="deleteNotification" parameterType="Long">
	int deleteNotification(Long id);
}
