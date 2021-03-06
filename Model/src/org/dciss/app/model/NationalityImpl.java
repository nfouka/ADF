package org.dciss.app.model;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 13 16:36:20 CEST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class NationalityImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        NationalityId,
        Nationality,
        StudentId,
        Nationality1,
        StudentIdNationality,
        Student,
        Comptes;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int NATIONALITYID = AttributesEnum.NationalityId.index();
    public static final int NATIONALITY = AttributesEnum.Nationality.index();
    public static final int STUDENTID = AttributesEnum.StudentId.index();
    public static final int NATIONALITY1 = AttributesEnum.Nationality1.index();
    public static final int STUDENTIDNATIONALITY = AttributesEnum.StudentIdNationality.index();
    public static final int STUDENT = AttributesEnum.Student.index();
    public static final int COMPTES = AttributesEnum.Comptes.index();

    /**
     * This is the default constructor (do not remove).
     */
    public NationalityImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("org.dciss.app.model.Nationality");
    }


    /**
     * Gets the attribute value for NationalityId, using the alias name NationalityId.
     * @return the value of NationalityId
     */
    public BigDecimal getNationalityId() {
        return (BigDecimal) getAttributeInternal(NATIONALITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for NationalityId.
     * @param value value to set the NationalityId
     */
    public void setNationalityId(BigDecimal value) {
        setAttributeInternal(NATIONALITYID, value);
    }

    /**
     * Gets the attribute value for Nationality, using the alias name Nationality.
     * @return the value of Nationality
     */
    public String getNationality() {
        return (String) getAttributeInternal(NATIONALITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Nationality.
     * @param value value to set the Nationality
     */
    public void setNationality(String value) {
        setAttributeInternal(NATIONALITY, value);
    }

    /**
     * Gets the attribute value for StudentId, using the alias name StudentId.
     * @return the value of StudentId
     */
    public BigDecimal getStudentId() {
        return (BigDecimal) getAttributeInternal(STUDENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StudentId.
     * @param value value to set the StudentId
     */
    public void setStudentId(BigDecimal value) {
        setAttributeInternal(STUDENTID, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getNationality1() {
        return (RowIterator) getAttributeInternal(NATIONALITY1);
    }

    /**
     * @return the associated entity NationalityImpl.
     */
    public NationalityImpl getStudentIdNationality() {
        return (NationalityImpl) getAttributeInternal(STUDENTIDNATIONALITY);
    }

    /**
     * Sets <code>value</code> as the associated entity NationalityImpl.
     */
    public void setStudentIdNationality(NationalityImpl value) {
        setAttributeInternal(STUDENTIDNATIONALITY, value);
    }

    /**
     * @return the associated entity StudentImpl.
     */
    public StudentImpl getStudent() {
        return (StudentImpl) getAttributeInternal(STUDENT);
    }

    /**
     * Sets <code>value</code> as the associated entity StudentImpl.
     */
    public void setStudent(StudentImpl value) {
        setAttributeInternal(STUDENT, value);
    }

    /**
     * @return the associated entity ComptesImpl.
     */
    public ComptesImpl getComptes() {
        return (ComptesImpl) getAttributeInternal(COMPTES);
    }

    /**
     * Sets <code>value</code> as the associated entity ComptesImpl.
     */
    public void setComptes(ComptesImpl value) {
        setAttributeInternal(COMPTES, value);
    }


    /**
     * @param nationalityId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal nationalityId) {
        return new Key(new Object[] { nationalityId });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}

