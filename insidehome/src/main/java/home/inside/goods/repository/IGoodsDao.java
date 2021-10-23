package home.inside.goods.repository;

import java.util.HashMap;
import java.util.List;

import home.inside.goods.vo.GoodsVo;

public interface IGoodsDao {
	
	public void insert(GoodsVo goodsVo) throws Exception;
	public void update(GoodsVo goodsVo) throws Exception;
	public void updateHeart(HashMap<String, String> hm) throws Exception;
	public void deleteGoods(String goodsCode) throws Exception;
	public List<GoodsVo> selectAll(String type) throws Exception;
	public GoodsVo selectOne(String goodsCode) throws Exception;
	public void updateStock(String goodsCode) throws Exception;
	
}