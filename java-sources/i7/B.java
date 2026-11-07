package i7;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.ayah.MainActivity;
import com.ayah.feature.tafsir.view.TafsirPage;
import com.google.android.gms.internal.measurement.C0864p3;
import com.google.android.gms.internal.measurement.C0893v3;
import com.google.android.gms.internal.measurement.H3;
import com.google.android.gms.internal.measurement.R3;
import com.google.android.gms.internal.measurement.T3;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.r4;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements InterfaceC1034y, p138n8.a, p118l7.h, p180s0.J, p201u6.a, x8.c, y8.a, p114l3.b {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ B f16821s = new B(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ B f16822t = new B(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ B f16823u = new B(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ B f16824v = new B(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ B f16825w = new B(4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ B f16826x = new B(5);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ B f16827y = new B(6);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ B f16828z = new B(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ B f16820A = new B(8);

    public /* synthetic */ B(int i10) {
        this.f16829r = i10;
    }

    public static x8.b b(C c10) {
        return new x8.b(System.currentTimeMillis() + ((long) 3600000), new p014b3.c(8, false), new x8.a(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override // i7.InterfaceC1034y
    public Object a() {
        switch (this.f16829r) {
            case 0:
                List list = G.f16928a;
                Boolean bool = (Boolean) r4.f14391a.b();
                bool.getClass();
                return bool;
            case 1:
                List list2 = G.f16928a;
                Boolean bool2 = (Boolean) C0893v3.f14433a.b();
                bool2.getClass();
                return bool2;
            case 2:
                List list3 = G.f16928a;
                Boolean bool3 = (Boolean) l4.f14353a.b();
                bool3.getClass();
                return bool3;
            case 3:
                List list4 = G.f16928a;
                R3.f14118s.get();
                Boolean bool4 = (Boolean) T3.f14134a.b();
                bool4.getClass();
                return bool4;
            case 4:
                List list5 = G.f16928a;
                R3.f14118s.get();
                Boolean bool5 = (Boolean) T3.f14135b.b();
                bool5.getClass();
                return bool5;
            case 5:
                List list6 = G.f16928a;
                Boolean bool6 = (Boolean) C0864p3.f14384a.b();
                bool6.getClass();
                return bool6;
            case 6:
                List list7 = G.f16928a;
                Boolean bool7 = (Boolean) Z3.f14187a.b();
                bool7.getClass();
                return bool7;
            case 7:
                return new Boolean(((Boolean) H3.f14045a.b()).booleanValue());
            default:
                return new Boolean(((Boolean) i4.f14337a.b()).booleanValue());
        }
    }

    @Override // p180s0.J
    public p180s0.F c(long j, p063g1.m mVar, p063g1.c cVar) {
        return new p180s0.C(p171r0.f.d(0L, j));
    }

    @Override // y8.a
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // x8.c
    public x8.b e(C c10, JSONObject jSONObject) {
        return b(c10);
    }

    @Override // p201u6.a
    public View g(MainActivity mainActivity, MainActivity mainActivity2) {
        p251z9.j.e(mainActivity, "context");
        p251z9.j.e(mainActivity2, "controller");
        TafsirPage tafsirPage = new TafsirPage(mainActivity, null, 0);
        tafsirPage.f13890A = mainActivity2;
        Aa.a aVar = new Aa.a();
        aVar.f555s = new H7.M();
        aVar.f557u = new H7.M();
        aVar.f556t = new ArrayList();
        aVar.f554r = new W2.n(9);
        aVar.b(tafsirPage);
        return tafsirPage;
    }

    @Override // p118l7.h
    public p118l7.o h(Object obj) {
        return p000a.a.E(Boolean.TRUE);
    }

    @Override // p138n8.a
    public void i(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public String toString() {
        switch (this.f16829r) {
            case 12:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
