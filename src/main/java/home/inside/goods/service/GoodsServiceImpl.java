package home.inside.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.inside.goods.repository.IGoodsDao;
import home.inside.goods.repository.IGoodsImageDao;
import home.inside.goods.repository.IGoodsSalesDao;
import home.inside.goods.vo.GoodsImageVo;
import home.inside.goods.vo.GoodsSalesVo;
import home.inside.goods.vo.GoodsVo;

@Service
public class GoodsServiceImpl implements IGoodsService {
	@Autowired
	private IGoodsDao goodsDao;
	@Autowired
	private IGoodsImageDao goodsImageDao;
	@Autowired
	private IGoodsSalesDao goodsSalesDao;
	
	@Override
	public void insert(GoodsVo goodsVo, GoodsImageVo goodsImageVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GoodsVo goodsVo, GoodsImageVo goodsImageVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateHeart(String type, String goodsCode) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGoods(String goodsCode) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<GoodsVo> selectAll(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsVo> selectAllImage(String type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodsVo selectOne(String goodsCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertGoodsSales(GoodsSalesVo goodsSalesVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGoodsSales(String nickname) throws Exception {
		// TODO Auto-generated method stub

	}

}
