/**
 */
package de.mdelab.languages.productionschema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.MaterialLink#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.MaterialLink#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.MaterialLink#getAssociatedMaterial <em>Associated Material</em>}</li>
 * </ul>
 *
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getMaterialLink()
 * @model
 * @generated
 */
public interface MaterialLink extends IdentifiableElement {
    /**
     * Returns the value of the '<em><b>Source Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.mdelab.languages.productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source Node</em>' reference.
     * @see #setSourceNode(LinkableNode)
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getMaterialLink_SourceNode()
     * @see de.mdelab.languages.productionschema.LinkableNode#getOutgoingLinks
     * @model opposite="outgoingLinks" required="true"
     * @generated
     */
    LinkableNode getSourceNode();

    /**
     * Sets the value of the '{@link de.mdelab.languages.productionschema.MaterialLink#getSourceNode <em>Source Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source Node</em>' reference.
     * @see #getSourceNode()
     * @generated
     */
    void setSourceNode(LinkableNode value);

    /**
     * Returns the value of the '<em><b>Destination Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link de.mdelab.languages.productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Destination Node</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Destination Node</em>' reference.
     * @see #setDestinationNode(LinkableNode)
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getMaterialLink_DestinationNode()
     * @see de.mdelab.languages.productionschema.LinkableNode#getIncomingLinks
     * @model opposite="incomingLinks" required="true"
     * @generated
     */
    LinkableNode getDestinationNode();

    /**
     * Sets the value of the '{@link de.mdelab.languages.productionschema.MaterialLink#getDestinationNode <em>Destination Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Destination Node</em>' reference.
     * @see #getDestinationNode()
     * @generated
     */
    void setDestinationNode(LinkableNode value);

    /**
     * Returns the value of the '<em><b>Associated Material</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Associated Material</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Associated Material</em>' reference.
     * @see #setAssociatedMaterial(Material)
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getMaterialLink_AssociatedMaterial()
     * @model
     * @generated
     */
    Material getAssociatedMaterial();

    /**
     * Sets the value of the '{@link de.mdelab.languages.productionschema.MaterialLink#getAssociatedMaterial <em>Associated Material</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Associated Material</em>' reference.
     * @see #getAssociatedMaterial()
     * @generated
     */
    void setAssociatedMaterial(Material value);

} // MaterialLink
