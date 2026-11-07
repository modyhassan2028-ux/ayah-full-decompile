package Z0;

import A.C0023i;
import A.M0;
import K0.RunnableC0354l;
import U0.I;
import U0.K;
import W.C0557f1;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class C implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.support.v4.media.session.r f10877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D f10878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p251z9.k f10880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p241y9.c f10881f;
    public y g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f10882h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f10883i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f10884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0712c f10885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p011b0.e f10886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RunnableC0354l f10887n;

    public C(View view, AndroidComposeView androidComposeView) {
        android.support.v4.media.session.r rVar = new android.support.v4.media.session.r(view);
        D d5 = new D(Choreographer.getInstance());
        this.f10876a = view;
        this.f10877b = rVar;
        this.f10878c = d5;
        this.f10880e = C0711b.f10898u;
        this.f10881f = C0711b.f10899v;
        this.g = new y(K.f8033b, 4, "");
        this.f10882h = k.g;
        this.f10883i = new ArrayList();
        this.j = p110k9.a.c(p110k9.h.f19075s, new C0557f1(9, this));
        this.f10885l = new C0712c(androidComposeView, rVar);
        this.f10886m = new p011b0.e(new A[16]);
    }

    @Override // Z0.t
    public final void a(y yVar, s sVar, I i10, M0 m10, p171r0.e eVar, p171r0.e eVar2) {
        C0712c c0712c = this.f10885l;
        synchronized (c0712c.f10905c) {
            try {
                c0712c.j = yVar;
                c0712c.f10912l = sVar;
                c0712c.f10911k = i10;
                c0712c.f10913m = m10;
                c0712c.f10914n = eVar;
                c0712c.f10915o = eVar2;
                if (c0712c.f10907e || c0712c.f10906d) {
                    c0712c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z0.t
    public final void b(p171r0.e eVar) {
        Rect rect;
        this.f10884k = new Rect(B9.a.V(eVar.f21389a), B9.a.V(eVar.f21390b), B9.a.V(eVar.f21391c), B9.a.V(eVar.f21392d));
        if (!this.f10883i.isEmpty() || (rect = this.f10884k) == null) {
            return;
        }
        this.f10876a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // Z0.t
    public final void c() {
        i(A.f10869r);
    }

    @Override // Z0.t
    public final void d() {
        i(A.f10871t);
    }

    @Override // Z0.t
    public final void e() {
        i(A.f10872u);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, k9.g] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, k9.g] */
    @Override // Z0.t
    public final void f(y yVar, y yVar2) {
        boolean z10 = (K.a(this.g.f10954b, yVar2.f10954b) && p251z9.j.a(this.g.f10955c, yVar2.f10955c)) ? false : true;
        this.g = yVar2;
        int size = this.f10883i.size();
        for (int i10 = 0; i10 < size; i10++) {
            u uVar = (u) ((WeakReference) this.f10883i.get(i10)).get();
            if (uVar != null) {
                uVar.f10943d = yVar2;
            }
        }
        C0712c c0712c = this.f10885l;
        synchronized (c0712c.f10905c) {
            c0712c.j = null;
            c0712c.f10912l = null;
            c0712c.f10911k = null;
            c0712c.f10913m = C0711b.f10896s;
            c0712c.f10914n = null;
            c0712c.f10915o = null;
        }
        if (p251z9.j.a(yVar, yVar2)) {
            if (z10) {
                android.support.v4.media.session.r rVar = this.f10877b;
                int iE = K.e(yVar2.f10954b);
                int iD = K.d(yVar2.f10954b);
                K k7 = this.g.f10955c;
                int iE2 = k7 != null ? K.e(k7.f8035a) : -1;
                K k10 = this.g.f10955c;
                ((InputMethodManager) rVar.f11365t.getValue()).updateSelection((View) rVar.f11364s, iE, iD, iE2, k10 != null ? K.d(k10.f8035a) : -1);
                return;
            }
            return;
        }
        if (yVar != null && (!p251z9.j.a(yVar.f10953a.f8060s, yVar2.f10953a.f8060s) || (K.a(yVar.f10954b, yVar2.f10954b) && !p251z9.j.a(yVar.f10955c, yVar2.f10955c)))) {
            android.support.v4.media.session.r rVar2 = this.f10877b;
            ((InputMethodManager) rVar2.f11365t.getValue()).restartInput((View) rVar2.f11364s);
            return;
        }
        int size2 = this.f10883i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            u uVar2 = (u) ((WeakReference) this.f10883i.get(i11)).get();
            if (uVar2 != null) {
                y yVar3 = this.g;
                android.support.v4.media.session.r rVar3 = this.f10877b;
                if (uVar2.f10946h) {
                    uVar2.f10943d = yVar3;
                    if (uVar2.f10945f) {
                        ((InputMethodManager) rVar3.f11365t.getValue()).updateExtractedText((View) rVar3.f11364s, uVar2.f10944e, F9.n.U(yVar3));
                    }
                    K k11 = yVar3.f10955c;
                    long j = yVar3.f10954b;
                    int iE3 = k11 != null ? K.e(k11.f8035a) : -1;
                    K k12 = yVar3.f10955c;
                    ((InputMethodManager) rVar3.f11365t.getValue()).updateSelection((View) rVar3.f11364s, K.e(j), K.d(j), iE3, k12 != null ? K.d(k12.f8035a) : -1);
                }
            }
        }
    }

    @Override // Z0.t
    public final void g() {
        this.f10879d = false;
        this.f10880e = C0711b.f10900w;
        this.f10881f = C0711b.f10901x;
        this.f10884k = null;
        i(A.f10870s);
    }

    @Override // Z0.t
    public final void h(y yVar, k kVar, C0023i c0023i, K.B b5) {
        this.f10879d = true;
        this.g = yVar;
        this.f10882h = kVar;
        this.f10880e = c0023i;
        this.f10881f = b5;
        i(A.f10869r);
    }

    public final void i(A a9) {
        this.f10886m.b(a9);
        if (this.f10887n == null) {
            RunnableC0354l runnableC0354l = new RunnableC0354l(10, this);
            this.f10878c.execute(runnableC0354l);
            this.f10887n = runnableC0354l;
        }
    }
}
