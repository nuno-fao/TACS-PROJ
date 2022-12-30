/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Date;
import cV.Image;
import cV.PersonalData;
import cV.Text;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link cV.impl.PersonalDataImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonalDataImpl extends SectionImpl implements PersonalData {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Text name;

	/**
	 * The cached value of the '{@link #getPhoto() <em>Photo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoto()
	 * @generated
	 * @ordered
	 */
	protected Image photo;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate;

	/**
	 * The cached value of the '{@link #getAbout_me() <em>About me</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout_me()
	 * @generated
	 * @ordered
	 */
	protected Text about_me;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected Text address;

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
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Text newName, NotificationChain msgs) {
		Text oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.PERSONAL_DATA__NAME, oldName, newName);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Text newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject) name).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject) newName).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getPhoto() {
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhoto(Image newPhoto, NotificationChain msgs) {
		Image oldPhoto = photo;
		photo = newPhoto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.PERSONAL_DATA__PHOTO, oldPhoto, newPhoto);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoto(Image newPhoto) {
		if (newPhoto != photo) {
			NotificationChain msgs = null;
			if (photo != null)
				msgs = ((InternalEObject) photo).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__PHOTO, null, msgs);
			if (newPhoto != null)
				msgs = ((InternalEObject) newPhoto).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__PHOTO, null, msgs);
			msgs = basicSetPhoto(newPhoto, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__PHOTO, newPhoto, newPhoto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBirthdate(Date newBirthdate, NotificationChain msgs) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.PERSONAL_DATA__BIRTHDATE, oldBirthdate, newBirthdate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		if (newBirthdate != birthdate) {
			NotificationChain msgs = null;
			if (birthdate != null)
				msgs = ((InternalEObject) birthdate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__BIRTHDATE, null, msgs);
			if (newBirthdate != null)
				msgs = ((InternalEObject) newBirthdate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__BIRTHDATE, null, msgs);
			msgs = basicSetBirthdate(newBirthdate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__BIRTHDATE, newBirthdate,
					newBirthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getAbout_me() {
		return about_me;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbout_me(Text newAbout_me, NotificationChain msgs) {
		Text oldAbout_me = about_me;
		about_me = newAbout_me;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.PERSONAL_DATA__ABOUT_ME, oldAbout_me, newAbout_me);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbout_me(Text newAbout_me) {
		if (newAbout_me != about_me) {
			NotificationChain msgs = null;
			if (about_me != null)
				msgs = ((InternalEObject) about_me).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__ABOUT_ME, null, msgs);
			if (newAbout_me != null)
				msgs = ((InternalEObject) newAbout_me).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__ABOUT_ME, null, msgs);
			msgs = basicSetAbout_me(newAbout_me, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__ABOUT_ME, newAbout_me,
					newAbout_me));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(Text newAddress, NotificationChain msgs) {
		Text oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CVPackage.PERSONAL_DATA__ADDRESS, oldAddress, newAddress);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(Text newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject) address).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject) newAddress).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.PERSONAL_DATA__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.PERSONAL_DATA__ADDRESS, newAddress,
					newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CVPackage.PERSONAL_DATA__NAME:
			return basicSetName(null, msgs);
		case CVPackage.PERSONAL_DATA__PHOTO:
			return basicSetPhoto(null, msgs);
		case CVPackage.PERSONAL_DATA__BIRTHDATE:
			return basicSetBirthdate(null, msgs);
		case CVPackage.PERSONAL_DATA__ABOUT_ME:
			return basicSetAbout_me(null, msgs);
		case CVPackage.PERSONAL_DATA__ADDRESS:
			return basicSetAddress(null, msgs);
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
		case CVPackage.PERSONAL_DATA__NAME:
			return getName();
		case CVPackage.PERSONAL_DATA__PHOTO:
			return getPhoto();
		case CVPackage.PERSONAL_DATA__BIRTHDATE:
			return getBirthdate();
		case CVPackage.PERSONAL_DATA__ABOUT_ME:
			return getAbout_me();
		case CVPackage.PERSONAL_DATA__ADDRESS:
			return getAddress();
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
			setName((Text) newValue);
			return;
		case CVPackage.PERSONAL_DATA__PHOTO:
			setPhoto((Image) newValue);
			return;
		case CVPackage.PERSONAL_DATA__BIRTHDATE:
			setBirthdate((Date) newValue);
			return;
		case CVPackage.PERSONAL_DATA__ABOUT_ME:
			setAbout_me((Text) newValue);
			return;
		case CVPackage.PERSONAL_DATA__ADDRESS:
			setAddress((Text) newValue);
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
			setName((Text) null);
			return;
		case CVPackage.PERSONAL_DATA__PHOTO:
			setPhoto((Image) null);
			return;
		case CVPackage.PERSONAL_DATA__BIRTHDATE:
			setBirthdate((Date) null);
			return;
		case CVPackage.PERSONAL_DATA__ABOUT_ME:
			setAbout_me((Text) null);
			return;
		case CVPackage.PERSONAL_DATA__ADDRESS:
			setAddress((Text) null);
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
		case CVPackage.PERSONAL_DATA__ADDRESS:
			return address != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonalDataImpl
