package com.qyd.play.designModel.template.jdbc.framework;

import java.sql.ResultSet;

/**
 * Created by Tom.
 */
public interface RowMapper<T> {

    T mapRow(ResultSet rs, int rowNum) throws Exception;

}
