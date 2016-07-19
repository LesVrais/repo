
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="APRResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "aprResult"
})
@XmlRootElement(name = "APRResponse")
public class APRResponse {

    @XmlElement(name = "APRResult")
    protected double aprResult;

    /**
     * Obtient la valeur de la propriété aprResult.
     * 
     */
    public double getAPRResult() {
        return aprResult;
    }

    /**
     * Définit la valeur de la propriété aprResult.
     * 
     */
    public void setAPRResult(double value) {
        this.aprResult = value;
    }

}
