package K0;

import A.C0007a;
import A.C0029l;
import A.C0030l0;
import K9.AbstractC0405x;
import K9.InterfaceC0402u;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InterfaceC0402u {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f5022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Z0.z f5023s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0402u f5024t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicReference f5025u = new AtomicReference(null);

    public V(View view, Z0.z zVar, InterfaceC0402u interfaceC0402u) {
        this.f5022r = view;
        this.f5023s = zVar;
        this.f5024t = interfaceC0402u;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(M.p pVar, q9.c cVar) {
        U u8;
        if (cVar instanceof U) {
            u8 = (U) cVar;
            int i10 = u8.f5015t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u8.f5015t = i10 - Integer.MIN_VALUE;
            } else {
                u8 = new U(this, cVar);
            }
        } else {
            u8 = new U(this, cVar);
        }
        Object obj = u8.f5013r;
        int i11 = u8.f5015t;
        if (i11 == 0) {
            p110k9.a.e(obj);
            int i12 = 18;
            C0007a c0007a = new C0007a(i12, pVar, this);
            C0030l0 c0030l0 = new C0030l0(this, (p150o9.c) null, i12);
            u8.f5015t = 1;
            if (AbstractC0405x.j(new C0029l(c0007a, this.f5025u, c0030l0, (p150o9.c) null), u8) == p161p9.a.f21156r) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p110k9.a.e(obj);
        }
        throw new A6.a();
    }

    @Override // K9.InterfaceC0402u
    public final p150o9.h getCoroutineContext() {
        return this.f5024t.getCoroutineContext();
    }
}
