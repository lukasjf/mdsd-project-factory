/**
 */
package de.mdelab.languages.productionschema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.mdelab.languages.productionschema.ProductionschemaFactory
 * @model kind="package"
 * @generated
 */
public interface ProductionschemaPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "productionschema";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/productionschema";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "productionschema";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProductionschemaPackage eINSTANCE = de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl.init();

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl <em>Production Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.ProductionSchemaImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getProductionSchema()
     * @generated
     */
    int PRODUCTION_SCHEMA = 0;

    /**
     * The feature id for the '<em><b>Owned Linkable Nodes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES = 0;

    /**
     * The feature id for the '<em><b>Owned Material Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS = 1;

    /**
     * The feature id for the '<em><b>Owned Materials</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRODUCTION_SCHEMA__OWNED_MATERIALS = 2;

    /**
     * The number of structural features of the '<em>Production Schema</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRODUCTION_SCHEMA_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Production Schema</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRODUCTION_SCHEMA_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.IdentifiableElementImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getIdentifiableElement()
     * @generated
     */
    int IDENTIFIABLE_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_ELEMENT__ID = 0;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_ELEMENT__LABEL = 1;

    /**
     * The number of structural features of the '<em>Identifiable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Identifiable Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.LinkableNodeImpl <em>Linkable Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.LinkableNodeImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getLinkableNode()
     * @generated
     */
    int LINKABLE_NODE = 4;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE__ID = IDENTIFIABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE__INCOMING_LINKS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE__OUTGOING_LINKS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Linkable Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Linkable Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKABLE_NODE_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.ConjunctiveNodeImpl <em>Conjunctive Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.ConjunctiveNodeImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getConjunctiveNode()
     * @generated
     */
    int CONJUNCTIVE_NODE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE__ID = LINKABLE_NODE__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE__LABEL = LINKABLE_NODE__LABEL;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE__INCOMING_LINKS = LINKABLE_NODE__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE__OUTGOING_LINKS = LINKABLE_NODE__OUTGOING_LINKS;

    /**
     * The number of structural features of the '<em>Conjunctive Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE_FEATURE_COUNT = LINKABLE_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Conjunctive Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONJUNCTIVE_NODE_OPERATION_COUNT = LINKABLE_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.DisjunctiveNodeImpl <em>Disjunctive Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.DisjunctiveNodeImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getDisjunctiveNode()
     * @generated
     */
    int DISJUNCTIVE_NODE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE__ID = LINKABLE_NODE__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE__LABEL = LINKABLE_NODE__LABEL;

    /**
     * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE__INCOMING_LINKS = LINKABLE_NODE__INCOMING_LINKS;

    /**
     * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE__OUTGOING_LINKS = LINKABLE_NODE__OUTGOING_LINKS;

    /**
     * The number of structural features of the '<em>Disjunctive Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE_FEATURE_COUNT = LINKABLE_NODE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Disjunctive Node</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DISJUNCTIVE_NODE_OPERATION_COUNT = LINKABLE_NODE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.MaterialLinkImpl <em>Material Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.MaterialLinkImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getMaterialLink()
     * @generated
     */
    int MATERIAL_LINK = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK__ID = IDENTIFIABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

    /**
     * The feature id for the '<em><b>Source Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK__SOURCE_NODE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Destination Node</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK__DESTINATION_NODE = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Associated Material</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK__ASSOCIATED_MATERIAL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Material Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Material Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_LINK_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.mdelab.languages.productionschema.impl.MaterialImpl <em>Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.mdelab.languages.productionschema.impl.MaterialImpl
     * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getMaterial()
     * @generated
     */
    int MATERIAL = 6;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL__ID = IDENTIFIABLE_ELEMENT__ID;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL__LABEL = IDENTIFIABLE_ELEMENT__LABEL;

    /**
     * The number of structural features of the '<em>Material</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Material</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MATERIAL_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.ProductionSchema <em>Production Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Production Schema</em>'.
     * @see de.mdelab.languages.productionschema.ProductionSchema
     * @generated
     */
    EClass getProductionSchema();

    /**
     * Returns the meta object for the containment reference list '{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Linkable Nodes</em>'.
     * @see de.mdelab.languages.productionschema.ProductionSchema#getOwnedLinkableNodes()
     * @see #getProductionSchema()
     * @generated
     */
    EReference getProductionSchema_OwnedLinkableNodes();

    /**
     * Returns the meta object for the containment reference list '{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterialLinks <em>Owned Material Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Material Links</em>'.
     * @see de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterialLinks()
     * @see #getProductionSchema()
     * @generated
     */
    EReference getProductionSchema_OwnedMaterialLinks();

    /**
     * Returns the meta object for the containment reference list '{@link de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterials <em>Owned Materials</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Owned Materials</em>'.
     * @see de.mdelab.languages.productionschema.ProductionSchema#getOwnedMaterials()
     * @see #getProductionSchema()
     * @generated
     */
    EReference getProductionSchema_OwnedMaterials();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.ConjunctiveNode <em>Conjunctive Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conjunctive Node</em>'.
     * @see de.mdelab.languages.productionschema.ConjunctiveNode
     * @generated
     */
    EClass getConjunctiveNode();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.DisjunctiveNode <em>Disjunctive Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Disjunctive Node</em>'.
     * @see de.mdelab.languages.productionschema.DisjunctiveNode
     * @generated
     */
    EClass getDisjunctiveNode();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.MaterialLink <em>Material Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Material Link</em>'.
     * @see de.mdelab.languages.productionschema.MaterialLink
     * @generated
     */
    EClass getMaterialLink();

    /**
     * Returns the meta object for the reference '{@link de.mdelab.languages.productionschema.MaterialLink#getSourceNode <em>Source Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source Node</em>'.
     * @see de.mdelab.languages.productionschema.MaterialLink#getSourceNode()
     * @see #getMaterialLink()
     * @generated
     */
    EReference getMaterialLink_SourceNode();

    /**
     * Returns the meta object for the reference '{@link de.mdelab.languages.productionschema.MaterialLink#getDestinationNode <em>Destination Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Destination Node</em>'.
     * @see de.mdelab.languages.productionschema.MaterialLink#getDestinationNode()
     * @see #getMaterialLink()
     * @generated
     */
    EReference getMaterialLink_DestinationNode();

    /**
     * Returns the meta object for the reference '{@link de.mdelab.languages.productionschema.MaterialLink#getAssociatedMaterial <em>Associated Material</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Associated Material</em>'.
     * @see de.mdelab.languages.productionschema.MaterialLink#getAssociatedMaterial()
     * @see #getMaterialLink()
     * @generated
     */
    EReference getMaterialLink_AssociatedMaterial();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.LinkableNode <em>Linkable Node</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linkable Node</em>'.
     * @see de.mdelab.languages.productionschema.LinkableNode
     * @generated
     */
    EClass getLinkableNode();

    /**
     * Returns the meta object for the reference list '{@link de.mdelab.languages.productionschema.LinkableNode#getIncomingLinks <em>Incoming Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incoming Links</em>'.
     * @see de.mdelab.languages.productionschema.LinkableNode#getIncomingLinks()
     * @see #getLinkableNode()
     * @generated
     */
    EReference getLinkableNode_IncomingLinks();

    /**
     * Returns the meta object for the reference list '{@link de.mdelab.languages.productionschema.LinkableNode#getOutgoingLinks <em>Outgoing Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Links</em>'.
     * @see de.mdelab.languages.productionschema.LinkableNode#getOutgoingLinks()
     * @see #getLinkableNode()
     * @generated
     */
    EReference getLinkableNode_OutgoingLinks();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.IdentifiableElement <em>Identifiable Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Identifiable Element</em>'.
     * @see de.mdelab.languages.productionschema.IdentifiableElement
     * @generated
     */
    EClass getIdentifiableElement();

    /**
     * Returns the meta object for the attribute '{@link de.mdelab.languages.productionschema.IdentifiableElement#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.mdelab.languages.productionschema.IdentifiableElement#getId()
     * @see #getIdentifiableElement()
     * @generated
     */
    EAttribute getIdentifiableElement_Id();

    /**
     * Returns the meta object for the attribute '{@link de.mdelab.languages.productionschema.IdentifiableElement#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see de.mdelab.languages.productionschema.IdentifiableElement#getLabel()
     * @see #getIdentifiableElement()
     * @generated
     */
    EAttribute getIdentifiableElement_Label();

    /**
     * Returns the meta object for class '{@link de.mdelab.languages.productionschema.Material <em>Material</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Material</em>'.
     * @see de.mdelab.languages.productionschema.Material
     * @generated
     */
    EClass getMaterial();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ProductionschemaFactory getProductionschemaFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl <em>Production Schema</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.ProductionSchemaImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getProductionSchema()
         * @generated
         */
        EClass PRODUCTION_SCHEMA = eINSTANCE.getProductionSchema();

        /**
         * The meta object literal for the '<em><b>Owned Linkable Nodes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES = eINSTANCE.getProductionSchema_OwnedLinkableNodes();

        /**
         * The meta object literal for the '<em><b>Owned Material Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS = eINSTANCE.getProductionSchema_OwnedMaterialLinks();

        /**
         * The meta object literal for the '<em><b>Owned Materials</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRODUCTION_SCHEMA__OWNED_MATERIALS = eINSTANCE.getProductionSchema_OwnedMaterials();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.ConjunctiveNodeImpl <em>Conjunctive Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.ConjunctiveNodeImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getConjunctiveNode()
         * @generated
         */
        EClass CONJUNCTIVE_NODE = eINSTANCE.getConjunctiveNode();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.DisjunctiveNodeImpl <em>Disjunctive Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.DisjunctiveNodeImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getDisjunctiveNode()
         * @generated
         */
        EClass DISJUNCTIVE_NODE = eINSTANCE.getDisjunctiveNode();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.MaterialLinkImpl <em>Material Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.MaterialLinkImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getMaterialLink()
         * @generated
         */
        EClass MATERIAL_LINK = eINSTANCE.getMaterialLink();

        /**
         * The meta object literal for the '<em><b>Source Node</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATERIAL_LINK__SOURCE_NODE = eINSTANCE.getMaterialLink_SourceNode();

        /**
         * The meta object literal for the '<em><b>Destination Node</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATERIAL_LINK__DESTINATION_NODE = eINSTANCE.getMaterialLink_DestinationNode();

        /**
         * The meta object literal for the '<em><b>Associated Material</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MATERIAL_LINK__ASSOCIATED_MATERIAL = eINSTANCE.getMaterialLink_AssociatedMaterial();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.LinkableNodeImpl <em>Linkable Node</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.LinkableNodeImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getLinkableNode()
         * @generated
         */
        EClass LINKABLE_NODE = eINSTANCE.getLinkableNode();

        /**
         * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE_NODE__INCOMING_LINKS = eINSTANCE.getLinkableNode_IncomingLinks();

        /**
         * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKABLE_NODE__OUTGOING_LINKS = eINSTANCE.getLinkableNode_OutgoingLinks();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.IdentifiableElementImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getIdentifiableElement()
         * @generated
         */
        EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE_ELEMENT__ID = eINSTANCE.getIdentifiableElement_Id();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute IDENTIFIABLE_ELEMENT__LABEL = eINSTANCE.getIdentifiableElement_Label();

        /**
         * The meta object literal for the '{@link de.mdelab.languages.productionschema.impl.MaterialImpl <em>Material</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.mdelab.languages.productionschema.impl.MaterialImpl
         * @see de.mdelab.languages.productionschema.impl.ProductionschemaPackageImpl#getMaterial()
         * @generated
         */
        EClass MATERIAL = eINSTANCE.getMaterial();

    }

} //ProductionschemaPackage
