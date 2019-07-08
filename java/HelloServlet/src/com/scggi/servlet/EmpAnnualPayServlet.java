package com.scggi.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scggi.vo.AnnualBonus;

/**
 * Servlet implementation class EmpAnnualPayServlet
 */
@WebServlet("/EmpAnnualPayServlet")
public class EmpAnnualPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpAnnualPayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bonusYear = request.getParameter("bonusYear");
		String query = "SELECT A.EMP_NM, B.BONUS_CD, C.DET_NM, TRIM(TO_CHAR(B.BONUS_AMT,'9,999,999,999')) BONUS_AMT\r\n" + 
					   "  FROM EMP A INNER JOIN ( SELECT A.EMP_NO, A.BONUS_CD, SUM(A.BONUS_AMT) BONUS_AMT\r\n" + 
					   "                                    FROM EMP_BONUS A\r\n" + 
					   "                                   WHERE A.BONUS_YYYY = "+ "'" +bonusYear + "'" +
					   "                                  GROUP BY A.EMP_NO, A.BONUS_CD ) B ON A.EMP_NO = B.EMP_NO\r\n" + 
				   	   "       INNER JOIN CODE_DET C ON B.BONUS_CD = C.DET_CD AND C.MST_CD = '00002'\r\n" + 
					   "ORDER BY A.EMP_NM";
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "BOOK", "BOOK");
	        PreparedStatement statement = con.prepareStatement(query);
	        ResultSet rs = statement.executeQuery();
	        List<AnnualBonus> list = new ArrayList<AnnualBonus>();
	        while(rs.next()) {
	        	AnnualBonus ab = new AnnualBonus();
	        	ab.setEmpNm(rs.getString("EMP_NM"));
	        	ab.setBonusCd(rs.getString("BONUS_CD"));
	        	ab.setDetNm(rs.getString("DET_NM"));
	        	ab.setBonusAmt(rs.getString("BONUS_AMT"));
	        	list.add(ab);
	        }
	        request.setAttribute("result", list);
		}catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("jsp/annualBonus.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
