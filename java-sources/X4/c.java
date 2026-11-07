package X4;

import I1.B0;
import I1.S;
import I1.r;
import J1.q;
import Z.X;
import Z0.B;
import android.app.ActivityManager;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import i7.B1;
import i7.C0985h0;
import i7.C1023u0;
import i7.E0;
import i7.H0;
import i7.Q1;
import i7.U1;
import i7.Y0;
import i7.Z;
import j$.util.Objects;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;
import p056f2.AbstractComponentCallbacksC0947u;
import p056f2.C0949w;
import p056f2.G;
import p056f2.K;
import p084i.E;
import p140o.i;
import p140o.k;
import p160p8.p;

/* JADX INFO: loaded from: classes.dex */
public class c implements fa.a, q, p053f.b, i, U1, Z, p118l7.f, p118l7.e, p118l7.c, p138n8.b, p149o8.a, r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f9953r;

    public c(int i10) {
        switch (i10) {
            case 22:
                this.f9953r = new CountDownLatch(1);
                break;
            case 27:
                this.f9953r = new AudioAttributes.Builder();
                break;
            default:
                this.f9953r = new B(19);
                break;
        }
    }

    public static String m(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static c u(String str) {
        return new c((TextUtils.isEmpty(str) || str.length() > 1) ? E0.f16862s : H0.e(str.charAt(0)));
    }

    @Override // i7.U1
    public void a(String str, String str2, Bundle bundle) {
        Y0 y10 = (Y0) this.f9953r;
        if (!TextUtils.isEmpty(str)) {
            y10.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((C1023u0) y10.f16104r).f17564B.getClass();
        y10.t("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // i7.Z
    public /* synthetic */ void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        ((Q1) this.f9953r).A(str, i10, th, bArr, map);
    }

    @Override // p149o8.a
    public void c(p160p8.q qVar) {
        this.f9953r = qVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // p053f.b
    public void d(Object obj) {
        p053f.a aVar = (p053f.a) obj;
        K k7 = (K) this.f9953r;
        G g = (G) k7.f15951F.pollLast();
        if (g == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g.f15941r;
        int i10 = g.f15942s;
        AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947uN = k7.f15964c.n(str);
        if (abstractComponentCallbacksC0947uN != null) {
            abstractComponentCallbacksC0947uN.w(i10, aVar.f15869r, aVar.f15870s);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // p118l7.c
    public void e() {
        ((CountDownLatch) this.f9953r).countDown();
    }

    @Override // J1.q
    public boolean f(View view) {
        Aa.a aVar = (Aa.a) this.f9953r;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) aVar.f557u;
        if (viewPager2.f13046I) {
            viewPager2.d(currentItem, true);
        }
        return true;
    }

    @Override // p118l7.f
    public void g(Object obj) {
        ((CountDownLatch) this.f9953r).countDown();
    }

    @Override // p118l7.e
    public void h(Exception exc) {
        ((CountDownLatch) this.f9953r).countDown();
    }

    public AudioAttributesImpl i() {
        return new AudioAttributesImplApi21(((AudioAttributes.Builder) this.f9953r).build());
    }

    @Override // p138n8.b
    public void j(String str, Bundle bundle) {
        p160p8.q qVar = (p160p8.q) this.f9953r;
        if (qVar != null) {
            try {
                String str2 = "$A$:" + m(str, bundle);
                p160p8.r rVar = qVar.f21113a;
                rVar.f21126o.f21345a.a(new p(rVar, System.currentTimeMillis() - rVar.f21117d, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public boolean k() {
        return ((p105k2.d) this.f9953r) == null;
    }

    public void l() {
        ((C0949w) this.f9953r).f16175u.Q();
    }

    public c n() {
        ((AudioAttributes.Builder) this.f9953r).setUsage(1);
        return this;
    }

    @Override // fa.a
    public void o(p072ga.d dVar, int i10) {
        if (i10 == 0) {
            ((X) this.f9953r).setValue(Boolean.FALSE);
        }
    }

    @Override // I1.r
    public B0 p(View view, B0 b5) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f9953r;
        WeakHashMap weakHashMap = S.f3689a;
        B0 b10 = appBarLayout.getFitsSystemWindows() ? b5 : null;
        if (!Objects.equals(appBarLayout.f14549x, b10)) {
            appBarLayout.f14549x = b10;
            appBarLayout.setWillNotDraw(!(appBarLayout.f14539M != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return b5;
    }

    @Override // p140o.i
    public boolean q(k kVar, MenuItem menuItem) {
        return false;
    }

    public /* bridge */ c r() {
        return n();
    }

    public void s() {
        B1 b5 = (B1) this.f9953r;
        b5.o();
        C1023u0 c1023u0 = (C1023u0) b5.f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        Y6.a aVar = c1023u0.f17564B;
        aVar.getClass();
        if (c0985h0.y(System.currentTimeMillis())) {
            C0985h0 c0985h1 = c1023u0.f17583v;
            C1023u0.k(c0985h1);
            c0985h1.f17386C.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                i7.X x9 = c1023u0.f17584w;
                C1023u0.m(x9);
                x9.f17178E.a("Detected application was in foreground");
                aVar.getClass();
                v(System.currentTimeMillis());
            }
        }
    }

    public void t(long j) {
        B1 b5 = (B1) this.f9953r;
        b5.o();
        b5.s();
        C1023u0 c1023u0 = (C1023u0) b5.f16104r;
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        if (c0985h0.y(j)) {
            C1023u0.k(c0985h0);
            c0985h0.f17386C.b(true);
            c1023u0.r().t();
        }
        C1023u0.k(c0985h0);
        c0985h0.f17390G.b(j);
        if (c0985h0.f17386C.a()) {
            v(j);
        }
    }

    public void v(long j) {
        B1 b5 = (B1) this.f9953r;
        b5.o();
        C1023u0 c1023u0 = (C1023u0) b5.f16104r;
        if (c1023u0.a()) {
            C0985h0 c0985h0 = c1023u0.f17583v;
            C1023u0.k(c0985h0);
            c0985h0.f17390G.b(j);
            c1023u0.f17564B.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            i7.X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17178E.b(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j / 1000;
            Long lValueOf = Long.valueOf(j10);
            Y0 y10 = c1023u0.f17566D;
            C1023u0.l(y10);
            y10.z("auto", "_sid", j, lValueOf);
            C1023u0.k(c0985h0);
            c0985h0.f17391H.b(j10);
            c0985h0.f17386C.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            C1023u0.l(y10);
            y10.w(j, bundle, "auto", "_s");
            String strJ = c0985h0.f17396M.j();
            if (TextUtils.isEmpty(strJ)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strJ);
            C1023u0.l(y10);
            y10.w(j, bundle2, "auto", "_ssr");
        }
    }

    @Override // p140o.i
    public void z(k kVar) {
        E e10 = (E) this.f9953r;
        Window.Callback callback = e10.f16507f;
        if (e10.f16506e.f20674a.p()) {
            callback.onPanelClosed(108, kVar);
        } else if (callback.onPreparePanel(0, null, kVar)) {
            callback.onMenuOpened(108, kVar);
        }
    }

    public /* synthetic */ c(Object obj) {
        this.f9953r = obj;
    }
}
