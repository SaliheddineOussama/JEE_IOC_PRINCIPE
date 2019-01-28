package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

	@Override
	public double getTemperature() {
		double data=24;
		return data;
	}

}
