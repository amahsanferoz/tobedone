package com.arora.tobedone.db;

import android.provider.BaseColumns;

/**
 * Created by ahsanferoz on 13/07/15.
 */
public class TaskContract {

    public static final String DB_NAME = "com.arora.tobedone.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";

    public class Columns {

        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}
