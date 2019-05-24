package model;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.level_dash;
import model.DAOEntity;


/**
 * The Class DAOHelloWorld.
 *
 * @author Jean-Aymeric Diet
 */
class DAOlevel_dash extends DAOEntity<level_dash> {

    /**
     * Instantiates a new DAO hello world.
     *
     * @param connection
     *          the connection
     * @throws SQLException
     *           the SQL exception
     */
    public DAOlevel_dash(final Connection connection) throws SQLException {
        super(connection);
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#create(model.Entity)
     */
    @Override
    public boolean create(final level_dash entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#delete(model.Entity)
     */
    @Override
    public boolean delete(final level_dash entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#update(model.Entity)
     */
    @Override
    public boolean update(final level_dash entity) {
        // Not implemented
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#find(int)
     */
    @Override
    public level_dash find(final int id) {
        level_dash level_dash = new level_dash();

        try {
            final String sql = "{call level_dashById(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setInt(1, id);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                level_dash = new level_dash(id, resultSet.getString("code"), resultSet.getString("message"));
            }
            return level_dash;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




    /*
     * (non-Javadoc)
     *
     * @see model.DAOEntity#find(java.lang.String)
     */
    @Override
    public level_dash find(final String code) {
        level_dash level_dash = new level_dash();

        try {
            final String sql = "{call level_dashByCode(?)}";
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setString(1, code);
            call.execute();
            final ResultSet resultSet = call.getResultSet();
            if (resultSet.first()) {
                level_dash = new level_dash(resultSet.getInt("id"), code, resultSet.getString("message"));
            }
            return level_dash;
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}