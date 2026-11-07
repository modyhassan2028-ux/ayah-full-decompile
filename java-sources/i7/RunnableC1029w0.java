package i7;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: renamed from: i7.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1029w0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17653r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X1 f17654s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B0 f17655t;

    public /* synthetic */ RunnableC1029w0(B0 b5, X1 x9, int i10) {
        this.f17653r = i10;
        this.f17654s = x9;
        this.f17655t = b5;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f17653r) {
            case 0:
                B0 b5 = this.f17655t;
                b5.f16830f.B();
                b5.f16830f.Y(this.f17654s);
                break;
            case 1:
                B0 b10 = this.f17655t;
                b10.f16830f.B();
                Q1 q10 = b10.f16830f;
                q10.c().o();
                q10.l0();
                X1 x9 = this.f17654s;
                U6.y.f(x9);
                String str = x9.f17204r;
                U6.y.c(str);
                int i10 = 0;
                if (q10.e0().y(null, G.f16883A0)) {
                    q10.e().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iW = q10.e0().w(null, G.f16953j0);
                    q10.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) G.f16939e.a(null)).longValue();
                    while (i10 < iW && q10.I(jLongValue, null)) {
                        i10++;
                    }
                } else {
                    q10.e0();
                    long jIntValue = ((Integer) G.f16958l.a(null)).intValue();
                    while (i10 < jIntValue && q10.I(0L, str)) {
                        i10++;
                    }
                }
                if (q10.e0().y(null, G.f16885B0)) {
                    q10.c().o();
                    q10.H();
                }
                N1 n6 = q10.f17082A;
                int iK = android.support.v4.media.session.p.k(x9.f17203V);
                n6.o();
                if (iK == 2 && !N1.r(str)) {
                    C1003n0 c1003n0 = n6.f17001s.f17104r;
                    Q1.U(c1003n0);
                    com.google.android.gms.internal.measurement.H0 h0A = c1003n0.A(str);
                    if (h0A != null && h0A.D() && !h0A.E().q().isEmpty()) {
                        q10.b().f17178E.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        q10.e().getClass();
                        q10.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                B0 b11 = this.f17655t;
                b11.f16830f.B();
                Q1 q11 = b11.f16830f;
                q11.c().o();
                q11.l0();
                X1 x10 = this.f17654s;
                U6.y.c(x10.f17204r);
                q11.c0(x10);
                break;
            case 3:
                B0 b12 = this.f17655t;
                b12.f16830f.B();
                Q1 q12 = b12.f16830f;
                if (q12.f17097P != null) {
                    ArrayList arrayList = new ArrayList();
                    q12.Q = arrayList;
                    arrayList.addAll(q12.f17097P);
                }
                C0999m c0999m = q12.f17106t;
                Q1.U(c0999m);
                C1023u0 c1023u0 = (C1023u0) c0999m.f16104r;
                X1 x11 = this.f17654s;
                String str2 = x11.f17204r;
                U6.y.f(str2);
                U6.y.c(str2);
                c0999m.o();
                c0999m.p();
                try {
                    SQLiteDatabase sQLiteDatabaseD0 = c0999m.d0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseD0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseD0.delete("events", "app_id=?", strArr) + sQLiteDatabaseD0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseD0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseD0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseD0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseD0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseD0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseD0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseD0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseD0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseD0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseD0.delete("upload_queue", "app_id=?", strArr);
                    if (c1023u0.f17582u.y(null, G.f16952i1)) {
                        iDelete += sQLiteDatabaseD0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    if (iDelete > 0) {
                        X x12 = c1023u0.f17584w;
                        C1023u0.m(x12);
                        x12.f17178E.c(str2, Integer.valueOf(iDelete), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e10) {
                    X x13 = c1023u0.f17584w;
                    C1023u0.m(x13);
                    x13.f17182w.c(X.w(str2), e10, "Error resetting analytics data. appId, error");
                }
                if (x11.f17211y) {
                    q12.Y(x11);
                }
                break;
            case 4:
                B0 b13 = this.f17655t;
                b13.f16830f.B();
                Q1 q13 = b13.f16830f;
                q13.c().o();
                q13.l0();
                X1 x14 = this.f17654s;
                U6.y.c(x14.f17204r);
                q13.m0(x14);
                q13.n0(x14);
                break;
            case 5:
                Q1 q14 = this.f17655t.f16830f;
                q14.B();
                q14.n0(this.f17654s);
                break;
            default:
                Q1 q15 = this.f17655t.f16830f;
                q15.B();
                q15.m0(this.f17654s);
                break;
        }
    }
}
