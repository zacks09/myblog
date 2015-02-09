package com.blog.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.util.CommonDao;
import com.blog.util.Page;

@Service(value = "userService")
public class UserService implements BaseServiceInf {

	@Autowired
	private CommonDao commonDao;
	
	public <T> T getEntity(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T getEntity(int ssid, long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> List<T> getList(Map<String, Object> param) {
		return commonDao.getList("user.queryCondition", param);
	}

	public <T> List<T> getList(Map<String, Object> param, int pageNo,
			int pageSize, String order) {
		return commonDao.getList("user.queryCondition", param);
	}

	public Page<?> getList(Page<?> page) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getCount(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T> void add(T entity) {
		// TODO Auto-generated method stub

	}

	public <T> void save(T entity) {
		// TODO Auto-generated method stub

	}

	public <T> void saveAll(T entity) {
		// TODO Auto-generated method stub

	}

	public <T> void delete(T entity) {
		// TODO Auto-generated method stub

	}

	public void deletes(Map<String, Object> map) {
		// TODO Auto-generated method stub

	}

	public void deletes(int ssid, long[] id) {
		// TODO Auto-generated method stub

	}

}
