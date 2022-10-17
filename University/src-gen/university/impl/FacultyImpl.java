/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import university.Faculty;
import university.Program;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Faculty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.FacultyImpl#getName <em>Name</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getYear_of_foundation <em>Year of foundation</em>}</li>
 *   <li>{@link university.impl.FacultyImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FacultyImpl extends MinimalEObjectImpl.Container implements Faculty {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear_of_foundation() <em>Year of foundation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear_of_foundation()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_OF_FOUNDATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear_of_foundation() <em>Year of foundation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear_of_foundation()
	 * @generated
	 * @ordered
	 */
	protected int year_of_foundation = YEAR_OF_FOUNDATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacultyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.FACULTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.FACULTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear_of_foundation() {
		return year_of_foundation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear_of_foundation(int newYear_of_foundation) {
		int oldYear_of_foundation = year_of_foundation;
		year_of_foundation = newYear_of_foundation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.FACULTY__YEAR_OF_FOUNDATION,
					oldYear_of_foundation, year_of_foundation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectResolvingEList<Program>(Program.class, this, UniversityPackage.FACULTY__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversityPackage.FACULTY__NAME:
			return getName();
		case UniversityPackage.FACULTY__YEAR_OF_FOUNDATION:
			return getYear_of_foundation();
		case UniversityPackage.FACULTY__PROGRAMS:
			return getPrograms();
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
		case UniversityPackage.FACULTY__NAME:
			setName((String) newValue);
			return;
		case UniversityPackage.FACULTY__YEAR_OF_FOUNDATION:
			setYear_of_foundation((Integer) newValue);
			return;
		case UniversityPackage.FACULTY__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
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
		case UniversityPackage.FACULTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UniversityPackage.FACULTY__YEAR_OF_FOUNDATION:
			setYear_of_foundation(YEAR_OF_FOUNDATION_EDEFAULT);
			return;
		case UniversityPackage.FACULTY__PROGRAMS:
			getPrograms().clear();
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
		case UniversityPackage.FACULTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UniversityPackage.FACULTY__YEAR_OF_FOUNDATION:
			return year_of_foundation != YEAR_OF_FOUNDATION_EDEFAULT;
		case UniversityPackage.FACULTY__PROGRAMS:
			return programs != null && !programs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", year_of_foundation: ");
		result.append(year_of_foundation);
		result.append(')');
		return result.toString();
	}

} //FacultyImpl
