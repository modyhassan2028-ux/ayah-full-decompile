package E2;

import android.app.Service;
import android.content.Intent;
import i7.C1023u0;
import i7.InterfaceC1030w1;
import java.util.List;

/* JADX INFO: renamed from: E2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0118e implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1655r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1657t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1659v;

    public /* synthetic */ RunnableC0118e(Z0.B b5, int i10, i7.X x9, Intent intent) {
        this.f1657t = b5;
        this.f1656s = i10;
        this.f1658u = x9;
        this.f1659v = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1655r) {
            case 0:
                ((C0120f) this.f1659v).f1663c.execute(new p039d8.a(1, this, AbstractC0114c.e(new C0116d(this)), false));
                break;
            default:
                Z0.B b5 = (Z0.B) this.f1657t;
                i7.X x9 = (i7.X) this.f1658u;
                Intent intent = (Intent) this.f1659v;
                Service service = (Service) b5.f10875s;
                InterfaceC1030w1 interfaceC1030w1 = (InterfaceC1030w1) service;
                int i10 = this.f1656s;
                if (interfaceC1030w1.a(i10)) {
                    x9.f17178E.b(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
                    i7.X x10 = C1023u0.s(service, null, null).f17584w;
                    C1023u0.m(x10);
                    x10.f17178E.a("Completed wakeful intent.");
                    interfaceC1030w1.b(intent);
                }
                break;
        }
    }

    public RunnableC0118e(C0120f c0120f, List list, List list2, int i10) {
        this.f1659v = c0120f;
        this.f1657t = list;
        this.f1658u = list2;
        this.f1656s = i10;
    }
}
