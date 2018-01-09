package com.yz.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTypeExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSortsIsNull() {
            addCriterion("SORTS is null");
            return (Criteria) this;
        }

        public Criteria andSortsIsNotNull() {
            addCriterion("SORTS is not null");
            return (Criteria) this;
        }

        public Criteria andSortsEqualTo(Integer value) {
            addCriterion("SORTS =", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotEqualTo(Integer value) {
            addCriterion("SORTS <>", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThan(Integer value) {
            addCriterion("SORTS >", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORTS >=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThan(Integer value) {
            addCriterion("SORTS <", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsLessThanOrEqualTo(Integer value) {
            addCriterion("SORTS <=", value, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsIn(List<Integer> values) {
            addCriterion("SORTS in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotIn(List<Integer> values) {
            addCriterion("SORTS not in", values, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsBetween(Integer value1, Integer value2) {
            addCriterion("SORTS between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andSortsNotBetween(Integer value1, Integer value2) {
            addCriterion("SORTS not between", value1, value2, "sorts");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNull() {
            addCriterion("IS_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIsAuthIsNotNull() {
            addCriterion("IS_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuthEqualTo(String value) {
            addCriterion("IS_AUTH =", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotEqualTo(String value) {
            addCriterion("IS_AUTH <>", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThan(String value) {
            addCriterion("IS_AUTH >", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUTH >=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThan(String value) {
            addCriterion("IS_AUTH <", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLessThanOrEqualTo(String value) {
            addCriterion("IS_AUTH <=", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthLike(String value) {
            addCriterion("IS_AUTH like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotLike(String value) {
            addCriterion("IS_AUTH not like", value, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthIn(List<String> values) {
            addCriterion("IS_AUTH in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotIn(List<String> values) {
            addCriterion("IS_AUTH not in", values, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthBetween(String value1, String value2) {
            addCriterion("IS_AUTH between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsAuthNotBetween(String value1, String value2) {
            addCriterion("IS_AUTH not between", value1, value2, "isAuth");
            return (Criteria) this;
        }

        public Criteria andIsRegistIsNull() {
            addCriterion("IS_REGIST is null");
            return (Criteria) this;
        }

        public Criteria andIsRegistIsNotNull() {
            addCriterion("IS_REGIST is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegistEqualTo(String value) {
            addCriterion("IS_REGIST =", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistNotEqualTo(String value) {
            addCriterion("IS_REGIST <>", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistGreaterThan(String value) {
            addCriterion("IS_REGIST >", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REGIST >=", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistLessThan(String value) {
            addCriterion("IS_REGIST <", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistLessThanOrEqualTo(String value) {
            addCriterion("IS_REGIST <=", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistLike(String value) {
            addCriterion("IS_REGIST like", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistNotLike(String value) {
            addCriterion("IS_REGIST not like", value, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistIn(List<String> values) {
            addCriterion("IS_REGIST in", values, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistNotIn(List<String> values) {
            addCriterion("IS_REGIST not in", values, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistBetween(String value1, String value2) {
            addCriterion("IS_REGIST between", value1, value2, "isRegist");
            return (Criteria) this;
        }

        public Criteria andIsRegistNotBetween(String value1, String value2) {
            addCriterion("IS_REGIST not between", value1, value2, "isRegist");
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