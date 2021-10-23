package home.inside.goods.repository;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.goods.vo.GoodsVo;

@Repository
public class GoodsDaoImpl implements IGoodsDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insert(GoodsVo goodsVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(GoodsVo goodsVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateHeart(HashMap<String, String> hm) throws Exception {
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
	public GoodsVo selectOne(String goodsCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStock(String goodsCode) throws Exception {
		// TODO Auto-generated method stub

	}

}
