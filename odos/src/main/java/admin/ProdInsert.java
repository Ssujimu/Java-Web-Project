package admin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CategoryDAO;
import dto.CategoryDTO;

public class ProdInsert implements AdminService {

	// μν μΆκ°
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		ArrayList<CategoryDTO> list = new CategoryDAO().list();
		request.setAttribute("category", list);
		
		request.setAttribute("content", "../adminPage/productInsert.jsp");
	}
}