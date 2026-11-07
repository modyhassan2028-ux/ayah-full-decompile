package T6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.J1;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J1 f7854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p118l7.i f7855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R7.f f7856d;

    public r(J1 j10, p118l7.i iVar, R7.f fVar) {
        super(2);
        this.f7855c = iVar;
        this.f7854b = j10;
        this.f7856d = fVar;
        if (j10.f14055b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // T6.m
    public final boolean a(i iVar) {
        return this.f7854b.f14055b;
    }

    @Override // T6.m
    public final R6.d[] b(i iVar) {
        return (R6.d[]) this.f7854b.f14056c;
    }

    @Override // T6.m
    public final void c(Status status) {
        this.f7856d.getClass();
        this.f7855c.a(status.f13986t != null ? new S6.g(status) : new R6.g(status));
    }

    @Override // T6.m
    public final void d(Exception exc) {
        this.f7855c.a(exc);
    }

    @Override // T6.m
    public final void e(i iVar) throws DeadObjectException {
        p118l7.i iVar2 = this.f7855c;
        try {
            this.f7854b.c(iVar.g, iVar2);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            c(m.g(e11));
        } catch (RuntimeException e12) {
            iVar2.a(e12);
        }
    }

    @Override // T6.m
    public final void f(L5.c cVar, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = (Map) cVar.f5533t;
        p118l7.i iVar = this.f7855c;
        map.put(iVar, boolValueOf);
        p118l7.o oVar = iVar.f19402a;
        L5.c cVar2 = new L5.c(5, cVar, iVar);
        oVar.getClass();
        oVar.f19422b.f(new p118l7.m(p118l7.j.f19403a, cVar2));
        oVar.n();
    }
}
