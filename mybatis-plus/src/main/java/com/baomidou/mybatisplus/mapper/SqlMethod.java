/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.mapper;

/**
 * <p>
 * MybatisPlus 支持 SQL 方法
 * </p>
 * 
 * @author hubin
 * @Date 2016-01-23
 */
public enum SqlMethod {
	/**
	 * 增加
	 */
	INSERT_ONE("insert", "插入一条数据", "INSERT INTO %s(%s) VALUES (%s)"),
	INSERT_BATCH("insertBatch", "批量插入数据", "<script>INSERT INTO %s(%s) VALUES %s</script>"),
	
	/**
	 * 删除
	 */
	DELETE_ONE("deleteById", "根据ID 删除一条数据", "DELETE FROM %s WHERE %s = #{ID}"),
	DELETE_BATCH("deleteBatchIds", "根据ID集合，批量删除数据", ""),
	
	/**
	 * 修改
	 */
	UPDATE_ONE("updateById", "根据ID 修改数据", ""),
	
	/**
	 * 查询
	 */
	SELECT_ONE("selectById", "根据ID 查询一条数据", "SELECT * FROM %s WHERE %s = #{ID}"),
	SELECT_BATCH("selectBatchIds", "根据ID集合，批量查询数据", ""),
	SELECT_ALL("selectAll", "查询满足条件所有数据", "SELECT * FROM %s");
	
	private final String method;
	
	private final String desc;

	private final String sql;


	SqlMethod( final String method, final String desc, final String sql ) {
		this.method = method;
		this.desc = desc;
		this.sql = sql;
	}


	public String getMethod() {
		return this.method;
	}


	public String getDesc() {
		return this.desc;
	}


	public String getSql() {
		return this.sql;
	}
}