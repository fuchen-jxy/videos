package com.ies.domain;

import java.io.Serializable;
import java.util.Date;

public class Collect implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.user_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.video_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private Integer videoId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.enable_status
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private Integer enableStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect.created
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table collect
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.id
     *
     * @return the value of collect.id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect.id
     *
     * @param id the value for collect.id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.user_id
     *
     * @return the value of collect.user_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect.user_id
     *
     * @param userId the value for collect.user_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.video_id
     *
     * @return the value of collect.video_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect.video_id
     *
     * @param videoId the value for collect.video_id
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.enable_status
     *
     * @return the value of collect.enable_status
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public Integer getEnableStatus() {
        return enableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect.enable_status
     *
     * @param enableStatus the value for collect.enable_status
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect.created
     *
     * @return the value of collect.created
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect.created
     *
     * @param created the value for collect.created
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect
     *
     * @mbggenerated Sat Mar 28 21:58:36 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", videoId=").append(videoId);
        sb.append(", enableStatus=").append(enableStatus);
        sb.append(", created=").append(created);
        sb.append("]");
        return sb.toString();
    }
}