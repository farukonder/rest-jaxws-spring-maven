package eu.tyrkiahus.web.model;

import javax.xml.bind.annotation.XmlElement;

public class Resume {
	
	private String id;
	@XmlElement
	private Adress adress = new Adress();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		adress.setAdd(id + "bla");
	}

}