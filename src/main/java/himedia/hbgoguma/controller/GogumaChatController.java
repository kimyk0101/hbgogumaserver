package himedia.hbgoguma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.hbgoguma.repository.vo.GogumaChat;
import himedia.hbgoguma.service.GogumaChatService;

@RestController
@RequestMapping("/api/gogumachat")
public class GogumaChatController {
	@Autowired
	private GogumaChatService gogumaChatService;
	
//	GET : /api/gogumachat
	@GetMapping
	public ResponseEntity<List<GogumaChat>> getAllChats() {
		List<GogumaChat> chats = gogumaChatService.selectAllChats();
		return ResponseEntity.ok(chats);
	}
	
// GET : /api/gogumachat/{pid}
	@GetMapping("/{pid}")
	public ResponseEntity<List<GogumaChat>> getChatsByPid(@PathVariable Long pid) {
		List<GogumaChat> chats = gogumaChatService.selectChatsByPid(pid);
		
		return ResponseEntity.ok(chats);
	}
	
//	POST : /api/gogumachat -> 새로운 알람 항목 생성
	@PostMapping
	public ResponseEntity<GogumaChat> createChat(@RequestBody GogumaChat chat) {
		GogumaChat savedChat = gogumaChatService.insertChat(chat);
		return ResponseEntity.ok(savedChat);	
		//	ResponseEntity.created로 하는 것이 의미상 더 나을 수도 있다.
	}
	
//	PUT : /api/gogumachat/{cid} -> 기존 알람 항목 수정
	@PutMapping("/{cid}")
	public ResponseEntity<GogumaChat> updateChat(@RequestBody GogumaChat chat, @PathVariable Long cid) {
		chat.setCid(cid);
		GogumaChat updatedChat = gogumaChatService.updateChat(chat);
		return ResponseEntity.ok(updatedChat);
	}
	
//	DELETE : /api/gogumachat/{cid} -> 기존 알람 항목 삭제
	@DeleteMapping("/{cid}")
	//	Body에 실어 보낼 내용이 없음 -> Void
	public ResponseEntity<Void> deleteChat(@PathVariable Long cid) {
		gogumaChatService.deleteChat(cid);
		return ResponseEntity.ok().<Void>build();
	}
}
