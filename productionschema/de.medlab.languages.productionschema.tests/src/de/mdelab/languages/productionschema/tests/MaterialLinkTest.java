/**
 */
package de.mdelab.languages.productionschema.tests;

import de.mdelab.languages.productionschema.MaterialLink;
import de.mdelab.languages.productionschema.ProductionschemaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Material Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MaterialLinkTest extends IdentifiableElementTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(MaterialLinkTest.class);
    }

    /**
     * Constructs a new Material Link test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaterialLinkTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Material Link test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected MaterialLink getFixture() {
        return (MaterialLink)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProductionschemaFactory.eINSTANCE.createMaterialLink());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

} //MaterialLinkTest
