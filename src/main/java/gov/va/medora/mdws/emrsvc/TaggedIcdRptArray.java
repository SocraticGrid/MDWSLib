
package gov.va.medora.mdws.emrsvc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaggedIcdRptArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaggedIcdRptArray">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdws.medora.va.gov/EmrSvc}AbstractTaggedArrayTO">
 *       &lt;sequence>
 *         &lt;element name="rpts" type="{http://mdws.medora.va.gov/EmrSvc}ArrayOfIcdRpt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaggedIcdRptArray", propOrder = {
    "rpts"
})
public class TaggedIcdRptArray
    extends AbstractTaggedArrayTO
{

    protected ArrayOfIcdRpt rpts;

    /**
     * Gets the value of the rpts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIcdRpt }
     *     
     */
    public ArrayOfIcdRpt getRpts() {
        return rpts;
    }

    /**
     * Sets the value of the rpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIcdRpt }
     *     
     */
    public void setRpts(ArrayOfIcdRpt value) {
        this.rpts = value;
    }

}
