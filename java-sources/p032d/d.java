package p032d;

import K9.InterfaceC0402u;
import com.google.android.gms.internal.measurement.J1;
import p020c.C0776a;
import p020c.x;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final class d extends x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0402u f15522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f15523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J1 f15524f;
    public boolean g;

    @Override // p020c.x
    public final void a() {
        J1 j10 = this.f15524f;
        if (j10 != null) {
            j10.b();
        }
        J1 j11 = this.f15524f;
        if (j11 != null) {
            j11.f14055b = false;
        }
        this.g = false;
    }

    @Override // p020c.x
    public final void b() {
        J1 j10 = this.f15524f;
        if (j10 != null && !j10.f14055b) {
            j10.b();
            this.f15524f = null;
        }
        if (this.f15524f == null) {
            this.f15524f = new J1(this.f15522d, false, this.f15523e, this);
        }
        J1 j11 = this.f15524f;
        if (j11 != null) {
            ((M9.e) j11.f14056c).j(null);
        }
        J1 j12 = this.f15524f;
        if (j12 != null) {
            j12.f14055b = false;
        }
        this.g = false;
    }

    @Override // p020c.x
    public final void c(C0776a c0776a) {
        super.c(c0776a);
        J1 j10 = this.f15524f;
        if (j10 != null) {
            ((M9.e) j10.f14056c).k(c0776a);
        }
    }

    @Override // p020c.x
    public final void d(C0776a c0776a) {
        super.d(c0776a);
        J1 j10 = this.f15524f;
        if (j10 != null) {
            j10.b();
        }
        if (this.f13407a) {
            this.f15524f = new J1(this.f15522d, true, this.f15523e, this);
        }
        this.g = true;
    }
}
