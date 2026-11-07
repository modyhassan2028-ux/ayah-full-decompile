package E0;

import U6.y;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.C0797c1;
import com.google.android.gms.internal.measurement.C0802d1;
import i7.C0967b0;
import i7.C0993k;
import i7.C0999m;
import i7.C1023u0;
import i7.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1420c;

    public d(C0999m c0999m, String str) {
        this.f1420c = c0999m;
        y.c(str);
        this.f1419b = str;
        this.f1418a = -1L;
    }

    public List a() {
        List list;
        List list2;
        C0999m c0999m = (C0999m) this.f1420c;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f1419b;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c0999m.d0().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f1418a)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j10 = cursorQuery.getLong(3);
                        boolean z10 = cursorQuery.getLong(5) == 1;
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f1418a) {
                            this.f1418a = j;
                        }
                        try {
                            C0797c1 c0797c1 = (C0797c1) C0967b0.b0(C0802d1.z(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c0797c1.b();
                            ((C0802d1) c0797c1.f14329s).F(string);
                            long j11 = cursorQuery.getLong(2);
                            c0797c1.b();
                            ((C0802d1) c0797c1.f14329s).G(j11);
                            arrayList.add(new C0993k(j, j10, z10, (C0802d1) c0797c1.e()));
                        } catch (IOException e10) {
                            X x9 = ((C1023u0) c0999m.f16104r).f17584w;
                            C1023u0.m(x9);
                            x9.f17182w.c(X.w(str), e10, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e11) {
                X x10 = ((C1023u0) c0999m.f16104r).f17584w;
                C1023u0.m(x10);
                x10.f17182w.c(X.w(str), e11, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    public d(C0999m c0999m, String str, long j) {
        this.f1420c = c0999m;
        y.c(str);
        this.f1419b = str;
        this.f1418a = c0999m.Z("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public d() {
        this.f1419b = new c();
        this.f1420c = new c();
    }
}
