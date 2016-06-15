/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionschemaFactoryImpl extends EFactoryImpl implements ProductionschemaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProductionschemaFactory init() {
        try {
            ProductionschemaFactory theProductionschemaFactory = (ProductionschemaFactory)EPackage.Registry.INSTANCE.getEFactory(ProductionschemaPackage.eNS_URI);
            if (theProductionschemaFactory != null) {
                return theProductionschemaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ProductionschemaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionschemaFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ProductionschemaPackage.PRODUCTION_SCHEMA: return createProductionSchema();
            case ProductionschemaPackage.CONJUNCTIVE_NODE: return createConjunctiveNode();
            case ProductionschemaPackage.DISJUNCTIVE_NODE: return createDisjunctiveNode();
            case ProductionschemaPackage.MATERIAL_LINK: return createMaterialLink();
            case ProductionschemaPackage.MATERIAL: return createMaterial();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionSchema createProductionSchema() {
        ProductionSchemaImpl productionSchema = new ProductionSchemaImpl();
        return productionSchema;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConjunctiveNode createConjunctiveNode() {
        ConjunctiveNodeImpl conjunctiveNode = new ConjunctiveNodeImpl();
        return conjunctiveNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisjunctiveNode createDisjunctiveNode() {
        DisjunctiveNodeImpl disjunctiveNode = new DisjunctiveNodeImpl();
        return disjunctiveNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaterialLink createMaterialLink() {
        MaterialLinkImpl materialLink = new MaterialLinkImpl();
        return materialLink;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Material createMaterial() {
        MaterialImpl material = new MaterialImpl();
        return material;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionschemaPackage getProductionschemaPackage() {
        return (ProductionschemaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ProductionschemaPackage getPackage() {
        return ProductionschemaPackage.eINSTANCE;
    }

} //ProductionschemaFactoryImpl
