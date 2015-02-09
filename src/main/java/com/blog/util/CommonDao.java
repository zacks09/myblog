package com.blog.util;

import java.util.List;

import javax.annotation.PostConstruct;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


/**
 * Mybitis的Map调用工具
 * @author John
 *
 */
@Repository("commonDao")
public class CommonDao extends SqlSessionDaoSupport {
	private static CommonDao dao;
	
	
	@PostConstruct
	public void init(){
		dao = this;
	}
	
	public static CommonDao getImpl(){
		return dao;
	}
	
	/**
	 * 保存对象
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @param obj: 需要保存的对象
	 */
	public void save(String key, Object obj) {
		super.getSqlSession().update(key, obj);
	}

	/**
	 * 增加实体
	 * @param key
	 * @param obj
	 * @return
	 */
	public void add(String key, Object obj) {
		super.getSqlSession().insert(key, obj);
	}
	
	/**
	 * 删除对象
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @param obj：需要删除的对象
	 */
	public void delete(String key, Object obj) {
		super.getSqlSession().delete(key, obj);
	}

	/**
	 * 根据参数取出对象
	 * @param <T>：返回的对象类型
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @param params：Mybatis Mapper中的需入的参数
	 * @return
	 */
	public <T> T get(String key, Object params) {
		return super.getSqlSession().selectOne(key, params);
	}

	/**
	 * 取出对象列表
	 * @param <T>：返回的对象类型
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @return
	 */
	public <T> List<T> getList(String key) {
		return super.getSqlSession().selectList(key);
	}

	/**
	 * 根据参数取出对象列表
	 * @param <T>：返回的对象类型
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @param params：Mybatis Mapper中的需入的参数
	 * @return
	 */
	public <T> List<T> getList(String key, Object params) {
		return super.getSqlSession().selectList(key, params);
	}

	/**
	 * 根据参数取出对象列表
	 * @param <T>：返回的对象类型
	 * @param key: Mybatis Mapper中的标识（namespace.id）
	 * @param params：Mybatis Mapper中的需入的参数
	 * @return
	 */
	public long getListCount(String key, Object params) {
		return super.getSqlSession().selectOne(key, params);
	}	
}
