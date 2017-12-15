package com.lxit.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.lxit.bean.DataDictionary;



@WebService
public interface DataDictionaryService {
	public List<DataDictionary> webQuery(String dataCode);
	
	public List<DataDictionary> webSelectData(Map<String, Object>map);
	public int webSelectCountdata(Map<String, Object>map);
	
	
	boolean webInsertDataDictionary(DataDictionary dataDictionary);
	
	boolean webdeleteDataDictionary(int dataId);
	
	
	public DataDictionary webdataDictionId(int dataId);
	
	/**
	 * 修改
	 * @param dataDictionary
	 * @return
	 */
	boolean webupdatDataDictionary(DataDictionary dataDictionary);
}
