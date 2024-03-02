package test;

import java.util.List;

import metier.MetierImpl;
import metier.Plat;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Plat> prods = metier.getPlatsParMotCle("cous");
		for (Plat p : prods)
		System.out.println(p.getNomPlat());
		}
		}



