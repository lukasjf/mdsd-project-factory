/**
 */
package de.mdelab.languages.productionschema.tests;

import de.mdelab.languages.productionschema.ProductionSchema;
import de.mdelab.languages.productionschema.ProductionschemaFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Production Schema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionSchemaTest extends TestCase {

    /**
     * The fixture for this Production Schema test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductionSchema fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ProductionSchemaTest.class);
    }

    /**
     * Constructs a new Production Schema test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProductionSchemaTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this Production Schema test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ProductionSchema fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Production Schema test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProductionSchema getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProductionschemaFactory.eINSTANCE.createProductionSchema());
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

} //ProductionSchemaTest
