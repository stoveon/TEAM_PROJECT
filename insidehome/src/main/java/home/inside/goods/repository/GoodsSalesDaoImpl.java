package home.inside.goods.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import home.inside.goods.vo.GoodsSalesVo;

@Repository
public class GoodsSalesDaoImpl implements IGoodsSalesDao {
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertGoodsSales(GoodsSalesVo goodsSalesVo) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteGoodsSales(String nickname) throws Exception {
		// TODO Auto-generated method stub

	}

}