package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.services.DptoService;

/**
 * Este servlet tiene la funcion de recoger una lista de Departamentos.
 * 
 * @author alexander
 *
 */
public class ListarDepartamentosServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		DptoService dptosService = new DptoService();
		req.setAttribute("departamentos", dptosService.getDepartments());
		req.getRequestDispatcher("emplesPorDepartamento.jsp")
				.forward(req, resp);
	}
}