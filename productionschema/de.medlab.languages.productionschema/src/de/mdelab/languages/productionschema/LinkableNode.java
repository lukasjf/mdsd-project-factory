/**
 */
package de.mdelab.languages.productionschema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linkable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getLinkableNode()
 * @model abstract="true"
 * @generated
 */
public interface LinkableNode extends IdentifiableElement {
    /**
     * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
     * The list contents are of type {@link de.mdelab.languages.productionschema.MaterialLink}.
     * It is bidirectional and its opposite is '{@link de.mdelab.languages.productionschema.MaterialLink#getDestinationNode <em>Destination Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Links</em>' reference list.
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getLinkableNode_IncomingLinks()
     * @see de.mdelab.languages.productionschema.MaterialLink#getDestinationNode
     * @model opposite="destinationNode"
     * @generated
     */
    EList<MaterialLink> getIncomingLinks();

    /**
     * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
     * The list contents are of type {@link de.mdelab.languages.productionschema.MaterialLink}.
     * It is bidirectional and its opposite is '{@link de.mdelab.languages.productionschema.MaterialLink#getSourceNode <em>Source Node</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Links</em>' reference list.
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getLinkableNode_OutgoingLinks()
     * @see de.mdelab.languages.productionschema.MaterialLink#getSourceNode
     * @model opposite="sourceNode"
     * @generated
     */
    EList<MaterialLink> getOutgoingLinks();

} // LinkableNode
