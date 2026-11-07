package p020c;

import java.util.concurrent.CopyOnWriteArrayList;
import p251z9.h;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f13408b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f13409c;

    public x(boolean z10) {
        this.f13407a = z10;
    }

    public abstract void b();

    public void c(C0776a c0776a) {
        j.e(c0776a, "backEvent");
    }

    public void d(C0776a c0776a) {
        j.e(c0776a, "backEvent");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [y9.a, z9.h] */
    public final void e(boolean z10) {
        this.f13407a = z10;
        ?? r10 = this.f13409c;
        if (r10 != 0) {
            r10.invoke();
        }
    }

    public void a() {
    }
}
