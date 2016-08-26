package com.example.sqliteprocessor;

import com.jeppeman.sqliteprocessor.AutoIncrement;
import com.jeppeman.sqliteprocessor.PrimaryKey;
import com.jeppeman.sqliteprocessor.SQLiteField;
import com.jeppeman.sqliteprocessor.SQLiteFieldType;
import com.jeppeman.sqliteprocessor.SQLiteTable;

import java.util.List;

/**
 * Created by jesper on 2016-08-25.
 */
@SQLiteTable(tableName = "myLittleTable2", databaseName = "myLittleDatabase2", version = 17)
public class MyLittleClass3 {

    @SQLiteField
    @PrimaryKey
    @AutoIncrement
    int id;

    @SQLiteField
    String name;

    @SQLiteField(fieldType = SQLiteFieldType.REAL)
    short shortz;

    @SQLiteField
    List<String> nameList;
}