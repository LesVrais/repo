
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
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ResidualValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InterestRate" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Months" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "loanAmount",
    "residualValue",
    "interestRate",
    "months"
})
@XmlRootElement(name = "LeaseMonthlyPayment")
public class LeaseMonthlyPayment {

    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "ResidualValue")
    protected double residualValue;
    @XmlElement(name = "InterestRate")
    protected double interestRate;
    @XmlElement(name = "Months")
    protected double months;

    /**
     * Obtient la valeur de la propri�t� loanAmount.
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * D�finit la valeur de la propri�t� loanAmount.
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * Obtient la valeur de la propri�t� residualValue.
     * 
     */
    public double getResidualValue() {
        return residualValue;
    }

    /**
     * D�finit la valeur de la propri�t� residualValue.
     * 
     */
    public void setResidualValue(double value) {
        this.residualValue = value;
    }

    /**
     * Obtient la valeur de la propri�t� interestRate.
     * 
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * D�finit la valeur de la propri�t� interestRate.
     * 
     */
    public void setInterestRate(double value) {
        this.interestRate = value;
    }

    /**
     * Obtient la valeur de la propri�t� months.
     * 
     */
    public double getMonths() {
        return months;
    }

    /**
     * D�finit la valeur de la propri�t� months.
     * 
     */
    public void setMonths(double value) {
        this.months = value;
    }

}
