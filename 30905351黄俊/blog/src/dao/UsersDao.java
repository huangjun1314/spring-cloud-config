package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Blog;
import entity.Users;

public interface UsersDao {
	
	
	List<Users> getAllUsers(@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);
	
	Users findUserByUsername(@Param("username")String username,@Param("password")String password);
	
	int getCount();
	
	int deleteById(@Param("id")Integer id);
	
	int addUser(Users user);
	
	List<Blog> getAllBlog(@Param("pageNum")Integer pageNum,@Param("pageSize")Integer pageSize);
	
	int deleteblog(@Param("id")Integer id);
	
	int addBlog(Blog blog);
	
}
