package T6;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class s extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p118l7.i f7857b;

    public s(p118l7.i iVar) {
        super(4);
        this.f7857b = iVar;
    }

    @Override // T6.m
    public final boolean a(i iVar) {
        if (iVar.f7834k.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // T6.m
    public final R6.d[] b(i iVar) {
        if (iVar.f7834k.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // T6.m
    public final void c(Status status) {
        this.f7857b.a(new R6.g(status));
    }

    @Override // T6.m
    public final void d(Exception exc) {
        this.f7857b.a(exc);
    }

    @Override // T6.m
    public final void e(i iVar) throws DeadObjectException {
        try {
            h(iVar);
        } catch (DeadObjectException e10) {
            c(m.g(e10));
            throw e10;
        } catch (RemoteException e11) {
            c(m.g(e11));
        } catch (RuntimeException e12) {
            this.f7857b.a(e12);
        }
    }

    public final void h(i iVar) {
        if (iVar.f7834k.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f7857b.b(Boolean.FALSE);
    }

    @Override // T6.m
    public final /* bridge */ /* synthetic */ void f(L5.c cVar, boolean z10) {
    }
}
