/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.test;

import java.util.List;

public class ResultBean {

    /**
     * code : 200
     * message : 操作成功
     * data : [{"id":123,"name":"sy","gender":0,"birthday":"1990-12-01","groupId":2,"employeeNo":"NO.104","title":"java研发","department":"研发部","company":"聚合科技","icon":"0de6ea98085e4b2a9757f245e438d8e7.png","createTime":"2019-07-29T17:43:26","deleted":0,"emotion":"neutral"}]
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 123
         * name : sy
         * gender : 0
         * birthday : 1990-12-01
         * groupId : 2
         * employeeNo : NO.104
         * title : java研发
         * department : 研发部
         * company : 聚合科技
         * icon : 0de6ea98085e4b2a9757f245e438d8e7.png
         * createTime : 2019-07-29T17:43:26
         * deleted : 0
         * emotion : neutral
         */

        private int id;
        private String name;
        private int gender;
        private String birthday;
        private int groupId;
        private String employeeNo;
        private String title;
        private String department;
        private String company;
        private String icon;
        private String createTime;
        private int deleted;
        private String emotion;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }

        public String getEmployeeNo() {
            return employeeNo;
        }

        public void setEmployeeNo(String employeeNo) {
            this.employeeNo = employeeNo;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public int getDeleted() {
            return deleted;
        }

        public void setDeleted(int deleted) {
            this.deleted = deleted;
        }

        public String getEmotion() {
            return emotion;
        }

        public void setEmotion(String emotion) {
            this.emotion = emotion;
        }
    }
}
