package crm.workbench.mapper;

import crm.workbench.domain.ActivityRemark;

import java.util.List;

public interface ActivityRemarkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    int insert(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    int insertSelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    ActivityRemark selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    int updateByPrimaryKeySelective(ActivityRemark record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_activity_remark
     *
     * @mbggenerated Sun May 07 13:42:58 CST 2023
     */
    int updateByPrimaryKey(ActivityRemark record);

    /**
     * 根据activityId查询该市场活动下所有备注的明细信息
     * @param activityId
     * @return
     */
    List<ActivityRemark> selectActivityRemarkForDetailByActivityId(String activityId);

    /**
     * 保存创建的市场活动备注
     * @param remark
     * @return
     */
    int insertActivityRemark(ActivityRemark remark);

    /**
     * 根据id删除市场活动备注
     * @param id
     * @return
     */
    int deleteActivityRemarkById(String id);

    /**
     * 保存修改的市场活动备注
     * @param remark
     * @return
     */
    int updateActivityRemark(ActivityRemark remark);
}