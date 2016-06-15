/**
 */
package de.mdelab.languages.productionschema.tests;

import de.mdelab.languages.productionschema.DisjunctiveNode;
import de.mdelab.languages.productionschema.ProductionschemaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Disjunctive Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DisjunctiveNodeTest extends LinkableNodeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(DisjunctiveNodeTest.class);
    }

    /**
     * Constructs a new Disjunctive Node test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DisjunctiveNodeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Disjunctive Node test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected DisjunctiveNode getFixture() {
        return (DisjunctiveNode)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(ProductionschemaFactory.eINSTANCE.createDisjunctiveNode());
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

} //DisjunctiveNodeTest
