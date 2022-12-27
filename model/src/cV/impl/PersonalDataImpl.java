/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Image;
import cV.PersonalData;
import cV.Text;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.PersonalDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link cV.impl.PersonalDataImpl#getPhoto <em>Photo</em>}</li>
 *   <li>{@link cV.impl.PersonalDataImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link cV.impl.PersonalDataImpl#getAbout_me <em>About me</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalDataImpl extends SectionImpl implements PersonalData {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Text name;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Image photo;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Text birthdate;

	/**
	 * The cached value of the '{@link #getAbout_me() <em>About me</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout_me()
	 * @generated
	 * @ordered
	 */
	protected Text about_me;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.PERSONAL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (Text)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.PERSONAL_DATA__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Text newName) {
		Text oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getPhoto() {
		if (photo != null && photo.eIsProxy()) {
			InternalEObject oldPhoto = (InternalEObject)photo;
			photo = (Image)eResolveProxy(oldPhoto);
			if (photo != oldPhoto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.PERSONAL_DATA__PHOTO, oldPhoto, photo));
			}
		}
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Image newPhoto) {
		Image oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__PHOTO, oldPhoto, photo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getBirthdate() {
		if (birthdate != null && birthdate.eIsProxy()) {
			InternalEObject oldBirthdate = (InternalEObject)birthdate;
			birthdate = (Text)eResolveProxy(oldBirthdate);
			if (birthdate != oldBirthdate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.PERSONAL_DATA__BIRTHDATE, oldBirthdate, birthdate));
			}
		}
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Text newBirthdate) {
		Text oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getAbout_me() {
		if (about_me != null && about_me.eIsProxy()) {
			InternalEObject oldAbout_me = (InternalEObject)about_me;
			about_me = (Text)eResolveProxy(oldAbout_me);
			if (about_me != oldAbout_me) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CVPackage.PERSONAL_DATA__ABOUT_ME, oldAbout_me, about_me));
			}
		}
		return about_me;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text basicGetAbout_me() {
		return about_me;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbout_me(Text newAbout_me) {
		Text oldAbout_me = about_me;
		about_me = newAbout_me;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__ABOUT_ME, oldAbout_me, about_me));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CVPackage.PERSONAL_DATA__NAME:
				if (resolve) return getName();
				return basicGetName();
			case CVPackage.PERSONAL_DATA__PHOTO:
				if (resolve) return getPhoto();
				return basicGetPhoto();
			case CVPackage.PERSONAL_DATA__BIRTHDATE:
				if (resolve) return getBirthdate();
				return basicGetBirthdate();
			case CVPackage.PERSONAL_DATA__ABOUT_ME:
				if (resolve) return getAbout_me();
				return basicGetAbout_me();
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
			case CVPackage.PERSONAL_DATA__NAME:
				setName((Text)newValue);
				return;
			case CVPackage.PERSONAL_DATA__PHOTO:
				setPhoto((Image)newValue);
				return;
			case CVPackage.PERSONAL_DATA__BIRTHDATE:
				setBirthdate((Text)newValue);
				return;
			case CVPackage.PERSONAL_DATA__ABOUT_ME:
				setAbout_me((Text)newValue);
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
			case CVPackage.PERSONAL_DATA__NAME:
				setName((Text)null);
				return;
			case CVPackage.PERSONAL_DATA__PHOTO:
				setPhoto((Image)null);
				return;
			case CVPackage.PERSONAL_DATA__BIRTHDATE:
				setBirthdate((Text)null);
				return;
			case CVPackage.PERSONAL_DATA__ABOUT_ME:
				setAbout_me((Text)null);
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
			case CVPackage.PERSONAL_DATA__NAME:
				return name != null;
			case CVPackage.PERSONAL_DATA__PHOTO:
				return photo != null;
			case CVPackage.PERSONAL_DATA__BIRTHDATE:
				return birthdate != null;
			case CVPackage.PERSONAL_DATA__ABOUT_ME:
				return about_me != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonalDataImpl
