/**
 */
package de.mdelab.languages.productionschema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage
 * @generated
 */
public interface ProductionschemaFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProductionschemaFactory eINSTANCE = de.mdelab.languages.productionschema.impl.ProductionschemaFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Production Schema</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Production Schema</em>'.
     * @generated
     */
    ProductionSchema createProductionSchema();

    /**
     * Returns a new object of class '<em>Conjunctive Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conjunctive Node</em>'.
     * @generated
     */
    ConjunctiveNode createConjunctiveNode();

    /**
     * Returns a new object of class '<em>Disjunctive Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Disjunctive Node</em>'.
     * @generated
     */
    DisjunctiveNode createDisjunctiveNode();

    /**
     * Returns a new object of class '<em>Material Link</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Material Link</em>'.
     * @generated
     */
    MaterialLink createMaterialLink();

    /**
     * Returns a new object of class '<em>Material</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Material</em>'.
     * @generated
     */
    Material createMaterial();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ProductionschemaPackage getProductionschemaPackage();

} //ProductionschemaFactory
