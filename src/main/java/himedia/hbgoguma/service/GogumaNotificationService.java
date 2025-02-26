package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaNotificationMapper;
import himedia.hbgoguma.repository.vo.GogumaNotification;

@Service
public class GogumaNotificationService {
	@Autowired
	private GogumaNotificationMapper gogumaNotiMapper;
	
	public List<GogumaNotification> selectAllNotification() {
		List<GogumaNotification> notifications = gogumaNotiMapper.selectAllNotifications();
		
		return notifications;
	}
	
	public GogumaNotification selectNotiByNid(Long nid) {
		GogumaNotification notification = gogumaNotiMapper.selectByNid(nid);
		
		return notification;
	}
	
	public GogumaNotification insertNotification(GogumaNotification noti) {
		gogumaNotiMapper.insertNotification(noti);
		
		Long nid = noti.getNid();
		
		return gogumaNotiMapper.selectByNid(nid);
	}
	
	public GogumaNotification updateNotification(GogumaNotification noti) {
		gogumaNotiMapper.updateNotification(noti);
		
		return noti;
	}
	
	public GogumaNotification readNotification(Long nid) {
		gogumaNotiMapper.readNotification(nid);
		
		return gogumaNotiMapper.selectByNid(nid);
	}
	
	public int deleteNotification(Long nid) {
		return gogumaNotiMapper.deleteNotification(nid);
	}
}
