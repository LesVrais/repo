
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
 *         &lt;element name="LoanAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ExtraCost" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "extraCost",
    "interestRate",
    "months"
})
@XmlRootElement(name = "APR")
public class APR {

    @XmlElement(name = "LoanAmount")
    protected double loanAmount;
    @XmlElement(name = "ExtraCost")
    protected double extraCost;
    @XmlElement(name = "InterestRate")
    protected double interestRate;
    @XmlElement(name = "Months")
    protected double months;

    /**
     * Obtient la valeur de la propriété loanAmount.
     * 
     */
    public double getLoanAmount() {
        return loanAmount;
    }

    /**
     * Définit la valeur de la propriété loanAmount.
     * 
     */
    public void setLoanAmount(double value) {
        this.loanAmount = value;
    }

    /**
     * Obtient la valeur de la propriété extraCost.
     * 
     */
    public double getExtraCost() {
        return extraCost;
    }

    /**
     * Définit la valeur de la propriété extraCost.
     * 
     */
    public void setExtraCost(double value) {
        this.extraCost = value;
    }

    /**
     * Obtient la valeur de la propriété interestRate.
     * 
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * Définit la valeur de la propriété interestRate.
     * 
     */
    public void setInterestRate(double value) {
        this.interestRate = value;
    }

    /**
     * Obtient la valeur de la propriété months.
     * 
     */
    public double getMonths() {
        return months;
    }

    /**
     * Définit la valeur de la propriété months.
     * 
     */
    public void setMonths(double value) {
        this.months = value;
    }

}
