package home.inside.goods.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.goods.vo.GoodsImageVo;

@Repository
public class GoodsImageDaoImpl implements IGoodsImageDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insert(GoodsImageVo goodsImageVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGoodsImage(String goodsCode) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> selectImage(String goodsCode) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> selectImage() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
