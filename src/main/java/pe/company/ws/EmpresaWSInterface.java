package pe.company.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import pe.company.model.Empresa;

@WebService(name = "EmpresaWSInterface", targetNamespace = "http://ws.company.pe/")
public interface EmpresaWSInterface {

	@WebMethod(operationName = "listarEmpresas", action = "urn:ListarEmpresas")
	@RequestWrapper(className = "pe.company.ws.jaxws.ListarEmpresas", localName = "listarEmpresas", targetNamespace = "http://ws.company.pe/")
	@ResponseWrapper(className = "pe.company.ws.jaxws.ListarEmpresasResponse", localName = "listarEmpresasResponse", targetNamespace = "http://ws.company.pe/")
	@WebResult(name = "return")
	List<Empresa> listarEmpresas(@WebParam(name = "arg0") int limite);

}