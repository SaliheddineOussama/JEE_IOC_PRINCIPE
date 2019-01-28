package metier;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;
// @Component("metier")
// @Component
@Service
public class MetierImpl implements IMetier{
	@Autowired
	@Resource(name="dao")
	private IDao dao;
	
	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	@Override
	public double calcul() {
		double temp = dao.getTemperature()*12;
		return temp;
	}

}
