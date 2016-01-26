package com.ccolor.mybatis.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tblOrderBDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public tblOrderBDExample() {
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

        public Criteria andWorkeridIsNull() {
            addCriterion("workerID is null");
            return (Criteria) this;
        }

        public Criteria andWorkeridIsNotNull() {
            addCriterion("workerID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeridEqualTo(String value) {
            addCriterion("workerID =", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotEqualTo(String value) {
            addCriterion("workerID <>", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThan(String value) {
            addCriterion("workerID >", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridGreaterThanOrEqualTo(String value) {
            addCriterion("workerID >=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThan(String value) {
            addCriterion("workerID <", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLessThanOrEqualTo(String value) {
            addCriterion("workerID <=", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridLike(String value) {
            addCriterion("workerID like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotLike(String value) {
            addCriterion("workerID not like", value, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridIn(List<String> values) {
            addCriterion("workerID in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotIn(List<String> values) {
            addCriterion("workerID not in", values, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridBetween(String value1, String value2) {
            addCriterion("workerID between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andWorkeridNotBetween(String value1, String value2) {
            addCriterion("workerID not between", value1, value2, "workerid");
            return (Criteria) this;
        }

        public Criteria andResak002IsNull() {
            addCriterion("resak002 is null");
            return (Criteria) this;
        }

        public Criteria andResak002IsNotNull() {
            addCriterion("resak002 is not null");
            return (Criteria) this;
        }

        public Criteria andResak002EqualTo(String value) {
            addCriterion("resak002 =", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002NotEqualTo(String value) {
            addCriterion("resak002 <>", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002GreaterThan(String value) {
            addCriterion("resak002 >", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002GreaterThanOrEqualTo(String value) {
            addCriterion("resak002 >=", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002LessThan(String value) {
            addCriterion("resak002 <", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002LessThanOrEqualTo(String value) {
            addCriterion("resak002 <=", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002Like(String value) {
            addCriterion("resak002 like", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002NotLike(String value) {
            addCriterion("resak002 not like", value, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002In(List<String> values) {
            addCriterion("resak002 in", values, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002NotIn(List<String> values) {
            addCriterion("resak002 not in", values, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002Between(String value1, String value2) {
            addCriterion("resak002 between", value1, value2, "resak002");
            return (Criteria) this;
        }

        public Criteria andResak002NotBetween(String value1, String value2) {
            addCriterion("resak002 not between", value1, value2, "resak002");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andNightIsNull() {
            addCriterion("night is null");
            return (Criteria) this;
        }

        public Criteria andNightIsNotNull() {
            addCriterion("night is not null");
            return (Criteria) this;
        }

        public Criteria andNightEqualTo(String value) {
            addCriterion("night =", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightNotEqualTo(String value) {
            addCriterion("night <>", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightGreaterThan(String value) {
            addCriterion("night >", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightGreaterThanOrEqualTo(String value) {
            addCriterion("night >=", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightLessThan(String value) {
            addCriterion("night <", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightLessThanOrEqualTo(String value) {
            addCriterion("night <=", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightLike(String value) {
            addCriterion("night like", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightNotLike(String value) {
            addCriterion("night not like", value, "night");
            return (Criteria) this;
        }

        public Criteria andNightIn(List<String> values) {
            addCriterion("night in", values, "night");
            return (Criteria) this;
        }

        public Criteria andNightNotIn(List<String> values) {
            addCriterion("night not in", values, "night");
            return (Criteria) this;
        }

        public Criteria andNightBetween(String value1, String value2) {
            addCriterion("night between", value1, value2, "night");
            return (Criteria) this;
        }

        public Criteria andNightNotBetween(String value1, String value2) {
            addCriterion("night not between", value1, value2, "night");
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

        public Criteria andTemp1EqualTo(String value) {
            addCriterion("temp1 =", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotEqualTo(String value) {
            addCriterion("temp1 <>", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThan(String value) {
            addCriterion("temp1 >", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1GreaterThanOrEqualTo(String value) {
            addCriterion("temp1 >=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThan(String value) {
            addCriterion("temp1 <", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1LessThanOrEqualTo(String value) {
            addCriterion("temp1 <=", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Like(String value) {
            addCriterion("temp1 like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotLike(String value) {
            addCriterion("temp1 not like", value, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1In(List<String> values) {
            addCriterion("temp1 in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotIn(List<String> values) {
            addCriterion("temp1 not in", values, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1Between(String value1, String value2) {
            addCriterion("temp1 between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp1NotBetween(String value1, String value2) {
            addCriterion("temp1 not between", value1, value2, "temp1");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNull() {
            addCriterion("temp2 is null");
            return (Criteria) this;
        }

        public Criteria andTemp2IsNotNull() {
            addCriterion("temp2 is not null");
            return (Criteria) this;
        }

        public Criteria andTemp2EqualTo(String value) {
            addCriterion("temp2 =", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotEqualTo(String value) {
            addCriterion("temp2 <>", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThan(String value) {
            addCriterion("temp2 >", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2GreaterThanOrEqualTo(String value) {
            addCriterion("temp2 >=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThan(String value) {
            addCriterion("temp2 <", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2LessThanOrEqualTo(String value) {
            addCriterion("temp2 <=", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Like(String value) {
            addCriterion("temp2 like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotLike(String value) {
            addCriterion("temp2 not like", value, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2In(List<String> values) {
            addCriterion("temp2 in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotIn(List<String> values) {
            addCriterion("temp2 not in", values, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2Between(String value1, String value2) {
            addCriterion("temp2 between", value1, value2, "temp2");
            return (Criteria) this;
        }

        public Criteria andTemp2NotBetween(String value1, String value2) {
            addCriterion("temp2 not between", value1, value2, "temp2");
            return (Criteria) this;
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

        public Criteria andCComIsNull() {
            addCriterion("c_com is null");
            return (Criteria) this;
        }

        public Criteria andCComIsNotNull() {
            addCriterion("c_com is not null");
            return (Criteria) this;
        }

        public Criteria andCComEqualTo(String value) {
            addCriterion("c_com =", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotEqualTo(String value) {
            addCriterion("c_com <>", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComGreaterThan(String value) {
            addCriterion("c_com >", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComGreaterThanOrEqualTo(String value) {
            addCriterion("c_com >=", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComLessThan(String value) {
            addCriterion("c_com <", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComLessThanOrEqualTo(String value) {
            addCriterion("c_com <=", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComLike(String value) {
            addCriterion("c_com like", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotLike(String value) {
            addCriterion("c_com not like", value, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComIn(List<String> values) {
            addCriterion("c_com in", values, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotIn(List<String> values) {
            addCriterion("c_com not in", values, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComBetween(String value1, String value2) {
            addCriterion("c_com between", value1, value2, "cCom");
            return (Criteria) this;
        }

        public Criteria andCComNotBetween(String value1, String value2) {
            addCriterion("c_com not between", value1, value2, "cCom");
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

        public Criteria andCSelfEqualTo(String value) {
            addCriterion("c_self =", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotEqualTo(String value) {
            addCriterion("c_self <>", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfGreaterThan(String value) {
            addCriterion("c_self >", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfGreaterThanOrEqualTo(String value) {
            addCriterion("c_self >=", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfLessThan(String value) {
            addCriterion("c_self <", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfLessThanOrEqualTo(String value) {
            addCriterion("c_self <=", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfLike(String value) {
            addCriterion("c_self like", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotLike(String value) {
            addCriterion("c_self not like", value, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfIn(List<String> values) {
            addCriterion("c_self in", values, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotIn(List<String> values) {
            addCriterion("c_self not in", values, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfBetween(String value1, String value2) {
            addCriterion("c_self between", value1, value2, "cSelf");
            return (Criteria) this;
        }

        public Criteria andCSelfNotBetween(String value1, String value2) {
            addCriterion("c_self not between", value1, value2, "cSelf");
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

        public Criteria andSelfEqualTo(String value) {
            addCriterion("self =", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotEqualTo(String value) {
            addCriterion("self <>", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfGreaterThan(String value) {
            addCriterion("self >", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfGreaterThanOrEqualTo(String value) {
            addCriterion("self >=", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfLessThan(String value) {
            addCriterion("self <", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfLessThanOrEqualTo(String value) {
            addCriterion("self <=", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfLike(String value) {
            addCriterion("self like", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotLike(String value) {
            addCriterion("self not like", value, "self");
            return (Criteria) this;
        }

        public Criteria andSelfIn(List<String> values) {
            addCriterion("self in", values, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotIn(List<String> values) {
            addCriterion("self not in", values, "self");
            return (Criteria) this;
        }

        public Criteria andSelfBetween(String value1, String value2) {
            addCriterion("self between", value1, value2, "self");
            return (Criteria) this;
        }

        public Criteria andSelfNotBetween(String value1, String value2) {
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

        public Criteria andSComEqualTo(String value) {
            addCriterion("s_com =", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotEqualTo(String value) {
            addCriterion("s_com <>", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComGreaterThan(String value) {
            addCriterion("s_com >", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComGreaterThanOrEqualTo(String value) {
            addCriterion("s_com >=", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComLessThan(String value) {
            addCriterion("s_com <", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComLessThanOrEqualTo(String value) {
            addCriterion("s_com <=", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComLike(String value) {
            addCriterion("s_com like", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotLike(String value) {
            addCriterion("s_com not like", value, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComIn(List<String> values) {
            addCriterion("s_com in", values, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotIn(List<String> values) {
            addCriterion("s_com not in", values, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComBetween(String value1, String value2) {
            addCriterion("s_com between", value1, value2, "sCom");
            return (Criteria) this;
        }

        public Criteria andSComNotBetween(String value1, String value2) {
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