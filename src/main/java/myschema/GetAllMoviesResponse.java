//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.28 at 07:39:20 PM EEST 
//


package myschema;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="allMovies" type="{http://spring.io/guides/gs-producing-web-service}movie" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allMovies"
})
@XmlRootElement(name = "getAllMoviesResponse")
public class GetAllMoviesResponse {

    @XmlElement(required = true)
    protected List<Movie> allMovies;

    /**
     * Gets the value of the allMovies property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allMovies property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllMovies().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Movie }
     */
    public List<Movie> getAllMovies() {
        if (allMovies == null) {
            allMovies = new ArrayList<Movie>();
        }
        return this.allMovies;
    }

}