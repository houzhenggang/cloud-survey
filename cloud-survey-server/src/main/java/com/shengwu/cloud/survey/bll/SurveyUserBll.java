package com.shengwu.cloud.survey.bll;

import com.shengwu.cloud.survey.model.ConcernListModel;
import com.shengwu.cloud.survey.model.UserBaseModel;
import com.shengwu.cloud.survey.model.UserConcernModel;
import com.shengwu.cloud.survey.model.UserInfoListModel;
import com.shengwu.cloud.survey.model.UserUpdateModel;

import java.util.List;

/**
 * 用户操作逻辑处理。
 * Author   shengwu。
 * Date:    2017/10/3 0003
 */
public interface SurveyUserBll {
    /**
     * 用户账号创建。
     *
     * @param userBaseModel 用户注册信息model
     * @return 注册账号id
     */
    String createUser(UserBaseModel userBaseModel);

    /**
     * 用户登陆/注销。
     *
     * @param userAccount 用户账号
     * @param password    密码
     * @param updateTime  更新时间
     * @return 用户基本信息。
     */
    UserBaseModel getUser(String userAccount, String password, String updateTime);

    /**
     * 用户账号信息修改。
     *
     * @param userBaseModel 用户账号修改信息
     * @return boolean
     */
    Boolean updateUser(UserBaseModel userBaseModel);

    /**
     * 账号删除。
     *
     * @param userId 用户id
     * @return boolean
     */
    Boolean deleteUser(String userId);

    /**
     * 账号密码修改/找回/重置。
     *
     * @param userUpdateModel 用户修改密码信息
     * @return 用户修改密码后信息
     */
    Boolean UpdateUserPassword(UserUpdateModel userUpdateModel);

    /**
     * 用户添加/取消关注。
     *
     * @param userConcernModel 用户关注信息nhvh
     * @return 是否添加/取消关注
     */
    Boolean addConcern(String userId, String userConcernIds, Boolean isConcern);

    /**
     * 查询用户关注列表、粉丝列表。
     *
     * @param userId 用户id
     * @return 用户关注信
     */
    ConcernListModel getConcernList(String userId);

    /**
     * 查询用户信息。
     *
     * @param userId 用户id
     * @return 用户资料
     */
    UserInfoListModel getUserInfo(String userId);

    /**
     * 批量查询用户资料。
     *
     * @param userList 用户ld列表
     * @return 返回用户信息列表。
     */
    UserInfoListModel getUserInfoList(List<String> userList);

}
