package pe.company.ws;

import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;

import pe.company.dao.EmpresaDAO;
import pe.company.model.Empresa;
import pe.company.ws.security.WSSecurityInterceptor;

@InInterceptors(classes = WSSecurityInterceptor.class)
@WebService(targetNamespace = "http://ws.company.pe/", endpointInterface = "pe.company.ws.EmpresaWSInterface", portName = "EmpresaWSPort", serviceName = "EmpresaWSService")
public class EmpresaWS implements EmpresaWSInterface {

	EmpresaDAO empresaDAO = new EmpresaDAO();

	public List<Empresa> listarEmpresas(int limite) {
		List<Empresa> lista = empresaDAO.getList();
		return lista.stream().limit(limite).collect(Collectors.toList());
	}
}