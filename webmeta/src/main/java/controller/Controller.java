
package controller;

import java.util.Map;

public interface Controller {
    String execute(Map<String, Object> var1) throws Exception;

    Object[] getDataBinders();
}
