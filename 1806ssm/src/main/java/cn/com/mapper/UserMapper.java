package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;


import cn.com.pojo.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> findAll();
	
	@Insert("insert into user (name,birthday,address) values(#{name},#{birthday},#{address})")
	public void insert(User user);
}
