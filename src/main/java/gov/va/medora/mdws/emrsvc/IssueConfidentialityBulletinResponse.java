
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
 *         &lt;element name="issueConfidentialityBulletinResult" type="{http://mdws.medora.va.gov/EmrSvc}TaggedTextArray" minOccurs="0"/>
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
    "issueConfidentialityBulletinResult"
})
@XmlRootElement(name = "issueConfidentialityBulletinResponse")
public class IssueConfidentialityBulletinResponse {

    protected TaggedTextArray issueConfidentialityBulletinResult;

    /**
     * Gets the value of the issueConfidentialityBulletinResult property.
     * 
     * @return
     *     possible object is
     *     {@link TaggedTextArray }
     *     
     */
    public TaggedTextArray getIssueConfidentialityBulletinResult() {
        return issueConfidentialityBulletinResult;
    }

    /**
     * Sets the value of the issueConfidentialityBulletinResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaggedTextArray }
     *     
     */
    public void setIssueConfidentialityBulletinResult(TaggedTextArray value) {
        this.issueConfidentialityBulletinResult = value;
    }

}
