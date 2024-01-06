
package p1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the p1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteEmployee_QNAME = new QName("http://p1/", "deleteEmployee");
    private final static QName _UpdateEmployeeResponse_QNAME = new QName("http://p1/", "updateEmployeeResponse");
    private final static QName _AddEmployee_QNAME = new QName("http://p1/", "addEmployee");
    private final static QName _SearchEmployees_QNAME = new QName("http://p1/", "searchEmployees");
    private final static QName _Getemployees_QNAME = new QName("http://p1/", "getemployees");
    private final static QName _GetemployeesResponse_QNAME = new QName("http://p1/", "getemployeesResponse");
    private final static QName _UpdateEmployee_QNAME = new QName("http://p1/", "updateEmployee");
    private final static QName _GetEmployeeById_QNAME = new QName("http://p1/", "getEmployeeById");
    private final static QName _Employee_QNAME = new QName("http://p1/", "Employee");
    private final static QName _DeleteEmployeeResponse_QNAME = new QName("http://p1/", "deleteEmployeeResponse");
    private final static QName _AddEmployeeResponse_QNAME = new QName("http://p1/", "addEmployeeResponse");
    private final static QName _SearchEmployeesResponse_QNAME = new QName("http://p1/", "searchEmployeesResponse");
    private final static QName _GetEmployeeByIdResponse_QNAME = new QName("http://p1/", "getEmployeeByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: p1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeByIdResponse }
     * 
     */
    public GetEmployeeByIdResponse createGetEmployeeByIdResponse() {
        return new GetEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link SearchEmployeesResponse }
     * 
     */
    public SearchEmployeesResponse createSearchEmployeesResponse() {
        return new SearchEmployeesResponse();
    }

    /**
     * Create an instance of {@link AddEmployeeResponse }
     * 
     */
    public AddEmployeeResponse createAddEmployeeResponse() {
        return new AddEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeById }
     * 
     */
    public GetEmployeeById createGetEmployeeById() {
        return new GetEmployeeById();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link DeleteEmployeeResponse }
     * 
     */
    public DeleteEmployeeResponse createDeleteEmployeeResponse() {
        return new DeleteEmployeeResponse();
    }

    /**
     * Create an instance of {@link UpdateEmployee }
     * 
     */
    public UpdateEmployee createUpdateEmployee() {
        return new UpdateEmployee();
    }

    /**
     * Create an instance of {@link SearchEmployees }
     * 
     */
    public SearchEmployees createSearchEmployees() {
        return new SearchEmployees();
    }

    /**
     * Create an instance of {@link Getemployees }
     * 
     */
    public Getemployees createGetemployees() {
        return new Getemployees();
    }

    /**
     * Create an instance of {@link GetemployeesResponse }
     * 
     */
    public GetemployeesResponse createGetemployeesResponse() {
        return new GetemployeesResponse();
    }

    /**
     * Create an instance of {@link DeleteEmployee }
     * 
     */
    public DeleteEmployee createDeleteEmployee() {
        return new DeleteEmployee();
    }

    /**
     * Create an instance of {@link UpdateEmployeeResponse }
     * 
     */
    public UpdateEmployeeResponse createUpdateEmployeeResponse() {
        return new UpdateEmployeeResponse();
    }

    /**
     * Create an instance of {@link AddEmployee }
     * 
     */
    public AddEmployee createAddEmployee() {
        return new AddEmployee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "deleteEmployee")
    public JAXBElement<DeleteEmployee> createDeleteEmployee(DeleteEmployee value) {
        return new JAXBElement<DeleteEmployee>(_DeleteEmployee_QNAME, DeleteEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "updateEmployeeResponse")
    public JAXBElement<UpdateEmployeeResponse> createUpdateEmployeeResponse(UpdateEmployeeResponse value) {
        return new JAXBElement<UpdateEmployeeResponse>(_UpdateEmployeeResponse_QNAME, UpdateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "addEmployee")
    public JAXBElement<AddEmployee> createAddEmployee(AddEmployee value) {
        return new JAXBElement<AddEmployee>(_AddEmployee_QNAME, AddEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "searchEmployees")
    public JAXBElement<SearchEmployees> createSearchEmployees(SearchEmployees value) {
        return new JAXBElement<SearchEmployees>(_SearchEmployees_QNAME, SearchEmployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getemployees }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "getemployees")
    public JAXBElement<Getemployees> createGetemployees(Getemployees value) {
        return new JAXBElement<Getemployees>(_Getemployees_QNAME, Getemployees.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetemployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "getemployeesResponse")
    public JAXBElement<GetemployeesResponse> createGetemployeesResponse(GetemployeesResponse value) {
        return new JAXBElement<GetemployeesResponse>(_GetemployeesResponse_QNAME, GetemployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "updateEmployee")
    public JAXBElement<UpdateEmployee> createUpdateEmployee(UpdateEmployee value) {
        return new JAXBElement<UpdateEmployee>(_UpdateEmployee_QNAME, UpdateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "getEmployeeById")
    public JAXBElement<GetEmployeeById> createGetEmployeeById(GetEmployeeById value) {
        return new JAXBElement<GetEmployeeById>(_GetEmployeeById_QNAME, GetEmployeeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "deleteEmployeeResponse")
    public JAXBElement<DeleteEmployeeResponse> createDeleteEmployeeResponse(DeleteEmployeeResponse value) {
        return new JAXBElement<DeleteEmployeeResponse>(_DeleteEmployeeResponse_QNAME, DeleteEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "addEmployeeResponse")
    public JAXBElement<AddEmployeeResponse> createAddEmployeeResponse(AddEmployeeResponse value) {
        return new JAXBElement<AddEmployeeResponse>(_AddEmployeeResponse_QNAME, AddEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchEmployeesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "searchEmployeesResponse")
    public JAXBElement<SearchEmployeesResponse> createSearchEmployeesResponse(SearchEmployeesResponse value) {
        return new JAXBElement<SearchEmployeesResponse>(_SearchEmployeesResponse_QNAME, SearchEmployeesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://p1/", name = "getEmployeeByIdResponse")
    public JAXBElement<GetEmployeeByIdResponse> createGetEmployeeByIdResponse(GetEmployeeByIdResponse value) {
        return new JAXBElement<GetEmployeeByIdResponse>(_GetEmployeeByIdResponse_QNAME, GetEmployeeByIdResponse.class, null, value);
    }

}
