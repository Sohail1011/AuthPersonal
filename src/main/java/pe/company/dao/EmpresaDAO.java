package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.company.db.Conector;
import pe.company.model.Empresa;

public class EmpresaDAO {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;

	public List<Empresa> getList() {
		List<Empresa> lista = new ArrayList<>();

		try {
			conn = Conector.getConnection();
			ps = conn.prepareStatement("select * from empresa;");
			rs = ps.executeQuery();

			while (rs.next()) {
				Empresa empresa = new Empresa(rs.getInt("id_empresa"), rs.getString("nombre"), rs.getString("pais"));
				lista.add(empresa);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return lista;
	}
}