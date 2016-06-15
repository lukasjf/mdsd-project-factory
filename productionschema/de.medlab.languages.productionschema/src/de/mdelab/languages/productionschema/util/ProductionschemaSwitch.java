/**
 */
package de.mdelab.languages.productionschema.util;

import de.mdelab.languages.productionschema.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.languages.productionschema.ProductionschemaPackage
 * @generated
 */
public class ProductionschemaSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ProductionschemaPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionschemaSwitch() {
        if (modelPackage == null) {
            modelPackage = ProductionschemaPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ProductionschemaPackage.PRODUCTION_SCHEMA: {
                ProductionSchema productionSchema = (ProductionSchema)theEObject;
                T result = caseProductionSchema(productionSchema);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.CONJUNCTIVE_NODE: {
                ConjunctiveNode conjunctiveNode = (ConjunctiveNode)theEObject;
                T result = caseConjunctiveNode(conjunctiveNode);
                if (result == null) result = caseLinkableNode(conjunctiveNode);
                if (result == null) result = caseIdentifiableElement(conjunctiveNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.DISJUNCTIVE_NODE: {
                DisjunctiveNode disjunctiveNode = (DisjunctiveNode)theEObject;
                T result = caseDisjunctiveNode(disjunctiveNode);
                if (result == null) result = caseLinkableNode(disjunctiveNode);
                if (result == null) result = caseIdentifiableElement(disjunctiveNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.MATERIAL_LINK: {
                MaterialLink materialLink = (MaterialLink)theEObject;
                T result = caseMaterialLink(materialLink);
                if (result == null) result = caseIdentifiableElement(materialLink);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.LINKABLE_NODE: {
                LinkableNode linkableNode = (LinkableNode)theEObject;
                T result = caseLinkableNode(linkableNode);
                if (result == null) result = caseIdentifiableElement(linkableNode);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.IDENTIFIABLE_ELEMENT: {
                IdentifiableElement identifiableElement = (IdentifiableElement)theEObject;
                T result = caseIdentifiableElement(identifiableElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ProductionschemaPackage.MATERIAL: {
                Material material = (Material)theEObject;
                T result = caseMaterial(material);
                if (result == null) result = caseIdentifiableElement(material);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Production Schema</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Production Schema</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProductionSchema(ProductionSchema object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conjunctive Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conjunctive Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConjunctiveNode(ConjunctiveNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Disjunctive Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Disjunctive Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDisjunctiveNode(DisjunctiveNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Material Link</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Material Link</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaterialLink(MaterialLink object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Linkable Node</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Linkable Node</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLinkableNode(LinkableNode object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiableElement(IdentifiableElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Material</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Material</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMaterial(Material object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ProductionschemaSwitch
