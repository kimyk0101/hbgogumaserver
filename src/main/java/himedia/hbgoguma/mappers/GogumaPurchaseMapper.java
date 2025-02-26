package himedia.hbgoguma.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import himedia.hbgoguma.repository.vo.GogumaPurchase;

@Mapper
public interface GogumaPurchaseMapper {
//	<select id="selectAllPurchases" resultType="GogumaPurchase">
	List<GogumaPurchase> selectAllPurchases();
//	<insert id="insertPurchase" parameterType="GogumaPurchase">
	int insertPurchase(GogumaPurchase purchase);
//	<select id="selectPurchaseById" parameterType="Long" resultType="GogumaPurchase">
	GogumaPurchase selectPurchaseById(Long id);
//	<update id="updatePurchase" parameterType="GogumaPurchase">
	int updatePurchase(GogumaPurchase purchase);
//	<delete id="deletePurchase" parameterType="Long">
	int deletePurchase(Long id);
}
