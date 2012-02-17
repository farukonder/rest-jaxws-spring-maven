package eu.tyrkiahus.web.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import eu.tyrkiahus.web.model.Resume;
import eu.tyrkiahus.web.service.TransactionBo;

@WebService(serviceName = "ws")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class AccountServiceEndpoint extends SpringBeanAutowiringSupport {

	@Autowired
	TransactionBo transactionBo;

	@WebMethod
	@WebResult(name = "Resume")
	public Resume insertAccount(String id) {
		String result = transactionBo.save();
		Resume resume = new Resume();
		resume.setId(result);
		return resume;
	}

}