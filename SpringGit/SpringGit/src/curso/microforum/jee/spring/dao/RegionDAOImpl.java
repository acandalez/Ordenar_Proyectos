package curso.microforum.jee.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import curso.microforum.jee.spring.Regions;

/**
 * Nuestro bean.
 * 
 * @author acandalez
 *
 */
public class RegionDAOImpl implements RegionsDAO {

	private JdbcTemplate jdbcTemplate;

	// Recibo un datasource. ver en dispatcher-servlet.
	public RegionDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);// Estamos haciendo un
															// new del bean
															// seguido de un new
															// de datasource.
	}

	@Override
	public List<Regions> list() {
		String consulta = "SELECT * FROM REGIONS";// Esto debería estar aparte,
													// sólo por motivos
													// didácticos se incluye
													// aquí

		List<Regions> l_regiones = this.jdbcTemplate.query(consulta,
				new RegionRowMapper());

		return l_regiones;
	}

	@Override
	public Regions read(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
