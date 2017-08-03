package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.ResultSet;

/**
 * Created by jessicacotrina on 9/27/16.
 */
public interface GetRows {
    public ObjectNode getRows(ResultSet rs);
}
