package com.example.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "FormServlet", urlPatterns = "/servlet/form")
//사용자에게 회원가입 페이지를 보내주는 서블릿
public class FormServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//응답 메세지 만들기
		resp.setContentType("text/html"); // 데이터타입 입력 문자열인지 List인지 , html인지
		
		resp.setCharacterEncoding("utf-8");//한글
		
		//html 내용 작성
		PrintWriter w = resp.getWriter();
        w.write("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "<form action=\"/servlet/save\" method=\"post\">\n" +
                "    이름: <input type=\"text\" name=\"username\" />\n" +
                "    암호: <input type=\"text\" name=\"password\" />\n" +
                "    <button type=\"submit\">전송</button>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>\n");
	}
	
	
}
