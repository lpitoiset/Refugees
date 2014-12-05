package com.example.refugeesinfo;

/**
 * Created by laurent on 04/12/14.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION = 4;

    // Database Name
    private static final String DATABASE_NAME = "refugees.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here

        String CREATE_TABLE_COUNTRY = "CREATE TABLE " + Country.TABLE + "("
                + Country.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Country.KEY_name + " TEXT, "
                + Country.KEY_code + " TEXT, "
                + Country.KEY_pop_ref + " TEXT, "
                + Country.KEY_pop_asylum + " TEXT, "
                + Country.KEY_pop_returned + " TEXT, "
                + Country.KEY_pop_idp + " TEXT, "
                + Country.KEY_pop_returned_idp + " TEXT, "
                + Country.KEY_pop_stateless + " TEXT, "
                + Country.KEY_pop_ooc + " TEXT, "
                + Country.KEY_pop_total + " TEXT )";

        db.execSQL(CREATE_TABLE_COUNTRY);

//        String INSERT_COUNTRY_DATA = "INSERT INTO Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') VALUES ('name','code','10','20','null','40','50','null','70','1234');";
//        db.execSQL(INSERT_COUNTRY_DATA);
//        insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others') values ('Afghanistan','16861','63','39665','631286','21830','','275486');";"

        String INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Afghanistan','AFG','16861','63','39665','631286','21830','','275486','985191')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Albania','ALB','76','228','','','','7443','','7747')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Algeria','ALG','94122','1799','*','','','','','95921')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Angola','ANG','23771','20026','1665','','','','','45462')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Antigua and Barbuda','ANT','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Argentina','ARG','3295','869','','','','','','4164')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Armenia','ARM','13727','60','','','','180','','13967')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Aruba','ABW','*','*','','','','*','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Australia','AUL','34405','13473','','','','','','47878')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Austria','AUS','55560','22681','','','','604','','78845')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Azerbaijan','AZE','1377','269','','609029','','3585','','614260')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bahamas','BHS','14','8','','','','','','22')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bahrain','BAH','294','52','','','','','','346')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bangladesh','BGD','231137','8','','','','','','231145')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Barbados','BAR','*','','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Belarus','BLR','599','69','','','','6712','','7380')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Belgium','BEL','25572','11439','','','','2466','','39477')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Belize','BZE','21','62','','','','','','83')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Benin','BEN','185','106','','','','','','291')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bolivarian Republic of Venezuela','VEN','204291','1022','','','','','','205313')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bosnia and Herzegovina','BSN','6909','29','121','84500','18949','792','52437','163737')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Botswana','BOT','2766','168','','','','','49','2983')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Brazil','BRA','5130','4581','','','','*','12318','22029')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('British Virgin Islands','BVI','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Brunei Darussalam','BRU','','','','','','20524','','20524')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Bulgaria','BUL','4280','4504','','','','','','8784')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Burkina Faso','BKF','29228','771','','','','','','29999')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Burundi','BDI','45487','6031','2114','78948','','1302','463','134345')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Cambodia','CAM','64','6','','','','','','70')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Cameroon','CMR','114729','8318','','','','','','123047')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Canada','CAN','160327','22110','','','','','','182437')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Cayman Islands','CAY','*','5','','','','','','5')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Central African Republic','CAR','14313','2635','*','894421','','','','911369')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Chad','CHD','434461','298','384','19791','','','','454934')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Chile','CHL','1723','401','','','','','','2124')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('China','CHI','301045','349','','','','','','301394')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Colombia','COL','182','58','13','5368138','','12','','5368403')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Congo','COB','51023','2644','19','','','','1055','54741')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Costa Rica','COS','20524','586','','','','','','21110')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Côte d''Ivoire','ICO','2955','586','20021','24000','21000','700000','132','768694')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Croatia','HRV','659','172','503','','','2886','16046','20266')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Cuba','CUB','377','*','','','','','','377')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Curaçao','CUW','13','45','','','','','','58')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Cyprus','CYP','3834','2604','','','','','','6438')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Czech Republic','CZE','3125','269','','','','1502','','4896')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Democratic Republic of the Congo','COD','113357','1453','68417','2963799','595200','','71257','3813483')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Denmark','DEN','13123','1580','','','','4263','','18966')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Djibouti','DJB','20005','3782','','','','','','23787')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Dominican Republic','DOM','716','817','','','','210000','','211533')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Ecuador','ECU','123051','12416','*','','','','','135467')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Egypt','ARE','230055','23105','','','','23','','253183')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('El Salvador','SAL','37','*','','','','','','37')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Eritrea','ERT','3166','*','','','','','64','3230')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Estonia','EST','42','10','','','','91281','','91333')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Ethiopia','ETH','433923','920','25','','','','999','435867')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Fiji','FIJ','*','7','','','','','','7')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Finland','FIN','11192','1474','','','','2122','','14788')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('France','FRA','232487','51683','','','','1247','','285417')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Gabon','GAB','1572','2423','','','','','','3995')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Gambia','GAM','9557','','','','','','212','9769')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Georgia','GEO','832','325','*','257611','','776','','259544')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Germany','GFR','187505','135510','','','','11709','','334724')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Ghana','GHA','18666','1818','*','','','','','20484')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Greece','GRE','3443','49787','','','','178','19534','72942')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Guatemala','GUA','154','14','','','','','','168')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Guinea','GUI','8544','304','*','','','','','8848')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Guinea-Bissau','GNB','8530','94','','','','','','8624')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Guyana','GUY','7','','','','','','','7')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Haiti','HAI','','8','','','','','','8')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Honduras','HON','6','22','','','','*','','28')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Hong Kong SAR, China','HKG','93','1827','','','','*','','1920')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Hungary','HUN','2392','1846','','','','113','','4351')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Iceland','ICE','37','266','','','','119','','422')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('India','IND','188371','3662','','','','','','192033')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Indonesia','INS','3195','7073','','','','','','10268')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Iraq','IRQ','246294','5976','60880','954128','63270','120000','','1450548')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Ireland','IRE','5951','5457','','','','73','','11481')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Islamic Republic of Iran','IRN','857352','46','*','','','','','857398')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Israel','ISR','48301','7877','','','','14','','56192')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Italy','ITA','78006','13620','','','','350','','91976')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Jamaica','JAM','18','*','','','','','','18')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Japan','JPN','2576','6685','','','','852','','10113')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Jordan','JOR','641894','4368','','','','','','646262')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Kazakhstan','KAZ','580','71','','','','6942','3675','11268')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Kenya','KEN','534920','52270','','','','20000','','607190')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Kuwait','KUW','628','1029','','','','93000','','94657')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Kyrgyzstan','KGZ','463','369','','','','11425','','12257')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Latvia','LVA','139','178','','','','267789','','268106')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Lebanon','LEB','856529','2253','','','','','3677','862459')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Lesotho','LES','24','','','','','','','24')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Liberia','LBR','53229','38','83','','','*','1540','54890')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Libya','LBY','25556','6577','','53579','5350','','','91062')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Liechtenstein','LIE','91','*','','','','*','','91')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Lithuania','LTU','883','59','','','','3892','','4834')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Luxembourg','LUX','2827','960','','','','177','','3964')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Macao SAR, China','MAC','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Madagascar','MAD','6','','','','','','*','6')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Malawi','MLW','5794','11127','','','','','','16921')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Malaysia','MLS','97474','43005','','','','40000','80000','260479')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Mali','MLI','14312','282','14278','254822','42253','','','325947')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Malta','MTA','9875','875','','','','','','10750')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Mauritania','MAU','92752','824','','','','','','93576')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Mexico','MEX','1779','1302','','','','13','','3094')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Monaco','MCO','34','','','','','','','34')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Mongolia','MNG','8','*','','','','16','','24')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Montenegro','MNE','8471','174','','','','3341','8089','20075')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Morocco','MOR','1443','3468','','','','','','4911')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Mozambique','MOZ','4433','10666','','','','','','15099')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Myanmar','MYA','','','3005','372000','27383','810000','','1212388')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Namibia','NAM','2315','1133','28','','','','1660','5136')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Nauru','NRU','','533','','','','','','533')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Nepal','NEP','46293','232','','','','','425','46950')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Netherlands','NET','74640','10420','','','','1951','','87011')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('New Zealand','NZL','1333','276','','','','','','1609')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Nicaragua','NIC','184','15','','','','*','','199')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Niger','NGR','57652','73','','','','','35166','92891')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Nigeria','NIG','1683','797','16','','','','','2496')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Norway','NOR','46033','6304','','','','1975','','54312')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Oman','OMN','138','70','','','','','','208')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Pakistan','PAK','1616495','5384','*','747498','90637','','','2460014')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Palau','PLW','*','','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Panama','PAN','17615','604','','','','*','','18219')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Papua New Guinea','PNG','9373','404','','','','','','9777')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Paraguay','PAR','132','*','','','','','','132')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Peru','PER','1108','485','','','','','','1593')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Philippines','PHI','163','63','','117369','211607','6015','68','335285')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Plurinational State of Bolivia','BOL','729','*','','','','','','729')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Poland','POL','16388','2082','','','','10825','','29295')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Portugal','POR','531','158','','','','553','','1242')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Qatar','QAT','130','10','','','','1200','','1340')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Republic of Korea','KOR','513','2352','','','','194','','3059')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Republic of Moldova','MDA','212','55','','','','2029','','2296')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Romania','ROM','1722','121','','','','297','','2140')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Russian Federation','RUS','3435','1227','','','','178000','7259','189921')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Rwanda','RWA','73342','210','7791','','','','118','81461')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Saint Kitts and Nevis','STK','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Saint Lucia','LCA','*','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Saudi Arabia','SAU','552','93','','','','70000','','70645')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Senegal','SEN','14241','2449','','','','','','16690')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Serbia (and Kosovo: S/RES/1244 (1999))','KOS','57074','360','168','227495','780','4195','777','290849')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Sierra Leone','SLE','2816','36','','','','','','2852')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Singapore','SIN','*','','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Sint Maarten (Dutch part)','SXM','*','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Slovakia','SVK','671','200','','','','1523','138','2532')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Slovenia','SVN','192','*','','','','*','','192')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Solomon Islands','SOL','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Somalia','SOM','2416','9867','36100','1133000','104706','','69','1286158')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('South Africa','RSA','65851','232149','','','','','','298000')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('South Sudan','SSD','229587','21','392','331097','','','','561097')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Spain','SPA','4576','4274','','','','270','','9120')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Sri Lanka','LKA','143','1605','913','42191','40691','','','85543')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('State of Palestine','GAZ','','','*','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Sudan','SUD','159838','10792','16949','1873300','19471','','3259','2083609')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Swaziland','SWA','491','526','','','','','*','1017')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Sweden','SWE','114122','27664','','','','20450','','162236')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Switzerland','SWI','52408','22075','','','','79','','74562')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Syrian Arab Republic','SYR','149266','2472','140756','6520800','','160000','','6973294')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Tajikistan','TJK','2040','2270','','','','1364','','5674')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Thailand','THA','136474','4683','','','','506197','216','647570')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('The former Yugoslav Republic of Macedonia','MCD','980','1056','','','','819','','2855')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Timor-Leste','TMP','','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Togo','TOG','20603','421','108','','','','','21132')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Tonga','TON','*','','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Trinidad and Tobago','TRT','*','38','','','','','','38')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Tunisia','TUN','712','344','*','','','','','1056')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Turkey','TUR','609911','52419','','','','780','306','663416')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Turkmenistan','TKM','40','','','','','8320','','8360')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Turks and Caicos Islands','TCI','*','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Uganda','UGA','220538','24206','*','','','','50000','294744')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Ukraine','UKR','2916','5431','','','','33271','','41618')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('United Arab Emirates','UAE','602','74','','','','','','676')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('United Kingdom','GBR','125991','22990','','','','205','','149186')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('United Republic of Tanzania','TAN','102099','392','','','','','162256','264747')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('United States','USA','263618','84302','','','','','','347920')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Uruguay','URU','180','23','','','','','','203')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Uzbekistan','UZB','138','','','','','','','138')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Vanuatu','VAN','*','*','','','','','','*')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Viet Nam','SRV','','','','','','11000','','11000')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Yemen','YEM','241276','8181','*','306614','93055','','','649126')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Zambia','ZAM','23579','2197','','','','','27205','52981')"; db.execSQL(INSERT_COUNTRY_DATA);
        INSERT_COUNTRY_DATA = "insert into Countries ('name','code','refugees','asylum','returned','idp','returned_idp','stateless','others','total') values ('Zimbabwe','ZIM','6377','469','*','60139','','','97','67082')"; db.execSQL(INSERT_COUNTRY_DATA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + Country.TABLE);

        // Create tables again
        onCreate(db);

    }

}