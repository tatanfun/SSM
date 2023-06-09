package crm.settings.mapper;

import crm.settings.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    User selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_user
     *
     * @mbggenerated Thu Apr 20 14:31:34 CST 2023
     */
    int updateByPrimaryKey(User record);

    /**
     * 根据账号和密码查询用户
     * @param Map
     * @return
     */
    User selectUserByLoginActAanPwd(Map<String,Object> Map);

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUsers();
}