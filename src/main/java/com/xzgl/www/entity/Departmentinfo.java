package com.xzgl.www.entity;

public class Departmentinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmentinfo.DpNo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String dpno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmentinfo.Dpname
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String dpname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column departmentinfo.Dpadress
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    private String dpadress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmentinfo.DpNo
     *
     * @return the value of departmentinfo.DpNo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getDpno() {
        return dpno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmentinfo.DpNo
     *
     * @param dpno the value for departmentinfo.DpNo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setDpno(String dpno) {
        this.dpno = dpno == null ? null : dpno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmentinfo.Dpname
     *
     * @return the value of departmentinfo.Dpname
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getDpname() {
        return dpname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmentinfo.Dpname
     *
     * @param dpname the value for departmentinfo.Dpname
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setDpname(String dpname) {
        this.dpname = dpname == null ? null : dpname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column departmentinfo.Dpadress
     *
     * @return the value of departmentinfo.Dpadress
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getDpadress() {
        return dpadress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column departmentinfo.Dpadress
     *
     * @param dpadress the value for departmentinfo.Dpadress
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setDpadress(String dpadress) {
        this.dpadress = dpadress == null ? null : dpadress.trim();
    }
}