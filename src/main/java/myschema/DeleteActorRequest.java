//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.28 at 07:39:20 PM EEST 
//


package myschema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="actorId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "movieId",
        "actorId"
})
@XmlRootElement(name = "deleteActorRequest")
public class DeleteActorRequest {

    protected int movieId;
    protected int actorId;

    /**
     * Gets the value of the movieId property.
     */
    public int getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     */
    public void setMovieId(int value) {
        this.movieId = value;
    }

    /**
     * Gets the value of the actorId property.
     */
    public int getActorId() {
        return actorId;
    }

    /**
     * Sets the value of the actorId property.
     */
    public void setActorId(int value) {
        this.actorId = value;
    }

}
