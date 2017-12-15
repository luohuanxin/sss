package com.lxit.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.bean.DataDictionary;
import com.lxit.dao.DataDictionaryDao;


/*@Service("DataDictionaryService")*/
@WebService
public class DataDictionaryServiceImpl implements DataDictionaryService{
	
	@Autowired
	DataDictionaryDao dataDictionaryDao;
	
	/*@Autowired
	DataDictionaryServiceTwo dataDictionaryServiceTwoImpl;*/
	
	@Override
	public List<DataDictionary> webQuery(String dataCode) {
	/*	System.out.println("dataDictionaryServiceTwoImpl:-->"+dataDictionaryServiceTwoImpl);
		System.out.println("dataDictionaryDao:->>>"+dataDictionaryDao);
		System.out.println(dataCode);*/
		/*List<DataDictionary> list1 = dataDictionaryServiceTwoImpl.webQuery(dataCode);*/
	/*	System.out.println("---l;>"+list1);
		for (DataDictionary dataDictionary : list1) {
			System.out.println("dataDictionary"+dataDictionary);
		}*/
		List<DataDictionary> list = dataDictionaryDao.webQuery(dataCode);
		return list;
	}

	@Override
	public boolean webInsertDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryDao.webInsertDataDictionary(dataDictionary)>0?true:false;
	}

	@Override
	public boolean webdeleteDataDictionary(int dataId) {
		return dataDictionaryDao.webdeleteDataDictionary(dataId)>0?true:false;
	}

	@Override
	public DataDictionary webdataDictionId(int dataId) {
		return dataDictionaryDao.webdataDictionId(dataId);
	}

	@Override
	public boolean webupdatDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryDao.webupdatDataDictionary(dataDictionary)>0?true:false;
	}


	@Override
	public List<DataDictionary> webSelectData(Map<String, Object> map) {
		return dataDictionaryDao.webSelectData(map);
	}


	@Override
	public int webSelectCountdata(Map<String, Object> map) {
		return dataDictionaryDao.webSelectCountdata(map);
	}

	
	
}
