
package com.gk.service;

import com.gk.entity.area.*;

import java.util.List;

public interface CommonService 
{	
	
	Integer                          queryNationId(String name);
	List<AreaNation>                 queryAreaNation();
	List<AreaProvince>               queryAreaProvince(Integer fatherId);
	List<AreaCity> queryAreaCity(Integer fatherId);
	List<AreaCounty>                 queryAreaCounty(Integer fatherId);
	AreaNation                       queryAreaNationById(Integer id);
	AreaProvince                     queryAreaProvinceById(Integer id);
	AreaCity                         queryAreaCityById(Integer id);
	List<AreaProvince>               queryAllAreaProvince();
	List<AreaCity>                   queryAllAreaCity();
	List<AreaCounty>                 queryAllAreaCounty();
	//ViewAreaInfo queryViewAreaInfo(Integer id);
	AreaCounty                       queryAreaCountyById(Integer id);

}