/**
 */
package de.mdelab.languages.productionschema.tests;

import de.mdelab.languages.productionschema.ConjunctiveNode;
import de.mdelab.languages.productionschema.ProductionschemaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conjunctive Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConjunctiveNodeTest extends LinkableNodeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(ConjunctiveNodeTest.class);
    }

    /**
     * Constructs a new Conjunctive Node test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConjunctiveNodeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Conjunctive Node test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected ConjunctiveNode getFixture() {
        return (ConjunctiveNode)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProductionschemaFactory.eINSTANCE.createConjunctiveNode());
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

} //ConjunctiveNodeTest
