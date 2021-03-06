
package gov.va.medora.mdws.emrsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isConsultNoteResult" type="{http://mdws.medora.va.gov/EmrSvc}TextTO" minOccurs="0"/>
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
    "isConsultNoteResult"
})
@XmlRootElement(name = "isConsultNoteResponse")
public class IsConsultNoteResponse {

    protected TextTO isConsultNoteResult;

    /**
     * Gets the value of the isConsultNoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link TextTO }
     *     
     */
    public TextTO getIsConsultNoteResult() {
        return isConsultNoteResult;
    }

    /**
     * Sets the value of the isConsultNoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextTO }
     *     
     */
    public void setIsConsultNoteResult(TextTO value) {
        this.isConsultNoteResult = value;
    }

}
