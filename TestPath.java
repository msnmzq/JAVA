package spring5.�ײ�ԭ��;
/*
 * java��ȡ�ļ�·���ķ���
 * ·���к���������ν���
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
		URL url= TestPath.class.getResource("");//��ȡ�������ڵİ��ľ���·��
		String p = url.getPath();
		System.out.println("������·����"+p);
		try {
			System.out.println("����������·����"+URLDecoder.decode(p, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void getPathMethod03(){
		URL url= TestPath.class.getResource("/");//��ȡ���̵�binĿ¼�ľ���·��
		String p = url.getPath();
		System.out.println("������·����"+p);
		try {
			System.out.println("����������·����"+URLDecoder.decode(p, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getPathMethod04(){
		try {
			URI uri = TestPath.class.getResource("/").toURI();//��ȡ���̵�binĿ¼�ľ���·��
			String p = uri.getPath();
			System.out.println("������·����"+p);
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}







}
