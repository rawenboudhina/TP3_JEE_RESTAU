package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Plat> getPlatsParMotCle(String mc);
	public void addProduit(Plat p);

}
