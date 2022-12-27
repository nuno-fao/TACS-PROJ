/**
 */
package cV.tests;

import cV.BibliographicEntry;
import cV.CVFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bibliographic Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibliographicEntryTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BibliographicEntryTest.class);
	}

	/**
	 * Constructs a new Bibliographic Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographicEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bibliographic Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BibliographicEntry getFixture() {
		return (BibliographicEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CVFactory.eINSTANCE.createBibliographicEntry());
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

} //BibliographicEntryTest
