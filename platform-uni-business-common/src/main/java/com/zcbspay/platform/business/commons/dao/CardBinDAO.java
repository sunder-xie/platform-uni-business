/* 
 * CardBindDAO.java  
 * 
 * version TODO
 *
 * 2016年6月22日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zcbspay.platform.business.commons.dao;


import com.zcbspay.platform.business.commons.bean.CardBin;
import com.zcbspay.platform.business.pojo.PojoCardBin;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年6月22日 下午4:17:26
 * @since 
 */
public interface CardBinDAO extends BaseDAO<PojoCardBin>{
	/****
	 * 根据卡号查询卡BIN
	 * @param cardNo
	 * @return
	 */
   public CardBin getCard(String cardNo);
	
}
