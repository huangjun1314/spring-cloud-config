package controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import entity.Blog;
import entity.Users;

import service.UsersService;

@Controller
public class ProjectController {
	
	@Resource
	private UsersService usersService;
	
	@RequestMapping("/login")
	public String login(@RequestParam("username")String username,
			@RequestParam("password")String password){
		Users user=usersService.findUser(username, password);
		if (user!=null) {
			return "redirect:/view";
		}
		return "index";
	}
	
	@RequestMapping("/view")
	public String view(@RequestParam("num")Integer num,HttpServletRequest request){
		int pageNum=1;
		int pageSize=5;
		int count=usersService.getAllCount();
		int total=count%pageSize==0?count/pageSize:count/pageSize+1;
		if (num!=null) {
			pageNum=num;
			if (num>=total) {
				pageNum=total;
			} else if(num<=0){
				pageNum=1;
			}
		}
		
		request.setAttribute("usersList", usersService.getAllUsers(pageNum, pageSize));
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("count", count);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("total", total);
		return "view";
	}
	
	
	
	@RequestMapping("/delete")
	public int delete(@RequestParam("id")String id){
		int count=usersService.deleteById(Integer.valueOf(id));
		return count;
	}
	
	@RequestMapping("/addview")
	public String addview(){
		return "addview";
	}
	
	@RequestMapping("/addsaveview")
	public String addsaveview(Users user,@RequestParam("picpath")MultipartFile attach,
			HttpServletRequest request){
		String picpath=null;
		if (!attach.isEmpty()) {
			String path=request.getSession().getServletContext().getRealPath("images");
			String fileOldName=attach.getOriginalFilename();
			String prefix=FilenameUtils.getExtension(fileOldName);
			
			if (prefix.equalsIgnoreCase("jpg")) {
				String fileName=UUID.randomUUID()+"."+prefix;
				File file=new File(path,fileName);
				if (file.exists()) {
					file.mkdirs();
				}
				try {
					attach.transferTo(file);
				}catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				picpath=request.getContextPath()+"/images/"+fileName;
			}
			
		}
		
		user.setPicpath(picpath);
		if (usersService.addUser(user)>0) {
			return "redirect:/view";
		} else {
			return addview();
		}
	}
	
	
	@RequestMapping("/blogview")
	public String blog(@RequestParam("num")Integer num,HttpServletRequest request){
		int pageNum=1;
		int pageSize=5;
		int count=usersService.getAllCount();
		int total=count%pageSize==0?count/pageSize:count/pageSize+1;
		if (num!=null) {
			pageNum=num;
			if (num>=total) {
				pageNum=total;
			} else if(num<=0){
				pageNum=1;
			}
		}
		
		request.setAttribute("blogList", usersService.getAllBlog(pageNum, pageSize));
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("count", count);
		request.setAttribute("pageSize", pageSize);
		request.setAttribute("total", total);
		return "blogview";
	}
	
	
	@RequestMapping("/deleteblog")
	public int deleteblog(@RequestParam("id")String id){
		int count=usersService.deleteblog(Integer.valueOf(id));
		return count;
	}
	
	@RequestMapping("/addblogview")
	public String addblogview(){
		return "addblogview";
	}
	
	@RequestMapping("/addsaveblogview")
	public String addsaveview(Blog blog,
			HttpServletRequest request){
		blog.setPublishtime(new Date());
		blog.setUserid(1);
		if (usersService.addBlog(blog)>0) {
			return "redirect:/blogview";
		} else {
			return addblogview();
		}
	}
	
	
}
