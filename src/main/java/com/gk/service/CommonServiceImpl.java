/*
package com.gk.service;


import com.entity.area.ViewAreaInfo;
import com.gk.entity.area.AreaCity;
import com.gk.entity.area.AreaCounty;
import com.gk.entity.area.AreaNation;
import com.gk.entity.area.AreaProvince;

import java.util.List;

public class CommonServiceImpl implements CommonService {

	private CommonDAO   commonDAO;
	
	public CommonDAO getCommonDAO() {
		return commonDAO;
	}
	public void setCommonDAO(CommonDAO commonDAO) {
		this.commonDAO = commonDAO;
	}
	
	@Override
	public Integer queryNationId(String name) {
		return commonDAO.queryNationId(name);
	}
	@Override
	public List<AreaNation> queryAreaNation() {
		return commonDAO.queryAreaNation();
	}
	@Override
	public List<AreaProvince> queryAreaProvince(Integer fatherId) {
		return commonDAO.queryAreaProvince(fatherId);
	}
	@Override
	public List<AreaCity> queryAreaCity(Integer fatherId) {
		return commonDAO.queryAreaCity(fatherId);
	}
	@Override
	public List<AreaCounty> queryAreaCounty(Integer fatherId) {
		return commonDAO.queryAreaCounty(fatherId);
	}


	@Override
	public AreaNation queryAreaNationById(Integer id) {
		return commonDAO.queryAreaNationById(id);
	}
	@Override
	public AreaProvince queryAreaProvinceById(Integer id) {
		return commonDAO.queryAreaProvinceById(id);
	}
	@Override
	public AreaCity queryAreaCityById(Integer id) {
		return commonDAO.queryAreaCityById(id);
	}

	@Override
	public List<AreaProvince> queryAllAreaProvince() {
		return commonDAO.queryAllAreaProvince();
	}

	@Override
	public List<AreaCity> queryAllAreaCity() {
		return commonDAO.queryAllAreaCity();
	}

	@Override
	public List<AreaCounty> queryAllAreaCounty() {
		return commonDAO.queryAllAreaCounty();
	}
	@Override
	public ViewAreaInfo queryViewAreaInfo(Integer id) {
		return commonDAO.queryViewAreaInfo(id);
	}
	@Override
	public AreaCounty queryAreaCountyById(Integer id) {
		return commonDAO.queryAreaCountyById(id);
	}
	
}
*/
