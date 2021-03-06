package com.dfs.api.entity.common;

import java.io.Serializable;

import com.dfs.api.core.entity.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 数据来源表实体
 * 
 * @author Ming
 * @date 2018-11-13
 */
@ApiModel(value="DataSourceEntity",description="数据来源表实体")
public class DataSourceEntity extends Entity implements Serializable {

	/** SerialVersionUID */
	private static final long serialVersionUID = 1L;

	/** 名称 */
	@ApiModelProperty("名称")
	private String name;

	/** 名称(英文) */
	@ApiModelProperty("名称(英文)")
	private String nameEn;

	/**
	 * 取得名称
	 * 
	 * @return 名称
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设定名称
	 * 
	 * @param name 名称
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 取得名称(英文)
	 * 
	 * @return 名称(英文)
	 */
	public String getNameEn() {
		return nameEn;
	}

	/**
	 * 设定名称(英文)
	 * 
	 * @param nameEn 名称(英文)
	 */
	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	/**
	 * 取得数据来源表实体字符串
	 * 
	 * @return 数据来源表实体字符串
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", nameEn=").append(nameEn);
		sb.append("]");
		return sb.toString();
	}
}