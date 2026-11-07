package i7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0797c1;
import com.google.android.gms.internal.measurement.C0802d1;
import com.google.android.gms.internal.measurement.C0817g1;
import com.google.android.gms.internal.measurement.C0827i1;
import com.google.android.gms.internal.measurement.C0832j1;
import com.google.android.gms.internal.measurement.C0837k1;
import com.google.android.gms.internal.measurement.C0842l1;
import com.google.android.gms.internal.measurement.C0886u1;
import com.google.android.gms.internal.measurement.InterfaceC0858o2;
import com.google.android.gms.internal.measurement.R3;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: i7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0999m extends L1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0996l f17464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A.o1 f17465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f17460w = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f17461x = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f17462y = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f17463z = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f17453A = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f17454B = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f17455C = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f17456D = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f17457E = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f17458F = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f17459G = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C0999m(Q1 q10) {
        super(q10);
        this.f17465v = new A.o1(((C1023u0) this.f16104r).f17564B);
        ((C1023u0) this.f16104r).getClass();
        this.f17464u = new C0996l(this, ((C1023u0) this.f16104r).f17579r);
    }

    public static final String R(List list) {
        return list.isEmpty() ? "" : p245z2.a.D(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void X(ContentValues contentValues, Object obj) {
        U6.y.c("value");
        U6.y.f(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final void A(Long l10) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        if (V()) {
            StringBuilder sb = new StringBuilder(l10.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l10);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (Y(sb.toString(), null) > 0) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseD0 = d0();
                c1023u0.f17564B.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l10.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l10);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseD0.execSQL(sb3.toString());
            } catch (SQLiteException e10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.b(e10, "Error incrementing retry count. error");
            }
        }
    }

    public final Object B(Cursor cursor, int i10) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        int type = cursor.getType(i10);
        if (type == 0) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        X x11 = c1023u0.f17584w;
        C1023u0.m(x11);
        x11.f17182w.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    public final long C(String str) {
        long j;
        ContentValues contentValues;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        U6.y.c("first_open_count");
        o();
        p();
        SQLiteDatabase sQLiteDatabaseD0 = d0();
        sQLiteDatabaseD0.beginTransaction();
        long j10 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jZ = Z(sb.toString(), new String[]{str}, -1L);
                if (jZ == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseD0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17182w.c(X.w(str), "first_open_count", "Failed to insert column (got -1). appId");
                    } else {
                        jZ = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jZ));
                            if (sQLiteDatabaseD0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                X x10 = c1023u0.f17584w;
                                C1023u0.m(x10);
                                x10.f17182w.c(X.w(str), "first_open_count", "Failed to update column (got 0). appId");
                            } else {
                                sQLiteDatabaseD0.setTransactionSuccessful();
                                j = jZ;
                            }
                        } catch (SQLiteException e10) {
                            e = e10;
                            j10 = jZ;
                            X x11 = c1023u0.f17584w;
                            C1023u0.m(x11);
                            x11.f17182w.d("Error inserting column. appId", X.w(str), "first_open_count", e);
                            j = j10;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jZ));
                    if (sQLiteDatabaseD0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        X x12 = c1023u0.f17584w;
                        C1023u0.m(x12);
                        x12.f17182w.c(X.w(str), "first_open_count", "Failed to update column (got 0). appId");
                    } else {
                        sQLiteDatabaseD0.setTransactionSuccessful();
                        j = jZ;
                    }
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
            return j;
        } finally {
            sQLiteDatabaseD0.endTransaction();
        }
    }

    public final boolean D(String str, String str2) {
        return Y("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long E(String str) {
        U6.y.c(str);
        return Z("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void F(String str, Long l10, long j, C0802d1 c0802d1) {
        o();
        p();
        U6.y.f(c0802d1);
        U6.y.c(str);
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        byte[] bArrA = c0802d1.a();
        X x9 = c1023u0.f17584w;
        X x10 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17178E.c(c1023u0.f17563A.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (d0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C1023u0.m(x10);
                x10.f17182w.b(X.w(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1023u0.m(x10);
            x10.f17182w.c(X.w(str), e10, "Error storing complex main event. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[LOOP:2: B:51:0x00fd->B:127:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0103  */
    public final void G(String str, Long l10, String str2, Bundle bundle) {
        X x9;
        Bundle bundle2;
        String str3;
        long j;
        ContentValues contentValues;
        X x10;
        C0842l1 c0842l1;
        Iterator it;
        C0999m c0999m = this;
        String str4 = str;
        C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
        U6.y.f(bundle);
        c0999m.o();
        c0999m.p();
        E0.d dVar = l10 != null ? new E0.d(c0999m, str4, l10.longValue()) : new E0.d(c0999m, str4);
        List<C0993k> listA = dVar.a();
        while (!listA.isEmpty()) {
            for (C0993k c0993k : listA) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        C0842l1 c0842l2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = c0999m.d0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(c0993k.f17436b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                c0842l1 = (C0842l1) ((C0837k1) C0967b0.b0(C0842l1.U(), cursorQuery.getBlob(0))).e();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        X x11 = c1023u0.f17584w;
                                                        C1023u0.m(x11);
                                                        x11.f17185z.b(X.w(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    cursor = cursorQuery;
                                                    X x12 = c1023u0.f17584w;
                                                    C1023u0.m(x12);
                                                    x12.f17182w.c(X.w(str4), e, "Data loss. Error selecting raw event. appId");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                c0842l2 = c0842l1;
                                            } catch (IOException e11) {
                                                X x13 = c1023u0.f17584w;
                                                C1023u0.m(x13);
                                                x13.f17182w.c(X.w(str4), e11, "Data loss. Failed to merge raw event metadata. appId");
                                                cursorQuery.close();
                                            }
                                            if (c0842l2 != null) {
                                                it = c0842l2.U1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((C0886u1) it.next()).r().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            X x14 = c1023u0.f17584w;
                                            C1023u0.m(x14);
                                            x14.f17182w.b(X.w(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        c0842l1 = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            c0842l1 = null;
                        }
                        if (c0842l2 != null) {
                            it = c0842l2.U1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C0886u1) it.next()).r().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = d0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        C1023u0.m(x9);
                        x10 = x9;
                        try {
                            x10.f17182w.c(X.w(str3), Long.valueOf(jUpdate), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e14) {
                            e = e14;
                            C1023u0.m(x10);
                            x10.f17182w.c(X.w(str3), e, "Error updating raw event. appId");
                        }
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                    x10 = x9;
                }
                Q1 q10 = c0999m.f17001s;
                C0967b0 c0967b0 = q10.f17110x;
                Q1.U(c0967b0);
                C0802d1 c0802d1 = c0993k.f17438d;
                Bundle bundle3 = new Bundle();
                for (C0817g1 c0817g1 : c0802d1.p()) {
                    if (c0817g1.x()) {
                        bundle3.putDouble(c0817g1.q(), c0817g1.y());
                    } else if (c0817g1.v()) {
                        bundle3.putFloat(c0817g1.q(), c0817g1.w());
                    } else if (c0817g1.t()) {
                        bundle3.putLong(c0817g1.q(), c0817g1.u());
                    } else if (c0817g1.r()) {
                        bundle3.putString(c0817g1.q(), c0817g1.s());
                    } else if (c0817g1.z().isEmpty()) {
                        X x15 = ((C1023u0) c0967b0.f16104r).f17584w;
                        C1023u0.m(x15);
                        x15.f17182w.b(c0817g1, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(c0817g1.q(), C0967b0.d0((InterfaceC0858o2) c0817g1.z()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strS = c0802d1.s();
                if (string == null) {
                    string = "";
                }
                V1 v10 = c1023u0.f17587z;
                x9 = c1023u0.f17584w;
                C1023u0.k(v10);
                if (strS.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        C0802d1 c0802d2 = c0802d1;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        c0802d1 = c0802d2;
                    }
                } else {
                    bundle2 = bundle;
                }
                C0802d1 c0802d3 = c0802d1;
                v10.z(bundle3, bundle2);
                C1011q c1011q = new C1011q((C1023u0) c0999m.f16104r, string, str4, c0802d3.s(), c0802d3.u(), c0802d3.w(), bundle3);
                str3 = (String) c1011q.f17511d;
                j = c0993k.f17435a;
                long j10 = c0993k.f17436b;
                boolean z10 = c0993k.f17437c;
                c0999m.o();
                c0999m.p();
                U6.y.c(str3);
                C0967b0 c0967b1 = q10.f17110x;
                Q1.U(c0967b1);
                byte[] bArrA = c0967b1.Q(c1011q).a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", (String) c1011q.f17512e);
                contentValues.put("timestamp", Long.valueOf(c1011q.f17509b));
                contentValues.put("metadata_fingerprint", Long.valueOf(j10));
                contentValues.put("data", bArrA);
                contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
                c0999m = this;
                str4 = str;
            }
            listA = dVar.a();
            c0999m = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final H0 H(String str) throws Throwable {
        Throwable th;
        SQLiteException e10;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.f(str);
        o();
        p();
        ?? RawQuery = {str};
        ?? r10 = 0;
        h0C = null;
        h0C = null;
        H0 h0C = null;
        try {
            try {
                RawQuery = d0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        h0C = H0.c(RawQuery.getInt(1), RawQuery.getString(0));
                    } else {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17178E.a("No data found");
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.b(e10, "Error querying database.");
                    if (RawQuery != 0) {
                    }
                    if (h0C == null) {
                        return H0.f16998c;
                    }
                    return h0C;
                }
            } catch (Throwable th2) {
                th = th2;
                r10 = RawQuery;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        RawQuery.close();
        if (h0C == null) {
            return H0.f16998c;
        }
        return h0C;
    }

    public final void I(String str, F1 f3) {
        o();
        p();
        U6.y.c(str);
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        Y6.a aVar = c1023u0.f17564B;
        X x9 = c1023u0.f17584w;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        F f7 = G.f16982w0;
        long jLongValue = jCurrentTimeMillis - ((Long) f7.a(null)).longValue();
        long j = f3.f16880s;
        if (j < jLongValue || j > ((Long) f7.a(null)).longValue() + jCurrentTimeMillis) {
            C1023u0.m(x9);
            x9.f17185z.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", X.w(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        C1023u0.m(x9);
        x9.f17178E.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", f3.f16879r);
        contentValues.put("source", Integer.valueOf(f3.f16881t));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (d0().insert("trigger_uris", null, contentValues) == -1) {
                C1023u0.m(x9);
                x9.f17182w.b(X.w(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1023u0.m(x9);
            x9.f17182w.c(X.w(str), e10, "Error storing trigger URI. appId");
        }
    }

    public final void J(String str, H0 h7) {
        U6.y.f(str);
        U6.y.f(h7);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", h7.g());
        contentValues.put("consent_source", Integer.valueOf(h7.f17000b));
        L(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String K(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = d0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e10) {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final void L(ContentValues contentValues) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        try {
            SQLiteDatabase sQLiteDatabaseD0 = d0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17184y.b(X.w("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseD0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseD0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.c(X.w("consent_settings"), X.w("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e10) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17182w.d("Error storing into table. key", X.w("consent_settings"), X.w("app_id"), e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    public final r M(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str2);
        U6.y.c(str3);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = d0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j10 = cursorQuery.getLong(1);
                        long j11 = cursorQuery.getLong(2);
                        long j12 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        r rVar = new r(str2, str3, j, j10, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j11, j12, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.b(X.w(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return rVar;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.d("Error querying events. appId", X.w(str2), c1023u0.f17563A.a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void N(String str, r rVar) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.f(rVar);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        String str2 = rVar.f17521a;
        contentValues.put("app_id", str2);
        contentValues.put("name", rVar.f17522b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f17523c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f17524d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f17526f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.g));
        contentValues.put("last_bundled_day", rVar.f17527h);
        contentValues.put("last_sampled_complex_event_id", rVar.f17528i);
        contentValues.put("last_sampling_rate", rVar.j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f17525e));
        Boolean bool = rVar.f17529k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (d0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17182w.b(X.w(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.c(X.w(str2), e10, "Error storing event aggregates. appId");
        }
    }

    public final void O(String str, String str2) {
        U6.y.c(str2);
        o();
        p();
        try {
            d0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.c(X.w(str2), e10, "Error deleting snapshot. appId");
        }
    }

    public final R1 P(String str, long j, byte[] bArr, String str2, String str3, int i10, int i11, long j10, long j11, long j12) {
        EnumC0980f1 enumC0980f1;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        if (TextUtils.isEmpty(str2)) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17177D.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C0827i1 c0827i1 = (C0827i1) C0967b0.b0(C0832j1.w(), bArr);
            EnumC0980f1[] enumC0980f1ArrValues = EnumC0980f1.values();
            int length = enumC0980f1ArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    enumC0980f1 = EnumC0980f1.UNKNOWN;
                    break;
                }
                enumC0980f1 = enumC0980f1ArrValues[i12];
                if (enumC0980f1.f17357r == i10) {
                    break;
                }
                i12++;
            }
            if (enumC0980f1 != EnumC0980f1.GOOGLE_SIGNAL && enumC0980f1 != EnumC0980f1.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = DesugarCollections.unmodifiableList(((C0832j1) c0827i1.f14329s).p()).iterator();
                while (it.hasNext()) {
                    C0837k1 c0837k1 = (C0837k1) ((C0842l1) it.next()).i();
                    c0837k1.b();
                    ((C0842l1) c0837k1.f14329s).T0(i11);
                    arrayList.add((C0842l1) c0837k1.e());
                }
                c0827i1.b();
                ((C0832j1) c0827i1.f14329s).B();
                c0827i1.b();
                ((C0832j1) c0827i1.f14329s).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17182w.b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new R1(j, (C0832j1) c0827i1.e(), str2, map, enumC0980f1, j10, j11, j12, i11);
        } catch (IOException e10) {
            X x11 = c1023u0.f17584w;
            C1023u0.m(x11);
            x11.f17182w.c(str, e10, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    public final String Q() {
        ((C1023u0) this.f16104r).f17564B.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) G.T.a(null);
        l10.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l10 + ")";
        long jLongValue = ((Long) G.S.a(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb.append(jCurrentTimeMillis);
        sb.append(") > ");
        String strX = android.support.v4.media.session.p.x(jLongValue, ")", sb);
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + strX.length() + 1);
        p245z2.a.I(sb2, "(", str, " OR ", strX);
        sb2.append(")");
        return sb2.toString();
    }

    public final void S(String str, H0 h7) {
        U6.y.f(str);
        o();
        p();
        J(str, H(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", h7.g());
        L(contentValues);
    }

    public final H0 T(String str) {
        U6.y.f(str);
        o();
        p();
        return H0.c(100, K("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final r U(String str, C0802d1 c0802d1, String str2) {
        r rVarM = M("events", str, c0802d1.s());
        if (rVarM != null) {
            long j = rVarM.f17525e + 1;
            long j10 = rVarM.f17524d + 1;
            return new r(rVarM.f17521a, rVarM.f17522b, rVarM.f17523c + 1, j10, j, rVarM.f17526f, rVarM.g, rVarM.f17527h, rVarM.f17528i, rVarM.j, rVarM.f17529k);
        }
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        X x9 = c1023u0.f17584w;
        C1023u0.m(x9);
        x9.f17185z.c(X.w(str), c1023u0.f17563A.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new r(str, c0802d1.s(), 1L, 1L, 1L, c0802d1.u(), 0L, null, null, null, null);
    }

    public final boolean V() {
        return ((C1023u0) this.f16104r).f17579r.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0248  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0124 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_ENTER, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0175  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0190 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3 A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, LOOP:0: B:80:0x01b3->B:127:?, LOOP_START, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0207 A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020e A[Catch: all -> 0x01f1, SQLiteException -> 0x01f3, TRY_LEAVE, TryCatch #1 {all -> 0x01f1, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:78:0x01ad, B:80:0x01b3, B:81:0x01bc, B:83:0x01c7, B:92:0x0207, B:91:0x01f6, B:95:0x020e, B:103:0x0235, B:11:0x003e, B:31:0x008c, B:33:0x0092, B:39:0x00a4, B:36:0x009a), top: B:113:0x0018 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void W(String str, long j, long j10, C0982g0 c0982g0) throws Throwable {
        ?? r10;
        ?? r11;
        Cursor cursorRawQuery;
        String str2;
        String[] strArr;
        String string;
        ?? r12;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str3;
        long j11;
        C0797c1 c0797c1;
        long jZ;
        long j12;
        String string2;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        Cursor cursorQuery = null;
        cursorQuery = null;
        ?? r13 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseD0 = d0();
                ?? IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                try {
                    if (IsEmpty != 0) {
                        String[] strArr5 = j10 != -1 ? new String[]{String.valueOf(j10), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        str4 = j10 != -1 ? "rowid <= ? and " : "";
                        StringBuilder sb = new StringBuilder(str4.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str4);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseD0.rawQuery(sb.toString(), strArr5);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string2 = cursorRawQuery.getString(0);
                                try {
                                    string = cursorRawQuery.getString(1);
                                    cursorRawQuery.close();
                                    r12 = string2;
                                    cursorRawQuery = sQLiteDatabaseD0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        try {
                                            C0842l1 c0842l1 = (C0842l1) ((C0837k1) C0967b0.b0(C0842l1.U(), cursorRawQuery.getBlob(0))).e();
                                            if (cursorRawQuery.moveToNext()) {
                                                X x9 = c1023u0.f17584w;
                                                C1023u0.m(x9);
                                                x9.f17185z.b(X.w(r12), "Get multiple raw event metadata records, expected one. appId");
                                            }
                                            cursorRawQuery.close();
                                            c0982g0.f17363b = c0842l1;
                                            if (c1023u0.f17582u.y(null, G.f16960l1)) {
                                                jZ = Z("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                                if (j10 == -1) {
                                                    j12 = j10;
                                                } else if (jZ != -1) {
                                                    j12 = -1;
                                                } else {
                                                    strArr2 = new String[]{r12, string};
                                                    strArr4 = strArr2;
                                                    str3 = "app_id = ? and metadata_fingerprint = ?";
                                                }
                                                if (j12 == -1 && jZ != -1) {
                                                    jZ = Math.min(j12, jZ);
                                                } else if (j12 != -1) {
                                                    jZ = j12;
                                                }
                                                strArr3 = new String[]{r12, string, String.valueOf(jZ)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else if (j10 != -1) {
                                                strArr3 = new String[]{r12, string, String.valueOf(j10)};
                                                strArr4 = strArr3;
                                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorQuery = sQLiteDatabaseD0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                            try {
                                                if (cursorQuery.moveToFirst()) {
                                                    do {
                                                        j11 = cursorQuery.getLong(0);
                                                        try {
                                                            c0797c1 = (C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery.getBlob(3));
                                                            String string3 = cursorQuery.getString(1);
                                                            c0797c1.b();
                                                            ((C0802d1) c0797c1.f14329s).F(string3);
                                                            long j13 = cursorQuery.getLong(2);
                                                            c0797c1.b();
                                                            ((C0802d1) c0797c1.f14329s).G(j13);
                                                            if (!c0982g0.a(j11, (C0802d1) c0797c1.e())) {
                                                                break;
                                                            }
                                                        } catch (IOException e10) {
                                                            X x10 = c1023u0.f17584w;
                                                            C1023u0.m(x10);
                                                            x10.f17182w.c(X.w(r12), e10, "Data loss. Failed to merge raw event. appId");
                                                        }
                                                    } while (cursorQuery.moveToNext());
                                                } else {
                                                    X x11 = c1023u0.f17584w;
                                                    C1023u0.m(x11);
                                                    x11.f17185z.b(X.w(r12), "Raw event data disappeared while in transaction. appId");
                                                }
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                r11 = r12;
                                                X x12 = c1023u0.f17584w;
                                                C1023u0.m(x12);
                                                x12.f17182w.c(X.w(r11), e, "Data loss. Error selecting raw event. appId");
                                            }
                                            cursorRawQuery = cursorQuery;
                                        } catch (IOException e12) {
                                            X x13 = c1023u0.f17584w;
                                            C1023u0.m(x13);
                                            x13.f17182w.c(X.w(r12), e12, "Data loss. Failed to merge raw event metadata. appId");
                                        }
                                    } else {
                                        X x14 = c1023u0.f17584w;
                                        C1023u0.m(x14);
                                        x14.f17182w.b(X.w(r12), "Raw event metadata record is missing. appId");
                                    }
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    cursorQuery = cursorRawQuery;
                                    r11 = string2;
                                    X x15 = c1023u0.f17584w;
                                    C1023u0.m(x15);
                                    x15.f17182w.c(X.w(r11), e, "Data loss. Error selecting raw event. appId");
                                    cursorRawQuery = cursorQuery;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                }
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            string2 = str;
                        }
                    } else {
                        try {
                            if (j10 != -1) {
                                String str5 = str;
                                strArr = new String[]{str5, String.valueOf(j10)};
                                IsEmpty = str5;
                            } else {
                                str2 = str;
                                strArr = new String[]{str2};
                            }
                            if (j10 != -1) {
                                IsEmpty = str2;
                                str4 = " and rowid <= ?";
                            }
                            IsEmpty = str2;
                            StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                            sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                            sb2.append(str4);
                            sb2.append(" order by rowid limit 1;");
                            cursorRawQuery = sQLiteDatabaseD0.rawQuery(sb2.toString(), strArr);
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    string = cursorRawQuery.getString(0);
                                    cursorRawQuery.close();
                                    r12 = IsEmpty;
                                    cursorRawQuery = sQLiteDatabaseD0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r12, string}, null, null, "rowid", "2");
                                    if (cursorRawQuery.moveToFirst()) {
                                        X x16 = c1023u0.f17584w;
                                        C1023u0.m(x16);
                                        x16.f17182w.b(X.w(r12), "Raw event metadata record is missing. appId");
                                    } else {
                                        C0842l1 c0842l2 = (C0842l1) ((C0837k1) C0967b0.b0(C0842l1.U(), cursorRawQuery.getBlob(0))).e();
                                        if (cursorRawQuery.moveToNext()) {
                                            X x17 = c1023u0.f17584w;
                                            C1023u0.m(x17);
                                            x17.f17185z.b(X.w(r12), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        c0982g0.f17363b = c0842l2;
                                        if (c1023u0.f17582u.y(null, G.f16960l1)) {
                                            jZ = Z("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r12, string}, -1L);
                                            if (j10 == -1) {
                                                j12 = j10;
                                            } else if (jZ != -1) {
                                                j12 = -1;
                                            } else {
                                                strArr2 = new String[]{r12, string};
                                                strArr4 = strArr2;
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            if (j12 == -1) {
                                                if (j12 != -1) {
                                                    jZ = j12;
                                                }
                                            } else if (j12 != -1) {
                                                jZ = j12;
                                            }
                                            strArr3 = new String[]{r12, string, String.valueOf(jZ)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else if (j10 != -1) {
                                            strArr3 = new String[]{r12, string, String.valueOf(j10)};
                                            strArr4 = strArr3;
                                            str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        } else {
                                            strArr2 = new String[]{r12, string};
                                            strArr4 = strArr2;
                                            str3 = "app_id = ? and metadata_fingerprint = ?";
                                        }
                                        cursorQuery = sQLiteDatabaseD0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str3, strArr4, null, null, "rowid", null);
                                        if (cursorQuery.moveToFirst()) {
                                            do {
                                                j11 = cursorQuery.getLong(0);
                                                c0797c1 = (C0797c1) C0967b0.b0(C0802d1.z(), cursorQuery.getBlob(3));
                                                String string4 = cursorQuery.getString(1);
                                                c0797c1.b();
                                                ((C0802d1) c0797c1.f14329s).F(string4);
                                                long j14 = cursorQuery.getLong(2);
                                                c0797c1.b();
                                                ((C0802d1) c0797c1.f14329s).G(j14);
                                                if (!c0982g0.a(j11, (C0802d1) c0797c1.e())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorQuery.moveToNext());
                                        } else {
                                            X x18 = c1023u0.f17584w;
                                            C1023u0.m(x18);
                                            x18.f17185z.b(X.w(r12), "Raw event data disappeared while in transaction. appId");
                                        }
                                        cursorRawQuery = cursorQuery;
                                    }
                                }
                            } catch (SQLiteException e15) {
                                e = e15;
                                cursorQuery = cursorRawQuery;
                                r10 = IsEmpty;
                                r11 = r10;
                                X x19 = c1023u0.f17584w;
                                C1023u0.m(x19);
                                x19.f17182w.c(X.w(r11), e, "Data loss. Error selecting raw event. appId");
                                cursorRawQuery = cursorQuery;
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r10 = IsEmpty;
                        }
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    r13 = "select metadata_fingerprint from raw_events where app_id = ?";
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (SQLiteException e17) {
            e = e17;
            r10 = str;
        }
    }

    public final long Y(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = d0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e10) {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long Z(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = d0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e10) {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void a0() {
        p();
        d0().beginTransaction();
    }

    public final void b0() {
        p();
        d0().setTransactionSuccessful();
    }

    public final void c0() {
        p();
        d0().endTransaction();
    }

    public final SQLiteDatabase d0() {
        o();
        try {
            return this.f17464u.getWritableDatabase();
        } catch (SQLiteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17185z.b(e10, "Error opening database");
            throw e10;
        }
    }

    public final void e0(String str) {
        r rVarM;
        O("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (rVarM = M("events", str, string)) != null) {
                            N("events_snapshot", rVarM);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(X.w(str), e10, "Error creating snapshot. appId");
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void f0(String str) throws Throwable {
        boolean z10;
        r rVarM;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        r rVarM2 = M("events", str, "_f");
        r rVarM3 = M("events", str, "_v");
        O("events", str);
        Cursor cursorQuery = null;
        boolean z11 = false;
        try {
            cursorQuery = d0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z12 = false;
                z10 = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z12 = true;
                            } else if ("_v".equals(string)) {
                                z10 = true;
                            }
                        }
                        if (string != null && (rVarM = M("events_snapshot", str, string)) != null) {
                            N("events", rVarM);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        z11 = z12;
                        try {
                            X x9 = ((C1023u0) this.f16104r).f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.c(X.w(str), e, "Error querying snapshot. appId");
                            z12 = z11;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z11 && rVarM2 != null) {
                                N("events", rVarM2);
                            } else if (!z10 && rVarM3 != null) {
                                N("events", rVarM3);
                            }
                            O("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = z12;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z11) {
                            if (!z10) {
                                N("events", rVarM3);
                            }
                        } else if (!z10) {
                            N("events", rVarM3);
                        }
                        O("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z12 && rVarM2 != null) {
                    N("events", rVarM2);
                } else if (!z10 && rVarM3 != null) {
                    N("events", rVarM3);
                }
            } else {
                cursorQuery.close();
                if (rVarM2 != null) {
                    N("events", rVarM2);
                } else if (rVarM3 != null) {
                    N("events", rVarM3);
                }
            }
        } catch (SQLiteException e11) {
            e = e11;
            z10 = false;
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
        O("events_snapshot", str);
    }

    public final void g0(String str, String str2) {
        U6.y.c(str);
        U6.y.c(str2);
        o();
        p();
        try {
            d0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.d("Error deleting user property. appId", X.w(str), c1023u0.f17563A.c(str2), e10);
        }
    }

    public final boolean h0(T1 t2) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        String str = t2.f17144b;
        o();
        p();
        String str2 = t2.f17143a;
        String str3 = t2.f17145c;
        if (i0(str2, str3) == null) {
            if (V1.o0(str3)) {
                if (Y("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c1023u0.f17582u.w(str2, G.f16920W), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jY = Y("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c1023u0.getClass();
                if (jY >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(t2.f17146d));
        X(contentValues, t2.f17147e);
        try {
            if (d0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(X.w(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.c(X.w(str2), e10, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    public final T1 i0(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        U6.y.c(str2);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = d0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objB = B(cursorQuery, 1);
                        if (objB != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                T1 t2 = new T1(str3, cursorQuery.getString(2), str4, j, objB);
                                if (cursorQuery.moveToNext()) {
                                    X x9 = c1023u0.f17584w;
                                    C1023u0.m(x9);
                                    x9.f17182w.b(X.w(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return t2;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                        sQLiteException = e;
                        X x10 = c1023u0.f17584w;
                        C1023u0.m(x10);
                        x10.f17182w.d("Error querying user property. appId", X.w(str3), c1023u0.f17563A.c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            str3 = str;
            str4 = str2;
            sQLiteException = e12;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List j0(String str) {
        String str2;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        o();
        p();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                c1023u0.getClass();
                cursorQuery = d0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursorQuery.getLong(2);
                            Object objB = B(cursorQuery, 3);
                            if (objB == null) {
                                X x9 = c1023u0.f17584w;
                                C1023u0.m(x9);
                                x9.f17182w.b(X.w(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new T1(str2, str3, string, j, objB));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e10) {
                                e = e10;
                                X x10 = c1023u0.f17584w;
                                C1023u0.m(x10);
                                x10.f17182w.c(X.w(str2), e, "Error querying user properties. appId");
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str2 = str;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e12) {
            e = e12;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List k0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        o();
        p();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            c1023u0.getClass();
            X x9 = c1023u0.f17584w;
            cursorQuery = d0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    C1023u0.m(x9);
                                    x9.f17182w.b(1000, "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objB = B(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objB == null) {
                                    try {
                                        C1023u0.m(x9);
                                        x9.f17182w.d("(2)Read invalid user property value, ignoring it", X.w(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            X x10 = c1023u0.f17584w;
                                            C1023u0.m(x10);
                                            x10.f17182w.d("(2)Error querying user properties", X.w(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new T1(str, str5, string2, j, objB));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    X x11 = c1023u0.f17584w;
                                    C1023u0.m(x11);
                                    x11.f17182w.d("(2)Error querying user properties", X.w(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                cursor = cursorQuery;
                                X x12 = c1023u0.f17584w;
                                C1023u0.m(x12);
                                x12.f17182w.d("(2)Error querying user properties", X.w(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e13) {
                e = e13;
                str4 = str2;
            }
        } catch (SQLiteException e14) {
            e = e14;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final boolean l0(C0975e c0975e) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        String str = c0975e.f17325r;
        U6.y.f(str);
        if (i0(str, c0975e.f17327t.f17132s) == null) {
            long jY = Y("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c1023u0.getClass();
            if (jY >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0975e.f17326s);
        contentValues.put("name", c0975e.f17327t.f17132s);
        Object objB = c0975e.f17327t.b();
        U6.y.f(objB);
        X(contentValues, objB);
        contentValues.put("active", Boolean.valueOf(c0975e.f17329v));
        contentValues.put("trigger_event_name", c0975e.f17330w);
        contentValues.put("trigger_timeout", Long.valueOf(c0975e.f17332y));
        C1022u c1022u = c0975e.f17331x;
        V1 v10 = c1023u0.f17587z;
        X x9 = c1023u0.f17584w;
        C1023u0.k(v10);
        contentValues.put("timed_out_event", V1.U(c1022u));
        contentValues.put("creation_timestamp", Long.valueOf(c0975e.f17328u));
        C1023u0.k(v10);
        contentValues.put("triggered_event", V1.U(c0975e.f17333z));
        contentValues.put("triggered_timestamp", Long.valueOf(c0975e.f17327t.f17133t));
        contentValues.put("time_to_live", Long.valueOf(c0975e.f17323A));
        contentValues.put("expired_event", V1.U(c0975e.f17324B));
        try {
            if (d0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C1023u0.m(x9);
            x9.f17182w.b(X.w(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e10) {
            C1023u0.m(x9);
            x9.f17182w.c(X.w(str), e10, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0115  */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f5: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:246), block:B:29:0x00f5 */
    public final C0975e m0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        U6.y.c(str2);
        o();
        p();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = d0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objB = B(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    C0967b0 c0967b0 = this.f17001s.f17110x;
                    Q1.U(c0967b0);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<C1022u> creator = C1022u.CREATOR;
                    C1022u c1022u = (C1022u) c0967b0.T(blob, creator);
                    long j10 = cursorQuery.getLong(6);
                    Q1.U(c0967b0);
                    C1022u c1022u2 = (C1022u) c0967b0.T(cursorQuery.getBlob(7), creator);
                    long j11 = cursorQuery.getLong(8);
                    long j12 = cursorQuery.getLong(9);
                    Q1.U(c0967b0);
                    C1022u c1022u3 = (C1022u) c0967b0.T(cursorQuery.getBlob(10), creator);
                    str3 = str2;
                    try {
                        C0975e c0975e = new C0975e(str, str4, new S1(str3, str4, j11, objB), j10, z10, string2, c1022u, j, c1022u2, j12, c1022u3);
                        if (cursorQuery.moveToNext()) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.c(X.w(str), c1023u0.f17563A.c(str3), "Got multiple records for conditional property, expected one");
                        }
                        cursorQuery.close();
                        return c0975e;
                    } catch (SQLiteException e10) {
                        e = e10;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        X x10 = c1023u0.f17584w;
        C1023u0.m(x10);
        x10.f17182w.d("Error querying conditional property", X.w(str), c1023u0.f17563A.c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void n0(String str, String str2) {
        U6.y.c(str);
        U6.y.c(str2);
        o();
        p();
        try {
            d0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17182w.d("Error deleting conditional property", X.w(str), c1023u0.f17563A.c(str2), e10);
        }
    }

    public final List o0(String str, String str2, String str3) {
        U6.y.c(str);
        o();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return p0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    public final List p0(String str, String[] strArr) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                c1023u0.getClass();
                cursorQuery = d0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objB = B(cursorQuery, 3);
                        boolean z10 = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        C0967b0 c0967b0 = this.f17001s.f17110x;
                        Q1.U(c0967b0);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<C1022u> creator = C1022u.CREATOR;
                        C1022u c1022u = (C1022u) c0967b0.T(blob, creator);
                        long j10 = cursorQuery.getLong(8);
                        Q1.U(c0967b0);
                        C1022u c1022u2 = (C1022u) c0967b0.T(cursorQuery.getBlob(9), creator);
                        long j11 = cursorQuery.getLong(10);
                        long j12 = cursorQuery.getLong(11);
                        Q1.U(c0967b0);
                        arrayList.add(new C0975e(string, string2, new S1(string3, string2, j11, objB), j10, z10, string4, c1022u, j, c1022u2, j12, (C1022u) c0967b0.T(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.b(e10, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x03ed  */
    public final C0970c0 q0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        o();
        p();
        Cursor cursor = null;
        try {
            cursorQuery = d0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        Q1 q10 = this.f17001s;
                        C0970c0 c0970c0 = new C0970c0(q10.f17084C, str);
                        C1023u0 c1023u1 = c0970c0.f17292a;
                        H0 h0A = q10.a(str);
                        G0 g10 = G0.f16990t;
                        if (h0A.i(g10)) {
                            c0970c0.F(cursorQuery.getString(0));
                        }
                        boolean z10 = true;
                        c0970c0.H(cursorQuery.getString(1));
                        if (q10.a(str).i(G0.f16989s)) {
                            c0970c0.I(cursorQuery.getString(2));
                        }
                        c0970c0.e(cursorQuery.getLong(3));
                        c0970c0.L(cursorQuery.getLong(4));
                        c0970c0.M(cursorQuery.getLong(5));
                        c0970c0.O(cursorQuery.getString(6));
                        c0970c0.R(cursorQuery.getString(7));
                        c0970c0.S(cursorQuery.getLong(8));
                        c0970c0.a(cursorQuery.getLong(9));
                        c0970c0.d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        c0970c0.i(cursorQuery.getLong(11));
                        c0970c0.j(cursorQuery.getLong(12));
                        c0970c0.k(cursorQuery.getLong(13));
                        c0970c0.l(cursorQuery.getLong(14));
                        c0970c0.f(cursorQuery.getLong(15));
                        c0970c0.g(cursorQuery.getLong(16));
                        c0970c0.Q(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        c0970c0.K(cursorQuery.getString(18));
                        c0970c0.n(cursorQuery.getLong(19));
                        c0970c0.m(cursorQuery.getLong(20));
                        c0970c0.v(cursorQuery.getString(21));
                        boolean z11 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        C1014r0 c1014r0 = c1023u1.f17585x;
                        C1023u0.m(c1014r0);
                        c1014r0.o();
                        c0970c0.Q |= c0970c0.f17305p != z11;
                        c0970c0.f17305p = z11;
                        c0970c0.c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            c0970c0.x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (q10.a(str).i(g10)) {
                            String string2 = cursorQuery.getString(28);
                            C1014r0 c1014r1 = c1023u1.f17585x;
                            C1023u0.m(c1014r1);
                            c1014r1.o();
                            c0970c0.Q |= !Objects.equals(c0970c0.f17309t, string2);
                            c0970c0.f17309t = string2;
                        }
                        boolean z12 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        C1014r0 c1014r2 = c1023u1.f17585x;
                        C1023u0.m(c1014r2);
                        c1014r2.o();
                        c0970c0.Q |= c0970c0.f17310u != z12;
                        c0970c0.f17310u = z12;
                        c0970c0.r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        C1014r0 c1014r3 = c1023u1.f17585x;
                        C1023u0.m(c1014r3);
                        c1014r3.o();
                        c0970c0.Q |= c0970c0.f17278C != string3;
                        c0970c0.f17278C = string3;
                        c0970c0.z(cursorQuery.getLong(30));
                        c0970c0.A(cursorQuery.getLong(31));
                        R3.a();
                        if (c1023u0.f17582u.y(str, G.f16913Q0)) {
                            int i10 = cursorQuery.getInt(32);
                            C1014r0 c1014r4 = c1023u1.f17585x;
                            C1023u0.m(c1014r4);
                            c1014r4.o();
                            c0970c0.Q |= c0970c0.f17313x != i10;
                            c0970c0.f17313x = i10;
                            c0970c0.B(cursorQuery.getLong(35));
                        }
                        boolean z13 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        C1014r0 c1014r5 = c1023u1.f17585x;
                        C1023u0.m(c1014r5);
                        c1014r5.o();
                        c0970c0.Q |= c0970c0.f17314y != z13;
                        c0970c0.f17314y = z13;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        C1014r0 c1014r6 = c1023u1.f17585x;
                        C1023u0.m(c1014r6);
                        c1014r6.o();
                        c0970c0.Q |= !Objects.equals(c0970c0.f17306q, boolValueOf);
                        c0970c0.f17306q = boolValueOf;
                        c0970c0.p(cursorQuery.getInt(37));
                        c0970c0.q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            U6.y.f(string);
                        }
                        C1014r0 c1014r7 = c1023u1.f17585x;
                        C1023u0.m(c1014r7);
                        c1014r7.o();
                        c0970c0.Q |= c0970c0.f17282G != string;
                        c0970c0.f17282G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            C1014r0 c1014r8 = c1023u1.f17585x;
                            C1023u0.m(c1014r8);
                            c1014r8.o();
                            c0970c0.Q |= !Objects.equals(c0970c0.f17315z, lValueOf);
                            c0970c0.f17315z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            C1014r0 c1014r9 = c1023u1.f17585x;
                            C1023u0.m(c1014r9);
                            c1014r9.o();
                            c0970c0.Q |= !Objects.equals(c0970c0.f17276A, lValueOf2);
                            c0970c0.f17276A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        C1014r0 c1014r10 = c1023u1.f17585x;
                        C1023u0.m(c1014r10);
                        c1014r10.o();
                        c0970c0.Q |= c0970c0.f17283H != blob;
                        c0970c0.f17283H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i11 = cursorQuery.getInt(44);
                            C1014r0 c1014r11 = c1023u1.f17585x;
                            C1023u0.m(c1014r11);
                            c1014r11.o();
                            boolean z14 = c0970c0.Q;
                            if (c0970c0.f17284I == i11) {
                                z10 = false;
                            }
                            c0970c0.Q = z10 | z14;
                            c0970c0.f17284I = i11;
                        }
                        C1014r0 c1014r12 = c1023u1.f17585x;
                        C1023u0.m(c1014r12);
                        c1014r12.o();
                        c0970c0.Q = false;
                        if (cursorQuery.moveToNext()) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.b(X.w(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return c0970c0;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.c(X.w(str), e, "Error querying app. appId");
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void r0(C0970c0 c0970c0, boolean z10) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        C1023u0 c1023u1 = c0970c0.f17292a;
        o();
        p();
        String strD = c0970c0.D();
        U6.y.f(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        G0 g10 = G0.f16990t;
        Q1 q10 = this.f17001s;
        if (z10) {
            contentValues.put("app_instance_id", (String) null);
        } else if (q10.a(strD).i(g10)) {
            contentValues.put("app_instance_id", c0970c0.E());
        }
        contentValues.put("gmp_app_id", c0970c0.G());
        if (q10.a(strD).i(G0.f16989s)) {
            C1014r0 c1014r0 = c1023u1.f17585x;
            C1023u0.m(c1014r0);
            c1014r0.o();
            contentValues.put("resettable_device_id_hash", c0970c0.f17296e);
        }
        C1014r0 c1014r1 = c1023u1.f17585x;
        C1023u0.m(c1014r1);
        c1014r1.o();
        contentValues.put("last_bundle_index", Long.valueOf(c0970c0.g));
        C1014r0 c1014r2 = c1023u1.f17585x;
        C1023u0.m(c1014r2);
        c1014r2.o();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0970c0.f17298h));
        C1014r0 c1014r3 = c1023u1.f17585x;
        C1023u0.m(c1014r3);
        c1014r3.o();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0970c0.f17299i));
        contentValues.put("app_version", c0970c0.N());
        C1014r0 c1014r4 = c1023u1.f17585x;
        C1023u0.m(c1014r4);
        c1014r4.o();
        contentValues.put("app_store", c0970c0.f17301l);
        C1014r0 c1014r5 = c1023u1.f17585x;
        C1023u0.m(c1014r5);
        c1014r5.o();
        contentValues.put("gmp_version", Long.valueOf(c0970c0.f17302m));
        C1014r0 c1014r6 = c1023u1.f17585x;
        C1023u0.m(c1014r6);
        c1014r6.o();
        contentValues.put("dev_cert_hash", Long.valueOf(c0970c0.f17303n));
        C1014r0 c1014r7 = c1023u1.f17585x;
        C1023u0.m(c1014r7);
        c1014r7.o();
        contentValues.put("measurement_enabled", Boolean.valueOf(c0970c0.f17304o));
        C1014r0 c1014r8 = c1023u1.f17585x;
        C1014r0 c1014r9 = c1023u1.f17585x;
        C1023u0.m(c1014r8);
        c1014r8.o();
        contentValues.put("day", Long.valueOf(c0970c0.f17285J));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_public_events_count", Long.valueOf(c0970c0.f17286K));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_events_count", Long.valueOf(c0970c0.f17287L));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_conversions_count", Long.valueOf(c0970c0.f17288M));
        C1014r0 c1014r10 = c1023u1.f17585x;
        C1023u0.m(c1014r10);
        c1014r10.o();
        contentValues.put("config_fetched_time", Long.valueOf(c0970c0.R));
        C1014r0 c1014r11 = c1023u1.f17585x;
        C1023u0.m(c1014r11);
        c1014r11.o();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0970c0.S));
        contentValues.put("app_version_int", Long.valueOf(c0970c0.P()));
        contentValues.put("firebase_instance_id", c0970c0.J());
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_error_events_count", Long.valueOf(c0970c0.f17289N));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0970c0.f17290O));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("health_monitor_sample", c0970c0.f17291P);
        contentValues.put("android_id", (Long) 0L);
        C1014r0 c1014r12 = c1023u1.f17585x;
        C1023u0.m(c1014r12);
        c1014r12.o();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0970c0.f17305p));
        contentValues.put("dynamite_version", Long.valueOf(c0970c0.b()));
        if (q10.a(strD).i(g10)) {
            C1014r0 c1014r13 = c1023u1.f17585x;
            C1023u0.m(c1014r13);
            c1014r13.o();
            contentValues.put("session_stitching_token", c0970c0.f17309t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0970c0.y()));
        C1014r0 c1014r14 = c1023u1.f17585x;
        C1023u0.m(c1014r14);
        c1014r14.o();
        contentValues.put("target_os_version", Long.valueOf(c0970c0.f17311v));
        C1014r0 c1014r15 = c1023u1.f17585x;
        C1023u0.m(c1014r15);
        c1014r15.o();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0970c0.f17312w));
        R3.a();
        C0981g c0981g = c1023u0.f17582u;
        X x9 = c1023u0.f17584w;
        if (c0981g.y(strD, G.f16913Q0)) {
            C1014r0 c1014r16 = c1023u1.f17585x;
            C1023u0.m(c1014r16);
            c1014r16.o();
            contentValues.put("ad_services_version", Integer.valueOf(c0970c0.f17313x));
            C1014r0 c1014r17 = c1023u1.f17585x;
            C1023u0.m(c1014r17);
            c1014r17.o();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0970c0.f17277B));
        }
        C1014r0 c1014r18 = c1023u1.f17585x;
        C1023u0.m(c1014r18);
        c1014r18.o();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0970c0.f17314y));
        contentValues.put("npa_metadata_value", c0970c0.w());
        C1014r0 c1014r19 = c1023u1.f17585x;
        C1023u0.m(c1014r19);
        c1014r19.o();
        contentValues.put("bundle_delivery_index", Long.valueOf(c0970c0.f17281F));
        contentValues.put("sgtm_preview_key", c0970c0.C());
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("dma_consent_state", Integer.valueOf(c0970c0.f17279D));
        C1023u0.m(c1014r9);
        c1014r9.o();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c0970c0.f17280E));
        contentValues.put("serialized_npa_metadata", c0970c0.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c0970c0.t()));
        C1014r0 c1014r20 = c1023u1.f17585x;
        C1023u0.m(c1014r20);
        c1014r20.o();
        ArrayList arrayList = c0970c0.f17308s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C1023u0.m(x9);
                x9.f17185z.b(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c1023u0.f17582u.y(null, G.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C1014r0 c1014r21 = c1023u1.f17585x;
        C1023u0.m(c1014r21);
        c1014r21.o();
        contentValues.put("unmatched_pfo", c0970c0.f17315z);
        C1014r0 c1014r22 = c1023u1.f17585x;
        C1023u0.m(c1014r22);
        c1014r22.o();
        contentValues.put("unmatched_uwa", c0970c0.f17276A);
        C1014r0 c1014r23 = c1023u1.f17585x;
        C1023u0.m(c1014r23);
        c1014r23.o();
        contentValues.put("ad_campaign_info", c0970c0.f17283H);
        try {
            SQLiteDatabase sQLiteDatabaseD0 = d0();
            if (sQLiteDatabaseD0.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseD0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C1023u0.m(x9);
                x9.f17182w.b(X.w(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1023u0.m(x9);
            x9.f17182w.c(X.w(strD), e10, "Error storing app. appId");
        }
    }

    public final long s(String str, C0832j1 c0832j1, String str2, Map map, EnumC0980f1 enumC0980f1, Long l10) {
        int iDelete;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        U6.y.f(c0832j1);
        U6.y.c(str);
        o();
        p();
        if (V()) {
            Q1 q10 = this.f17001s;
            long jA = q10.f17112z.f17623w.a();
            Y6.a aVar = c1023u0.f17564B;
            X x9 = c1023u0.f17584w;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) G.f16907N.a(null)).longValue()) {
                q10.f17112z.f17623w.b(jElapsedRealtime);
                o();
                p();
                if (V() && (iDelete = d0().delete("upload_queue", Q(), new String[0])) > 0) {
                    C1023u0.m(x9);
                    x9.f17178E.b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                U6.y.c(str);
                o();
                p();
                try {
                    int iW = c1023u0.f17582u.w(str, G.f16882A);
                    if (iW > 0) {
                        d0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iW)});
                    }
                } catch (SQLiteException e10) {
                    C1023u0.m(x9);
                    x9.f17182w.c(X.w(str), e10, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = c0832j1.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(enumC0980f1.f17357r));
        Y6.a aVar2 = c1023u0.f17564B;
        X x10 = c1023u0.f17584w;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l10 != null) {
            contentValues.put("associated_row_id", l10);
        }
        try {
            long jInsert = d0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            C1023u0.m(x10);
            x10.f17182w.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e11) {
            C1023u0.m(x10);
            x10.f17182w.c(str, e11, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    public final C0990j s0(long j, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        return t0(j, str, 1L, false, false, z10, false, z11, z12, z13);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00de  */
    public final List t(String str, J1 j10, int i10) {
        List list;
        U6.y.c(str);
        o();
        p();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseD0 = d0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strR = R(j10.f17019r);
            String strQ = Q();
            StringBuilder sb = new StringBuilder(strR.length() + 17 + strQ.length());
            sb.append("app_id=?");
            sb.append(strR);
            sb.append(" AND NOT ");
            sb.append(strQ);
            cursorQuery = sQLiteDatabaseD0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i10 > 0 ? String.valueOf(i10) : null);
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                R1 r1P = P(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (r1P != null) {
                    arrayList.add(r1P);
                }
            }
            list = arrayList;
        } catch (SQLiteException e10) {
            try {
                X x9 = ((C1023u0) this.f16104r).f17584w;
                C1023u0.m(x9);
                x9.f17182w.c(str, e10, "Error to querying MeasurementBatch from upload_queue. appId");
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    public final C0990j t0(long j, String str, long j10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        o();
        p();
        String[] strArr = {str};
        C0990j c0990j = new C0990j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseD0 = d0();
                cursorQuery = sQLiteDatabaseD0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        c0990j.f17418b = cursorQuery.getLong(1);
                        c0990j.f17417a = cursorQuery.getLong(2);
                        c0990j.f17419c = cursorQuery.getLong(3);
                        c0990j.f17420d = cursorQuery.getLong(4);
                        c0990j.f17421e = cursorQuery.getLong(5);
                        c0990j.f17422f = cursorQuery.getLong(6);
                        c0990j.g = cursorQuery.getLong(7);
                    }
                    if (z10) {
                        c0990j.f17418b += j10;
                    }
                    if (z11) {
                        c0990j.f17417a += j10;
                    }
                    if (z12) {
                        c0990j.f17419c += j10;
                    }
                    if (z13) {
                        c0990j.f17420d += j10;
                    }
                    if (z14) {
                        c0990j.f17421e += j10;
                    }
                    if (z15) {
                        c0990j.f17422f += j10;
                    }
                    if (z16) {
                        c0990j.g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c0990j.f17417a));
                    contentValues.put("daily_events_count", Long.valueOf(c0990j.f17418b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c0990j.f17419c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c0990j.f17420d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c0990j.f17421e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c0990j.f17422f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c0990j.g));
                    sQLiteDatabaseD0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    X x9 = c1023u0.f17584w;
                    C1023u0.m(x9);
                    x9.f17185z.b(X.w(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.c(X.w(str), e10, "Error updating daily counts. appId");
            }
            return c0990j;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public final boolean u(String str) {
        EnumC0980f1[] enumC0980f1Arr = {EnumC0980f1.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC0980f1Arr[0].f17357r));
        String strR = R(arrayList);
        String strQ = Q();
        StringBuilder sb = new StringBuilder(strR.length() + 61 + strQ.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strR);
        sb.append(" AND NOT ");
        sb.append(strQ);
        return Y(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:19:0x006b */
    public final p074h0.i u0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor;
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        U6.y.c(str);
        o();
        p();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = d0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.b(X.w(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            p074h0.i iVar = new p074h0.i(3, blob, string, string2);
                            cursorQuery.close();
                            return iVar;
                        }
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    X x10 = c1023u0.f17584w;
                    C1023u0.m(x10);
                    x10.f17182w.c(X.w(str), e, "Error querying remote config. appId");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void v(Long l10) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        try {
            if (d0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e10) {
            X x10 = c1023u0.f17584w;
            C1023u0.m(x10);
            x10.f17182w.b(e10, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e10;
        }
    }

    public final void v0(C0842l1 c0842l1, boolean z10) {
        o();
        p();
        U6.y.c(c0842l1.p());
        if (!c0842l1.b2()) {
            throw new IllegalStateException();
        }
        y();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        Y6.a aVar = c1023u0.f17564B;
        X x9 = c1023u0.f17584w;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = c0842l1.c2();
        F f3 = G.S;
        if (jC2 < jCurrentTimeMillis - ((Long) f3.a(null)).longValue() || c0842l1.c2() > ((Long) f3.a(null)).longValue() + jCurrentTimeMillis) {
            C1023u0.m(x9);
            x9.f17185z.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", X.w(c0842l1.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c0842l1.c2()));
        }
        byte[] bArrA = c0842l1.a();
        try {
            C0967b0 c0967b0 = this.f17001s.f17110x;
            Q1.U(c0967b0);
            byte[] bArrA0 = c0967b0.a0(bArrA);
            C1023u0.m(x9);
            x9.f17178E.b(Integer.valueOf(bArrA0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c0842l1.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c0842l1.c2()));
            contentValues.put("data", bArrA0);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (c0842l1.p0()) {
                contentValues.put("retry_count", Integer.valueOf(c0842l1.q0()));
            }
            try {
                if (d0().insert("queue", null, contentValues) == -1) {
                    C1023u0.m(x9);
                    x9.f17182w.b(X.w(c0842l1.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e10) {
                C1023u0.m(x9);
                x9.f17182w.c(X.w(c0842l1.p()), e10, "Error storing bundle. appId");
            }
        } catch (IOException e11) {
            C1023u0.m(x9);
            x9.f17182w.c(X.w(c0842l1.p()), e11, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String w() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseD0 = d0();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseD0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e11) {
                    e10 = e11;
                    X x9 = ((C1023u0) this.f16104r).f17584w;
                    C1023u0.m(x9);
                    x9.f17182w.b(e10, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                r10 = sQLiteDatabaseD0;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final void x(long j) {
        o();
        p();
        try {
            if (d0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e10) {
            X x9 = ((C1023u0) this.f16104r).f17584w;
            C1023u0.m(x9);
            x9.f17182w.b(e10, "Failed to delete a bundle in a queue table");
            throw e10;
        }
    }

    public final void y() {
        o();
        p();
        if (V()) {
            Q1 q10 = this.f17001s;
            long jA = q10.f17112z.f17622v.a();
            C1023u0 c1023u0 = (C1023u0) this.f16104r;
            c1023u0.f17564B.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) G.f16907N.a(null)).longValue()) {
                q10.f17112z.f17622v.b(jElapsedRealtime);
                o();
                p();
                if (V()) {
                    SQLiteDatabase sQLiteDatabaseD0 = d0();
                    c1023u0.f17564B.getClass();
                    int iDelete = sQLiteDatabaseD0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) G.S.a(null)).longValue())});
                    if (iDelete > 0) {
                        X x9 = c1023u0.f17584w;
                        C1023u0.m(x9);
                        x9.f17178E.b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void z(ArrayList arrayList) {
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        o();
        p();
        U6.y.f(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (V()) {
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (Y(sb2.toString(), null) > 0) {
                X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17185z.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseD0 = d0();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseD0.execSQL(sb3.toString());
            } catch (SQLiteException e10) {
                X x10 = c1023u0.f17584w;
                C1023u0.m(x10);
                x10.f17182w.b(e10, "Error incrementing retry count. error");
            }
        }
    }

    @Override // i7.L1
    public final void r() {
    }
}
