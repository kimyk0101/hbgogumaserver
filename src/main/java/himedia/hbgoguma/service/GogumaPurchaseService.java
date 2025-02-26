package himedia.hbgoguma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.hbgoguma.mappers.GogumaPurchaseMapper;
import himedia.hbgoguma.repository.vo.GogumaPurchase;

@Service
public class GogumaPurchaseService {
	@Autowired
	private GogumaPurchaseMapper gogumaPurchaseMapper;
	
	public List<GogumaPurchase> selectAllPurchases() {
		List<GogumaPurchase> purchases = gogumaPurchaseMapper.selectAllPurchases();
		
		return purchases;
	}
	
	public GogumaPurchase selectPurchaseById(Long id) {
		GogumaPurchase purchase = gogumaPurchaseMapper.selectPurchaseById(id);
		
		return purchase;
	}
	
	public GogumaPurchase insertPurchase(GogumaPurchase purchase) {
		gogumaPurchaseMapper.insertPurchase(purchase);
		
		Long id = purchase.getId();
		
		return gogumaPurchaseMapper.selectPurchaseById(id);
	}
	
	public GogumaPurchase updatePurchase(GogumaPurchase purchase) {
		gogumaPurchaseMapper.updatePurchase(purchase);
		
		return purchase;
	}
	
	public int deletePurchase(Long id) {
		return gogumaPurchaseMapper.deletePurchase(id);
	}
}
