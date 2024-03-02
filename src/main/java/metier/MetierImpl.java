package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Plat> getPlatsParMotCle(String mc) {
	 List<Plat> plats= new ArrayList<Plat>();
	 Connection conn=SingletonConnection.getConnection();
	 try {
	PreparedStatement ps= conn.prepareStatement("select * from PLATS where NOM_PLAT LIKE ?");
	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	Plat p = new Plat();
	p.setIdPlat(rs.getLong("ID_PLAT"));
	p.setNomPlat(rs.getString("NOM_PLAT"));
	p.setPrix(rs.getDouble("PRIX"));
	plats.add(p);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return plats;
	}

	

	@Override
	public void addProduit(Plat p) {
		// TODO Auto-generated method stub

	}

}
