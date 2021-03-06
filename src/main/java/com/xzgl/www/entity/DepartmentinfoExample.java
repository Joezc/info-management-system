package com.xzgl.www.entity;

import java.util.ArrayList;
import java.util.List;

public class DepartmentinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public DepartmentinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDpnoIsNull() {
            addCriterion("DpNo is null");
            return (Criteria) this;
        }

        public Criteria andDpnoIsNotNull() {
            addCriterion("DpNo is not null");
            return (Criteria) this;
        }

        public Criteria andDpnoEqualTo(String value) {
            addCriterion("DpNo =", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoNotEqualTo(String value) {
            addCriterion("DpNo <>", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoGreaterThan(String value) {
            addCriterion("DpNo >", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoGreaterThanOrEqualTo(String value) {
            addCriterion("DpNo >=", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoLessThan(String value) {
            addCriterion("DpNo <", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoLessThanOrEqualTo(String value) {
            addCriterion("DpNo <=", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoLike(String value) {
            addCriterion("DpNo like", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoNotLike(String value) {
            addCriterion("DpNo not like", value, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoIn(List<String> values) {
            addCriterion("DpNo in", values, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoNotIn(List<String> values) {
            addCriterion("DpNo not in", values, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoBetween(String value1, String value2) {
            addCriterion("DpNo between", value1, value2, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnoNotBetween(String value1, String value2) {
            addCriterion("DpNo not between", value1, value2, "dpno");
            return (Criteria) this;
        }

        public Criteria andDpnameIsNull() {
            addCriterion("Dpname is null");
            return (Criteria) this;
        }

        public Criteria andDpnameIsNotNull() {
            addCriterion("Dpname is not null");
            return (Criteria) this;
        }

        public Criteria andDpnameEqualTo(String value) {
            addCriterion("Dpname =", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotEqualTo(String value) {
            addCriterion("Dpname <>", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameGreaterThan(String value) {
            addCriterion("Dpname >", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameGreaterThanOrEqualTo(String value) {
            addCriterion("Dpname >=", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLessThan(String value) {
            addCriterion("Dpname <", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLessThanOrEqualTo(String value) {
            addCriterion("Dpname <=", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameLike(String value) {
            addCriterion("Dpname like", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotLike(String value) {
            addCriterion("Dpname not like", value, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameIn(List<String> values) {
            addCriterion("Dpname in", values, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotIn(List<String> values) {
            addCriterion("Dpname not in", values, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameBetween(String value1, String value2) {
            addCriterion("Dpname between", value1, value2, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpnameNotBetween(String value1, String value2) {
            addCriterion("Dpname not between", value1, value2, "dpname");
            return (Criteria) this;
        }

        public Criteria andDpadressIsNull() {
            addCriterion("Dpadress is null");
            return (Criteria) this;
        }

        public Criteria andDpadressIsNotNull() {
            addCriterion("Dpadress is not null");
            return (Criteria) this;
        }

        public Criteria andDpadressEqualTo(String value) {
            addCriterion("Dpadress =", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressNotEqualTo(String value) {
            addCriterion("Dpadress <>", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressGreaterThan(String value) {
            addCriterion("Dpadress >", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressGreaterThanOrEqualTo(String value) {
            addCriterion("Dpadress >=", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressLessThan(String value) {
            addCriterion("Dpadress <", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressLessThanOrEqualTo(String value) {
            addCriterion("Dpadress <=", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressLike(String value) {
            addCriterion("Dpadress like", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressNotLike(String value) {
            addCriterion("Dpadress not like", value, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressIn(List<String> values) {
            addCriterion("Dpadress in", values, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressNotIn(List<String> values) {
            addCriterion("Dpadress not in", values, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressBetween(String value1, String value2) {
            addCriterion("Dpadress between", value1, value2, "dpadress");
            return (Criteria) this;
        }

        public Criteria andDpadressNotBetween(String value1, String value2) {
            addCriterion("Dpadress not between", value1, value2, "dpadress");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table departmentinfo
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 06 22:59:22 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table departmentinfo
     *
     * @mbggenerated Thu Jul 06 22:59:22 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}