/**
 */
package cV.impl;

import cV.CVPackage;
import cV.Contacts;
import cV.Text;
import cV.URL;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contacts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cV.impl.ContactsImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link cV.impl.ContactsImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link cV.impl.ContactsImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactsImpl extends SectionImpl implements Contacts {
	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected Text phone;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected Text email;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<URL> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CVPackage.Literals.CONTACTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhone(Text newPhone, NotificationChain msgs) {
		Text oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__PHONE,
					oldPhone, newPhone);
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
	public void setPhone(Text newPhone) {
		if (newPhone != phone) {
			NotificationChain msgs = null;
			if (phone != null)
				msgs = ((InternalEObject) phone).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.CONTACTS__PHONE, null, msgs);
			if (newPhone != null)
				msgs = ((InternalEObject) newPhone).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.CONTACTS__PHONE, null, msgs);
			msgs = basicSetPhone(newPhone, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__PHONE, newPhone, newPhone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmail(Text newEmail, NotificationChain msgs) {
		Text oldEmail = email;
		email = newEmail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__EMAIL,
					oldEmail, newEmail);
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
	public void setEmail(Text newEmail) {
		if (newEmail != email) {
			NotificationChain msgs = null;
			if (email != null)
				msgs = ((InternalEObject) email).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.CONTACTS__EMAIL, null, msgs);
			if (newEmail != null)
				msgs = ((InternalEObject) newEmail).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CVPackage.CONTACTS__EMAIL, null, msgs);
			msgs = basicSetEmail(newEmail, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CVPackage.CONTACTS__EMAIL, newEmail, newEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URL> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<URL>(URL.class, this, CVPackage.CONTACTS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CVPackage.CONTACTS__PHONE:
			return basicSetPhone(null, msgs);
		case CVPackage.CONTACTS__EMAIL:
			return basicSetEmail(null, msgs);
		case CVPackage.CONTACTS__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
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
		case CVPackage.CONTACTS__PHONE:
			return getPhone();
		case CVPackage.CONTACTS__EMAIL:
			return getEmail();
		case CVPackage.CONTACTS__LINKS:
			return getLinks();
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
		case CVPackage.CONTACTS__PHONE:
			setPhone((Text) newValue);
			return;
		case CVPackage.CONTACTS__EMAIL:
			setEmail((Text) newValue);
			return;
		case CVPackage.CONTACTS__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends URL>) newValue);
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
		case CVPackage.CONTACTS__PHONE:
			setPhone((Text) null);
			return;
		case CVPackage.CONTACTS__EMAIL:
			setEmail((Text) null);
			return;
		case CVPackage.CONTACTS__LINKS:
			getLinks().clear();
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
		case CVPackage.CONTACTS__PHONE:
			return phone != null;
		case CVPackage.CONTACTS__EMAIL:
			return email != null;
		case CVPackage.CONTACTS__LINKS:
			return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContactsImpl
