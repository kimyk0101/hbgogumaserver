package himedia.hbgoguma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import himedia.hbgoguma.repository.vo.GogumaPurchase;
import himedia.hbgoguma.service.GogumaPurchaseService;

@RestController
@RequestMapping("/api/gogumapurchase")
public class GogumaPurchaseController {
	@Autowired
	private GogumaPurchaseService gogumaPurchaseService;
	
//	GET : /api/gogumapurchase
	@GetMapping
	public ResponseEntity<List<GogumaPurchase>> getAllPurchases() {
		List<GogumaPurchase> purchases = gogumaPurchaseService.selectAllPurchases();
		
		return ResponseEntity.ok(purchases);
	}

//	GET : /api/gogumapurchase/{id}
	@GetMapping("/{id}")
	public ResponseEntity<GogumaPurchase> selectPurchaseById(@PathVariable Long id) {
		GogumaPurchase purchase = gogumaPurchaseService.selectPurchaseById(id);
		
		return ResponseEntity.ok(purchase);
	}
	
// POST : /api/gogumapurchase -> 새로운 구매 기록 생성
	@PostMapping
	public ResponseEntity<GogumaPurchase> insertPurchase(@RequestBody GogumaPurchase purchase) {
		GogumaPurchase savedPurchase = gogumaPurchaseService.insertPurchase(purchase);
		
		return ResponseEntity.ok(savedPurchase);
	}
}
