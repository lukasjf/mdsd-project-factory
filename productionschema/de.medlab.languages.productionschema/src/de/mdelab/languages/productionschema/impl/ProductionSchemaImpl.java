/**
 */
package de.mdelab.languages.productionschema.impl;

import de.mdelab.languages.productionschema.LinkableNode;
import de.mdelab.languages.productionschema.Material;
import de.mdelab.languages.productionschema.MaterialLink;
import de.mdelab.languages.productionschema.ProductionSchema;
import de.mdelab.languages.productionschema.ProductionschemaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedLinkableNodes <em>Owned Linkable Nodes</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedMaterialLinks <em>Owned Material Links</em>}</li>
 *   <li>{@link de.mdelab.languages.productionschema.impl.ProductionSchemaImpl#getOwnedMaterials <em>Owned Materials</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionSchemaImpl extends MinimalEObjectImpl.Container implements ProductionSchema {
    /**
     * The cached value of the '{@link #getOwnedLinkableNodes() <em>Owned Linkable Nodes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedLinkableNodes()
     * @generated
     * @ordered
     */
    protected EList<LinkableNode> ownedLinkableNodes;

    /**
     * The cached value of the '{@link #getOwnedMaterialLinks() <em>Owned Material Links</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedMaterialLinks()
     * @generated
     * @ordered
     */
    protected EList<MaterialLink> ownedMaterialLinks;

    /**
     * The cached value of the '{@link #getOwnedMaterials() <em>Owned Materials</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnedMaterials()
     * @generated
     * @ordered
     */
    protected EList<Material> ownedMaterials;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductionSchemaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ProductionschemaPackage.Literals.PRODUCTION_SCHEMA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<LinkableNode> getOwnedLinkableNodes() {
        if (ownedLinkableNodes == null) {
            ownedLinkableNodes = new EObjectContainmentEList<LinkableNode>(LinkableNode.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES);
        }
        return ownedLinkableNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MaterialLink> getOwnedMaterialLinks() {
        if (ownedMaterialLinks == null) {
            ownedMaterialLinks = new EObjectContainmentEList<MaterialLink>(MaterialLink.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS);
        }
        return ownedMaterialLinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Material> getOwnedMaterials() {
        if (ownedMaterials == null) {
            ownedMaterials = new EObjectContainmentEList<Material>(Material.class, this, ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS);
        }
        return ownedMaterials;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
                return ((InternalEList<?>)getOwnedLinkableNodes()).basicRemove(otherEnd, msgs);
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS:
                return ((InternalEList<?>)getOwnedMaterialLinks()).basicRemove(otherEnd, msgs);
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
                return ((InternalEList<?>)getOwnedMaterials()).basicRemove(otherEnd, msgs);
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
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
                return getOwnedLinkableNodes();
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS:
                return getOwnedMaterialLinks();
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
                return getOwnedMaterials();
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
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
                getOwnedLinkableNodes().clear();
                getOwnedLinkableNodes().addAll((Collection<? extends LinkableNode>)newValue);
                return;
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS:
                getOwnedMaterialLinks().clear();
                getOwnedMaterialLinks().addAll((Collection<? extends MaterialLink>)newValue);
                return;
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
                getOwnedMaterials().clear();
                getOwnedMaterials().addAll((Collection<? extends Material>)newValue);
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
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
                getOwnedLinkableNodes().clear();
                return;
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS:
                getOwnedMaterialLinks().clear();
                return;
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
                getOwnedMaterials().clear();
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
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_LINKABLE_NODES:
                return ownedLinkableNodes != null && !ownedLinkableNodes.isEmpty();
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIAL_LINKS:
                return ownedMaterialLinks != null && !ownedMaterialLinks.isEmpty();
            case ProductionschemaPackage.PRODUCTION_SCHEMA__OWNED_MATERIALS:
                return ownedMaterials != null && !ownedMaterials.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProductionSchemaImpl
