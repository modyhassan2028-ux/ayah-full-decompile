package i7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.R3;
import p056f2.AbstractC0939l;

/* JADX INFO: renamed from: i7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0996l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC0939l f17448s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0996l(C0999m c0999m, Context context) {
        this(context, "google_app_measurement.db");
        this.f17447r = 0;
        this.f17448s = c0999m;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f17447r) {
            case 0:
                C0999m c0999m = (C0999m) this.f17448s;
                C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
                C1023u0 c1023u1 = (C1023u0) c0999m.f16104r;
                c1023u0.getClass();
                A.o1 o1Var = c0999m.f17465v;
                if (o1Var.f366s != 0) {
                    ((Y6.a) o1Var.f367t).getClass();
                    if (SystemClock.elapsedRealtime() - o1Var.f366s < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((Y6.a) o1Var.f367t).getClass();
                    o1Var.f366s = SystemClock.elapsedRealtime();
                    X x9 = c1023u1.f17584w;
                    C1023u0.m(x9);
                    x9.f17182w.a("Opening the database failed, dropping and recreating it");
                    if (!c1023u1.f17579r.getDatabasePath("google_app_measurement.db").delete()) {
                        X x10 = c1023u1.f17584w;
                        C1023u0.m(x10);
                        x10.f17182w.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        o1Var.f366s = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e10) {
                        X x11 = c1023u1.f17584w;
                        C1023u0.m(x11);
                        x11.f17182w.b(e10, "Failed to open freshly created database");
                        throw e10;
                    }
                }
            default:
                Q q10 = (Q) this.f17448s;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e11) {
                    throw e11;
                } catch (SQLiteException unused2) {
                    C1023u0 c1023u2 = (C1023u0) q10.f16104r;
                    X x12 = c1023u2.f17584w;
                    C1023u0.m(x12);
                    x12.f17182w.a("Opening the local database failed, dropping and recreating it");
                    if (!c1023u2.f17579r.getDatabasePath("google_app_measurement_local.db").delete()) {
                        X x13 = c1023u2.f17584w;
                        C1023u0.m(x13);
                        x13.f17182w.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e12) {
                        X x14 = ((C1023u0) q10.f16104r).f17584w;
                        C1023u0.m(x14);
                        x14.f17182w.b(e12, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f17447r) {
            case 0:
                X x9 = ((C1023u0) ((C0999m) this.f17448s).f16104r).f17584w;
                C1023u0.m(x9);
                I0.f(x9, sQLiteDatabase);
                break;
            default:
                X x10 = ((C1023u0) ((Q) this.f17448s).f16104r).f17584w;
                C1023u0.m(x10);
                I0.f(x10, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.f17447r;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f17447r) {
            case 0:
                C1023u0 c1023u0 = (C1023u0) ((C0999m) this.f17448s).f16104r;
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                I0.d(x9, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C0999m.f17460w);
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C0999m.f17462y);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C0999m.f17463z);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C0999m.f17454B);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C0999m.f17453A);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C0999m.f17455C);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C0999m.f17456D);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C0999m.f17457E);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C0999m.f17458F);
                R3.a();
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C0999m.f17459G);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C0999m.f17461x);
                C1023u0.m(x10);
                I0.d(x10, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                X x11 = ((C1023u0) ((Q) this.f17448s).f16104r).f17584w;
                C1023u0.m(x11);
                I0.d(x11, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", Q.f17070v);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.f17447r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0996l(Q q10, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f17447r = 1;
        this.f17448s = q10;
    }

    public C0996l(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void i(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    private final void n(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
