package erick.android.carteraclientes.BaseDatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DatosOpenHelper extends SQLiteOpenHelper {
    /*
    public DatosOpenHelper(Context context){
        super (context, "DATOS", null, 1);
    }

    @Override
    public void onCreate (SQLiteDatabase sqLiteDatabase) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("NOMBRE VARCHAR (250), ");
        sql.append("DIRECCION VARCHAR (250), ");
        sql.append("EMAIL VARCHAR (200), ");
        sql.append("TELEFONO VARCHAR (20) ) ");

        sqLiteDatabase.execSQL(sql.toString());

    @Override
    public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i, int il){

    }
    */

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "BaseDatosPractica.db";

    public DatosOpenHelper (Context context){
        super (context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "CLIENTE";
        public static final String COLUMN_NAME_NOMBRE = "NOMBRE";
        public static final String COLUMN_NAME_DIRECCION = "DIRECCION";
        public static final String COLUMN_NAME_EMAIL = "EMAIL";
        public static final String COLUMN_NAME_TELEFONO = "TELEFONO";
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE IF NOT EXISTS " + FeedEntry.TABLE_NAME + " (" +
                    //FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_NAME_NOMBRE + " VARCHAR (250)," +
                    FeedEntry.COLUMN_NAME_DIRECCION + " VARCHAR (250)," +
                    FeedEntry.COLUMN_NAME_EMAIL + " VARCHAR (200)," +
                    FeedEntry.COLUMN_NAME_TELEFONO + " VARCHAR (20))";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;


    public void onCreate (SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
