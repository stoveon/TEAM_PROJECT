package home.inside.goods.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import home.inside.common.service.IPointService;
import home.inside.common.util.FileUtil;
import home.inside.goods.service.IGoodsService;
import home.inside.goods.vo.GoodsSalesVo;
import home.inside.goods.vo.GoodsVo;

//세션이름: loginInside
//pointVo에 담아서 보내면 됨.
@Controller
public class GoodsController {
	@Autowired
	private IGoodsService goodsService;
	@Autowired
	private IPointService pointService;
	@Autowired
	private FileUtil util;
	
	@RequestMapping(value="manager/goods/insertGoods.do", method = RequestMethod.GET)
	public String insertGoodsForm() {
		
		return "manager/goods/insertForm";
	}
	
	@RequestMapping(value="manager/goods/insertGoods.do", method = RequestMethod.POST)
	public String insertGoodsSubmit(GoodsVo goodsVo, MultipartHttpServletRequest mpReq) {
		Map<String, Object> hm = util.goodsFileUpload(mpReq);
		
		goodsVo.setGoodsCode((String) hm.get("goodsCode"));
		//goodsService.insert(goodsVo, goodsImageVo);
		return "manager/goods/list";
	}
	
	@RequestMapping(value="manager/goods/updateGoods.do", method = RequestMethod.GET)
	public String updateGoodsForm(GoodsVo goodsVo, MultipartHttpServletRequest mpReq) {
		
		return "manager/goods/updateForm";
	}
	
	@RequestMapping(value="manager/goods/updateGoods.do", method = RequestMethod.POST)
	public String updateGoodsForm(String goodsCodes, Model model) {
		
		return "manager/goods/updateForm";
	}
	
	@RequestMapping(value="manager/goods/updateGoods.do", method = RequestMethod.POST)
	public String updateGoodsSubmit(GoodsVo goodsVo, MultipartHttpServletRequest mpReq) {
		
		return "manager/goods/list";
	}
	
	//관리자
	@RequestMapping(value="")
	public String editGoodsList(String type, Model model, String[] goodsCodes) {
		
		return "";
	}
	
	@RequestMapping(value="")
	public String selectGoodsList(String type, Model model, HttpSession session) {
		
		return "";
	}
	
	@RequestMapping(value="")
	public String selectGoodsDetail(String goodsCode, Model model) {
		
		return "";
	}
	
	@RequestMapping(value="")
	public String orderGoodsForm(String goodsCode, Model model, HttpSession session) {
		
		return "";
	}
	
	@RequestMapping(value="")
	public String orderGoodsSubmit(GoodsSalesVo goodsSalesVo) {
		
		return "";
	}
}
