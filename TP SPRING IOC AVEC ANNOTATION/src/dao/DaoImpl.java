package dao;

import org.springframework.stereotype.Component;

/*
 * Annotation qui dit à Spring : "Au démarrage, donne-moi un objet de cette classe.
 * Pour donner un nom au component, utiliser l'attribut 'value'
 */
@Component(value="dao")
//@Repository(value="dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
		/*
		 * Exemple d'algorithme
		 * je me connecte à la bd
		 */
		double data = 98;
		return data;
	}
	
	public void init() {
		System.out.println("Instanciation de Dao Impl");
	}

}
