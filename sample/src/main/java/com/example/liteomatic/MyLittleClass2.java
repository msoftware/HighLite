package com.example.liteomatic;

import com.jeppeman.liteomatic.PrimaryKey;
import com.jeppeman.liteomatic.SQLiteField;
import com.jeppeman.liteomatic.SQLiteFieldType;
import com.jeppeman.liteomatic.SQLiteTable;

@SQLiteTable(
        database = TestDatabase.class,
        tableName = "myLittleTable2",
        autoDeleteColumns = true,
        autoAddColumns = false)
public class MyLittleClass2 {

    @SQLiteField(primaryKey = @PrimaryKey(autoIncrement = true))
    int id;

    @SQLiteField
    String namezz;

    @SQLiteField(fieldType = SQLiteFieldType.REAL)
    float shortz;

    @SQLiteField(fieldType = SQLiteFieldType.INTEGER)
    boolean testBool;
}