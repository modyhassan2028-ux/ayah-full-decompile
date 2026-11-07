package I1;

import U6.C0532j;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f3678s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3679t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f3680u;

    public F() {
        if (C0532j.f8280u == null) {
            C0532j.f8280u = new C0532j(24);
        }
    }

    public int a(int i10) {
        if (i10 < this.f3679t) {
            return ((ByteBuffer) this.f3680u).getShort(this.f3678s + i10);
        }
        return 0;
    }

    public void b() {
        if (((p129m9.e) this.f3680u).f19717y != this.f3679t) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i10 = this.f3677r;
            p129m9.e eVar = (p129m9.e) this.f3680u;
            if (i10 >= eVar.f19715w || eVar.f19712t[i10] >= 0) {
                return;
            } else {
                this.f3677r = i10 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        C0243b c0243b;
        if (Build.VERSION.SDK_INT >= this.f3678s) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f3678s) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f3677r);
            if (!((Class) this.f3680u).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateD = S.d(view);
            if (accessibilityDelegateD == null) {
                c0243b = null;
            } else {
                c0243b = accessibilityDelegateD instanceof C0241a ? ((C0241a) accessibilityDelegateD).f3708a : new C0243b(accessibilityDelegateD);
            }
            if (c0243b == null) {
                c0243b = new C0243b();
            }
            S.o(view, c0243b);
            view.setTag(this.f3677r, obj);
            S.i(this.f3679t, view);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f3677r < ((p129m9.e) this.f3680u).f19715w;
    }

    public void remove() {
        p129m9.e eVar = (p129m9.e) this.f3680u;
        b();
        if (this.f3678s == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        eVar.c();
        eVar.l(this.f3678s);
        this.f3678s = -1;
        this.f3679t = eVar.f19717y;
    }
}
