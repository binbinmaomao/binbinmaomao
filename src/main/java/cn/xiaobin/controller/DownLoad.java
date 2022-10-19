package cn.xiaobin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class DownLoad {
	
	@RequestMapping("/download/sun")
	public String  downLoad(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//改修
		String path= request.getServletContext().getRealPath("/file/sunxiaobin.png");
		//String path = "C:\\workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\springDay09\\file\\sunxiabin.png";
		//String path = request.getRequestURL().toString();
		//String path = request.getSession().getServletContext().getRealPath("file/sunxiabin.png");
		System.out.println(path);
		File file = new File(path);
		String fileName = file.getName();
		response.setHeader("Content-disposition", "attachment;filename="+ fileName );
		//URLEncoder.encode(fileName, "UTF‐8"));
		InputStream in = new FileInputStream(path);//获取文件输入流
		int len = 0;
		byte[] buffer = new byte[1024];
		OutputStream out = response.getOutputStream();
		while ((len = in.read(buffer)) > 0) {
			out.write(buffer,0,len);//将缓冲区的数据输出到客户端浏览器
		}
		in.close();
		return null;
	}
	
	 @RequestMapping(value = "/testUpload", method = RequestMethod.POST)
	public String testUpload(@RequestParam(value = "desc", required = false) String desc, @RequestParam("file") MultipartFile multipartFile) throws IOException {
	   System.out.println("desc : " + desc);
	   System.out.println("OriginalFilename : " + multipartFile.getOriginalFilename());
	   //multipartFile.transferTo(new File("D:\\file\\"+multipartFile.getOriginalFilename()));
	   
	   String path ="C:\\tmp\\"+multipartFile.getOriginalFilename();
	   File file = new File(path);
	   multipartFile.transferTo(file);
	 
	 	return "/sucess"; //增加成功页面: /views/success.jsp
	 }

}
