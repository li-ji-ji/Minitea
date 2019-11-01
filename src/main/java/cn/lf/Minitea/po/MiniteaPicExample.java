package cn.lf.Minitea.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MiniteaPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MiniteaPicExample() {
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

        public Criteria andPicNameIsNull() {
            addCriterion("pic_name is null");
            return (Criteria) this;
        }

        public Criteria andPicNameIsNotNull() {
            addCriterion("pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameEqualTo(String value) {
            addCriterion("pic_name =", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotEqualTo(String value) {
            addCriterion("pic_name <>", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThan(String value) {
            addCriterion("pic_name >", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("pic_name >=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThan(String value) {
            addCriterion("pic_name <", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLessThanOrEqualTo(String value) {
            addCriterion("pic_name <=", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameLike(String value) {
            addCriterion("pic_name like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotLike(String value) {
            addCriterion("pic_name not like", value, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameIn(List<String> values) {
            addCriterion("pic_name in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotIn(List<String> values) {
            addCriterion("pic_name not in", values, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameBetween(String value1, String value2) {
            addCriterion("pic_name between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicNameNotBetween(String value1, String value2) {
            addCriterion("pic_name not between", value1, value2, "picName");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicStatusIsNull() {
            addCriterion("pic_status is null");
            return (Criteria) this;
        }

        public Criteria andPicStatusIsNotNull() {
            addCriterion("pic_status is not null");
            return (Criteria) this;
        }

        public Criteria andPicStatusEqualTo(Integer value) {
            addCriterion("pic_status =", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotEqualTo(Integer value) {
            addCriterion("pic_status <>", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusGreaterThan(Integer value) {
            addCriterion("pic_status >", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_status >=", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusLessThan(Integer value) {
            addCriterion("pic_status <", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pic_status <=", value, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusIn(List<Integer> values) {
            addCriterion("pic_status in", values, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotIn(List<Integer> values) {
            addCriterion("pic_status not in", values, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusBetween(Integer value1, Integer value2) {
            addCriterion("pic_status between", value1, value2, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_status not between", value1, value2, "picStatus");
            return (Criteria) this;
        }

        public Criteria andPicWidthIsNull() {
            addCriterion("pic_width is null");
            return (Criteria) this;
        }

        public Criteria andPicWidthIsNotNull() {
            addCriterion("pic_width is not null");
            return (Criteria) this;
        }

        public Criteria andPicWidthEqualTo(Double value) {
            addCriterion("pic_width =", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthNotEqualTo(Double value) {
            addCriterion("pic_width <>", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthGreaterThan(Double value) {
            addCriterion("pic_width >", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthGreaterThanOrEqualTo(Double value) {
            addCriterion("pic_width >=", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthLessThan(Double value) {
            addCriterion("pic_width <", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthLessThanOrEqualTo(Double value) {
            addCriterion("pic_width <=", value, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthIn(List<Double> values) {
            addCriterion("pic_width in", values, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthNotIn(List<Double> values) {
            addCriterion("pic_width not in", values, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthBetween(Double value1, Double value2) {
            addCriterion("pic_width between", value1, value2, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicWidthNotBetween(Double value1, Double value2) {
            addCriterion("pic_width not between", value1, value2, "picWidth");
            return (Criteria) this;
        }

        public Criteria andPicHeightIsNull() {
            addCriterion("pic_height is null");
            return (Criteria) this;
        }

        public Criteria andPicHeightIsNotNull() {
            addCriterion("pic_height is not null");
            return (Criteria) this;
        }

        public Criteria andPicHeightEqualTo(Double value) {
            addCriterion("pic_height =", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightNotEqualTo(Double value) {
            addCriterion("pic_height <>", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightGreaterThan(Double value) {
            addCriterion("pic_height >", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("pic_height >=", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightLessThan(Double value) {
            addCriterion("pic_height <", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightLessThanOrEqualTo(Double value) {
            addCriterion("pic_height <=", value, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightIn(List<Double> values) {
            addCriterion("pic_height in", values, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightNotIn(List<Double> values) {
            addCriterion("pic_height not in", values, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightBetween(Double value1, Double value2) {
            addCriterion("pic_height between", value1, value2, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicHeightNotBetween(Double value1, Double value2) {
            addCriterion("pic_height not between", value1, value2, "picHeight");
            return (Criteria) this;
        }

        public Criteria andPicIntroIsNull() {
            addCriterion("pic_intro is null");
            return (Criteria) this;
        }

        public Criteria andPicIntroIsNotNull() {
            addCriterion("pic_intro is not null");
            return (Criteria) this;
        }

        public Criteria andPicIntroEqualTo(String value) {
            addCriterion("pic_intro =", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroNotEqualTo(String value) {
            addCriterion("pic_intro <>", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroGreaterThan(String value) {
            addCriterion("pic_intro >", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroGreaterThanOrEqualTo(String value) {
            addCriterion("pic_intro >=", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroLessThan(String value) {
            addCriterion("pic_intro <", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroLessThanOrEqualTo(String value) {
            addCriterion("pic_intro <=", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroLike(String value) {
            addCriterion("pic_intro like", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroNotLike(String value) {
            addCriterion("pic_intro not like", value, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroIn(List<String> values) {
            addCriterion("pic_intro in", values, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroNotIn(List<String> values) {
            addCriterion("pic_intro not in", values, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroBetween(String value1, String value2) {
            addCriterion("pic_intro between", value1, value2, "picIntro");
            return (Criteria) this;
        }

        public Criteria andPicIntroNotBetween(String value1, String value2) {
            addCriterion("pic_intro not between", value1, value2, "picIntro");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andPicKeyIsNull() {
            addCriterion("pic_key is null");
            return (Criteria) this;
        }

        public Criteria andPicKeyIsNotNull() {
            addCriterion("pic_key is not null");
            return (Criteria) this;
        }

        public Criteria andPicKeyEqualTo(String value) {
            addCriterion("pic_key =", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyNotEqualTo(String value) {
            addCriterion("pic_key <>", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyGreaterThan(String value) {
            addCriterion("pic_key >", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("pic_key >=", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyLessThan(String value) {
            addCriterion("pic_key <", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyLessThanOrEqualTo(String value) {
            addCriterion("pic_key <=", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyLike(String value) {
            addCriterion("pic_key like", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyNotLike(String value) {
            addCriterion("pic_key not like", value, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyIn(List<String> values) {
            addCriterion("pic_key in", values, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyNotIn(List<String> values) {
            addCriterion("pic_key not in", values, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyBetween(String value1, String value2) {
            addCriterion("pic_key between", value1, value2, "picKey");
            return (Criteria) this;
        }

        public Criteria andPicKeyNotBetween(String value1, String value2) {
            addCriterion("pic_key not between", value1, value2, "picKey");
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