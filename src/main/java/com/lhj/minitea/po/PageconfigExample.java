package com.lhj.minitea.po;

import java.util.ArrayList;
import java.util.List;

public class PageconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageconfigExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBgpicIsNull() {
            addCriterion("bgpic is null");
            return (Criteria) this;
        }

        public Criteria andBgpicIsNotNull() {
            addCriterion("bgpic is not null");
            return (Criteria) this;
        }

        public Criteria andBgpicEqualTo(String value) {
            addCriterion("bgpic =", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicNotEqualTo(String value) {
            addCriterion("bgpic <>", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicGreaterThan(String value) {
            addCriterion("bgpic >", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicGreaterThanOrEqualTo(String value) {
            addCriterion("bgpic >=", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicLessThan(String value) {
            addCriterion("bgpic <", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicLessThanOrEqualTo(String value) {
            addCriterion("bgpic <=", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicLike(String value) {
            addCriterion("bgpic like", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicNotLike(String value) {
            addCriterion("bgpic not like", value, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicIn(List<String> values) {
            addCriterion("bgpic in", values, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicNotIn(List<String> values) {
            addCriterion("bgpic not in", values, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicBetween(String value1, String value2) {
            addCriterion("bgpic between", value1, value2, "bgpic");
            return (Criteria) this;
        }

        public Criteria andBgpicNotBetween(String value1, String value2) {
            addCriterion("bgpic not between", value1, value2, "bgpic");
            return (Criteria) this;
        }

        public Criteria andPic1IsNull() {
            addCriterion("pic1 is null");
            return (Criteria) this;
        }

        public Criteria andPic1IsNotNull() {
            addCriterion("pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andPic1EqualTo(String value) {
            addCriterion("pic1 =", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotEqualTo(String value) {
            addCriterion("pic1 <>", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThan(String value) {
            addCriterion("pic1 >", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1GreaterThanOrEqualTo(String value) {
            addCriterion("pic1 >=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThan(String value) {
            addCriterion("pic1 <", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1LessThanOrEqualTo(String value) {
            addCriterion("pic1 <=", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Like(String value) {
            addCriterion("pic1 like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotLike(String value) {
            addCriterion("pic1 not like", value, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1In(List<String> values) {
            addCriterion("pic1 in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotIn(List<String> values) {
            addCriterion("pic1 not in", values, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1Between(String value1, String value2) {
            addCriterion("pic1 between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic1NotBetween(String value1, String value2) {
            addCriterion("pic1 not between", value1, value2, "pic1");
            return (Criteria) this;
        }

        public Criteria andPic2IsNull() {
            addCriterion("pic2 is null");
            return (Criteria) this;
        }

        public Criteria andPic2IsNotNull() {
            addCriterion("pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andPic2EqualTo(String value) {
            addCriterion("pic2 =", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotEqualTo(String value) {
            addCriterion("pic2 <>", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThan(String value) {
            addCriterion("pic2 >", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2GreaterThanOrEqualTo(String value) {
            addCriterion("pic2 >=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThan(String value) {
            addCriterion("pic2 <", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2LessThanOrEqualTo(String value) {
            addCriterion("pic2 <=", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Like(String value) {
            addCriterion("pic2 like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotLike(String value) {
            addCriterion("pic2 not like", value, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2In(List<String> values) {
            addCriterion("pic2 in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotIn(List<String> values) {
            addCriterion("pic2 not in", values, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2Between(String value1, String value2) {
            addCriterion("pic2 between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic2NotBetween(String value1, String value2) {
            addCriterion("pic2 not between", value1, value2, "pic2");
            return (Criteria) this;
        }

        public Criteria andPic3IsNull() {
            addCriterion("pic3 is null");
            return (Criteria) this;
        }

        public Criteria andPic3IsNotNull() {
            addCriterion("pic3 is not null");
            return (Criteria) this;
        }

        public Criteria andPic3EqualTo(String value) {
            addCriterion("pic3 =", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotEqualTo(String value) {
            addCriterion("pic3 <>", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThan(String value) {
            addCriterion("pic3 >", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3GreaterThanOrEqualTo(String value) {
            addCriterion("pic3 >=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThan(String value) {
            addCriterion("pic3 <", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3LessThanOrEqualTo(String value) {
            addCriterion("pic3 <=", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Like(String value) {
            addCriterion("pic3 like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotLike(String value) {
            addCriterion("pic3 not like", value, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3In(List<String> values) {
            addCriterion("pic3 in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotIn(List<String> values) {
            addCriterion("pic3 not in", values, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3Between(String value1, String value2) {
            addCriterion("pic3 between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic3NotBetween(String value1, String value2) {
            addCriterion("pic3 not between", value1, value2, "pic3");
            return (Criteria) this;
        }

        public Criteria andPic4IsNull() {
            addCriterion("pic4 is null");
            return (Criteria) this;
        }

        public Criteria andPic4IsNotNull() {
            addCriterion("pic4 is not null");
            return (Criteria) this;
        }

        public Criteria andPic4EqualTo(String value) {
            addCriterion("pic4 =", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotEqualTo(String value) {
            addCriterion("pic4 <>", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThan(String value) {
            addCriterion("pic4 >", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4GreaterThanOrEqualTo(String value) {
            addCriterion("pic4 >=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThan(String value) {
            addCriterion("pic4 <", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4LessThanOrEqualTo(String value) {
            addCriterion("pic4 <=", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Like(String value) {
            addCriterion("pic4 like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotLike(String value) {
            addCriterion("pic4 not like", value, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4In(List<String> values) {
            addCriterion("pic4 in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotIn(List<String> values) {
            addCriterion("pic4 not in", values, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4Between(String value1, String value2) {
            addCriterion("pic4 between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic4NotBetween(String value1, String value2) {
            addCriterion("pic4 not between", value1, value2, "pic4");
            return (Criteria) this;
        }

        public Criteria andPic5IsNull() {
            addCriterion("pic5 is null");
            return (Criteria) this;
        }

        public Criteria andPic5IsNotNull() {
            addCriterion("pic5 is not null");
            return (Criteria) this;
        }

        public Criteria andPic5EqualTo(String value) {
            addCriterion("pic5 =", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotEqualTo(String value) {
            addCriterion("pic5 <>", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThan(String value) {
            addCriterion("pic5 >", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5GreaterThanOrEqualTo(String value) {
            addCriterion("pic5 >=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThan(String value) {
            addCriterion("pic5 <", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5LessThanOrEqualTo(String value) {
            addCriterion("pic5 <=", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Like(String value) {
            addCriterion("pic5 like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotLike(String value) {
            addCriterion("pic5 not like", value, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5In(List<String> values) {
            addCriterion("pic5 in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotIn(List<String> values) {
            addCriterion("pic5 not in", values, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5Between(String value1, String value2) {
            addCriterion("pic5 between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andPic5NotBetween(String value1, String value2) {
            addCriterion("pic5 not between", value1, value2, "pic5");
            return (Criteria) this;
        }

        public Criteria andValue1IsNull() {
            addCriterion("value1 is null");
            return (Criteria) this;
        }

        public Criteria andValue1IsNotNull() {
            addCriterion("value1 is not null");
            return (Criteria) this;
        }

        public Criteria andValue1EqualTo(String value) {
            addCriterion("value1 =", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotEqualTo(String value) {
            addCriterion("value1 <>", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThan(String value) {
            addCriterion("value1 >", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1GreaterThanOrEqualTo(String value) {
            addCriterion("value1 >=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThan(String value) {
            addCriterion("value1 <", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1LessThanOrEqualTo(String value) {
            addCriterion("value1 <=", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Like(String value) {
            addCriterion("value1 like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotLike(String value) {
            addCriterion("value1 not like", value, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1In(List<String> values) {
            addCriterion("value1 in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotIn(List<String> values) {
            addCriterion("value1 not in", values, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1Between(String value1, String value2) {
            addCriterion("value1 between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue1NotBetween(String value1, String value2) {
            addCriterion("value1 not between", value1, value2, "value1");
            return (Criteria) this;
        }

        public Criteria andValue2IsNull() {
            addCriterion("value2 is null");
            return (Criteria) this;
        }

        public Criteria andValue2IsNotNull() {
            addCriterion("value2 is not null");
            return (Criteria) this;
        }

        public Criteria andValue2EqualTo(String value) {
            addCriterion("value2 =", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotEqualTo(String value) {
            addCriterion("value2 <>", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThan(String value) {
            addCriterion("value2 >", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2GreaterThanOrEqualTo(String value) {
            addCriterion("value2 >=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThan(String value) {
            addCriterion("value2 <", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2LessThanOrEqualTo(String value) {
            addCriterion("value2 <=", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Like(String value) {
            addCriterion("value2 like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotLike(String value) {
            addCriterion("value2 not like", value, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2In(List<String> values) {
            addCriterion("value2 in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotIn(List<String> values) {
            addCriterion("value2 not in", values, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2Between(String value1, String value2) {
            addCriterion("value2 between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue2NotBetween(String value1, String value2) {
            addCriterion("value2 not between", value1, value2, "value2");
            return (Criteria) this;
        }

        public Criteria andValue3IsNull() {
            addCriterion("value3 is null");
            return (Criteria) this;
        }

        public Criteria andValue3IsNotNull() {
            addCriterion("value3 is not null");
            return (Criteria) this;
        }

        public Criteria andValue3EqualTo(String value) {
            addCriterion("value3 =", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotEqualTo(String value) {
            addCriterion("value3 <>", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThan(String value) {
            addCriterion("value3 >", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3GreaterThanOrEqualTo(String value) {
            addCriterion("value3 >=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThan(String value) {
            addCriterion("value3 <", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3LessThanOrEqualTo(String value) {
            addCriterion("value3 <=", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Like(String value) {
            addCriterion("value3 like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotLike(String value) {
            addCriterion("value3 not like", value, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3In(List<String> values) {
            addCriterion("value3 in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotIn(List<String> values) {
            addCriterion("value3 not in", values, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3Between(String value1, String value2) {
            addCriterion("value3 between", value1, value2, "value3");
            return (Criteria) this;
        }

        public Criteria andValue3NotBetween(String value1, String value2) {
            addCriterion("value3 not between", value1, value2, "value3");
            return (Criteria) this;
        }

        public Criteria andValue4IsNull() {
            addCriterion("value4 is null");
            return (Criteria) this;
        }

        public Criteria andValue4IsNotNull() {
            addCriterion("value4 is not null");
            return (Criteria) this;
        }

        public Criteria andValue4EqualTo(String value) {
            addCriterion("value4 =", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotEqualTo(String value) {
            addCriterion("value4 <>", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4GreaterThan(String value) {
            addCriterion("value4 >", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4GreaterThanOrEqualTo(String value) {
            addCriterion("value4 >=", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4LessThan(String value) {
            addCriterion("value4 <", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4LessThanOrEqualTo(String value) {
            addCriterion("value4 <=", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4Like(String value) {
            addCriterion("value4 like", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotLike(String value) {
            addCriterion("value4 not like", value, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4In(List<String> values) {
            addCriterion("value4 in", values, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotIn(List<String> values) {
            addCriterion("value4 not in", values, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4Between(String value1, String value2) {
            addCriterion("value4 between", value1, value2, "value4");
            return (Criteria) this;
        }

        public Criteria andValue4NotBetween(String value1, String value2) {
            addCriterion("value4 not between", value1, value2, "value4");
            return (Criteria) this;
        }

        public Criteria andValue5IsNull() {
            addCriterion("value5 is null");
            return (Criteria) this;
        }

        public Criteria andValue5IsNotNull() {
            addCriterion("value5 is not null");
            return (Criteria) this;
        }

        public Criteria andValue5EqualTo(String value) {
            addCriterion("value5 =", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotEqualTo(String value) {
            addCriterion("value5 <>", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5GreaterThan(String value) {
            addCriterion("value5 >", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5GreaterThanOrEqualTo(String value) {
            addCriterion("value5 >=", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5LessThan(String value) {
            addCriterion("value5 <", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5LessThanOrEqualTo(String value) {
            addCriterion("value5 <=", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5Like(String value) {
            addCriterion("value5 like", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotLike(String value) {
            addCriterion("value5 not like", value, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5In(List<String> values) {
            addCriterion("value5 in", values, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotIn(List<String> values) {
            addCriterion("value5 not in", values, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5Between(String value1, String value2) {
            addCriterion("value5 between", value1, value2, "value5");
            return (Criteria) this;
        }

        public Criteria andValue5NotBetween(String value1, String value2) {
            addCriterion("value5 not between", value1, value2, "value5");
            return (Criteria) this;
        }

        public Criteria andValue6IsNull() {
            addCriterion("value6 is null");
            return (Criteria) this;
        }

        public Criteria andValue6IsNotNull() {
            addCriterion("value6 is not null");
            return (Criteria) this;
        }

        public Criteria andValue6EqualTo(String value) {
            addCriterion("value6 =", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotEqualTo(String value) {
            addCriterion("value6 <>", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6GreaterThan(String value) {
            addCriterion("value6 >", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6GreaterThanOrEqualTo(String value) {
            addCriterion("value6 >=", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6LessThan(String value) {
            addCriterion("value6 <", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6LessThanOrEqualTo(String value) {
            addCriterion("value6 <=", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6Like(String value) {
            addCriterion("value6 like", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotLike(String value) {
            addCriterion("value6 not like", value, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6In(List<String> values) {
            addCriterion("value6 in", values, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotIn(List<String> values) {
            addCriterion("value6 not in", values, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6Between(String value1, String value2) {
            addCriterion("value6 between", value1, value2, "value6");
            return (Criteria) this;
        }

        public Criteria andValue6NotBetween(String value1, String value2) {
            addCriterion("value6 not between", value1, value2, "value6");
            return (Criteria) this;
        }

        public Criteria andValue7IsNull() {
            addCriterion("value7 is null");
            return (Criteria) this;
        }

        public Criteria andValue7IsNotNull() {
            addCriterion("value7 is not null");
            return (Criteria) this;
        }

        public Criteria andValue7EqualTo(String value) {
            addCriterion("value7 =", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7NotEqualTo(String value) {
            addCriterion("value7 <>", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7GreaterThan(String value) {
            addCriterion("value7 >", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7GreaterThanOrEqualTo(String value) {
            addCriterion("value7 >=", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7LessThan(String value) {
            addCriterion("value7 <", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7LessThanOrEqualTo(String value) {
            addCriterion("value7 <=", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7Like(String value) {
            addCriterion("value7 like", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7NotLike(String value) {
            addCriterion("value7 not like", value, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7In(List<String> values) {
            addCriterion("value7 in", values, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7NotIn(List<String> values) {
            addCriterion("value7 not in", values, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7Between(String value1, String value2) {
            addCriterion("value7 between", value1, value2, "value7");
            return (Criteria) this;
        }

        public Criteria andValue7NotBetween(String value1, String value2) {
            addCriterion("value7 not between", value1, value2, "value7");
            return (Criteria) this;
        }

        public Criteria andValue8IsNull() {
            addCriterion("value8 is null");
            return (Criteria) this;
        }

        public Criteria andValue8IsNotNull() {
            addCriterion("value8 is not null");
            return (Criteria) this;
        }

        public Criteria andValue8EqualTo(String value) {
            addCriterion("value8 =", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8NotEqualTo(String value) {
            addCriterion("value8 <>", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8GreaterThan(String value) {
            addCriterion("value8 >", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8GreaterThanOrEqualTo(String value) {
            addCriterion("value8 >=", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8LessThan(String value) {
            addCriterion("value8 <", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8LessThanOrEqualTo(String value) {
            addCriterion("value8 <=", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8Like(String value) {
            addCriterion("value8 like", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8NotLike(String value) {
            addCriterion("value8 not like", value, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8In(List<String> values) {
            addCriterion("value8 in", values, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8NotIn(List<String> values) {
            addCriterion("value8 not in", values, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8Between(String value1, String value2) {
            addCriterion("value8 between", value1, value2, "value8");
            return (Criteria) this;
        }

        public Criteria andValue8NotBetween(String value1, String value2) {
            addCriterion("value8 not between", value1, value2, "value8");
            return (Criteria) this;
        }

        public Criteria andValue9IsNull() {
            addCriterion("value9 is null");
            return (Criteria) this;
        }

        public Criteria andValue9IsNotNull() {
            addCriterion("value9 is not null");
            return (Criteria) this;
        }

        public Criteria andValue9EqualTo(String value) {
            addCriterion("value9 =", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9NotEqualTo(String value) {
            addCriterion("value9 <>", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9GreaterThan(String value) {
            addCriterion("value9 >", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9GreaterThanOrEqualTo(String value) {
            addCriterion("value9 >=", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9LessThan(String value) {
            addCriterion("value9 <", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9LessThanOrEqualTo(String value) {
            addCriterion("value9 <=", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9Like(String value) {
            addCriterion("value9 like", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9NotLike(String value) {
            addCriterion("value9 not like", value, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9In(List<String> values) {
            addCriterion("value9 in", values, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9NotIn(List<String> values) {
            addCriterion("value9 not in", values, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9Between(String value1, String value2) {
            addCriterion("value9 between", value1, value2, "value9");
            return (Criteria) this;
        }

        public Criteria andValue9NotBetween(String value1, String value2) {
            addCriterion("value9 not between", value1, value2, "value9");
            return (Criteria) this;
        }

        public Criteria andValue0IsNull() {
            addCriterion("value0 is null");
            return (Criteria) this;
        }

        public Criteria andValue0IsNotNull() {
            addCriterion("value0 is not null");
            return (Criteria) this;
        }

        public Criteria andValue0EqualTo(String value) {
            addCriterion("value0 =", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0NotEqualTo(String value) {
            addCriterion("value0 <>", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0GreaterThan(String value) {
            addCriterion("value0 >", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0GreaterThanOrEqualTo(String value) {
            addCriterion("value0 >=", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0LessThan(String value) {
            addCriterion("value0 <", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0LessThanOrEqualTo(String value) {
            addCriterion("value0 <=", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0Like(String value) {
            addCriterion("value0 like", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0NotLike(String value) {
            addCriterion("value0 not like", value, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0In(List<String> values) {
            addCriterion("value0 in", values, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0NotIn(List<String> values) {
            addCriterion("value0 not in", values, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0Between(String value1, String value2) {
            addCriterion("value0 between", value1, value2, "value0");
            return (Criteria) this;
        }

        public Criteria andValue0NotBetween(String value1, String value2) {
            addCriterion("value0 not between", value1, value2, "value0");
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