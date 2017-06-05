package Object_Pool.example;

import java.sql.Connection;

/**
 * The three remaining methods are abstract_imp
 * and therefore must be implemented by the subclass
 *
 * @author malex
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {
	@Override
	protected Connection create() {
		return null;
	}

	@Override
	public boolean validate(Connection o) {
		return false;
	}

	@Override
	public void expire(Connection o) {

	}
}
