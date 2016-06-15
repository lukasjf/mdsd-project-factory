/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.ConjunctiveNode;
import de.mdelab.languages.productionschema.DisjunctiveNode;
import de.mdelab.languages.productionschema.IdentifiableElement;
import de.mdelab.languages.productionschema.LinkableNode;
import de.mdelab.languages.productionschema.Material;
import de.mdelab.languages.productionschema.MaterialLink;
import de.mdelab.languages.productionschema.ProductionSchema;
import de.mdelab.languages.productionschema.ProductionschemaFactory;
import de.mdelab.languages.productionschema.ProductionschemaPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionschemaPackageImpl extends EPackageImpl implements ProductionschemaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass productionSchemaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conjunctiveNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass disjunctiveNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass materialLinkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkableNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifiableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass materialEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.mdelab.languages.productionschema.ProductionschemaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ProductionschemaPackageImpl() {
        super(eNS_URI, ProductionschemaFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ProductionschemaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ProductionschemaPackage init() {
        if (isInited) return (ProductionschemaPackage)EPackage.Registry.INSTANCE.getEPackage(ProductionschemaPackage.eNS_URI);

        // Obtain or create and register package
        ProductionschemaPackageImpl theProductionschemaPackage = (ProductionschemaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProductionschemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProductionschemaPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theProductionschemaPackage.createPackageContents();

        // Initialize created meta-data
        theProductionschemaPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theProductionschemaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ProductionschemaPackage.eNS_URI, theProductionschemaPackage);
        return theProductionschemaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProductionSchema() {
        return productionSchemaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductionSchema_OwnedLinkableNodes() {
        return (EReference)productionSchemaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductionSchema_OwnedMaterialLinks() {
        return (EReference)productionSchemaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProductionSchema_OwnedMaterials() {
        return (EReference)productionSchemaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConjunctiveNode() {
        return conjunctiveNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDisjunctiveNode() {
        return disjunctiveNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaterialLink() {
        return materialLinkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaterialLink_SourceNode() {
        return (EReference)materialLinkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaterialLink_DestinationNode() {
        return (EReference)materialLinkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMaterialLink_AssociatedMaterial() {
        return (EReference)materialLinkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkableNode() {
        return linkableNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkableNode_IncomingLinks() {
        return (EReference)linkableNodeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLinkableNode_OutgoingLinks() {
        return (EReference)linkableNodeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifiableElement() {
        return identifiableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifiableElement_Id() {
        return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIdentifiableElement_Label() {
        return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaterial() {
        return materialEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionschemaFactory getProductionschemaFactory() {
        return (ProductionschemaFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        productionSchemaEClass = createEClass(PRODUCTION_SCHEMA);
        createEReference(productionSchemaEClass, PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES);
        createEReference(productionSchemaEClass, PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS);
        createEReference(productionSchemaEClass, PRODUCTION_SCHEMA__OWNED_MATERIALS);

        conjunctiveNodeEClass = createEClass(CONJUNCTIVE_NODE);

        disjunctiveNodeEClass = createEClass(DISJUNCTIVE_NODE);

        materialLinkEClass = createEClass(MATERIAL_LINK);
        createEReference(materialLinkEClass, MATERIAL_LINK__SOURCE_NODE);
        createEReference(materialLinkEClass, MATERIAL_LINK__DESTINATION_NODE);
        createEReference(materialLinkEClass, MATERIAL_LINK__ASSOCIATED_MATERIAL);

        linkableNodeEClass = createEClass(LINKABLE_NODE);
        createEReference(linkableNodeEClass, LINKABLE_NODE__INCOMING_LINKS);
        createEReference(linkableNodeEClass, LINKABLE_NODE__OUTGOING_LINKS);

        identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
        createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__ID);
        createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__LABEL);

        materialEClass = createEClass(MATERIAL);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        conjunctiveNodeEClass.getESuperTypes().add(this.getLinkableNode());
        disjunctiveNodeEClass.getESuperTypes().add(this.getLinkableNode());
        materialLinkEClass.getESuperTypes().add(this.getIdentifiableElement());
        linkableNodeEClass.getESuperTypes().add(this.getIdentifiableElement());
        materialEClass.getESuperTypes().add(this.getIdentifiableElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(productionSchemaEClass, ProductionSchema.class, "ProductionSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProductionSchema_OwnedLinkableNodes(), this.getLinkableNode(), null, "ownedLinkableNodes", null, 0, -1, ProductionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProductionSchema_OwnedMaterialLinks(), this.getMaterialLink(), null, "ownedMaterialLinks", null, 0, -1, ProductionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProductionSchema_OwnedMaterials(), this.getMaterial(), null, "ownedMaterials", null, 0, -1, ProductionSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conjunctiveNodeEClass, ConjunctiveNode.class, "ConjunctiveNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(disjunctiveNodeEClass, DisjunctiveNode.class, "DisjunctiveNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(materialLinkEClass, MaterialLink.class, "MaterialLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMaterialLink_SourceNode(), this.getLinkableNode(), this.getLinkableNode_OutgoingLinks(), "sourceNode", null, 1, 1, MaterialLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMaterialLink_DestinationNode(), this.getLinkableNode(), this.getLinkableNode_IncomingLinks(), "destinationNode", null, 1, 1, MaterialLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMaterialLink_AssociatedMaterial(), this.getMaterial(), null, "associatedMaterial", null, 0, 1, MaterialLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkableNodeEClass, LinkableNode.class, "LinkableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLinkableNode_IncomingLinks(), this.getMaterialLink(), this.getMaterialLink_DestinationNode(), "incomingLinks", null, 0, -1, LinkableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLinkableNode_OutgoingLinks(), this.getMaterialLink(), this.getMaterialLink_SourceNode(), "outgoingLinks", null, 0, -1, LinkableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIdentifiableElement_Id(), ecorePackage.getELong(), "id", null, 1, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIdentifiableElement_Label(), ecorePackage.getEString(), "label", null, 0, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ProductionschemaPackageImpl
