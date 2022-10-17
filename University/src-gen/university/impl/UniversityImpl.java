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
import university.University;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.UniversityImpl#getName <em>Name</em>}</li>
 *   <li>{@link university.impl.UniversityImpl#getCity <em>City</em>}</li>
 *   <li>{@link university.impl.UniversityImpl#getYear_of_foundation <em>Year of foundation</em>}</li>
 *   <li>{@link university.impl.UniversityImpl#getFaculties <em>Faculties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
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
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

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
	 * The cached value of the '{@link #getFaculties() <em>Faculties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaculties()
	 * @generated
	 * @ordered
	 */
	protected EList<Faculty> faculties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.UNIVERSITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.UNIVERSITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.UNIVERSITY__CITY, oldCity, city));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.UNIVERSITY__YEAR_OF_FOUNDATION,
					oldYear_of_foundation, year_of_foundation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Faculty> getFaculties() {
		if (faculties == null) {
			faculties = new EObjectResolvingEList<Faculty>(Faculty.class, this,
					UniversityPackage.UNIVERSITY__FACULTIES);
		}
		return faculties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UniversityPackage.UNIVERSITY__NAME:
			return getName();
		case UniversityPackage.UNIVERSITY__CITY:
			return getCity();
		case UniversityPackage.UNIVERSITY__YEAR_OF_FOUNDATION:
			return getYear_of_foundation();
		case UniversityPackage.UNIVERSITY__FACULTIES:
			return getFaculties();
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
		case UniversityPackage.UNIVERSITY__NAME:
			setName((String) newValue);
			return;
		case UniversityPackage.UNIVERSITY__CITY:
			setCity((String) newValue);
			return;
		case UniversityPackage.UNIVERSITY__YEAR_OF_FOUNDATION:
			setYear_of_foundation((Integer) newValue);
			return;
		case UniversityPackage.UNIVERSITY__FACULTIES:
			getFaculties().clear();
			getFaculties().addAll((Collection<? extends Faculty>) newValue);
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
		case UniversityPackage.UNIVERSITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case UniversityPackage.UNIVERSITY__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case UniversityPackage.UNIVERSITY__YEAR_OF_FOUNDATION:
			setYear_of_foundation(YEAR_OF_FOUNDATION_EDEFAULT);
			return;
		case UniversityPackage.UNIVERSITY__FACULTIES:
			getFaculties().clear();
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
		case UniversityPackage.UNIVERSITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case UniversityPackage.UNIVERSITY__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case UniversityPackage.UNIVERSITY__YEAR_OF_FOUNDATION:
			return year_of_foundation != YEAR_OF_FOUNDATION_EDEFAULT;
		case UniversityPackage.UNIVERSITY__FACULTIES:
			return faculties != null && !faculties.isEmpty();
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
		result.append(", city: ");
		result.append(city);
		result.append(", year_of_foundation: ");
		result.append(year_of_foundation);
		result.append(')');
		return result.toString();
	}

} //UniversityImpl
