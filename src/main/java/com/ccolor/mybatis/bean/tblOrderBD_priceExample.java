package com.ccolor.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class tblOrderBD_priceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public tblOrderBD_priceExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCSelfIsNull() {
            addCriterion("c_self is null");
            return (Criteria) this;
        }

        public Criteria andCSelfIsNotNull() {
            addCriterion("c_self is not null");
            return (Criteria) this;
        }

        public Criteria andCSelfEqualTo(Integer value) {
            addCriterion("c_self =", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotEqualTo(Integer value) {
            addCriterion("c_self <>", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfGreaterThan(Integer value) {
            addCriterion("c_self >", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_self >=", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfLessThan(Integer value) {
            addCriterion("c_self <", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfLessThanOrEqualTo(Integer value) {
            addCriterion("c_self <=", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfIn(List<Integer> values) {
            addCriterion("c_self in", values, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotIn(List<Integer> values) {
            addCriterion("c_self not in", values, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfBetween(Integer value1, Integer value2) {
            addCriterion("c_self between", value1, value2, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotBetween(Integer value1, Integer value2) {
            addCriterion("c_self not between", value1, value2, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCComIsNull() {
            addCriterion("c_com is null");
            return (Criteria) this;
        }

        public Criteria andCComIsNotNull() {
            addCriterion("c_com is not null");
            return (Criteria) this;
        }

        public Criteria andCComEqualTo(Integer value) {
            addCriterion("c_com =", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotEqualTo(Integer value) {
            addCriterion("c_com <>", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComGreaterThan(Integer value) {
            addCriterion("c_com >", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_com >=", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComLessThan(Integer value) {
            addCriterion("c_com <", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComLessThanOrEqualTo(Integer value) {
            addCriterion("c_com <=", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComIn(List<Integer> values) {
            addCriterion("c_com in", values, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotIn(List<Integer> values) {
            addCriterion("c_com not in", values, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComBetween(Integer value1, Integer value2) {
            addCriterion("c_com between", value1, value2, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotBetween(Integer value1, Integer value2) {
            addCriterion("c_com not between", value1, value2, "cCom");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNull() {
            addCriterion("temp1 is null");
            return (Criteria) this;
        }

        public Criteria andTemp1IsNotNull() {
            addCriterion("temp1 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp1EqualTo(Integer value) {
            addCriterion("temp1 =", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotEqualTo(Integer value) {
            addCriterion("temp1 <>", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThan(Integer value) {
            addCriterion("temp1 >", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThanOrEqualTo(Integer value) {
            addCriterion("temp1 >=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThan(Integer value) {
            addCriterion("temp1 <", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThanOrEqualTo(Integer value) {
            addCriterion("temp1 <=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1In(List<Integer> values) {
            addCriterion("temp1 in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotIn(List<Integer> values) {
            addCriterion("temp1 not in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Between(Integer value1, Integer value2) {
            addCriterion("temp1 between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotBetween(Integer value1, Integer value2) {
            addCriterion("temp1 not between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andSelfIsNull() {
            addCriterion("self is null");
            return (Criteria) this;
        }

        public Criteria andSelfIsNotNull() {
            addCriterion("self is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEqualTo(Integer value) {
            addCriterion("self =", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotEqualTo(Integer value) {
            addCriterion("self <>", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfGreaterThan(Integer value) {
            addCriterion("self >", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfGreaterThanOrEqualTo(Integer value) {
            addCriterion("self >=", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfLessThan(Integer value) {
            addCriterion("self <", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfLessThanOrEqualTo(Integer value) {
            addCriterion("self <=", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfIn(List<Integer> values) {
            addCriterion("self in", values, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotIn(List<Integer> values) {
            addCriterion("self not in", values, "self");
            return (Criteria) this;
        }

        public Criteria andSelfBetween(Integer value1, Integer value2) {
            addCriterion("self between", value1, value2, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotBetween(Integer value1, Integer value2) {
            addCriterion("self not between", value1, value2, "self");
            return (Criteria) this;
        }

        public Criteria andSComIsNull() {
            addCriterion("s_com is null");
            return (Criteria) this;
        }

        public Criteria andSComIsNotNull() {
            addCriterion("s_com is not null");
            return (Criteria) this;
        }

        public Criteria andSComEqualTo(Integer value) {
            addCriterion("s_com =", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotEqualTo(Integer value) {
            addCriterion("s_com <>", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComGreaterThan(Integer value) {
            addCriterion("s_com >", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_com >=", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComLessThan(Integer value) {
            addCriterion("s_com <", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComLessThanOrEqualTo(Integer value) {
            addCriterion("s_com <=", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComIn(List<Integer> values) {
            addCriterion("s_com in", values, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotIn(List<Integer> values) {
            addCriterion("s_com not in", values, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComBetween(Integer value1, Integer value2) {
            addCriterion("s_com between", value1, value2, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotBetween(Integer value1, Integer value2) {
            addCriterion("s_com not between", value1, value2, "sCom");
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