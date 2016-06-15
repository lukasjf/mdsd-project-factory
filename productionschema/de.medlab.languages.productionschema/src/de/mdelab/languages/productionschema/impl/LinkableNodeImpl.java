/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.LinkableNode;
import de.mdelab.languages.productionschema.MaterialLink;
import de.mdelab.languages.productionschema.ProductionschemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linkable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.impl.LinkableNodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.LinkableNodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LinkableNodeImpl extends IdentifiableElementImpl implements LinkableNode {
    /**
     * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingLinks()
     * @generated
     * @ordered
     */
    protected EList<MaterialLink> incomingLinks;

    /**
     * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingLinks()
     * @generated
     * @ordered
     */
    protected EList<MaterialLink> outgoingLinks;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LinkableNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProductionschemaPackage.Literals.LINKABLE_NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MaterialLink> getIncomingLinks() {
        if (incomingLinks == null) {
            incomingLinks = new EObjectWithInverseResolvingEList<MaterialLink>(MaterialLink.class, this, ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS, ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE);
        }
        return incomingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MaterialLink> getOutgoingLinks() {
        if (outgoingLinks == null) {
            outgoingLinks = new EObjectWithInverseResolvingEList<MaterialLink>(MaterialLink.class, this, ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS, ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE);
        }
        return outgoingLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                return getIncomingLinks();
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                return getOutgoingLinks();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                getIncomingLinks().clear();
                getIncomingLinks().addAll((Collection<? extends MaterialLink>)newValue);
                return;
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                getOutgoingLinks().addAll((Collection<? extends MaterialLink>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                getIncomingLinks().clear();
                return;
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                getOutgoingLinks().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS:
                return incomingLinks != null && !incomingLinks.isEmpty();
            case ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS:
                return outgoingLinks != null && !outgoingLinks.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //LinkableNodeImpl
