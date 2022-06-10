package store_v1;

import java.math.BigDecimal;
import java.util.Arrays;

import store_v1.request.MakeRequest;
import store_v1.request.MakeRequestHandler;
import store_v1.request.actions.CreateBankRequest;
import store_v1.request.actions.RequestByMail;

public class TestRequests {

	public static void main(String[] args) {
		String client = "Ana da Silva";
		BigDecimal budgetValue = new BigDecimal("745.99");
		int itemQuantity = 3;
		
		MakeRequest gerador = new MakeRequest(client, budgetValue, itemQuantity);
		MakeRequestHandler handler = new MakeRequestHandler(Arrays.asList(
				new RequestByMail(),
				new CreateBankRequest()));
		handler.execute(gerador);
	}

}
