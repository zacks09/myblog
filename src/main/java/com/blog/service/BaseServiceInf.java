package com.blog.service;


import java.util.List;
import java.util.Map;

import com.blog.util.Page;

/**
 * 基础服务层接口
 * @author Johm
 *
 */
public interface BaseServiceInf {
	/**
	 * 根据主键查询实体对象
	 * @param map 要查询的key的K/V对组合
	 * @return
	 */
	public <T> T getEntity(Map<String,Object> map);

	/**
	 * 根据主键查询实体对象
	 * @param map 要查询的key的K/V对组合
	 * @return
	 */
	public <T> T getEntity(int ssid,long id);	

	/**
	 * 根据动态查询条件查询出列表
	 * @param param 要查询的多个K/V对组合
	 * @return
	 */
	public <T> List<T> getList(Map<String,Object> param);

	/**
	 * 根据动态查询条件分页查询出列表
	 * @param param 要查询的多个K/V对组合
	 * @param pageStart 起始页
	 * @param pageSize  页大小
	 * @param order     排序字符串
	 * @return
	 */
	public <T> List<T> getList(Map<String,Object> param,int pageNo,int pageSize,String order);	

	/**
	 * 根据动态查询条件分页查询出列表
	 * @param page 含有（要查询的多个K/V对组合，页号，页大小，排序字符串）
	 * @return
	 */
	public Page<?> getList(Page<?> page);	
	
	
	/**
	 * 根据动态查询条件的行数
	 * @param param 要查询的多个K/V对组合
	 * @return
	 */
	public long getCount(Map<String,Object> param);

	
	/**
	 * 增加
	 * @param entity
	 */
	public <T> void add(T entity);
	
	/**
	 * 保存
	 * @param entity
	 */
	public <T> void save(T entity);

	/**
	 * 保存
	 * @param entity
	 */
	public <T> void saveAll(T entity);
	
	/**
	 * 删除
	 * @param entity
	 */
	public <T> void delete(T entity);


	/**
	 * 批量删除
	 * @param map
	 */
	public void deletes(Map<String,Object> map);
	
	/**
	 * 批量删除
	 * @param map
	 */
	public void deletes(int ssid,long[] id);	
}






