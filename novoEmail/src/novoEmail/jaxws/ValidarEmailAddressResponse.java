
package novoEmail.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.4.2
 * Wed Jan 27 17:43:24 BRT 2021
 * Generated source version: 3.4.2
 */

@XmlRootElement(name = "validarEmailAddressResponse", namespace = "http://novoEmail/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarEmailAddressResponse", namespace = "http://novoEmail/")

public class ValidarEmailAddressResponse {

    @XmlElement(name = "return")
    private boolean _return;

    public boolean getReturn() {
        return this._return;
    }

    public void setReturn(boolean new_return)  {
        this._return = new_return;
    }

}

