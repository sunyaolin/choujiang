package com.zcurd.account.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTaskBase<M extends BaseTaskBase<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("name");
	}

	public M setTargetType(java.lang.Integer targetType) {
		set("target_type", targetType);
		return (M)this;
	}

	public java.lang.Integer getTargetType() {
		return get("target_type");
	}

	public M setTargetValue(java.lang.String targetValue) {
		set("target_value", targetValue);
		return (M)this;
	}

	public java.lang.String getTargetValue() {
		return get("target_value");
	}

	public M setCron(java.lang.String cron) {
		set("cron", cron);
		return (M)this;
	}

	public java.lang.String getCron() {
		return get("cron");
	}

	public M setLastRunResult(java.lang.String lastRunResult) {
		set("last_run_result", lastRunResult);
		return (M)this;
	}

	public java.lang.String getLastRunResult() {
		return get("last_run_result");
	}

	public M setLastRunTime(java.util.Date lastRunTime) {
		set("last_run_time", lastRunTime);
		return (M)this;
	}

	public java.util.Date getLastRunTime() {
		return get("last_run_time");
	}

	public M setLastRunTimeCost(java.lang.Integer lastRunTimeCost) {
		set("last_run_time_cost", lastRunTimeCost);
		return (M)this;
	}

	public java.lang.Integer getLastRunTimeCost() {
		return get("last_run_time_cost");
	}

	public M setStatus(java.lang.Integer status) {
		set("status", status);
		return (M)this;
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public M setCreateUserId(java.lang.Integer createUserId) {
		set("create_user_id", createUserId);
		return (M)this;
	}

	public java.lang.Integer getCreateUserId() {
		return get("create_user_id");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
