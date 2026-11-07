package i7;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.C0802d1;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: renamed from: i7.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f17364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f17365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D0 f17366e;

    public /* synthetic */ C0982g0(C0985h0 c0985h0, long j) {
        this.f17366e = c0985h0;
        U6.y.c("health_monitor");
        U6.y.a(j > 0);
        this.f17363b = "health_monitor:start";
        this.f17364c = "health_monitor:count";
        this.f17365d = "health_monitor:value";
        this.f17362a = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[RETURN] */
    public boolean a(long j, C0802d1 c0802d1) {
        int size;
        if (((ArrayList) this.f17365d) == null) {
            this.f17365d = new ArrayList();
        }
        if (((ArrayList) this.f17364c) == null) {
            this.f17364c = new ArrayList();
        }
        if (((ArrayList) this.f17365d).isEmpty() || ((((C0802d1) ((ArrayList) this.f17365d).get(0)).u() / 1000) / 60) / 60 == ((c0802d1.u() / 1000) / 60) / 60) {
            long jK = this.f17362a + ((long) c0802d1.k());
            Q1 q10 = (Q1) this.f17366e;
            if (!q10.e0().y(null, G.f16941e1)) {
                q10.e0();
                if (jK < Math.max(0, ((Integer) G.j.a(null)).intValue())) {
                    this.f17362a = jK;
                    ((ArrayList) this.f17365d).add(c0802d1);
                    ((ArrayList) this.f17364c).add(Long.valueOf(j));
                    size = ((ArrayList) this.f17365d).size();
                    q10.e0();
                    if (size < Math.max(1, ((Integer) G.f16955k.a(null)).intValue())) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.f17365d).isEmpty()) {
                this.f17362a = jK;
                ((ArrayList) this.f17365d).add(c0802d1);
                ((ArrayList) this.f17364c).add(Long.valueOf(j));
                size = ((ArrayList) this.f17365d).size();
                q10.e0();
                if (size < Math.max(1, ((Integer) G.f16955k.a(null)).intValue())) {
                    return true;
                }
            } else {
                q10.e0();
                if (jK < Math.max(0, ((Integer) G.j.a(null)).intValue())) {
                    this.f17362a = jK;
                    ((ArrayList) this.f17365d).add(c0802d1);
                    ((ArrayList) this.f17364c).add(Long.valueOf(j));
                    size = ((ArrayList) this.f17365d).size();
                    q10.e0();
                    if (size < Math.max(1, ((Integer) G.f16955k.a(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void b() {
        C0985h0 c0985h0 = (C0985h0) this.f17366e;
        c0985h0.o();
        ((C1023u0) c0985h0.f16104r).f17564B.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = c0985h0.s().edit();
        editorEdit.remove((String) this.f17364c);
        editorEdit.remove((String) this.f17365d);
        editorEdit.putLong((String) this.f17363b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ C0982g0(Q1 q10) {
        this.f17366e = q10;
    }
}
