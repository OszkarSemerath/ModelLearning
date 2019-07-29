/**
 */
package family.impl;

import family.FamilyPackage;
import family.Female;
import family.Male;
import family.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link family.impl.PersonImpl#getFather <em>Father</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getMother <em>Mother</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getAge <em>Age</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getSize <em>Size</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link family.impl.PersonImpl#getRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The cached value of the '{@link #getFather() <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFather()
	 * @generated
	 * @ordered
	 */
	protected Male father;

	/**
	 * The cached value of the '{@link #getMother() <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMother()
	 * @generated
	 * @ordered
	 */
	protected Female mother;

	/**
	 * The cached setting delegate for the '{@link #getChildren() <em>Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CHILDREN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FamilyPackage.Literals.PERSON__CHILDREN).getSettingDelegate();

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getRelative() <em>Relative</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RELATIVE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FamilyPackage.Literals.PERSON__RELATIVE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FamilyPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Male getFather() {
		if (father != null && father.eIsProxy()) {
			InternalEObject oldFather = (InternalEObject)father;
			father = (Male)eResolveProxy(oldFather);
			if (father != oldFather) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.PERSON__FATHER, oldFather, father));
			}
		}
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Male basicGetFather() {
		return father;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFather(Male newFather) {
		Male oldFather = father;
		father = newFather;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__FATHER, oldFather, father));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Female getMother() {
		if (mother != null && mother.eIsProxy()) {
			InternalEObject oldMother = (InternalEObject)mother;
			mother = (Female)eResolveProxy(oldMother);
			if (mother != oldMother) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FamilyPackage.PERSON__MOTHER, oldMother, mother));
			}
		}
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Female basicGetMother() {
		return mother;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMother(Female newMother) {
		Female oldMother = mother;
		mother = newMother;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__MOTHER, oldMother, mother));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Person> getChildren() {
		return (EList<Person>)CHILDREN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FamilyPackage.PERSON__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person getRelative() {
		return (Person)RELATIVE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetRelative() {
		return (Person)RELATIVE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FamilyPackage.PERSON__FATHER:
				if (resolve) return getFather();
				return basicGetFather();
			case FamilyPackage.PERSON__MOTHER:
				if (resolve) return getMother();
				return basicGetMother();
			case FamilyPackage.PERSON__CHILDREN:
				return getChildren();
			case FamilyPackage.PERSON__NAME:
				return getName();
			case FamilyPackage.PERSON__AGE:
				return getAge();
			case FamilyPackage.PERSON__SIZE:
				return getSize();
			case FamilyPackage.PERSON__WEIGHT:
				return getWeight();
			case FamilyPackage.PERSON__RELATIVE:
				if (resolve) return getRelative();
				return basicGetRelative();
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
			case FamilyPackage.PERSON__FATHER:
				setFather((Male)newValue);
				return;
			case FamilyPackage.PERSON__MOTHER:
				setMother((Female)newValue);
				return;
			case FamilyPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case FamilyPackage.PERSON__AGE:
				setAge((Integer)newValue);
				return;
			case FamilyPackage.PERSON__SIZE:
				setSize((Integer)newValue);
				return;
			case FamilyPackage.PERSON__WEIGHT:
				setWeight((Integer)newValue);
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
			case FamilyPackage.PERSON__FATHER:
				setFather((Male)null);
				return;
			case FamilyPackage.PERSON__MOTHER:
				setMother((Female)null);
				return;
			case FamilyPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FamilyPackage.PERSON__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case FamilyPackage.PERSON__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case FamilyPackage.PERSON__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case FamilyPackage.PERSON__FATHER:
				return father != null;
			case FamilyPackage.PERSON__MOTHER:
				return mother != null;
			case FamilyPackage.PERSON__CHILDREN:
				return CHILDREN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FamilyPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FamilyPackage.PERSON__AGE:
				return age != AGE_EDEFAULT;
			case FamilyPackage.PERSON__SIZE:
				return size != SIZE_EDEFAULT;
			case FamilyPackage.PERSON__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case FamilyPackage.PERSON__RELATIVE:
				return RELATIVE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", age: ");
		result.append(age);
		result.append(", size: ");
		result.append(size);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
