/**
 */
package de.mdelab.languages.productionschema.util;

import de.mdelab.languages.productionschema.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage
 * @generated
 */
public class ProductionschemaAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ProductionschemaPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionschemaAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ProductionschemaPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductionschemaSwitch<Adapter> modelSwitch =
        new ProductionschemaSwitch<Adapter>() {
            @Override
            public Adapter caseProductionSchema(ProductionSchema object) {
                return createProductionSchemaAdapter();
            }
            @Override
            public Adapter caseConjunctiveNode(ConjunctiveNode object) {
                return createConjunctiveNodeAdapter();
            }
            @Override
            public Adapter caseDisjunctiveNode(DisjunctiveNode object) {
                return createDisjunctiveNodeAdapter();
            }
            @Override
            public Adapter caseMaterialLink(MaterialLink object) {
                return createMaterialLinkAdapter();
            }
            @Override
            public Adapter caseLinkableNode(LinkableNode object) {
                return createLinkableNodeAdapter();
            }
            @Override
            public Adapter caseIdentifiableElement(IdentifiableElement object) {
                return createIdentifiableElementAdapter();
            }
            @Override
            public Adapter caseMaterial(Material object) {
                return createMaterialAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.ProductionSchema <em>Production Schema</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.ProductionSchema
     * @generated
     */
    public Adapter createProductionSchemaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.ConjunctiveNode <em>Conjunctive Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.ConjunctiveNode
     * @generated
     */
    public Adapter createConjunctiveNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.DisjunctiveNode <em>Disjunctive Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.DisjunctiveNode
     * @generated
     */
    public Adapter createDisjunctiveNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.MaterialLink <em>Material Link</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.MaterialLink
     * @generated
     */
    public Adapter createMaterialLinkAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.LinkableNode <em>Linkable Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.LinkableNode
     * @generated
     */
    public Adapter createLinkableNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.IdentifiableElement <em>Identifiable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.IdentifiableElement
     * @generated
     */
    public Adapter createIdentifiableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.mdelab.languages.productionschema.Material <em>Material</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see de.mdelab.languages.productionschema.Material
     * @generated
     */
    public Adapter createMaterialAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //ProductionschemaAdapterFactory
