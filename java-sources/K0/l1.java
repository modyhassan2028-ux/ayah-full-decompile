package K0;

import K9.AbstractC0405x;
import android.view.View;
import androidx.lifecycle.EnumC0766o;
import androidx.lifecycle.InterfaceC0769s;
import androidx.lifecycle.InterfaceC0771u;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements InterfaceC0769s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P9.d f5092r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0333a0 f5093s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Z.s0 f5094t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p251z9.v f5095u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f5096v;

    public l1(P9.d dVar, C0333a0 c0333a0, Z.s0 s0Var, p251z9.v vVar, View view) {
        this.f5092r = dVar;
        this.f5093s = c0333a0;
        this.f5094t = s0Var;
        this.f5095u = vVar;
        this.f5096v = view;
    }

    @Override // androidx.lifecycle.InterfaceC0769s
    public final void n(InterfaceC0771u interfaceC0771u, EnumC0766o enumC0766o) {
        int i10 = k1.f5089a[enumC0766o.ordinal()];
        if (i10 == 1) {
            AbstractC0405x.x(this.f5092r, null, new A.k1(this.f5095u, this.f5094t, interfaceC0771u, this, this.f5096v, null, 1), 1);
            return;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                this.f5094t.C();
                return;
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f5094t.x();
                return;
            }
        }
        C0333a0 c0333a0 = this.f5093s;
        if (c0333a0 != null) {
            Ca.r rVar = (Ca.r) c0333a0.f5056t;
            synchronized (rVar.f851e) {
                try {
                    if (!rVar.b()) {
                        ArrayList arrayList = (ArrayList) rVar.f849c;
                        rVar.f849c = (ArrayList) rVar.f850d;
                        rVar.f850d = arrayList;
                        rVar.f848b = true;
                        int size = arrayList.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((p150o9.c) arrayList.get(i11)).resumeWith(p110k9.y.f19095a);
                        }
                        arrayList.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f5094t.I();
    }
}
