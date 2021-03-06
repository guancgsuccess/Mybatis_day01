package tech.aistar.day04.entity;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    //private User user;
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.number
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createtime
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.note
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.number
     *
     * @return the value of orders.number
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.number
     *
     * @param number the value for orders.number
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createtime
     *
     * @return the value of orders.createtime
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createtime
     *
     * @param createtime the value for orders.createtime
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.note
     *
     * @return the value of orders.note
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.note
     *
     * @param note the value for orders.note
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbggenerated Tue May 14 09:31:12 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", number=").append(number);
        sb.append(", createtime=").append(createtime);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}