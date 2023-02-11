package metier;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Compte {
	@XmlAttribute
	private int code;
	@XmlElement
	private double solde;
	@XmlTransient
	private Date dateCreation;
}
