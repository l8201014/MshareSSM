package com.zwn.model;

public class Area {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.aid
     *
     * @mbggenerated
     */
    private Integer aid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area.areaname
     *
     * @mbggenerated
     */
    private String areaname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.aid
     *
     * @return the value of area.aid
     *
     * @mbggenerated
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.aid
     *
     * @param aid the value for area.aid
     *
     * @mbggenerated
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area.areaname
     *
     * @return the value of area.areaname
     *
     * @mbggenerated
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area.areaname
     *
     * @param areaname the value for area.areaname
     *
     * @mbggenerated
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }
}