package K0;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: K0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0332a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5053b;

    public AbstractC0332a(Context context) {
        this.f5052a = context;
    }

    public static float h(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public void d() {
        p084i.u uVar = (p084i.u) this.f5052a;
        if (uVar != null) {
            try {
                ((p084i.x) this.f5053b).f16652B.unregisterReceiver(uVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5052a = null;
        }
    }

    public abstract IntentFilter e();

    public abstract int[] f(int i10);

    public abstract int g();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof C1.a)) {
            return menuItem;
        }
        C1.a aVar = (C1.a) menuItem;
        if (((u.O) this.f5053b) == null) {
            this.f5053b = new u.O(0);
        }
        MenuItem menuItem2 = (MenuItem) ((u.O) this.f5053b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p140o.r rVar = new p140o.r((Context) this.f5052a, aVar);
        ((u.O) this.f5053b).put(aVar, rVar);
        return rVar;
    }

    public int[] j(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f5053b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String k() {
        String str = (String) this.f5052a;
        if (str != null) {
            return str;
        }
        p251z9.j.k("text");
        throw null;
    }

    public abstract void l();

    public abstract void m();

    public abstract int[] n(int i10);

    public abstract void o(M7.c cVar);

    public abstract void p();

    public void q() {
        d();
        IntentFilter intentFilterE = e();
        if (intentFilterE.countActions() == 0) {
            return;
        }
        if (((p084i.u) this.f5052a) == null) {
            this.f5052a = new p084i.u(this);
        }
        ((p084i.x) this.f5053b).f16652B.registerReceiver((p084i.u) this.f5052a, intentFilterE);
    }

    public abstract void r();

    public abstract void s();

    public AbstractC0332a(int i10) {
        this.f5053b = new ArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            ((ArrayList) this.f5053b).add(new M7.m());
        }
    }

    public AbstractC0332a() {
        this.f5053b = new int[2];
    }

    public AbstractC0332a(p084i.x xVar) {
        this.f5053b = xVar;
    }
}
