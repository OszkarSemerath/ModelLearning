/**
 */
package family;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link family.Person#getFather <em>Father</em>}</li>
 *   <li>{@link family.Person#getMother <em>Mother</em>}</li>
 *   <li>{@link family.Person#getChildren <em>Children</em>}</li>
 *   <li>{@link family.Person#getName <em>Name</em>}</li>
 *   <li>{@link family.Person#getAge <em>Age</em>}</li>
 *   <li>{@link family.Person#getSize <em>Size</em>}</li>
 *   <li>{@link family.Person#getWeight <em>Weight</em>}</li>
 *   <li>{@link family.Person#getRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @see family.FamilyPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Father</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Father</em>' reference.
	 * @see #setFather(Male)
	 * @see family.FamilyPackage#getPerson_Father()
	 * @model
	 * @generated
	 */
	Male getFather();

	/**
	 * Sets the value of the '{@link family.Person#getFather <em>Father</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Father</em>' reference.
	 * @see #getFather()
	 * @generated
	 */
	void setFather(Male value);

	/**
	 * Returns the value of the '<em><b>Mother</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mother</em>' reference.
	 * @see #setMother(Female)
	 * @see family.FamilyPackage#getPerson_Mother()
	 * @model
	 * @generated
	 */
	Female getMother();

	/**
	 * Sets the value of the '{@link family.Person#getMother <em>Mother</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mother</em>' reference.
	 * @see #getMother()
	 * @generated
	 */
	void setMother(Female value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link family.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see family.FamilyPackage#getPerson_Children()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='familytree.queries.children'"
	 * @generated
	 */
	EList<Person> getChildren();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see family.FamilyPackage#getPerson_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link family.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see family.FamilyPackage#getPerson_Age()
	 * @model default="0"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link family.Person#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see family.FamilyPackage#getPerson_Size()
	 * @model default="0"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link family.Person#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see family.FamilyPackage#getPerson_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link family.Person#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' reference.
	 * @see family.FamilyPackage#getPerson_Relative()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.viatra.query.querybasedfeature patternFQN='familytree.queries.relative'"
	 * @generated
	 */
	Person getRelative();

} // Person
