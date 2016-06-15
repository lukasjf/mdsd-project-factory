/**
 */
package de.mdelab.languages.productionschema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterialLinks <em>Owned Material Links</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterials <em>Owned Materials</em>}</li>
 * </ul>
 *
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getProductionSchema()
 * @model
 * @generated
 */
public interface ProductionSchema extends EObject {
    /**
     * Returns the value of the '<em><b>Owned Linkable Nodes</b></em>' containment reference list.
     * The list contents are of type {@link de.mdelab.languages.productionschema.LinkableNode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Linkable Nodes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Linkable Nodes</em>' containment reference list.
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getProductionSchema_OwnedLinkableNodes()
     * @model containment="true"
     * @generated
     */
    EList<LinkableNode> getOwnedLinkableNodes();

    /**
     * Returns the value of the '<em><b>Owned Material Links</b></em>' containment reference list.
     * The list contents are of type {@link de.mdelab.languages.productionschema.MaterialLink}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Material Links</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Material Links</em>' containment reference list.
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getProductionSchema_OwnedMaterialLinks()
     * @model containment="true"
     * @generated
     */
    EList<MaterialLink> getOwnedMaterialLinks();

    /**
     * Returns the value of the '<em><b>Owned Materials</b></em>' containment reference list.
     * The list contents are of type {@link de.mdelab.languages.productionschema.Material}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned Materials</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned Materials</em>' containment reference list.
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#getProductionSchema_OwnedMaterials()
     * @model containment="true"
     * @generated
     */
    EList<Material> getOwnedMaterials();

} // ProductionSchema
