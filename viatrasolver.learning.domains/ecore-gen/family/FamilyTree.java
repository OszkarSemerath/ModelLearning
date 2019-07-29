/**
 */
package family;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link family.FamilyTree#getPeople <em>People</em>}</li>
 * </ul>
 *
 * @see family.FamilyPackage#getFamilyTree()
 * @model
 * @generated
 */
public interface FamilyTree extends EObject {
	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link family.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see family.FamilyPackage#getFamilyTree_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

} // FamilyTree
