
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LeaseMonthlyPaymentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "leaseMonthlyPaymentResult"
})
@XmlRootElement(name = "LeaseMonthlyPaymentResponse")
public class LeaseMonthlyPaymentResponse {

    @XmlElement(name = "LeaseMonthlyPaymentResult")
    protected double leaseMonthlyPaymentResult;

    /**
     * Obtient la valeur de la propri�t� leaseMonthlyPaymentResult.
     * 
     */
    public double getLeaseMonthlyPaymentResult() {
        return leaseMonthlyPaymentResult;
    }

    /**
     * D�finit la valeur de la propri�t� leaseMonthlyPaymentResult.
     * 
     */
    public void setLeaseMonthlyPaymentResult(double value) {
        this.leaseMonthlyPaymentResult = value;
    }

}
