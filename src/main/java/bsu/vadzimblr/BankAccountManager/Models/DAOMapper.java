package bsu.vadzimblr.BankAccountManager.Models;

import java.util.List;

public interface DAOMapper<M> {
    List<String> mapModelToParameters(M model);
}
