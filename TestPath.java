package spring5.底层原理;
/*
 * java获取文件路径的方法
 * 路径中含有中文如何解码
 * 
 * 
 * */

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Test;

public class TestPath {
	@Test
	public void getPathMethod() {

//		String path = this.getClass().getResource("bean2.xml").getPath();
		String path = TestPath.class.getResource("bean2.xml").getPath();
		System.out.println(path);		

	}
	@Test
	public void getPathMethod01() {
		String path = TestPath.class.getClassLoader().getResource("bean3.xml").getPath();
		System.out.println(path);
	}
	

	@Test
	public void getPathMethod02(){
		URL url= TestPath.class.getResource("");//获取此类所在的包的绝对路径
		String p = url.getPath();
		System.out.println("方法二路径："+p);
		try {
			System.out.println("方法二解码路径："+URLDecoder.decode(p, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void getPathMethod03(){
		URL url= TestPath.class.getResource("/");//获取工程的bin目录的绝对路径
		String p = url.getPath();
		System.out.println("方法三路径："+p);
		try {
			System.out.println("方法三解码路径："+URLDecoder.decode(p, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getPathMethod04(){
		try {
			URI uri = TestPath.class.getResource("/").toURI();//获取工程的bin目录的绝对路径
			String p = uri.getPath();
			System.out.println("方法四路径："+p);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}







}
