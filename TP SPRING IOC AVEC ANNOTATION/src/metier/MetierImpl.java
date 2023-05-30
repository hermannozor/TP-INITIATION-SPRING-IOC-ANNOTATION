package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;

/*
 * Annotation qui dit à Spring : "Au démarrage, donne-moi un objet de cette classe.
 * Pour donner un nom au component, utiliser l'attribut 'metier'
 */
@Component(value="metier")
//@Service(value="metier")
public class MetierImpl implements IMetier {

	/*
	 * Couplage faible
	 * 
	 * (On ne doit pas faire 
	 * private IDao dao = new car IDao est un interface et
	 * en faisant IDao dao = new... ça devient un couplage fort)
	 */
	/*
	 * Annotation qui permet d'injecter les dépéndances. Autowired veut dire 'Inject'
	 */
	@Autowired
	private IDao dao;
	
	/*
	 * IDao est private. Il me faut donc un setter
	 * qui me permettra d'injecter ma dépendance
	 * Pas besoin de getter
	 */
	public void setDao(IDao dao) {
		this.dao = dao;
		System.out.println("Injection des dépendances");
	}
	@Override
	public double calcul() {
		/*
		 * Utilisation du polymorphisme
		 */
		double d = dao.getData();
		double res = d*23;
		return res;
	}
	
	public void init() {
		System.out.println("Initialisation de MetierImpl");
	}
	public MetierImpl() {
		System.out.println("Instanciation de Metier");
	}

}
