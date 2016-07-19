
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
 *         &lt;element name="LoanNumberOfPaymentResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanNumberOfPaymentResult"
})
@XmlRootElement(name = "LoanNumberOfPaymentResponse")
public class LoanNumberOfPaymentResponse {

    @XmlElement(name = "LoanNumberOfPaymentResult")
    protected double loanNumberOfPaymentResult;

    /**
     * Obtient la valeur de la propri�t� loanNumberOfPaymentResult.
     * 
     */
    public double getLoanNumberOfPaymentResult() {
        return loanNumberOfPaymentResult;
    }

    /**
     * D�finit la valeur de la propri�t� loanNumberOfPaymentResult.
     * 
     */
    public void setLoanNumberOfPaymentResult(double value) {
        this.loanNumberOfPaymentResult = value;
    }

}
