package com.gk.model.media;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CoverInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoverInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNull() {
            addCriterion("movieId is null");
            return (Criteria) this;
        }

        public Criteria andMovieIdIsNotNull() {
            addCriterion("movieId is not null");
            return (Criteria) this;
        }

        public Criteria andMovieIdEqualTo(Long value) {
            addCriterion("movieId =", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotEqualTo(Long value) {
            addCriterion("movieId <>", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThan(Long value) {
            addCriterion("movieId >", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdGreaterThanOrEqualTo(Long value) {
            addCriterion("movieId >=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThan(Long value) {
            addCriterion("movieId <", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdLessThanOrEqualTo(Long value) {
            addCriterion("movieId <=", value, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdIn(List<Long> values) {
            addCriterion("movieId in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotIn(List<Long> values) {
            addCriterion("movieId not in", values, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdBetween(Long value1, Long value2) {
            addCriterion("movieId between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andMovieIdNotBetween(Long value1, Long value2) {
            addCriterion("movieId not between", value1, value2, "movieId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNull() {
            addCriterion("audioId is null");
            return (Criteria) this;
        }

        public Criteria andAudioIdIsNotNull() {
            addCriterion("audioId is not null");
            return (Criteria) this;
        }

        public Criteria andAudioIdEqualTo(Long value) {
            addCriterion("audioId =", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotEqualTo(Long value) {
            addCriterion("audioId <>", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThan(Long value) {
            addCriterion("audioId >", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdGreaterThanOrEqualTo(Long value) {
            addCriterion("audioId >=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThan(Long value) {
            addCriterion("audioId <", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdLessThanOrEqualTo(Long value) {
            addCriterion("audioId <=", value, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdIn(List<Long> values) {
            addCriterion("audioId in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotIn(List<Long> values) {
            addCriterion("audioId not in", values, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdBetween(Long value1, Long value2) {
            addCriterion("audioId between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andAudioIdNotBetween(Long value1, Long value2) {
            addCriterion("audioId not between", value1, value2, "audioId");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("fileId is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("fileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Long value) {
            addCriterion("fileId =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Long value) {
            addCriterion("fileId <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Long value) {
            addCriterion("fileId >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fileId >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Long value) {
            addCriterion("fileId <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Long value) {
            addCriterion("fileId <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Long> values) {
            addCriterion("fileId in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Long> values) {
            addCriterion("fileId not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Long value1, Long value2) {
            addCriterion("fileId between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Long value1, Long value2) {
            addCriterion("fileId not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("createTime <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("isDel is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("isDel is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("isDel =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("isDel <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("isDel >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDel >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("isDel <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("isDel <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("isDel in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("isDel not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("isDel between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDel not between", value1, value2, "isDel");
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