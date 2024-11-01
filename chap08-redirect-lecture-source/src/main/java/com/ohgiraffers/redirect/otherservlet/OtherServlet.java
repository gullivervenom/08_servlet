package com.ohgiraffers.redirect.otherservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청 정상 수락");

        // 비즈니스 로직 수행 구역(고객의 요청을 데이터데이스에 추가하는 로직)
        Logic logic = new Logic();
        logic.registData();

        resp.sendRedirect("redirect?name=cho&age=20");


    }
}
