package com.inc.admin.domain.biz;

import java.util.ArrayList;
import java.util.List;

/**
 * 图书实体类
 *
 * @author tanzibiao
 * @date 2021/06/13
 *
 * @mbg.generated 2021/06/13
 */
public class BookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    /**
     * BookCriteria
     * @return
     */
    public BookCriteria() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * setOrderByClause
     * @param orderByClause
     * @return
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     * @return
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     * @param distinct
     * @return
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     * @return
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     * @return
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     * @param criteria
     * @return
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     * @return
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     * @return
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     * @return
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     * @return
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * setPageNo
     * @param pageNo
     * @return
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * getPageNo
     * @return
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * setStartRow
     * @param startRow
     * @return
     */
    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    /**
     * getStartRow
     * @return
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * setPageSize
     * @param pageSize
     * @return
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     * getPageSize
     * @return
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * setFields
     * @param fields
     * @return
     */
    public void setFields(String fields) {
        this.fields=fields;
    }

    /**
     * getFields
     * @return
     */
    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }
        public Criteria andJiIsNull() {
            addCriterion("ji is null");
            return (Criteria) this;
        }

        public Criteria andJiIsNotNull() {
            addCriterion("ji is not null");
            return (Criteria) this;
        }

        public Criteria andJiEqualTo(String value) {
            addCriterion("ji =", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiNotEqualTo(String value) {
            addCriterion("ji <>", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiGreaterThan(String value) {
            addCriterion("ji >", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiGreaterThanOrEqualTo(String value) {
            addCriterion("ji >=", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiLessThan(String value) {
            addCriterion("ji <", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiLessThanOrEqualTo(String value) {
            addCriterion("ji <=", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiLike(String value) {
            addCriterion("ji like", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiNotLike(String value) {
            addCriterion("ji not like", value, "ji");
            return (Criteria) this;
        }

        public Criteria andJiIn(List<String> values) {
            addCriterion("ji in", values, "ji");
            return (Criteria) this;
        }

        public Criteria andJiNotIn(List<String> values) {
            addCriterion("ji not in", values, "ji");
            return (Criteria) this;
        }

        public Criteria andJiBetween(String value1, String value2) {
            addCriterion("ji between", value1, value2, "ji");
            return (Criteria) this;
        }

        public Criteria andJiNotBetween(String value1, String value2) {
            addCriterion("ji not between", value1, value2, "ji");
            return (Criteria) this;
        }
        public Criteria andQuIsNull() {
            addCriterion("qu is null");
            return (Criteria) this;
        }

        public Criteria andQuIsNotNull() {
            addCriterion("qu is not null");
            return (Criteria) this;
        }

        public Criteria andQuEqualTo(String value) {
            addCriterion("qu =", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotEqualTo(String value) {
            addCriterion("qu <>", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThan(String value) {
            addCriterion("qu >", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuGreaterThanOrEqualTo(String value) {
            addCriterion("qu >=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThan(String value) {
            addCriterion("qu <", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuLessThanOrEqualTo(String value) {
            addCriterion("qu <=", value, "qu");
            return (Criteria) this;
        }

        public Criteria andQuIn(List<String> values) {
            addCriterion("qu in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotIn(List<String> values) {
            addCriterion("qu not in", values, "qu");
            return (Criteria) this;
        }

        public Criteria andQuBetween(String value1, String value2) {
            addCriterion("qu between", value1, value2, "qu");
            return (Criteria) this;
        }

        public Criteria andQuNotBetween(String value1, String value2) {
            addCriterion("qu not between", value1, value2, "qu");
            return (Criteria) this;
        }
        public Criteria andMaIsNull() {
            addCriterion("ma is null");
            return (Criteria) this;
        }

        public Criteria andMaIsNotNull() {
            addCriterion("ma  is not null");
            return (Criteria) this;
        }

        public Criteria andMaEqualTo(String value) {
            addCriterion("ma =", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotEqualTo(String value) {
            addCriterion("ma <>", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaGreaterThan(String value) {
            addCriterion("ma >", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaGreaterThanOrEqualTo(String value) {
            addCriterion("ma >=", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaLessThan(String value) {
            addCriterion("ma <", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaLessThanOrEqualTo(String value) {
            addCriterion("ma <=", value, "ma");
            return (Criteria) this;
        }

        public Criteria andMaIn(List<String> values) {
            addCriterion("ma in", values, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotIn(List<String> values) {
            addCriterion("ma not in", values, "ma");
            return (Criteria) this;
        }

        public Criteria andMaBetween(String value1, String value2) {
            addCriterion("ma between", value1, value2, "ma");
            return (Criteria) this;
        }

        public Criteria andMaNotBetween(String value1, String value2) {
            addCriterion("ma not between", value1, value2, "ma");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

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
