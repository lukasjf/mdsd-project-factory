/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.LinkableNode;
import de.mdelab.languages.productionschema.Material;
import de.mdelab.languages.productionschema.MaterialLink;
import de.mdelab.languages.productionschema.ProductionschemaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.impl.MaterialLinkImpl#getSourceNode <em>Source Node</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.MaterialLinkImpl#getDestinationNode <em>Destination Node</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.MaterialLinkImpl#getAssociatedMaterial <em>Associated Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialLinkImpl extends IdentifiableElementImpl implements MaterialLink {
    /**
     * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSourceNode()
     * @generated
     * @ordered
     */
    protected LinkableNode sourceNode;

    /**
     * The cached value of the '{@link #getDestinationNode() <em>Destination Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDestinationNode()
     * @generated
     * @ordered
     */
    protected LinkableNode destinationNode;

    /**
     * The cached value of the '{@link #getAssociatedMaterial() <em>Associated Material</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociatedMaterial()
     * @generated
     * @ordered
     */
    protected Material associatedMaterial;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MaterialLinkImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProductionschemaPackage.Literals.MATERIAL_LINK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkableNode getSourceNode() {
        if (sourceNode != null && sourceNode.eIsProxy()) {
            InternalEObject oldSourceNode = (InternalEObject)sourceNode;
            sourceNode = (LinkableNode)eResolveProxy(oldSourceNode);
            if (sourceNode != oldSourceNode) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE, oldSourceNode, sourceNode));
            }
        }
        return sourceNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkableNode basicGetSourceNode() {
        return sourceNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSourceNode(LinkableNode newSourceNode, NotificationChain msgs) {
        LinkableNode oldSourceNode = sourceNode;
        sourceNode = newSourceNode;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE, oldSourceNode, newSourceNode);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSourceNode(LinkableNode newSourceNode) {
        if (newSourceNode != sourceNode) {
            NotificationChain msgs = null;
            if (sourceNode != null)
                msgs = ((InternalEObject)sourceNode).eInverseRemove(this, ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS, LinkableNode.class, msgs);
            if (newSourceNode != null)
                msgs = ((InternalEObject)newSourceNode).eInverseAdd(this, ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS, LinkableNode.class, msgs);
            msgs = basicSetSourceNode(newSourceNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE, newSourceNode, newSourceNode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkableNode getDestinationNode() {
        if (destinationNode != null && destinationNode.eIsProxy()) {
            InternalEObject oldDestinationNode = (InternalEObject)destinationNode;
            destinationNode = (LinkableNode)eResolveProxy(oldDestinationNode);
            if (destinationNode != oldDestinationNode) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE, oldDestinationNode, destinationNode));
            }
        }
        return destinationNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkableNode basicGetDestinationNode() {
        return destinationNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDestinationNode(LinkableNode newDestinationNode, NotificationChain msgs) {
        LinkableNode oldDestinationNode = destinationNode;
        destinationNode = newDestinationNode;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE, oldDestinationNode, newDestinationNode);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDestinationNode(LinkableNode newDestinationNode) {
        if (newDestinationNode != destinationNode) {
            NotificationChain msgs = null;
            if (destinationNode != null)
                msgs = ((InternalEObject)destinationNode).eInverseRemove(this, ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS, LinkableNode.class, msgs);
            if (newDestinationNode != null)
                msgs = ((InternalEObject)newDestinationNode).eInverseAdd(this, ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS, LinkableNode.class, msgs);
            msgs = basicSetDestinationNode(newDestinationNode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE, newDestinationNode, newDestinationNode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Material getAssociatedMaterial() {
        if (associatedMaterial != null && associatedMaterial.eIsProxy()) {
            InternalEObject oldAssociatedMaterial = (InternalEObject)associatedMaterial;
            associatedMaterial = (Material)eResolveProxy(oldAssociatedMaterial);
            if (associatedMaterial != oldAssociatedMaterial) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL, oldAssociatedMaterial, associatedMaterial));
            }
        }
        return associatedMaterial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Material basicGetAssociatedMaterial() {
        return associatedMaterial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociatedMaterial(Material newAssociatedMaterial) {
        Material oldAssociatedMaterial = associatedMaterial;
        associatedMaterial = newAssociatedMaterial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL, oldAssociatedMaterial, associatedMaterial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                if (sourceNode != null)
                    msgs = ((InternalEObject)sourceNode).eInverseRemove(this, ProductionschemaPackage.LINKABLE_NODE__OUTGOING_LINKS, LinkableNode.class, msgs);
                return basicSetSourceNode((LinkableNode)otherEnd, msgs);
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                if (destinationNode != null)
                    msgs = ((InternalEObject)destinationNode).eInverseRemove(this, ProductionschemaPackage.LINKABLE_NODE__INCOMING_LINKS, LinkableNode.class, msgs);
                return basicSetDestinationNode((LinkableNode)otherEnd, msgs);
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
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                return basicSetSourceNode(null, msgs);
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                return basicSetDestinationNode(null, msgs);
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
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                if (resolve) return getSourceNode();
                return basicGetSourceNode();
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                if (resolve) return getDestinationNode();
                return basicGetDestinationNode();
            case ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL:
                if (resolve) return getAssociatedMaterial();
                return basicGetAssociatedMaterial();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                setSourceNode((LinkableNode)newValue);
                return;
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                setDestinationNode((LinkableNode)newValue);
                return;
            case ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL:
                setAssociatedMaterial((Material)newValue);
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
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                setSourceNode((LinkableNode)null);
                return;
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                setDestinationNode((LinkableNode)null);
                return;
            case ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL:
                setAssociatedMaterial((Material)null);
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
            case ProductionschemaPackage.MATERIAL_LINK__SOURCE_NODE:
                return sourceNode != null;
            case ProductionschemaPackage.MATERIAL_LINK__DESTINATION_NODE:
                return destinationNode != null;
            case ProductionschemaPackage.MATERIAL_LINK__ASSOCIATED_MATERIAL:
                return associatedMaterial != null;
        }
        return super.eIsSet(featureID);
    }

} //MaterialLinkImpl
