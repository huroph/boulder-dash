package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.level_dash;

public final class Model extends Observable implements IModel {

	private level_dash level_dash;
	private int levelID = 1;


	public Model() {

		this.loadlevel_dash(levelID);
	}


	public level_dash getlevel_dash() {
		return this.level_dash;
	}

	private void setlevel_dash(final level_dash level_dash) {
		this.level_dash = level_dash;
		this.setChanged();
		this.notifyObservers();
	}

	public void loadlevel_dash(final int id) {
		try {
			final DAOlevel_dash daolevel_dash = new DAOlevel_dash(DBConnection.getInstance().getConnection());
			this.setlevel_dash(DAOlevel_dash.find(id));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	public Observable getObservable() {
		return this;
	}
}
