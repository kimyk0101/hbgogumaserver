package himedia.hbgoguma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.hbgoguma.repository.vo.GogumaNotification;
import himedia.hbgoguma.service.GogumaNotificationService;

@RestController
@RequestMapping("/api/gogumanotification")
public class GogumaNotificationController {
	@Autowired
	private GogumaNotificationService gogumaNotificationService;
	
//	GET : /api/gogumanotification
	@GetMapping
	public ResponseEntity<List<GogumaNotification>> getAllNotifications() {
		List<GogumaNotification> notifications = gogumaNotificationService.selectAllNotification();
		return ResponseEntity.ok(notifications);
	}
	
// GET : /api/gogumanotification/{nid}
	@GetMapping("/{nid}")
	public ResponseEntity<GogumaNotification> selectNotiByNid(@PathVariable Long nid) {
		GogumaNotification noti = gogumaNotificationService.selectNotiByNid(nid);
		
		return ResponseEntity.ok(noti);
	}
	
//	POST : /api/gogumanotification -> 새로운 알람 항목 생성
	@PostMapping
	public ResponseEntity<GogumaNotification> createNotification(@RequestBody GogumaNotification noti) {
		GogumaNotification savedNoti = gogumaNotificationService.insertNotification(noti);
		return ResponseEntity.ok(savedNoti);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumanotification/{nid} -> 기존 알람 항목 수정
	@PutMapping("/{nid}")
	public ResponseEntity<GogumaNotification> updateNotification(@RequestBody GogumaNotification noti, @PathVariable Long nid) {
		noti.setNid(nid);
		GogumaNotification updatedNoti = gogumaNotificationService.updateNotification(noti);
		return ResponseEntity.ok(updatedNoti);
	}
	
//	PATCH : /api/gogumanotification/{nid}
	@PatchMapping("/{nid}")
	public ResponseEntity<GogumaNotification> readNotification(@PathVariable Long nid) {
		GogumaNotification updatedNoti = gogumaNotificationService.readNotification(nid);
		return ResponseEntity.ok(updatedNoti);
	}
	
//	DELETE : /api/gogumanotification/{nid} -> 기존 알람 항목 삭제
	@DeleteMapping("/{nid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteNotification(@PathVariable Long nid) {
		gogumaNotificationService.deleteNotification(nid);
		return ResponseEntity.ok().<Void>build();
	}
}
