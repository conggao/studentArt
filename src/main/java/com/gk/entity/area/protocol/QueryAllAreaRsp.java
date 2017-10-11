package com.gk.entity.area.protocol;

import com.gk.entity.area.AreaInfo;

import java.util.List;



public class QueryAllAreaRsp implements java.io.Serializable
{
	private List<AreaInfo>  listAreaProvince;
	private List<AreaInfo>  listCity;
	private List<AreaInfo>  listAreaCounty;
	
	public List<AreaInfo> getListAreaProvince() {
		return listAreaProvince;
	}
	public void setListAreaProvince(List<AreaInfo> listAreaProvince) {
		this.listAreaProvince = listAreaProvince;
	}
	public List<AreaInfo> getListCity() {
		return listCity;
	}
	public void setListCity(List<AreaInfo> listCity) {
		this.listCity = listCity;
	}
	public List<AreaInfo> getListAreaCounty() {
		return listAreaCounty;
	}
	public void setListAreaCounty(List<AreaInfo> listAreaCounty) {
		this.listAreaCounty = listAreaCounty;
	}
	
	
	
	
}