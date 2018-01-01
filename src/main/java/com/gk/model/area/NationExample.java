package com.gk.model.area;

import java.util.ArrayList;
import java.util.List;

public class NationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPinyinFullIsNull() {
            addCriterion("pinyinFull is null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullIsNotNull() {
            addCriterion("pinyinFull is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullEqualTo(String value) {
            addCriterion("pinyinFull =", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotEqualTo(String value) {
            addCriterion("pinyinFull <>", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullGreaterThan(String value) {
            addCriterion("pinyinFull >", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullGreaterThanOrEqualTo(String value) {
            addCriterion("pinyinFull >=", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLessThan(String value) {
            addCriterion("pinyinFull <", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLessThanOrEqualTo(String value) {
            addCriterion("pinyinFull <=", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLike(String value) {
            addCriterion("pinyinFull like", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotLike(String value) {
            addCriterion("pinyinFull not like", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullIn(List<String> values) {
            addCriterion("pinyinFull in", values, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotIn(List<String> values) {
            addCriterion("pinyinFull not in", values, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBetween(String value1, String value2) {
            addCriterion("pinyinFull between", value1, value2, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotBetween(String value1, String value2) {
            addCriterion("pinyinFull not between", value1, value2, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankIsNull() {
            addCriterion("pinyinFullBlank is null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankIsNotNull() {
            addCriterion("pinyinFullBlank is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankEqualTo(String value) {
            addCriterion("pinyinFullBlank =", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankNotEqualTo(String value) {
            addCriterion("pinyinFullBlank <>", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankGreaterThan(String value) {
            addCriterion("pinyinFullBlank >", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankGreaterThanOrEqualTo(String value) {
            addCriterion("pinyinFullBlank >=", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankLessThan(String value) {
            addCriterion("pinyinFullBlank <", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankLessThanOrEqualTo(String value) {
            addCriterion("pinyinFullBlank <=", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankLike(String value) {
            addCriterion("pinyinFullBlank like", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankNotLike(String value) {
            addCriterion("pinyinFullBlank not like", value, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankIn(List<String> values) {
            addCriterion("pinyinFullBlank in", values, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankNotIn(List<String> values) {
            addCriterion("pinyinFullBlank not in", values, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankBetween(String value1, String value2) {
            addCriterion("pinyinFullBlank between", value1, value2, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBlankNotBetween(String value1, String value2) {
            addCriterion("pinyinFullBlank not between", value1, value2, "pinyinFullBlank");
            return (Criteria) this;
        }

        public Criteria andPinyinShortIsNull() {
            addCriterion("pinyinShort is null");
            return (Criteria) this;
        }

        public Criteria andPinyinShortIsNotNull() {
            addCriterion("pinyinShort is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinShortEqualTo(String value) {
            addCriterion("pinyinShort =", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortNotEqualTo(String value) {
            addCriterion("pinyinShort <>", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortGreaterThan(String value) {
            addCriterion("pinyinShort >", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortGreaterThanOrEqualTo(String value) {
            addCriterion("pinyinShort >=", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortLessThan(String value) {
            addCriterion("pinyinShort <", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortLessThanOrEqualTo(String value) {
            addCriterion("pinyinShort <=", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortLike(String value) {
            addCriterion("pinyinShort like", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortNotLike(String value) {
            addCriterion("pinyinShort not like", value, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortIn(List<String> values) {
            addCriterion("pinyinShort in", values, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortNotIn(List<String> values) {
            addCriterion("pinyinShort not in", values, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortBetween(String value1, String value2) {
            addCriterion("pinyinShort between", value1, value2, "pinyinShort");
            return (Criteria) this;
        }

        public Criteria andPinyinShortNotBetween(String value1, String value2) {
            addCriterion("pinyinShort not between", value1, value2, "pinyinShort");
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