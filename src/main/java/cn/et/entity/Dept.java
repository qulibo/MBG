package cn.et.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.did
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    private Integer did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.pid
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.did
     *
     * @return the value of dept.did
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.did
     *
     * @param did the value for dept.did
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.pid
     *
     * @return the value of dept.pid
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.pid
     *
     * @param pid the value for dept.pid
     *
     * @mbg.generated Wed Dec 13 19:49:32 CST 2017
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}