/**
 */
package cV.tests;

import cV.CVFactory;
import cV.SkillEntry;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Skill Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillEntryTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SkillEntryTest.class);
	}

	/**
	 * Constructs a new Skill Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Skill Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SkillEntry getFixture() {
		return (SkillEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CVFactory.eINSTANCE.createSkillEntry());
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

} //SkillEntryTest
