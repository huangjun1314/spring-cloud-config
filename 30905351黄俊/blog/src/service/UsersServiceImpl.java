package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UsersDao;

import entity.Blog;
import entity.Users;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	
	@Resource
	private UsersDao usersDao;
	
	@Override
	public List<Users> getAllUsers(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return usersDao.getAllUsers((pageNum-1)*pageSize, pageSize);
	}
	
	@Override
	public Users findUser(String username, String password) {
		// TODO Auto-generated method stub
		
		Users user=usersDao.findUserByUsername(username, password);
		if (user!=null&&user.getUsername().equals(username)&&user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public int getAllCount() {
		// TODO Auto-generated method stub
		return usersDao.getCount();
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return usersDao.deleteById(id);
	}

	@Override
	public int addUser(Users user) {
		// TODO Auto-generated method stub
		return usersDao.addUser(user);
	}

	@Override
	public List<Blog> getAllBlog(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		return usersDao.getAllBlog((pageNum-1)*pageSize, pageSize);
	}

	@Override
	public int deleteblog(Integer id) {
		// TODO Auto-generated method stub
		return usersDao.deleteblog(id);
	}

	@Override
	public int addBlog(Blog blog) {
		// TODO Auto-generated method stub
		return usersDao.addBlog(blog);
	}

	

}
