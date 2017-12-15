package com.lxit.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import com.lxit.service.DataDictionaryService;
import com.lxit.service.WeatherService;

public class TestMian {
	public static void main(String[] args) throws Exception {
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setServiceClass(DataDictionaryService.class);
		bean.setAddress("http://localhost:8080/WebServices/services/getWeather?wsdl");
		DataDictionaryService service = (DataDictionaryService) bean.create();
		DataDictionary ddd = new DataDictionary();
		ddd.setDataCode("sssssss");
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		ddd.setDataCreateTime(time);
		System.out.println(service.webInsertDataDictionary(ddd));
		
		//调用别人的借口
		/*JaxWsDynamicClientFactory factory=JaxWsDynamicClientFactory.newInstance();
		Client client=factory.createClient("http://localhost:8080/WebServices/services/getWeather?wsdl");
		Object[] obj=client.invoke("webQuery", "client_state");
		System.out.println(obj[0]);*/
	}
}
