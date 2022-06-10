package store_v1.request.actions;

import store_v1.request.Request;

public interface AfterRequestAction {

	void execute(Request request);

}
