package com.lxit.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.bean.DataDictionary;


@MapperScan
public interface DataDictionaryDao {
	public List<DataDictionary> webQuery(String dataCode);
	
	/**
	 * 查询�?�?
	 * @return
	 */
	public List<DataDictionary> webSelectData(Map<String, Object>map);
	
	/**
	 * 查询总条�?
	 * @param map
	 * @return
	 */
	public int webSelectCountdata(Map<String, Object>map);
	
	/**
	 * 增加
	 * @param dataDictionary
	 * @return
	 */
	int webInsertDataDictionary(DataDictionary dataDictionary);
	
	/**
	 * 删除
	 * @param dataId
	 * @return
	 */
	int webdeleteDataDictionary(int dataId);
	
	/**
	 * 按照id查询
	 * @param dataId
	 * @return
	 */
	public DataDictionary webdataDictionId(int dataId);
	
	/**
	 * 修改
	 * @param dataDictionary
	 * @return
	 */
	int webupdatDataDictionary(DataDictionary dataDictionary);
}
