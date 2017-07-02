/**
 * 
 */
package com.veera.service;

import com.veera.dao.DBDao;
import com.veera.model.DBDatas;

/**
 * @author Cholan
 *
 */
public class DBService {

	DBDao daoObj;

	public boolean getStatus(DBDatas dbObj) throws Exception {
		return(daoObj.getStatus(dbObj));
	}

}
