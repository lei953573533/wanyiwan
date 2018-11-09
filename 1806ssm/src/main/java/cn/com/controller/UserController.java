package cn.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.pojo.User;
import cn.com.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
	@RequestMapping("/insert/{name}/{birthday}/{address}")
	public String insert(User user){
		try {
			userService.insert(user);
			return "save ok";
		} catch (Exception e) {
			e.printStackTrace();
			return "save error";
		}
	}
}
