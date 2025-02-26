package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaChatMapper;
import himedia.hbgoguma.repository.vo.GogumaChat;

@Service
public class GogumaChatService {
	@Autowired
	private GogumaChatMapper gogumaChatMapper;
	
	public List<GogumaChat> selectAllChats() {
		List<GogumaChat> chats = gogumaChatMapper.selectAllChats();
		
		return chats;
	}
	
	public List<GogumaChat> selectChatsByPid(Long pid) {
		List<GogumaChat> chats = gogumaChatMapper.selectChatsByPid(pid);
		
		return chats;
	}
	
	public GogumaChat insertChat(GogumaChat chat) {
		gogumaChatMapper.insertChat(chat);
		
		Long cid = chat.getCid();
		
		return gogumaChatMapper.selectChatByCid(cid);
	}
	
	public GogumaChat updateChat(GogumaChat chat) {
		gogumaChatMapper.updateChat(chat);
		
		return chat;
	}
	
	public int deleteChat(Long cid) {
		return gogumaChatMapper.deleteChat(cid);
	}
}
