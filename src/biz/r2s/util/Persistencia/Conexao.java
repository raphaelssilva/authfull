package biz.r2s.util.Persistencia;

import javax.jdo.*;

public class Conexao {
    
	private static final PersistenceManagerFactory pmfInstance =
        JDOHelper.getPersistenceManagerFactory("transactions-optional");

    private Conexao() {}

    public static PersistenceManagerFactory get() {
        return pmfInstance;
    }

 
}
 
